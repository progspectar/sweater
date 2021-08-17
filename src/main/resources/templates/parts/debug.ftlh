Dump objects:</br>
<#list .data_model?keys as key>
    <@dump_object object=key/>
    </br>
</#list>

<#macro dump_prop prop debug=true>

    <#if prop??>
        <#if prop?is_node>
            is_node
        <#elseif prop?is_method>
            #is_method
        <#elseif prop?is_sequence>
            #sequenc
        <#elseif prop?is_hash_ex>
            #is_hash_e:
            {<#list prop as key, item>${key}=<@dump_prop prop=item/><#if !item?is_last>, </#if></#list>}
        <#else>
            #else
            ${prop}
        </#if>

    <#else>
        null
    </#if>

</#macro>

<#macro dump_object object debug=true>
    <#compress>
        <#if object??>
            <#attempt>
                object:</br>
                <@dump_prop prop=object/>
                <#recover>
                    <#if !debug><!-- </#if>LOG: Could not parse object <#if debug><pre>${.error}</pre><#else>--></#if>
            </#attempt>
        <#else>
            null
        </#if>
    </#compress>
</#macro>
