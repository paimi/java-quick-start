/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package sh.platform.template;

import jakarta.nosql.mapping.AttributeConverter;
import org.bson.types.ObjectId;

public class ObjectIdConverter implements AttributeConverter<String, ObjectId> {

    @Override
    public ObjectId convertToDatabaseColumn(String attribute) {
        if(attribute == null) {
            return null;
        }
        return new ObjectId(attribute);
    }

    @Override
    public String convertToEntityAttribute(ObjectId dbData) {
        if(dbData == null) {
            return null;
        }
        return dbData.toString();
    }
}