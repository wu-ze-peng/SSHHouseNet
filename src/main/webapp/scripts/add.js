jQuery.noConflict();
jQuery(document).ready(function ($) {
    var $district = $("#district");
    var $type = $("#type");
    var $street = $("#street")
    function getDistrictList() {
        $.ajax({
            type:"post",
            url:"district.action",
            data:"",
            dataType:"json",
            success:function (data) {
                if(data!=null){
                    $district.html("");
                    var options = "<option value=\"0\">请选择</option>";
                    var result = data.result;
                    for(var i = 0; i < result.length; i++){
                        // alert(data.result[i].id);
                        // alert(data.result[i].name);
                        options += "<option value=\""+result[i][0]+"\">"+result[i][1]+"</option>";
                    }
                    $district.html(options);
                }
            }

        })
    }

    function getStreetList() {
        $.ajax({
            type:"post",
            url:"street.action",
            data:"",
            dataType:"json",
            success:function (data) {
                if(data!=null){
                    $street.html("");
                    var options = "<option value=\"0\">请选择</option>";
                    var result = data.result;
                    for(var i = 0; i < result.length; i++){
                        // alert(data.result[i].id);
                        // alert(data.result[i].name);
                        options += "<option value=\""+result[i][0]+"\">"+result[i][1]+"</option>";
                    }
                    $street.html(options);
                }
            }

        })
    }
    function getTypeList() {
        $.ajax({
            type:"post",
            url:"type.action",
            data:"",
            dataType:"json",
            success:function (data) {
                if(data!=null){
                    $type.html("");
                    var options = "<option value=\"0\">请选择</option>";
                    var result = data.result;
                    for(var i = 0; i < result.length; i++){
                        options += "<option value=\""+result[i][0]+"\">"+result[i][1]+"</option>";
                    }
                    $type.html(options);
                }
            }

        })
    }

    getTypeList();
    getStreetList();
    getDistrictList();
});