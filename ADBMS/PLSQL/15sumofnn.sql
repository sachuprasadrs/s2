DECLARE
	n number := &number;
	sum number := 0;
BEGIN
	for i in 1..n
	loop
		s:=s+i;
	end loop;
	DBMS_OUTPUT.PUT_LINE('Sum of first ' || n || ' natural numbers is: ' || sum);
END;
/
