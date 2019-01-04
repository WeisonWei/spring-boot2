
CREATE TABLE IF NOT EXISTS `t_student` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `student_name` VARCHAR(255) DEFAULT NULL,
  `student_phone` VARCHAR(255) DEFAULT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=INNODB AUTO_INCREMENT=1 ;

CREATE TABLE IF NOT EXISTS `t_student_score` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `subject` VARCHAR(255) DEFAULT NULL,
  `student_id` INT(255) DEFAULT NULL,
  `subject_score` INT(255),
  PRIMARY KEY  (`id`)
) ENGINE=INNODB AUTO_INCREMENT=1 ;

INSERT INTO `t_student` (`student_name`, `student_phone`) VALUES('小明','111');
INSERT INTO `t_student` (`student_name`, `student_phone`) VALUES('小红','222');
INSERT INTO `t_student` (`student_name`, `student_phone`) VALUES('小灰','333');
INSERT INTO `t_student` (`student_name`, `student_phone`) VALUES('小朋','444');

INSERT INTO `t_student_score` (`subject`, `student_id`, `subject_score`) VALUES('语文','1','30');
INSERT INTO `t_student_score` (`subject`, `student_id`, `subject_score`) VALUES('数学','1','40');
INSERT INTO `t_student_score` (`subject`, `student_id`, `subject_score`) VALUES('语文','2','50');
INSERT INTO `t_student_score` (`subject`, `student_id`, `subject_score`) VALUES('数学','2','35');
INSERT INTO `t_student_score` (`subject`, `student_id`, `subject_score`) VALUES('语文','3','50');
INSERT INTO `t_student_score` (`subject`, `student_id`, `subject_score`) VALUES('数学','3','35');
INSERT INTO `t_student_score` (`subject`, `student_id`, `subject_score`) VALUES('语文','4','50');
INSERT INTO `t_student_score` (`subject`, `student_id`, `subject_score`) VALUES('数学','4','35');
