.class public final Ldefpackage/si;
.super Ldefpackage/bz4;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final d:Ldefpackage/ri;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ldefpackage/ri;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ldefpackage/ri;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ldefpackage/si;->d:Ldefpackage/ri;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ldefpackage/bk0;II)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Ldefpackage/si;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Ldefpackage/si;->b:Ljava/lang/Object;

    .line 13
    .line 14
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Ldefpackage/si;->c:Ljava/lang/Object;

    .line 18
    .line 19
    sget-object p0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 20
    .line 21
    invoke-static {p2, p3, p0}, Ljava/text/DateFormat;->getDateTimeInstance(IILjava/util/Locale;)Ljava/text/DateFormat;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1, p0}, Ljava/util/Locale;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-nez p0, :cond_0

    .line 37
    .line 38
    invoke-static {p2, p3}, Ljava/text/DateFormat;->getDateTimeInstance(II)Ljava/text/DateFormat;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    :cond_0
    sget p0, Ldefpackage/o22;->a:I

    .line 46
    .line 47
    const/16 p1, 0x9

    .line 48
    .line 49
    if-lt p0, p1, :cond_1

    .line 50
    .line 51
    invoke-static {p2, p3}, Ldefpackage/g12;->z(II)Ljava/text/SimpleDateFormat;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    :cond_1
    return-void
.end method

.method public constructor <init>(Ldefpackage/dz4;Ljava/lang/Class;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Ldefpackage/si;->a:I

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    iput-object p1, p0, Ldefpackage/si;->b:Ljava/lang/Object;

    iput-object p2, p0, Ldefpackage/si;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ldefpackage/nk1;Ldefpackage/bz4;Ljava/lang/Class;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ldefpackage/si;->a:I

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    new-instance v0, Ldefpackage/eg2;

    invoke-direct {v0, p1, p2, p3}, Ldefpackage/eg2;-><init>(Ldefpackage/nk1;Ldefpackage/bz4;Ljava/lang/reflect/Type;)V

    iput-object v0, p0, Ldefpackage/si;->b:Ljava/lang/Object;

    .line 61
    iput-object p3, p0, Ldefpackage/si;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ldefpackage/nk1;Ljava/lang/reflect/Type;Ldefpackage/bz4;Ldefpackage/o73;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ldefpackage/si;->a:I

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    new-instance v0, Ldefpackage/eg2;

    invoke-direct {v0, p1, p3, p2}, Ldefpackage/eg2;-><init>(Ldefpackage/nk1;Ldefpackage/bz4;Ljava/lang/reflect/Type;)V

    iput-object v0, p0, Ldefpackage/si;->b:Ljava/lang/Object;

    .line 64
    iput-object p4, p0, Ldefpackage/si;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Ldefpackage/l32;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Ldefpackage/si;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x9

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Ldefpackage/si;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Ljava/lang/Class;

    .line 13
    .line 14
    iget-object p0, p0, Ldefpackage/si;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Ldefpackage/dz4;

    .line 17
    .line 18
    iget-object p0, p0, Ldefpackage/dz4;->p:Ldefpackage/bz4;

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Ldefpackage/bz4;->a(Ldefpackage/l32;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    if-eqz p0, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    new-instance v1, Lcom/google/gson/JsonSyntaxException;

    .line 34
    .line 35
    const-string v2, "Expected a "

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    const-string v3, " but was "

    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    const-string v4, "; at path "

    .line 52
    .line 53
    invoke-virtual {p1}, Ldefpackage/l32;->H()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    new-instance v5, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    invoke-direct {v5, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-direct {v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw v1

    .line 85
    :cond_1
    :goto_0
    return-object p0

    .line 86
    :pswitch_0
    invoke-virtual {p1}, Ldefpackage/l32;->e0()I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-ne v0, v2, :cond_2

    .line 91
    .line 92
    invoke-virtual {p1}, Ldefpackage/l32;->a0()V

    .line 93
    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_2
    invoke-virtual {p1}, Ldefpackage/l32;->c0()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    iget-object v2, p0, Ldefpackage/si;->b:Ljava/lang/Object;

    .line 101
    .line 102
    move-object v4, v2

    .line 103
    check-cast v4, Ljava/util/ArrayList;

    .line 104
    .line 105
    monitor-enter v4

    .line 106
    :try_start_0
    iget-object v2, p0, Ldefpackage/si;->b:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v2, Ljava/util/ArrayList;

    .line 109
    .line 110
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 111
    .line 112
    .line 113
    move-result v5

    .line 114
    move v6, v1

    .line 115
    :catch_0
    if-ge v6, v5, :cond_3

    .line 116
    .line 117
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v7

    .line 121
    add-int/lit8 v6, v6, 0x1

    .line 122
    .line 123
    check-cast v7, Ljava/text/DateFormat;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 124
    .line 125
    :try_start_1
    invoke-virtual {v7, v0}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    .line 126
    .line 127
    .line 128
    move-result-object p1
    :try_end_1
    .catch Ljava/text/ParseException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 129
    :try_start_2
    monitor-exit v4

    .line 130
    goto :goto_1

    .line 131
    :catchall_0
    move-exception p0

    .line 132
    goto :goto_3

    .line 133
    :cond_3
    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 134
    :try_start_3
    new-instance v2, Ljava/text/ParsePosition;

    .line 135
    .line 136
    invoke-direct {v2, v1}, Ljava/text/ParsePosition;-><init>(I)V

    .line 137
    .line 138
    .line 139
    invoke-static {v0, v2}, Ldefpackage/fv1;->b(Ljava/lang/String;Ljava/text/ParsePosition;)Ljava/util/Date;

    .line 140
    .line 141
    .line 142
    move-result-object p1
    :try_end_3
    .catch Ljava/text/ParseException; {:try_start_3 .. :try_end_3} :catch_1

    .line 143
    :goto_1
    iget-object p0, p0, Ldefpackage/si;->c:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast p0, Ldefpackage/bk0;

    .line 146
    .line 147
    invoke-virtual {p0, p1}, Ldefpackage/bk0;->b(Ljava/util/Date;)Ljava/util/Date;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    goto :goto_2

    .line 152
    :catch_1
    move-exception p0

    .line 153
    const-string v1, "Failed parsing \'"

    .line 154
    .line 155
    const-string v2, "\' as Date; at path "

    .line 156
    .line 157
    invoke-static {v1, v0, v2}, Ldefpackage/xa3;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-virtual {p1}, Ldefpackage/l32;->H()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    invoke-static {v0, p1, p0}, Ldefpackage/oi0;->a(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 166
    .line 167
    .line 168
    :goto_2
    return-object v3

    .line 169
    :goto_3
    :try_start_4
    monitor-exit v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 170
    throw p0

    .line 171
    :pswitch_1
    invoke-virtual {p1}, Ldefpackage/l32;->e0()I

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    if-ne v0, v2, :cond_4

    .line 176
    .line 177
    invoke-virtual {p1}, Ldefpackage/l32;->a0()V

    .line 178
    .line 179
    .line 180
    goto :goto_5

    .line 181
    :cond_4
    iget-object v0, p0, Ldefpackage/si;->c:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast v0, Ldefpackage/o73;

    .line 184
    .line 185
    invoke-interface {v0}, Ldefpackage/o73;->A()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    move-object v3, v0

    .line 190
    check-cast v3, Ljava/util/Collection;

    .line 191
    .line 192
    invoke-virtual {p1}, Ldefpackage/l32;->b()V

    .line 193
    .line 194
    .line 195
    :goto_4
    invoke-virtual {p1}, Ldefpackage/l32;->J()Z

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    if-eqz v0, :cond_5

    .line 200
    .line 201
    iget-object v0, p0, Ldefpackage/si;->b:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v0, Ldefpackage/eg2;

    .line 204
    .line 205
    iget-object v0, v0, Ldefpackage/eg2;->c:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast v0, Ldefpackage/bz4;

    .line 208
    .line 209
    invoke-virtual {v0, p1}, Ldefpackage/bz4;->a(Ldefpackage/l32;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-interface {v3, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    goto :goto_4

    .line 217
    :cond_5
    invoke-virtual {p1}, Ldefpackage/l32;->q()V

    .line 218
    .line 219
    .line 220
    :goto_5
    return-object v3

    .line 221
    :pswitch_2
    iget-object v0, p0, Ldefpackage/si;->c:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast v0, Ljava/lang/Class;

    .line 224
    .line 225
    invoke-virtual {p1}, Ldefpackage/l32;->e0()I

    .line 226
    .line 227
    .line 228
    move-result v4

    .line 229
    if-ne v4, v2, :cond_6

    .line 230
    .line 231
    invoke-virtual {p1}, Ldefpackage/l32;->a0()V

    .line 232
    .line 233
    .line 234
    goto :goto_8

    .line 235
    :cond_6
    new-instance v2, Ljava/util/ArrayList;

    .line 236
    .line 237
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 238
    .line 239
    .line 240
    invoke-virtual {p1}, Ldefpackage/l32;->b()V

    .line 241
    .line 242
    .line 243
    :goto_6
    invoke-virtual {p1}, Ldefpackage/l32;->J()Z

    .line 244
    .line 245
    .line 246
    move-result v3

    .line 247
    if-eqz v3, :cond_7

    .line 248
    .line 249
    iget-object v3, p0, Ldefpackage/si;->b:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast v3, Ldefpackage/eg2;

    .line 252
    .line 253
    iget-object v3, v3, Ldefpackage/eg2;->c:Ljava/lang/Object;

    .line 254
    .line 255
    check-cast v3, Ldefpackage/bz4;

    .line 256
    .line 257
    invoke-virtual {v3, p1}, Ldefpackage/bz4;->a(Ldefpackage/l32;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v3

    .line 261
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    goto :goto_6

    .line 265
    :cond_7
    invoke-virtual {p1}, Ldefpackage/l32;->q()V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 269
    .line 270
    .line 271
    move-result p0

    .line 272
    invoke-virtual {v0}, Ljava/lang/Class;->isPrimitive()Z

    .line 273
    .line 274
    .line 275
    move-result p1

    .line 276
    if-eqz p1, :cond_8

    .line 277
    .line 278
    invoke-static {v0, p0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v3

    .line 282
    :goto_7
    if-ge v1, p0, :cond_9

    .line 283
    .line 284
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object p1

    .line 288
    invoke-static {v3, v1, p1}, Ljava/lang/reflect/Array;->set(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 289
    .line 290
    .line 291
    add-int/lit8 v1, v1, 0x1

    .line 292
    .line 293
    goto :goto_7

    .line 294
    :cond_8
    invoke-static {v0, p0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object p0

    .line 298
    check-cast p0, [Ljava/lang/Object;

    .line 299
    .line 300
    invoke-virtual {v2, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v3

    .line 304
    :cond_9
    :goto_8
    return-object v3

    .line 305
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Ldefpackage/q32;Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget v0, p0, Ldefpackage/si;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Ldefpackage/si;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Ldefpackage/dz4;

    .line 10
    .line 11
    iget-object p0, p0, Ldefpackage/dz4;->p:Ldefpackage/bz4;

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2}, Ldefpackage/bz4;->b(Ldefpackage/q32;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    check-cast p2, Ljava/util/Date;

    .line 18
    .line 19
    if-nez p2, :cond_0

    .line 20
    .line 21
    invoke-virtual {p1}, Ldefpackage/q32;->F()Ldefpackage/q32;

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v0, p0, Ldefpackage/si;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Ljava/text/DateFormat;

    .line 34
    .line 35
    iget-object p0, p0, Ldefpackage/si;->b:Ljava/lang/Object;

    .line 36
    .line 37
    move-object v1, p0

    .line 38
    check-cast v1, Ljava/util/ArrayList;

    .line 39
    .line 40
    monitor-enter v1

    .line 41
    :try_start_0
    invoke-virtual {v0, p2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    invoke-virtual {p1, p0}, Ldefpackage/q32;->W(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    :goto_0
    return-void

    .line 50
    :catchall_0
    move-exception p0

    .line 51
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 52
    throw p0

    .line 53
    :pswitch_1
    check-cast p2, Ljava/util/Collection;

    .line 54
    .line 55
    if-nez p2, :cond_1

    .line 56
    .line 57
    invoke-virtual {p1}, Ldefpackage/q32;->F()Ldefpackage/q32;

    .line 58
    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_1
    invoke-virtual {p1}, Ldefpackage/q32;->f()V

    .line 62
    .line 63
    .line 64
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_2

    .line 73
    .line 74
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    iget-object v1, p0, Ldefpackage/si;->b:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v1, Ldefpackage/eg2;

    .line 81
    .line 82
    invoke-virtual {v1, p1, v0}, Ldefpackage/eg2;->b(Ldefpackage/q32;Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_2
    invoke-virtual {p1}, Ldefpackage/q32;->q()V

    .line 87
    .line 88
    .line 89
    :goto_2
    return-void

    .line 90
    :pswitch_2
    if-nez p2, :cond_3

    .line 91
    .line 92
    invoke-virtual {p1}, Ldefpackage/q32;->F()Ldefpackage/q32;

    .line 93
    .line 94
    .line 95
    goto :goto_4

    .line 96
    :cond_3
    invoke-virtual {p1}, Ldefpackage/q32;->f()V

    .line 97
    .line 98
    .line 99
    invoke-static {p2}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    :goto_3
    if-ge v1, v0, :cond_4

    .line 104
    .line 105
    invoke-static {p2, v1}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    iget-object v3, p0, Ldefpackage/si;->b:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v3, Ldefpackage/eg2;

    .line 112
    .line 113
    invoke-virtual {v3, p1, v2}, Ldefpackage/eg2;->b(Ldefpackage/q32;Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    add-int/lit8 v1, v1, 0x1

    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_4
    invoke-virtual {p1}, Ldefpackage/q32;->q()V

    .line 120
    .line 121
    .line 122
    :goto_4
    return-void

    .line 123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget v0, p0, Ldefpackage/si;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    iget-object p0, p0, Ldefpackage/si;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Ljava/util/ArrayList;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, Ljava/text/DateFormat;

    .line 21
    .line 22
    instance-of v0, p0, Ljava/text/SimpleDateFormat;

    .line 23
    .line 24
    const/16 v1, 0x29

    .line 25
    .line 26
    const-string v2, "DefaultDateTypeAdapter("

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    new-instance v0, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    check-cast p0, Ljava/text/SimpleDateFormat;

    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/text/SimpleDateFormat;->toPattern()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    :goto_0
    return-object p0

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method
