<?php
print "<pre>";
print_r($_POST['check1']);
print_r($_POST['check']);

print "</pre>";
?>
<form method="POST" action="Test.php">
    <input type="checkbox" name="check[]" value="100">100 <br />
    <input type="checkbox" name="check[]" value="200">200 <br />
    <input type="checkbox" name="check[]" value="300">300 <br />
    <input type="submit" name="submit" value="submit">
</form>
<br>
<br>

<form method="POST" action="Test.php">
    <input type="checkbox" name="check1[]" value="11">11 <br />
    <input type="checkbox" name="check1[]" value="22">22 <br />
    <input type="checkbox" name="check1[]" value="33">33 <br />
    <input type="submit" name="submit" value="submit">
</form>
