
---------------------------------------------------------------------------------------------
Assumptions-
---------------------------------------------------------------------------------------------
Used open source Hibernate api for my entire project

--------------------------------------------------------------------------------------------
Dependencies-
--------------------------------------------------------------------------------------------
Hibernate api
Mysqlconnector(for jdbc driver connectivity to mysqlserver)
Json-simple api(for creating,saving data in to json object)


---------------------------------------------------------------------------------------------
Must-
---------------------------------------------------------------------------------------------
Need to modify according the Database server and authentication details in hibernate configuration file
 		<property name="hibernate.connection.driver_class">com.mysql.jdbc.Driver</property>
        <property name="hibernate.connection.username">XXXXXXXXXXXXXXXXX</property>
        <property name="hibernate.connection.password">XXXXXXXXXXXXXXXX</property>
        <property name="hibernate.connection.url">jdbc:mysql://localhost:3306/mydb</property>
        
        
----------------------------------------------------------------------------------------------  
Application Flow
----------------------------------------------------------------------------------------------
Main Functionalities-
1.Search and return name based on input(productid)
2.Retrieve top 50 elements of records
3.Retrieve based on input(pagnation)
4.Return JSON record Object
