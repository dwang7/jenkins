// script to set the FROM email id

import javax.mail.Message.RecipientType
import javax.mail.Address
import javax.mail.internet.InternetAddress
import javax.mail.internet.MimeMessage
import groovy.json.JsonSlurper

def var = build.getEnvVars()
def emailContent = msg.getContent().getBodyPart(0).getContent()
def jobname = var.get("JOB_NAME")
def build_url = var.get("BUILD_URL")
def email_id = var.get("EMAIL_ID")

logger.print("email is " + email_id + "\n\n")

msg.setFrom(new InternetAddress(email_id))
