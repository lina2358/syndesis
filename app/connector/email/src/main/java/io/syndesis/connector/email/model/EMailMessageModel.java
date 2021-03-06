/*
 * Copyright (C) 2016 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.syndesis.connector.email.model;

import java.util.Objects;

import io.syndesis.connector.email.EMailConstants;

public final class EMailMessageModel implements EMailConstants {

    private String subject;
    private String from;
    private String to;
    private String cc;
    private String bcc;

    //
    // Can be a MimeMultiPart for ensuring consistent
    // data integrity is maintained rather than reducing
    // content to just plain text.
    //
    private Object content;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getFrom() {
        return this.from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getBcc() {
        return bcc;
    }

    public void setBcc(String bcc) {
        this.bcc = bcc;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((bcc == null) ? 0 : bcc.hashCode());
        result = prime * result + ((cc == null) ? 0 : cc.hashCode());
        result = prime * result + ((subject == null) ? 0 : subject.hashCode());
        result = prime * result + ((content == null) ? 0 : content.hashCode());
        result = prime * result + ((to == null) ? 0 : to.hashCode());
        result = prime * result + ((from == null) ? 0 : from.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (! (obj instanceof EMailMessageModel)) {
            return false;
        }

        EMailMessageModel other = (EMailMessageModel) obj;
        boolean equal = Objects.equals(bcc, other.bcc);
        equal &= Objects.equals(cc, other.cc);
        equal &= Objects.equals(subject, other.subject);
        equal &= Objects.equals(content, other.content);
        equal &= Objects.equals(from, other.from);
        equal &= Objects.equals(to, other.to);

        return equal;
    }

    @Override
    public String toString() {
        return "EMailMessageModel [subject=" + subject + ", from=" + from + ", to=" + to + ", cc=" + cc + ", bcc=" + bcc
               + ", content=" + content + "]";
    }

}
