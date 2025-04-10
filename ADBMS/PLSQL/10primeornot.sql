DECLARE
    num INTEGER;
    i INTEGER;
    is_prime BOOLEAN := TRUE;
BEGIN
    num := &num;
    FOR i IN 2..num/2 LOOP
        IF num MOD i = 0 THEN
            is_prime := FALSE;
            EXIT;
        END IF;
    END LOOP;
    IF is_prime AND num > 1 THEN
        DBMS_OUTPUT.PUT_LINE(num || ' is a prime number.');
    ELSE
        DBMS_OUTPUT.PUT_LINE(num || ' is not a prime number.');
    END IF;
END;
/

