DECLARE
   n INTEGER := &number;
   sum INTEGER := 0;
   i INTEGER := 1;
BEGIN
   WHILE i <= n LOOP
      sum := sum + i;
      i := i + 1;
   END LOOP;
DBMS_OUTPUT.PUT_LINE('Sum of first ' || n || ' natural numbers is: ' || sum);
END;
/
