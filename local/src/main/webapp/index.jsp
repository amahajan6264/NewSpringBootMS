<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Language Selection</title>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script>
        $(document).ready(function() {
            $('select').change(function() {
                var lang = $(this).val();
                $.post('/changeLanguage', { lang: lang }, function(data) {
                    window.location.reload();
                }).fail(function() {
                    alert('Failed to change language');
                });
            });
        });
    </script>
</head>
<body>
    <select>
        <option value="en">English</option>
        <option value="ar">العربية</option>
    </select>
</body>
</html>
