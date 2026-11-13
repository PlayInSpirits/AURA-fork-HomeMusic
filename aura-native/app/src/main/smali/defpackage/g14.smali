.class public abstract Ldefpackage/g14;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final a:Ljava/lang/ThreadLocal;

.field public static final b:Ljava/util/WeakHashMap;

.field public static final c:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ldefpackage/g14;->a:Ljava/lang/ThreadLocal;

    .line 7
    .line 8
    new-instance v0, Ljava/util/WeakHashMap;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, v1}, Ljava/util/WeakHashMap;-><init>(I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Ldefpackage/g14;->b:Ljava/util/WeakHashMap;

    .line 15
    .line 16
    new-instance v0, Ljava/lang/Object;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    sput-object v0, Ldefpackage/g14;->c:Ljava/lang/Object;

    .line 22
    .line 23
    return-void
.end method

.method public static a(Landroid/content/Context;ILandroid/util/TypedValue;ILdefpackage/au0;ZZ)Landroid/graphics/Typeface;
    .locals 12

    .line 1
    move-object/from16 v7, p4

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-virtual {v2, p1, p2, v0}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    .line 9
    .line 10
    .line 11
    const-string v9, "ResourcesCompat"

    .line 12
    .line 13
    iget-object v0, p2, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    .line 14
    .line 15
    if-eqz v0, :cond_c

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    const-string v0, "res/"

    .line 22
    .line 23
    invoke-virtual {v4, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/4 v10, 0x0

    .line 28
    const/4 v11, -0x3

    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    if-eqz v7, :cond_9

    .line 32
    .line 33
    invoke-virtual {v7, v11}, Ldefpackage/au0;->e(I)V

    .line 34
    .line 35
    .line 36
    goto/16 :goto_4

    .line 37
    .line 38
    :cond_0
    iget v0, p2, Landroid/util/TypedValue;->assetCookie:I

    .line 39
    .line 40
    sget-object v6, Ldefpackage/d05;->b:Ldefpackage/fg4;

    .line 41
    .line 42
    invoke-static {v2, p1, v4, v0, p3}, Ldefpackage/d05;->b(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v6, v0}, Ldefpackage/fg4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Landroid/graphics/Typeface;

    .line 51
    .line 52
    const/16 v8, 0x13

    .line 53
    .line 54
    if-eqz v0, :cond_2

    .line 55
    .line 56
    if-eqz v7, :cond_1

    .line 57
    .line 58
    new-instance p0, Landroid/os/Handler;

    .line 59
    .line 60
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 65
    .line 66
    .line 67
    new-instance p2, Ldefpackage/ur2;

    .line 68
    .line 69
    invoke-direct {p2, v8, v7, v0}, Ldefpackage/ur2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 73
    .line 74
    .line 75
    :cond_1
    move-object v10, v0

    .line 76
    goto/16 :goto_4

    .line 77
    .line 78
    :cond_2
    if-eqz p6, :cond_3

    .line 79
    .line 80
    goto/16 :goto_4

    .line 81
    .line 82
    :cond_3
    :try_start_0
    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    const-string v1, ".xml"

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-eqz v0, :cond_5

    .line 93
    .line 94
    invoke-virtual {v2, p1}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-static {v0, v2}, Ldefpackage/e35;->L(Landroid/content/res/XmlResourceParser;Landroid/content/res/Resources;)Ldefpackage/xa1;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    if-nez v1, :cond_4

    .line 103
    .line 104
    const-string p0, "Failed to find font-family tag"

    .line 105
    .line 106
    invoke-static {v9, p0}, Landroid/util/Ldefpackage/og;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 107
    .line 108
    .line 109
    if-eqz v7, :cond_9

    .line 110
    .line 111
    invoke-virtual {v7, v11}, Ldefpackage/au0;->e(I)V

    .line 112
    .line 113
    .line 114
    goto :goto_4

    .line 115
    :catch_0
    move-exception v0

    .line 116
    move-object p0, v0

    .line 117
    goto :goto_1

    .line 118
    :catch_1
    move-exception v0

    .line 119
    move-object p0, v0

    .line 120
    goto :goto_2

    .line 121
    :cond_4
    iget v5, p2, Landroid/util/TypedValue;->assetCookie:I

    .line 122
    .line 123
    move-object v0, p0

    .line 124
    move v3, p1

    .line 125
    move v6, p3

    .line 126
    move/from16 v8, p5

    .line 127
    .line 128
    invoke-static/range {v0 .. v8}, Ldefpackage/d05;->a(Landroid/content/Context;Ldefpackage/xa1;Landroid/content/res/Resources;ILjava/lang/String;IILdefpackage/au0;Z)Landroid/graphics/Typeface;

    .line 129
    .line 130
    .line 131
    move-result-object v10

    .line 132
    goto :goto_4

    .line 133
    :cond_5
    iget p2, p2, Landroid/util/TypedValue;->assetCookie:I

    .line 134
    .line 135
    sget-object v0, Ldefpackage/d05;->a:Ldefpackage/vr1;

    .line 136
    .line 137
    move-object v1, p0

    .line 138
    move v3, p1

    .line 139
    move v5, p3

    .line 140
    invoke-virtual/range {v0 .. v5}, Ldefpackage/vr1;->h(Landroid/content/Context;Landroid/content/res/Resources;ILjava/lang/String;I)Landroid/graphics/Typeface;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    if-eqz p0, :cond_6

    .line 145
    .line 146
    invoke-static {v2, p1, v4, p2, p3}, Ldefpackage/d05;->b(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p2

    .line 150
    invoke-virtual {v6, p2, p0}, Ldefpackage/fg4;->l(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    :cond_6
    if-eqz v7, :cond_7

    .line 154
    .line 155
    if-eqz p0, :cond_8

    .line 156
    .line 157
    new-instance p2, Landroid/os/Handler;

    .line 158
    .line 159
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 164
    .line 165
    .line 166
    new-instance v0, Ldefpackage/ur2;

    .line 167
    .line 168
    invoke-direct {v0, v8, v7, p0}, Ldefpackage/ur2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {p2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 172
    .line 173
    .line 174
    :cond_7
    :goto_0
    move-object v10, p0

    .line 175
    goto :goto_4

    .line 176
    :cond_8
    invoke-virtual {v7, v11}, Ldefpackage/au0;->e(I)V
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 177
    .line 178
    .line 179
    goto :goto_0

    .line 180
    :goto_1
    const-string p2, "Failed to read xml resource "

    .line 181
    .line 182
    invoke-virtual {p2, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object p2

    .line 186
    invoke-static {v9, p2, p0}, Landroid/util/Ldefpackage/og;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 187
    .line 188
    .line 189
    goto :goto_3

    .line 190
    :goto_2
    const-string p2, "Failed to parse xml resource "

    .line 191
    .line 192
    invoke-virtual {p2, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object p2

    .line 196
    invoke-static {v9, p2, p0}, Landroid/util/Ldefpackage/og;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 197
    .line 198
    .line 199
    :goto_3
    if-eqz v7, :cond_9

    .line 200
    .line 201
    invoke-virtual {v7, v11}, Ldefpackage/au0;->e(I)V

    .line 202
    .line 203
    .line 204
    :cond_9
    :goto_4
    if-nez v10, :cond_b

    .line 205
    .line 206
    if-nez v7, :cond_b

    .line 207
    .line 208
    if-eqz p6, :cond_a

    .line 209
    .line 210
    goto :goto_5

    .line 211
    :cond_a
    new-instance p0, Landroid/content/res/Resources$NotFoundException;

    .line 212
    .line 213
    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    new-instance p2, Ljava/lang/StringBuilder;

    .line 218
    .line 219
    const-string v0, "Font resource ID #0x"

    .line 220
    .line 221
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    const-string p1, " could not be retrieved."

    .line 228
    .line 229
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    invoke-direct {p0, p1}, Landroid/content/res/Resources$NotFoundException;-><init>(Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    throw p0

    .line 240
    :cond_b
    :goto_5
    return-object v10

    .line 241
    :cond_c
    new-instance p0, Landroid/content/res/Resources$NotFoundException;

    .line 242
    .line 243
    invoke-virtual {v2, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    new-instance v1, Ljava/lang/StringBuilder;

    .line 252
    .line 253
    const-string v2, "Resource \""

    .line 254
    .line 255
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 259
    .line 260
    .line 261
    const-string v0, "\" ("

    .line 262
    .line 263
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    const-string p1, ") is not a Font: "

    .line 270
    .line 271
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object p1

    .line 281
    invoke-direct {p0, p1}, Landroid/content/res/Resources$NotFoundException;-><init>(Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    throw p0
.end method
