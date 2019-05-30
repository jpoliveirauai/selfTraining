from Costumer import Costumer
from pymysql import MySQLError
import pymysql


class Base():
    mSql = pymysql.connect("localhost", "root", "123456", "python")
    cursor = mSql.cursor()

    def insert(self, costumer):
        sql = "INSERT INTO COSTUMER VALUES (%s,%s,%s);"
        try:
            self.cursor.execute(
                sql, (costumer.nome, costumer.cpf, costumer.age))
            self.mSql.commit()
        except MySQLError as e:
            print('Got error {!r}, errno is {}'.format(e, e.args[0]))
            print("Deu Ruim!!")

    def delete(self, costumer):
        sql = "DELETE FROM COSTUMER WHERE CPF=%s;"
        try:
            self.cursor.execute(sql, costumer.cpf)
            self.mSql.commit()
        except MySQLError as e:
            print('Got error {!r}, errno is {}'.format(e, e.args[0]))
            print("Deu Ruim!!")

    def show(self, costumer):
        sql = "SELECT * FROM COSTUMER WHERE CPF=%s;"
        try:
            self.cursor.execute(sql, costumer.cpf)
            result = self.cursor.fetchone()
            if(result!=None):
                print(result)
            else:
                return ""
        except MySQLError as e:
            print('Got error {!r}, errno is {}'.format(e, e.args[0]))
            print("Deu Ruim!!")
    def update(self, costumer):
        sql = "UPDATE COSTUMER SET NAME = %s, IDADE = %s WHERE CPF = %s;"
        try:
            self.cursor.execute(sql, (costumer.nome ,costumer.age, costumer.cpf))
            self.mSql.commit()
        except MySQLError as e:
            print('Got error {!r}, errno is {}'.format(e, e.args[0]))
            print("Deu Ruim!!")
    