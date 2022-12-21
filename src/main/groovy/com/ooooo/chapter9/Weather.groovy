package com.ooooo.chapter9

import groovy.sql.Sql

/**
 * @author <a href="https://github.com/ooooo-youwillsee">ooooo</a>
 * @since 1.0.0
 */

def url = ""
def username = ""
def password = ""
def driver = ""

def sql = Sql.newInstance(url, username, password, driver)

println '---'
sql.execute("select 1")

println '---'
sql.eachRow("select * for user") { it ->
  println it
}

println '---'
sql.eachRow("select * from user where id:=id", [id: "1"]) {
  println it
}

println '---'
def insertedUserList = sql.executeInsert("insert into user(id, name) values ('1', 'tom')")

println insertedUserList


