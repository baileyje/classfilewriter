/*
 * JBoss, Home of Professional Open Source
 * Copyright 2010, Red Hat Inc., and individual contributors as indicated
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.jboss.classfilewriter.test.bytecode.i;

import junit.framework.Assert;

import org.jboss.classfilewriter.code.CodeAttribute;
import org.jboss.classfilewriter.test.bytecode.MethodTester;
import org.junit.Test;

public class IconstTest {

    @Test
    public void testIconst() {
        MethodTester<Integer> mt = new MethodTester<Integer>(int.class);
        CodeAttribute ca = mt.getCodeAttribute();
        ca.iconst(2);
        ca.returnInstruction();
        Assert.assertEquals(2, (int) mt.invoke());
    }

    @Test
    public void testIconstToLdc() {
        MethodTester<Integer> mt = new MethodTester<Integer>(int.class);
        CodeAttribute ca = mt.getCodeAttribute();
        ca.iconst(200);
        ca.returnInstruction();
        Assert.assertEquals(200, (int) mt.invoke());
    }

}
