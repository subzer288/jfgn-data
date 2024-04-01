INSERT INTO `jfgn`.`courses`
(`course`,
`institution`,
`start_date`,
`currently_learning`,
`end_date`)
VALUES
('Frontend with Vue.js','Platzi','2023-08-01',0,'2024-01-01'),
('Algorithms and data structures','Leetcode','2024-01-01',1,'2024-03-28'),
('System Design','Leetcode','2024-01-01',1,'2024-03-28'),
('Java University','Udemy','2019-02-01',0,'2019-11-01'),
('Data Scientis','Platzi','2023-12-01',0,'2024-02-01');

INSERT INTO `jfgn`.`jobs`
(
`name`,
`company`,
`city`,
`start_date`,
`current_job`,
`end_date`)
VALUES
("System Administrator and Backend Developer","ITESS","Guadalajara","2018-03-01", 0,"2020-01-01"),
("Freelance developer","Self-Employed","Guadalajara","2020-03-01", 0,"2021-07-01"),
("System administrator and Backend Developer","AMPI","Guadalajara","2022-01-01", 0,"2023-11-01");

INSERT INTO `jfgn`.`job_activities`
(`activity`,
`id_job`)
VALUES
("Manage and maintain to the MLS and CRM of AMPI Guadalajara, fixing bugs, developing new features using web technologies like Laravel or Angular",1),
("Develop scripts in PHP to do different task like export databases, generate emails or generate reports",1),
("Frontend development using different web technologies",1),
("Creation of different websites, APIs or landing pages using different technologies like Wordpress, React, Laravel, ExpressJS",2),
("Administration of all the MLS and CRM of the association like Wiggot, AMPI System, ValorEs, SADAM",3),
("Develop of API for the associates to consult information in the AMPI Database using technologies like Laravel, SpringBoot",3),
("Maintaining of the databases up to date",3),
("Creation of courses about how to use all the tools provided by the association",3);

INSERT INTO `jfgn`.`type_technologies`
(`name`)
VALUES
("Frontend"),
("Backend"),
("DBMS"),
("Programming Languages");

INSERT INTO `jfgn`.`technologies`
(`name`,
`value`,
`id_type_technologies`)
VALUES
("Web Technololgies", 100,1),
("Vue", 70,1),
("Angular", 80,1),
("React", 80,1),
("Spring Framework",70,2),
("Laravel",90,2),
("Express js",90,2),
("NEXT.js",70,2),
("MySQL",80,3),
("Redis",60,3),
("PostgreSQL",80,3),
("MongoDB",90,3),
("Neo4j",60,3),
("Python",70,4),
("Java",80,4),
("PHP",90,4),
("Javascript",90,4),
("C / C++",80,4);

INSERT INTO `jfgn`.`education`
(`name`,
`school`,
`city`,
`start_date`,
`currently_student`,
`end_date`,
`status`)
VALUES
("Technician in information technologies","Centro de Enseñanza Tecnica Industrial, CETI","Guadalajara","2011-08-07",0,"2015-07-04","Graduated by project."),
("Software development Engineer","Centro de Enseñanza Tecnica Industrial, CETI","Guadalajara","2015-08-07",0,"2019-12-14","Graduated by Internship.");