.class public final synthetic Ldefpackage/tb4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/bp3;
.implements Ldefpackage/gz0;
.implements Ldefpackage/gs4;
.implements Ldefpackage/ky0;
.implements Ldefpackage/eg1;


# instance fields
.field public final synthetic n:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Ldefpackage/tb4;->n:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic a()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw v0
.end method

.method public static synthetic b(JLjava/lang/Object;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/fido/zzhf;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "Integer value "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw v0
.end method

.method public static synthetic c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw v0
.end method

.method public static synthetic d(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/io/IOException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw v0
.end method

.method public static synthetic e(Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/RuntimeException;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    throw v0
.end method

.method public static synthetic f(Ljava/lang/String;F)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw v0
.end method

.method public static synthetic h(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw v0
.end method

.method public static synthetic j(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 23
    .line 24
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1
.end method

.method public static synthetic k()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw v0
.end method


# virtual methods
.method public G(Ldefpackage/df;)V
    .locals 0

    .line 1
    return-void
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 53

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v0, v0, Ldefpackage/tb4;->n:I

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    move-object/from16 v0, p1

    .line 17
    .line 18
    check-cast v0, Landroid/os/Bundle;

    .line 19
    .line 20
    sget-object v1, Ldefpackage/iw4;->f:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-static {v1}, Ldefpackage/sv4;->a(Landroid/os/Bundle;)Ldefpackage/sv4;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    sget-object v2, Ldefpackage/iw4;->g:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getIntArray(Ljava/lang/String;)[I

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    iget v3, v1, Ldefpackage/sv4;->a:I

    .line 40
    .line 41
    new-array v4, v3, [I

    .line 42
    .line 43
    if-eqz v2, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    move-object v2, v4

    .line 47
    :goto_0
    sget-object v4, Ldefpackage/iw4;->h:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {v0, v4}, Landroid/os/BaseBundle;->getBooleanArray(Ljava/lang/String;)[Z

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    new-array v3, v3, [Z

    .line 54
    .line 55
    if-eqz v4, :cond_1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    move-object v4, v3

    .line 59
    :goto_1
    sget-object v3, Ldefpackage/iw4;->i:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v0, v3, v6}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    new-instance v3, Ldefpackage/iw4;

    .line 66
    .line 67
    invoke-direct {v3, v1, v0, v2, v4}, Ldefpackage/iw4;-><init>(Ldefpackage/sv4;Z[I[Z)V

    .line 68
    .line 69
    .line 70
    return-object v3

    .line 71
    :pswitch_0
    move-object/from16 v0, p1

    .line 72
    .line 73
    check-cast v0, Ldefpackage/iw4;

    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    new-instance v1, Landroid/os/Bundle;

    .line 79
    .line 80
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 81
    .line 82
    .line 83
    sget-object v2, Ldefpackage/iw4;->f:Ljava/lang/String;

    .line 84
    .line 85
    iget-object v3, v0, Ldefpackage/iw4;->b:Ldefpackage/sv4;

    .line 86
    .line 87
    invoke-virtual {v3}, Ldefpackage/sv4;->d()Landroid/os/Bundle;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 92
    .line 93
    .line 94
    sget-object v2, Ldefpackage/iw4;->g:Ljava/lang/String;

    .line 95
    .line 96
    iget-object v3, v0, Ldefpackage/iw4;->d:[I

    .line 97
    .line 98
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putIntArray(Ljava/lang/String;[I)V

    .line 99
    .line 100
    .line 101
    sget-object v2, Ldefpackage/iw4;->h:Ljava/lang/String;

    .line 102
    .line 103
    iget-object v3, v0, Ldefpackage/iw4;->e:[Z

    .line 104
    .line 105
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putBooleanArray(Ljava/lang/String;[Z)V

    .line 106
    .line 107
    .line 108
    sget-object v2, Ldefpackage/iw4;->i:Ljava/lang/String;

    .line 109
    .line 110
    iget-boolean v0, v0, Ldefpackage/iw4;->c:Z

    .line 111
    .line 112
    invoke-virtual {v1, v2, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 113
    .line 114
    .line 115
    return-object v1

    .line 116
    :pswitch_1
    move-object/from16 v0, p1

    .line 117
    .line 118
    check-cast v0, Ldefpackage/sv4;

    .line 119
    .line 120
    iget v0, v0, Ldefpackage/sv4;->c:I

    .line 121
    .line 122
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    return-object v0

    .line 127
    :pswitch_2
    move-object/from16 v0, p1

    .line 128
    .line 129
    check-cast v0, Landroid/os/Bundle;

    .line 130
    .line 131
    sget-object v7, Ldefpackage/tb1;->Q:Ldefpackage/tb1;

    .line 132
    .line 133
    new-instance v8, Ldefpackage/sb1;

    .line 134
    .line 135
    invoke-direct {v8}, Ldefpackage/sb1;-><init>()V

    .line 136
    .line 137
    .line 138
    if-eqz v0, :cond_2

    .line 139
    .line 140
    const-class v1, Ldefpackage/hw;

    .line 141
    .line 142
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    sget-object v2, Ldefpackage/f35;->a:Ljava/lang/String;

    .line 147
    .line 148
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 149
    .line 150
    .line 151
    :cond_2
    sget-object v1, Ldefpackage/tb1;->R:Ljava/lang/String;

    .line 152
    .line 153
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    iget-object v2, v7, Ldefpackage/tb1;->a:Ljava/lang/String;

    .line 158
    .line 159
    if-eqz v1, :cond_3

    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_3
    move-object v1, v2

    .line 163
    :goto_2
    iput-object v1, v8, Ldefpackage/sb1;->a:Ljava/lang/String;

    .line 164
    .line 165
    sget-object v1, Ldefpackage/tb1;->S:Ljava/lang/String;

    .line 166
    .line 167
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    iget-object v2, v7, Ldefpackage/tb1;->b:Ljava/lang/String;

    .line 172
    .line 173
    if-eqz v1, :cond_4

    .line 174
    .line 175
    goto :goto_3

    .line 176
    :cond_4
    move-object v1, v2

    .line 177
    :goto_3
    iput-object v1, v8, Ldefpackage/sb1;->b:Ljava/lang/String;

    .line 178
    .line 179
    sget-object v1, Ldefpackage/tb1;->w0:Ljava/lang/String;

    .line 180
    .line 181
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    if-nez v1, :cond_5

    .line 186
    .line 187
    sget-object v1, Ldefpackage/gy3;->r:Ldefpackage/gy3;

    .line 188
    .line 189
    goto :goto_5

    .line 190
    :cond_5
    invoke-static {}, Ldefpackage/yw1;->j()Ldefpackage/uw1;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    move v3, v6

    .line 195
    :goto_4
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 196
    .line 197
    .line 198
    move-result v4

    .line 199
    if-ge v3, v4, :cond_6

    .line 200
    .line 201
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    check-cast v4, Landroid/os/Bundle;

    .line 206
    .line 207
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    new-instance v5, Ldefpackage/o42;

    .line 211
    .line 212
    sget-object v9, Ldefpackage/o42;->c:Ljava/lang/String;

    .line 213
    .line 214
    invoke-virtual {v4, v9}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v9

    .line 218
    sget-object v10, Ldefpackage/o42;->d:Ljava/lang/String;

    .line 219
    .line 220
    invoke-virtual {v4, v10}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v4

    .line 224
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    invoke-direct {v5, v9, v4}, Ldefpackage/o42;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v2, v5}, Ldefpackage/pw1;->c(Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    add-int/lit8 v3, v3, 0x1

    .line 234
    .line 235
    goto :goto_4

    .line 236
    :cond_6
    invoke-virtual {v2}, Ldefpackage/uw1;->f()Ldefpackage/gy3;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    :goto_5
    invoke-static {v1}, Ldefpackage/yw1;->k(Ljava/util/Collection;)Ldefpackage/yw1;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    iput-object v1, v8, Ldefpackage/sb1;->c:Ldefpackage/yw1;

    .line 245
    .line 246
    sget-object v1, Ldefpackage/tb1;->T:Ljava/lang/String;

    .line 247
    .line 248
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v1

    .line 252
    iget-object v2, v7, Ldefpackage/tb1;->d:Ljava/lang/String;

    .line 253
    .line 254
    if-eqz v1, :cond_7

    .line 255
    .line 256
    goto :goto_6

    .line 257
    :cond_7
    move-object v1, v2

    .line 258
    :goto_6
    iput-object v1, v8, Ldefpackage/sb1;->d:Ljava/lang/String;

    .line 259
    .line 260
    sget-object v1, Ldefpackage/tb1;->U:Ljava/lang/String;

    .line 261
    .line 262
    iget v2, v7, Ldefpackage/tb1;->e:I

    .line 263
    .line 264
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 265
    .line 266
    .line 267
    move-result v1

    .line 268
    iput v1, v8, Ldefpackage/sb1;->e:I

    .line 269
    .line 270
    sget-object v1, Ldefpackage/tb1;->V:Ljava/lang/String;

    .line 271
    .line 272
    iget v2, v7, Ldefpackage/tb1;->f:I

    .line 273
    .line 274
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 275
    .line 276
    .line 277
    move-result v1

    .line 278
    iput v1, v8, Ldefpackage/sb1;->f:I

    .line 279
    .line 280
    sget-object v1, Ldefpackage/tb1;->x0:Ljava/lang/String;

    .line 281
    .line 282
    iget v2, v7, Ldefpackage/tb1;->g:I

    .line 283
    .line 284
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 285
    .line 286
    .line 287
    move-result v1

    .line 288
    iput v1, v8, Ldefpackage/sb1;->g:I

    .line 289
    .line 290
    sget-object v1, Ldefpackage/tb1;->W:Ljava/lang/String;

    .line 291
    .line 292
    iget v2, v7, Ldefpackage/tb1;->h:I

    .line 293
    .line 294
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 295
    .line 296
    .line 297
    move-result v1

    .line 298
    iput v1, v8, Ldefpackage/sb1;->h:I

    .line 299
    .line 300
    sget-object v1, Ldefpackage/tb1;->X:Ljava/lang/String;

    .line 301
    .line 302
    iget v2, v7, Ldefpackage/tb1;->i:I

    .line 303
    .line 304
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 305
    .line 306
    .line 307
    move-result v1

    .line 308
    iput v1, v8, Ldefpackage/sb1;->i:I

    .line 309
    .line 310
    sget-object v1, Ldefpackage/tb1;->Y:Ljava/lang/String;

    .line 311
    .line 312
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v1

    .line 316
    iget-object v2, v7, Ldefpackage/tb1;->k:Ljava/lang/String;

    .line 317
    .line 318
    if-eqz v1, :cond_8

    .line 319
    .line 320
    goto :goto_7

    .line 321
    :cond_8
    move-object v1, v2

    .line 322
    :goto_7
    iput-object v1, v8, Ldefpackage/sb1;->j:Ljava/lang/String;

    .line 323
    .line 324
    sget-object v1, Ldefpackage/tb1;->Z:Ljava/lang/String;

    .line 325
    .line 326
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v1

    .line 330
    iget-object v2, v7, Ldefpackage/tb1;->m:Ljava/lang/String;

    .line 331
    .line 332
    if-eqz v1, :cond_9

    .line 333
    .line 334
    goto :goto_8

    .line 335
    :cond_9
    move-object v1, v2

    .line 336
    :goto_8
    invoke-static {v1}, Ldefpackage/lw2;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v1

    .line 340
    iput-object v1, v8, Ldefpackage/sb1;->l:Ljava/lang/String;

    .line 341
    .line 342
    sget-object v1, Ldefpackage/tb1;->a0:Ljava/lang/String;

    .line 343
    .line 344
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v1

    .line 348
    iget-object v2, v7, Ldefpackage/tb1;->n:Ljava/lang/String;

    .line 349
    .line 350
    if-eqz v1, :cond_a

    .line 351
    .line 352
    goto :goto_9

    .line 353
    :cond_a
    move-object v1, v2

    .line 354
    :goto_9
    invoke-static {v1}, Ldefpackage/lw2;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v1

    .line 358
    iput-object v1, v8, Ldefpackage/sb1;->m:Ljava/lang/String;

    .line 359
    .line 360
    sget-object v1, Ldefpackage/tb1;->b0:Ljava/lang/String;

    .line 361
    .line 362
    iget v2, v7, Ldefpackage/tb1;->o:I

    .line 363
    .line 364
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 365
    .line 366
    .line 367
    move-result v1

    .line 368
    iput v1, v8, Ldefpackage/sb1;->n:I

    .line 369
    .line 370
    new-instance v9, Ljava/util/ArrayList;

    .line 371
    .line 372
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 373
    .line 374
    .line 375
    :goto_a
    new-instance v1, Ljava/lang/StringBuilder;

    .line 376
    .line 377
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 378
    .line 379
    .line 380
    sget-object v2, Ldefpackage/tb1;->c0:Ljava/lang/String;

    .line 381
    .line 382
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 383
    .line 384
    .line 385
    const-string v2, "_"

    .line 386
    .line 387
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 388
    .line 389
    .line 390
    const/16 v2, 0x24

    .line 391
    .line 392
    invoke-static {v6, v2}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object v2

    .line 396
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 397
    .line 398
    .line 399
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v1

    .line 403
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    .line 404
    .line 405
    .line 406
    move-result-object v1

    .line 407
    if-nez v1, :cond_c

    .line 408
    .line 409
    iput-object v9, v8, Ldefpackage/sb1;->p:Ljava/util/List;

    .line 410
    .line 411
    sget-object v1, Ldefpackage/tb1;->d0:Ljava/lang/String;

    .line 412
    .line 413
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 414
    .line 415
    .line 416
    move-result-object v1

    .line 417
    check-cast v1, Ldefpackage/ow0;

    .line 418
    .line 419
    iput-object v1, v8, Ldefpackage/sb1;->q:Ldefpackage/ow0;

    .line 420
    .line 421
    sget-object v1, Ldefpackage/tb1;->e0:Ljava/lang/String;

    .line 422
    .line 423
    iget-wide v2, v7, Ldefpackage/tb1;->s:J

    .line 424
    .line 425
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 426
    .line 427
    .line 428
    move-result-wide v1

    .line 429
    iput-wide v1, v8, Ldefpackage/sb1;->r:J

    .line 430
    .line 431
    sget-object v1, Ldefpackage/tb1;->f0:Ljava/lang/String;

    .line 432
    .line 433
    iget v2, v7, Ldefpackage/tb1;->u:I

    .line 434
    .line 435
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 436
    .line 437
    .line 438
    move-result v1

    .line 439
    iput v1, v8, Ldefpackage/sb1;->t:I

    .line 440
    .line 441
    sget-object v1, Ldefpackage/tb1;->g0:Ljava/lang/String;

    .line 442
    .line 443
    iget v2, v7, Ldefpackage/tb1;->v:I

    .line 444
    .line 445
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 446
    .line 447
    .line 448
    move-result v1

    .line 449
    iput v1, v8, Ldefpackage/sb1;->u:I

    .line 450
    .line 451
    sget-object v1, Ldefpackage/tb1;->z0:Ljava/lang/String;

    .line 452
    .line 453
    iget v2, v7, Ldefpackage/tb1;->w:I

    .line 454
    .line 455
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 456
    .line 457
    .line 458
    move-result v1

    .line 459
    iput v1, v8, Ldefpackage/sb1;->v:I

    .line 460
    .line 461
    sget-object v1, Ldefpackage/tb1;->A0:Ljava/lang/String;

    .line 462
    .line 463
    iget v2, v7, Ldefpackage/tb1;->x:I

    .line 464
    .line 465
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 466
    .line 467
    .line 468
    move-result v1

    .line 469
    iput v1, v8, Ldefpackage/sb1;->w:I

    .line 470
    .line 471
    sget-object v1, Ldefpackage/tb1;->h0:Ljava/lang/String;

    .line 472
    .line 473
    iget v2, v7, Ldefpackage/tb1;->y:F

    .line 474
    .line 475
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    .line 476
    .line 477
    .line 478
    move-result v1

    .line 479
    iput v1, v8, Ldefpackage/sb1;->x:F

    .line 480
    .line 481
    sget-object v1, Ldefpackage/tb1;->i0:Ljava/lang/String;

    .line 482
    .line 483
    iget v2, v7, Ldefpackage/tb1;->z:I

    .line 484
    .line 485
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 486
    .line 487
    .line 488
    move-result v1

    .line 489
    iput v1, v8, Ldefpackage/sb1;->y:I

    .line 490
    .line 491
    sget-object v1, Ldefpackage/tb1;->j0:Ljava/lang/String;

    .line 492
    .line 493
    iget v2, v7, Ldefpackage/tb1;->A:F

    .line 494
    .line 495
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    .line 496
    .line 497
    .line 498
    move-result v1

    .line 499
    iput v1, v8, Ldefpackage/sb1;->z:F

    .line 500
    .line 501
    sget-object v1, Ldefpackage/tb1;->k0:Ljava/lang/String;

    .line 502
    .line 503
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    .line 504
    .line 505
    .line 506
    move-result-object v1

    .line 507
    iput-object v1, v8, Ldefpackage/sb1;->A:[B

    .line 508
    .line 509
    sget-object v1, Ldefpackage/tb1;->l0:Ljava/lang/String;

    .line 510
    .line 511
    iget v2, v7, Ldefpackage/tb1;->C:I

    .line 512
    .line 513
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 514
    .line 515
    .line 516
    move-result v1

    .line 517
    iput v1, v8, Ldefpackage/sb1;->B:I

    .line 518
    .line 519
    sget-object v1, Ldefpackage/tb1;->y0:Ljava/lang/String;

    .line 520
    .line 521
    iget v2, v7, Ldefpackage/tb1;->E:I

    .line 522
    .line 523
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 524
    .line 525
    .line 526
    move-result v1

    .line 527
    iput v1, v8, Ldefpackage/sb1;->D:I

    .line 528
    .line 529
    sget-object v1, Ldefpackage/tb1;->m0:Ljava/lang/String;

    .line 530
    .line 531
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 532
    .line 533
    .line 534
    move-result-object v1

    .line 535
    if-eqz v1, :cond_b

    .line 536
    .line 537
    new-instance v9, Ldefpackage/c50;

    .line 538
    .line 539
    sget-object v2, Ldefpackage/c50;->i:Ljava/lang/String;

    .line 540
    .line 541
    const/4 v3, -0x1

    .line 542
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 543
    .line 544
    .line 545
    move-result v10

    .line 546
    sget-object v2, Ldefpackage/c50;->j:Ljava/lang/String;

    .line 547
    .line 548
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 549
    .line 550
    .line 551
    move-result v11

    .line 552
    sget-object v2, Ldefpackage/c50;->k:Ljava/lang/String;

    .line 553
    .line 554
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 555
    .line 556
    .line 557
    move-result v12

    .line 558
    sget-object v2, Ldefpackage/c50;->l:Ljava/lang/String;

    .line 559
    .line 560
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    .line 561
    .line 562
    .line 563
    move-result-object v13

    .line 564
    sget-object v2, Ldefpackage/c50;->m:Ljava/lang/String;

    .line 565
    .line 566
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 567
    .line 568
    .line 569
    move-result v14

    .line 570
    sget-object v2, Ldefpackage/c50;->n:Ljava/lang/String;

    .line 571
    .line 572
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 573
    .line 574
    .line 575
    move-result v15

    .line 576
    invoke-direct/range {v9 .. v15}, Ldefpackage/c50;-><init>(III[BII)V

    .line 577
    .line 578
    .line 579
    iput-object v9, v8, Ldefpackage/sb1;->C:Ldefpackage/c50;

    .line 580
    .line 581
    :cond_b
    sget-object v1, Ldefpackage/tb1;->n0:Ljava/lang/String;

    .line 582
    .line 583
    iget v2, v7, Ldefpackage/tb1;->F:I

    .line 584
    .line 585
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 586
    .line 587
    .line 588
    move-result v1

    .line 589
    iput v1, v8, Ldefpackage/sb1;->E:I

    .line 590
    .line 591
    sget-object v1, Ldefpackage/tb1;->o0:Ljava/lang/String;

    .line 592
    .line 593
    iget v2, v7, Ldefpackage/tb1;->G:I

    .line 594
    .line 595
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 596
    .line 597
    .line 598
    move-result v1

    .line 599
    iput v1, v8, Ldefpackage/sb1;->F:I

    .line 600
    .line 601
    sget-object v1, Ldefpackage/tb1;->p0:Ljava/lang/String;

    .line 602
    .line 603
    iget v2, v7, Ldefpackage/tb1;->H:I

    .line 604
    .line 605
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 606
    .line 607
    .line 608
    move-result v1

    .line 609
    iput v1, v8, Ldefpackage/sb1;->G:I

    .line 610
    .line 611
    sget-object v1, Ldefpackage/tb1;->q0:Ljava/lang/String;

    .line 612
    .line 613
    iget v2, v7, Ldefpackage/tb1;->I:I

    .line 614
    .line 615
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 616
    .line 617
    .line 618
    move-result v1

    .line 619
    iput v1, v8, Ldefpackage/sb1;->H:I

    .line 620
    .line 621
    sget-object v1, Ldefpackage/tb1;->r0:Ljava/lang/String;

    .line 622
    .line 623
    iget v2, v7, Ldefpackage/tb1;->J:I

    .line 624
    .line 625
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 626
    .line 627
    .line 628
    move-result v1

    .line 629
    iput v1, v8, Ldefpackage/sb1;->I:I

    .line 630
    .line 631
    sget-object v1, Ldefpackage/tb1;->s0:Ljava/lang/String;

    .line 632
    .line 633
    iget v2, v7, Ldefpackage/tb1;->K:I

    .line 634
    .line 635
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 636
    .line 637
    .line 638
    move-result v1

    .line 639
    iput v1, v8, Ldefpackage/sb1;->J:I

    .line 640
    .line 641
    sget-object v1, Ldefpackage/tb1;->u0:Ljava/lang/String;

    .line 642
    .line 643
    iget v2, v7, Ldefpackage/tb1;->M:I

    .line 644
    .line 645
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 646
    .line 647
    .line 648
    move-result v1

    .line 649
    iput v1, v8, Ldefpackage/sb1;->L:I

    .line 650
    .line 651
    sget-object v1, Ldefpackage/tb1;->v0:Ljava/lang/String;

    .line 652
    .line 653
    iget v2, v7, Ldefpackage/tb1;->N:I

    .line 654
    .line 655
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 656
    .line 657
    .line 658
    move-result v1

    .line 659
    iput v1, v8, Ldefpackage/sb1;->M:I

    .line 660
    .line 661
    sget-object v1, Ldefpackage/tb1;->t0:Ljava/lang/String;

    .line 662
    .line 663
    iget v2, v7, Ldefpackage/tb1;->O:I

    .line 664
    .line 665
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 666
    .line 667
    .line 668
    move-result v0

    .line 669
    iput v0, v8, Ldefpackage/sb1;->N:I

    .line 670
    .line 671
    new-instance v0, Ldefpackage/tb1;

    .line 672
    .line 673
    invoke-direct {v0, v8}, Ldefpackage/tb1;-><init>(Ldefpackage/sb1;)V

    .line 674
    .line 675
    .line 676
    return-object v0

    .line 677
    :cond_c
    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 678
    .line 679
    .line 680
    add-int/lit8 v6, v6, 0x1

    .line 681
    .line 682
    goto/16 :goto_a

    .line 683
    .line 684
    :pswitch_3
    move-object/from16 v0, p1

    .line 685
    .line 686
    check-cast v0, Landroid/os/Bundle;

    .line 687
    .line 688
    sget-object v7, Ldefpackage/zt4;->h:Ljava/lang/String;

    .line 689
    .line 690
    invoke-virtual {v0, v7, v6}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 691
    .line 692
    .line 693
    move-result v11

    .line 694
    sget-object v7, Ldefpackage/zt4;->i:Ljava/lang/String;

    .line 695
    .line 696
    invoke-virtual {v0, v7, v4, v5}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 697
    .line 698
    .line 699
    move-result-wide v12

    .line 700
    sget-object v7, Ldefpackage/zt4;->j:Ljava/lang/String;

    .line 701
    .line 702
    invoke-virtual {v0, v7, v2, v3}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 703
    .line 704
    .line 705
    move-result-wide v14

    .line 706
    sget-object v7, Ldefpackage/zt4;->k:Ljava/lang/String;

    .line 707
    .line 708
    invoke-virtual {v0, v7, v6}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 709
    .line 710
    .line 711
    move-result v17

    .line 712
    sget-object v7, Ldefpackage/zt4;->l:Ljava/lang/String;

    .line 713
    .line 714
    invoke-virtual {v0, v7}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 715
    .line 716
    .line 717
    move-result-object v0

    .line 718
    if-eqz v0, :cond_1e

    .line 719
    .line 720
    sget-object v7, Ldefpackage/z5;->h:Ljava/lang/String;

    .line 721
    .line 722
    invoke-virtual {v0, v7}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 723
    .line 724
    .line 725
    move-result-object v7

    .line 726
    if-nez v7, :cond_d

    .line 727
    .line 728
    new-array v1, v6, [Ldefpackage/x5;

    .line 729
    .line 730
    move-object/from16 v19, v1

    .line 731
    .line 732
    goto/16 :goto_1b

    .line 733
    .line 734
    :cond_d
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 735
    .line 736
    .line 737
    move-result v8

    .line 738
    new-array v8, v8, [Ldefpackage/x5;

    .line 739
    .line 740
    move v9, v6

    .line 741
    :goto_b
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 742
    .line 743
    .line 744
    move-result v10

    .line 745
    if-ge v9, v10, :cond_1d

    .line 746
    .line 747
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 748
    .line 749
    .line 750
    move-result-object v10

    .line 751
    check-cast v10, Landroid/os/Bundle;

    .line 752
    .line 753
    sget-object v1, Ldefpackage/x5;->m:Ljava/lang/String;

    .line 754
    .line 755
    invoke-virtual {v10, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 756
    .line 757
    .line 758
    move-result-wide v19

    .line 759
    sget-object v1, Ldefpackage/x5;->n:Ljava/lang/String;

    .line 760
    .line 761
    invoke-virtual {v10, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 762
    .line 763
    .line 764
    move-result v21

    .line 765
    sget-object v1, Ldefpackage/x5;->t:Ljava/lang/String;

    .line 766
    .line 767
    invoke-virtual {v10, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 768
    .line 769
    .line 770
    move-result v22

    .line 771
    sget-object v1, Ldefpackage/x5;->o:Ljava/lang/String;

    .line 772
    .line 773
    invoke-virtual {v10, v1}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 774
    .line 775
    .line 776
    move-result-object v1

    .line 777
    sget-object v4, Ldefpackage/x5;->u:Ljava/lang/String;

    .line 778
    .line 779
    invoke-virtual {v10, v4}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 780
    .line 781
    .line 782
    move-result-object v4

    .line 783
    sget-object v5, Ldefpackage/x5;->p:Ljava/lang/String;

    .line 784
    .line 785
    invoke-virtual {v10, v5}, Landroid/os/BaseBundle;->getIntArray(Ljava/lang/String;)[I

    .line 786
    .line 787
    .line 788
    move-result-object v5

    .line 789
    sget-object v2, Ldefpackage/x5;->q:Ljava/lang/String;

    .line 790
    .line 791
    invoke-virtual {v10, v2}, Landroid/os/BaseBundle;->getLongArray(Ljava/lang/String;)[J

    .line 792
    .line 793
    .line 794
    move-result-object v2

    .line 795
    sget-object v3, Ldefpackage/x5;->r:Ljava/lang/String;

    .line 796
    .line 797
    invoke-virtual {v10, v3}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 798
    .line 799
    .line 800
    move-result-wide v26

    .line 801
    sget-object v3, Ldefpackage/x5;->s:Ljava/lang/String;

    .line 802
    .line 803
    invoke-virtual {v10, v3}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 804
    .line 805
    .line 806
    move-result v28

    .line 807
    sget-object v3, Ldefpackage/x5;->v:Ljava/lang/String;

    .line 808
    .line 809
    invoke-virtual {v10, v3}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 810
    .line 811
    .line 812
    move-result-object v3

    .line 813
    sget-object v6, Ldefpackage/x5;->x:Ljava/lang/String;

    .line 814
    .line 815
    invoke-virtual {v10, v6}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 816
    .line 817
    .line 818
    move-result-object v6

    .line 819
    move-object/from16 p1, v2

    .line 820
    .line 821
    sget-object v2, Ldefpackage/x5;->w:Ljava/lang/String;

    .line 822
    .line 823
    invoke-virtual {v10, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 824
    .line 825
    .line 826
    move-result v31

    .line 827
    new-instance v18, Ldefpackage/x5;

    .line 828
    .line 829
    if-nez v5, :cond_e

    .line 830
    .line 831
    const/4 v2, 0x0

    .line 832
    new-array v5, v2, [I

    .line 833
    .line 834
    :cond_e
    move-object/from16 v23, v5

    .line 835
    .line 836
    if-eqz v4, :cond_11

    .line 837
    .line 838
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 839
    .line 840
    .line 841
    move-result v1

    .line 842
    new-array v1, v1, [Ldefpackage/gn2;

    .line 843
    .line 844
    const/4 v2, 0x0

    .line 845
    :goto_c
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 846
    .line 847
    .line 848
    move-result v5

    .line 849
    if-ge v2, v5, :cond_10

    .line 850
    .line 851
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 852
    .line 853
    .line 854
    move-result-object v5

    .line 855
    check-cast v5, Landroid/os/Bundle;

    .line 856
    .line 857
    if-nez v5, :cond_f

    .line 858
    .line 859
    const/4 v5, 0x0

    .line 860
    goto :goto_d

    .line 861
    :cond_f
    invoke-static {v5}, Ldefpackage/gn2;->b(Landroid/os/Bundle;)Ldefpackage/gn2;

    .line 862
    .line 863
    .line 864
    move-result-object v5

    .line 865
    :goto_d
    aput-object v5, v1, v2

    .line 866
    .line 867
    add-int/lit8 v2, v2, 0x1

    .line 868
    .line 869
    goto :goto_c

    .line 870
    :cond_10
    move-object/from16 v24, v1

    .line 871
    .line 872
    :goto_e
    const/4 v2, 0x0

    .line 873
    goto/16 :goto_14

    .line 874
    .line 875
    :cond_11
    if-eqz v1, :cond_17

    .line 876
    .line 877
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 878
    .line 879
    .line 880
    move-result v2

    .line 881
    new-array v2, v2, [Ldefpackage/gn2;

    .line 882
    .line 883
    const/4 v4, 0x0

    .line 884
    :goto_f
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 885
    .line 886
    .line 887
    move-result v5

    .line 888
    if-ge v4, v5, :cond_16

    .line 889
    .line 890
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 891
    .line 892
    .line 893
    move-result-object v5

    .line 894
    move-object/from16 v33, v5

    .line 895
    .line 896
    check-cast v33, Landroid/net/Uri;

    .line 897
    .line 898
    if-nez v33, :cond_12

    .line 899
    .line 900
    move-object/from16 v24, v1

    .line 901
    .line 902
    move-object/from16 v25, v2

    .line 903
    .line 904
    const/16 v40, 0x0

    .line 905
    .line 906
    goto :goto_13

    .line 907
    :cond_12
    sget-object v5, Ldefpackage/gn2;->g:Ldefpackage/gn2;

    .line 908
    .line 909
    new-instance v5, Ldefpackage/um2;

    .line 910
    .line 911
    invoke-direct {v5}, Ldefpackage/um2;-><init>()V

    .line 912
    .line 913
    .line 914
    new-instance v10, Ldefpackage/xm2;

    .line 915
    .line 916
    invoke-direct {v10}, Ldefpackage/xm2;-><init>()V

    .line 917
    .line 918
    .line 919
    sget-object v37, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 920
    .line 921
    sget-object v39, Ldefpackage/gy3;->r:Ldefpackage/gy3;

    .line 922
    .line 923
    move-object/from16 v24, v1

    .line 924
    .line 925
    new-instance v1, Ldefpackage/zm2;

    .line 926
    .line 927
    invoke-direct {v1}, Ldefpackage/zm2;-><init>()V

    .line 928
    .line 929
    .line 930
    sget-object v46, Ldefpackage/cn2;->d:Ldefpackage/cn2;

    .line 931
    .line 932
    move-object/from16 v25, v2

    .line 933
    .line 934
    iget-object v2, v10, Ldefpackage/xm2;->e:Ljava/lang/Object;

    .line 935
    .line 936
    check-cast v2, Landroid/net/Uri;

    .line 937
    .line 938
    if-eqz v2, :cond_14

    .line 939
    .line 940
    iget-object v2, v10, Ldefpackage/xm2;->d:Ljava/lang/Object;

    .line 941
    .line 942
    check-cast v2, Ljava/util/UUID;

    .line 943
    .line 944
    if-eqz v2, :cond_13

    .line 945
    .line 946
    goto :goto_10

    .line 947
    :cond_13
    const/4 v2, 0x0

    .line 948
    goto :goto_11

    .line 949
    :cond_14
    :goto_10
    const/4 v2, 0x1

    .line 950
    :goto_11
    invoke-static {v2}, Ldefpackage/rr2;->w(Z)V

    .line 951
    .line 952
    .line 953
    new-instance v43, Ldefpackage/bn2;

    .line 954
    .line 955
    iget-object v2, v10, Ldefpackage/xm2;->d:Ljava/lang/Object;

    .line 956
    .line 957
    check-cast v2, Ljava/util/UUID;

    .line 958
    .line 959
    if-eqz v2, :cond_15

    .line 960
    .line 961
    new-instance v2, Ldefpackage/ym2;

    .line 962
    .line 963
    invoke-direct {v2, v10}, Ldefpackage/ym2;-><init>(Ldefpackage/xm2;)V

    .line 964
    .line 965
    .line 966
    move-object/from16 v35, v2

    .line 967
    .line 968
    goto :goto_12

    .line 969
    :cond_15
    const/16 v35, 0x0

    .line 970
    .line 971
    :goto_12
    const/16 v34, 0x0

    .line 972
    .line 973
    const/16 v36, 0x0

    .line 974
    .line 975
    const/16 v38, 0x0

    .line 976
    .line 977
    const-wide v40, -0x7fffffffffffffffL    # -4.9E-324

    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    move-object/from16 v32, v43

    .line 983
    .line 984
    invoke-direct/range {v32 .. v41}, Ldefpackage/bn2;-><init>(Landroid/net/Uri;Ljava/lang/String;Ldefpackage/ym2;Ldefpackage/sm2;Ljava/util/List;Ljava/lang/String;Ldefpackage/yw1;J)V

    .line 985
    .line 986
    .line 987
    new-instance v40, Ldefpackage/gn2;

    .line 988
    .line 989
    new-instance v2, Ldefpackage/wm2;

    .line 990
    .line 991
    invoke-direct {v2, v5}, Ldefpackage/vm2;-><init>(Ldefpackage/um2;)V

    .line 992
    .line 993
    .line 994
    new-instance v5, Ldefpackage/an2;

    .line 995
    .line 996
    invoke-direct {v5, v1}, Ldefpackage/an2;-><init>(Ldefpackage/zm2;)V

    .line 997
    .line 998
    .line 999
    sget-object v45, Ldefpackage/do2;->K:Ldefpackage/do2;

    .line 1000
    .line 1001
    const-string v41, ""

    .line 1002
    .line 1003
    move-object/from16 v42, v2

    .line 1004
    .line 1005
    move-object/from16 v44, v5

    .line 1006
    .line 1007
    invoke-direct/range {v40 .. v46}, Ldefpackage/gn2;-><init>(Ljava/lang/String;Ldefpackage/wm2;Ldefpackage/bn2;Ldefpackage/an2;Ldefpackage/do2;Ldefpackage/cn2;)V

    .line 1008
    .line 1009
    .line 1010
    :goto_13
    aput-object v40, v25, v4

    .line 1011
    .line 1012
    add-int/lit8 v4, v4, 0x1

    .line 1013
    .line 1014
    move-object/from16 v1, v24

    .line 1015
    .line 1016
    move-object/from16 v2, v25

    .line 1017
    .line 1018
    goto/16 :goto_f

    .line 1019
    .line 1020
    :cond_16
    move-object/from16 v25, v2

    .line 1021
    .line 1022
    move-object/from16 v24, v25

    .line 1023
    .line 1024
    goto/16 :goto_e

    .line 1025
    .line 1026
    :cond_17
    const/4 v2, 0x0

    .line 1027
    new-array v1, v2, [Ldefpackage/gn2;

    .line 1028
    .line 1029
    move-object/from16 v24, v1

    .line 1030
    .line 1031
    :goto_14
    if-nez p1, :cond_18

    .line 1032
    .line 1033
    new-array v1, v2, [J

    .line 1034
    .line 1035
    move-object/from16 v25, v1

    .line 1036
    .line 1037
    goto :goto_15

    .line 1038
    :cond_18
    move-object/from16 v25, p1

    .line 1039
    .line 1040
    :goto_15
    new-array v1, v2, [Ljava/lang/String;

    .line 1041
    .line 1042
    if-nez v3, :cond_19

    .line 1043
    .line 1044
    :goto_16
    move-object/from16 v29, v1

    .line 1045
    .line 1046
    goto :goto_17

    .line 1047
    :cond_19
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 1048
    .line 1049
    .line 1050
    move-result-object v1

    .line 1051
    check-cast v1, [Ljava/lang/String;

    .line 1052
    .line 1053
    goto :goto_16

    .line 1054
    :goto_17
    if-nez v6, :cond_1b

    .line 1055
    .line 1056
    new-array v1, v2, [Ldefpackage/y5;

    .line 1057
    .line 1058
    :cond_1a
    move-object/from16 v30, v1

    .line 1059
    .line 1060
    goto :goto_1a

    .line 1061
    :cond_1b
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 1062
    .line 1063
    .line 1064
    move-result v1

    .line 1065
    new-array v1, v1, [Ldefpackage/y5;

    .line 1066
    .line 1067
    const/4 v2, 0x0

    .line 1068
    :goto_18
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 1069
    .line 1070
    .line 1071
    move-result v3

    .line 1072
    if-ge v2, v3, :cond_1a

    .line 1073
    .line 1074
    invoke-interface {v6, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v3

    .line 1078
    check-cast v3, Landroid/os/Bundle;

    .line 1079
    .line 1080
    if-nez v3, :cond_1c

    .line 1081
    .line 1082
    const/16 v32, 0x0

    .line 1083
    .line 1084
    goto :goto_19

    .line 1085
    :cond_1c
    new-instance v32, Ldefpackage/y5;

    .line 1086
    .line 1087
    sget-object v4, Ldefpackage/y5;->d:Ljava/lang/String;

    .line 1088
    .line 1089
    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 1090
    .line 1091
    .line 1092
    move-result-wide v33

    .line 1093
    sget-object v4, Ldefpackage/y5;->e:Ljava/lang/String;

    .line 1094
    .line 1095
    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 1096
    .line 1097
    .line 1098
    move-result-wide v35

    .line 1099
    sget-object v4, Ldefpackage/y5;->f:Ljava/lang/String;

    .line 1100
    .line 1101
    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v37

    .line 1105
    invoke-direct/range {v32 .. v37}, Ldefpackage/y5;-><init>(JJLjava/lang/String;)V

    .line 1106
    .line 1107
    .line 1108
    :goto_19
    aput-object v32, v1, v2

    .line 1109
    .line 1110
    add-int/lit8 v2, v2, 0x1

    .line 1111
    .line 1112
    goto :goto_18

    .line 1113
    :goto_1a
    invoke-direct/range {v18 .. v31}, Ldefpackage/x5;-><init>(JII[I[Ldefpackage/gn2;[JJZ[Ljava/lang/String;[Ldefpackage/y5;Z)V

    .line 1114
    .line 1115
    .line 1116
    aput-object v18, v8, v9

    .line 1117
    .line 1118
    add-int/lit8 v9, v9, 0x1

    .line 1119
    .line 1120
    const-wide/16 v2, 0x0

    .line 1121
    .line 1122
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    const/4 v6, 0x0

    .line 1128
    goto/16 :goto_b

    .line 1129
    .line 1130
    :cond_1d
    move-object/from16 v19, v8

    .line 1131
    .line 1132
    :goto_1b
    sget-object v1, Ldefpackage/z5;->i:Ljava/lang/String;

    .line 1133
    .line 1134
    const-wide/16 v2, 0x0

    .line 1135
    .line 1136
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 1137
    .line 1138
    .line 1139
    move-result-wide v20

    .line 1140
    sget-object v1, Ldefpackage/z5;->j:Ljava/lang/String;

    .line 1141
    .line 1142
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 1148
    .line 1149
    .line 1150
    move-result-wide v22

    .line 1151
    sget-object v1, Ldefpackage/z5;->k:Ljava/lang/String;

    .line 1152
    .line 1153
    const/4 v2, 0x0

    .line 1154
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 1155
    .line 1156
    .line 1157
    move-result v24

    .line 1158
    new-instance v18, Ldefpackage/z5;

    .line 1159
    .line 1160
    invoke-direct/range {v18 .. v24}, Ldefpackage/z5;-><init>([Ldefpackage/x5;JJI)V

    .line 1161
    .line 1162
    .line 1163
    :goto_1c
    move-object/from16 v16, v18

    .line 1164
    .line 1165
    goto :goto_1d

    .line 1166
    :cond_1e
    sget-object v18, Ldefpackage/z5;->f:Ldefpackage/z5;

    .line 1167
    .line 1168
    goto :goto_1c

    .line 1169
    :goto_1d
    new-instance v8, Ldefpackage/zt4;

    .line 1170
    .line 1171
    invoke-direct {v8}, Ldefpackage/zt4;-><init>()V

    .line 1172
    .line 1173
    .line 1174
    const/4 v9, 0x0

    .line 1175
    const/4 v10, 0x0

    .line 1176
    invoke-virtual/range {v8 .. v17}, Ldefpackage/zt4;->i(Ljava/lang/Object;Ljava/lang/Object;IJJLdefpackage/z5;Z)V

    .line 1177
    .line 1178
    .line 1179
    return-object v8

    .line 1180
    :pswitch_4
    move-object/from16 v0, p1

    .line 1181
    .line 1182
    check-cast v0, Landroid/os/Bundle;

    .line 1183
    .line 1184
    sget-object v1, Ldefpackage/bu4;->s:Ljava/lang/String;

    .line 1185
    .line 1186
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v1

    .line 1190
    if-eqz v1, :cond_1f

    .line 1191
    .line 1192
    invoke-static {v1}, Ldefpackage/gn2;->b(Landroid/os/Bundle;)Ldefpackage/gn2;

    .line 1193
    .line 1194
    .line 1195
    move-result-object v1

    .line 1196
    :goto_1e
    move-object/from16 v34, v1

    .line 1197
    .line 1198
    goto :goto_1f

    .line 1199
    :cond_1f
    sget-object v1, Ldefpackage/gn2;->g:Ldefpackage/gn2;

    .line 1200
    .line 1201
    goto :goto_1e

    .line 1202
    :goto_1f
    sget-object v1, Ldefpackage/bu4;->t:Ljava/lang/String;

    .line 1203
    .line 1204
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 1210
    .line 1211
    .line 1212
    move-result-wide v36

    .line 1213
    sget-object v1, Ldefpackage/bu4;->u:Ljava/lang/String;

    .line 1214
    .line 1215
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 1216
    .line 1217
    .line 1218
    move-result-wide v38

    .line 1219
    sget-object v1, Ldefpackage/bu4;->v:Ljava/lang/String;

    .line 1220
    .line 1221
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 1222
    .line 1223
    .line 1224
    move-result-wide v40

    .line 1225
    sget-object v1, Ldefpackage/bu4;->w:Ljava/lang/String;

    .line 1226
    .line 1227
    const/4 v2, 0x0

    .line 1228
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 1229
    .line 1230
    .line 1231
    move-result v42

    .line 1232
    sget-object v1, Ldefpackage/bu4;->x:Ljava/lang/String;

    .line 1233
    .line 1234
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 1235
    .line 1236
    .line 1237
    move-result v43

    .line 1238
    sget-object v1, Ldefpackage/bu4;->y:Ljava/lang/String;

    .line 1239
    .line 1240
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 1241
    .line 1242
    .line 1243
    move-result-object v1

    .line 1244
    if-eqz v1, :cond_20

    .line 1245
    .line 1246
    invoke-static {v1}, Ldefpackage/an2;->b(Landroid/os/Bundle;)Ldefpackage/an2;

    .line 1247
    .line 1248
    .line 1249
    move-result-object v1

    .line 1250
    move-object/from16 v44, v1

    .line 1251
    .line 1252
    goto :goto_20

    .line 1253
    :cond_20
    const/16 v44, 0x0

    .line 1254
    .line 1255
    :goto_20
    sget-object v1, Ldefpackage/bu4;->z:Ljava/lang/String;

    .line 1256
    .line 1257
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 1258
    .line 1259
    .line 1260
    move-result v1

    .line 1261
    sget-object v3, Ldefpackage/bu4;->A:Ljava/lang/String;

    .line 1262
    .line 1263
    const-wide/16 v4, 0x0

    .line 1264
    .line 1265
    invoke-virtual {v0, v3, v4, v5}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 1266
    .line 1267
    .line 1268
    move-result-wide v45

    .line 1269
    sget-object v3, Ldefpackage/bu4;->B:Ljava/lang/String;

    .line 1270
    .line 1271
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    invoke-virtual {v0, v3, v6, v7}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 1277
    .line 1278
    .line 1279
    move-result-wide v47

    .line 1280
    sget-object v3, Ldefpackage/bu4;->C:Ljava/lang/String;

    .line 1281
    .line 1282
    invoke-virtual {v0, v3, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 1283
    .line 1284
    .line 1285
    move-result v49

    .line 1286
    sget-object v3, Ldefpackage/bu4;->D:Ljava/lang/String;

    .line 1287
    .line 1288
    invoke-virtual {v0, v3, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 1289
    .line 1290
    .line 1291
    move-result v50

    .line 1292
    sget-object v2, Ldefpackage/bu4;->E:Ljava/lang/String;

    .line 1293
    .line 1294
    invoke-virtual {v0, v2, v4, v5}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 1295
    .line 1296
    .line 1297
    move-result-wide v51

    .line 1298
    new-instance v32, Ldefpackage/bu4;

    .line 1299
    .line 1300
    invoke-direct/range {v32 .. v32}, Ldefpackage/bu4;-><init>()V

    .line 1301
    .line 1302
    .line 1303
    sget-object v33, Ldefpackage/bu4;->q:Ljava/lang/Object;

    .line 1304
    .line 1305
    const/16 v35, 0x0

    .line 1306
    .line 1307
    invoke-virtual/range {v32 .. v52}, Ldefpackage/bu4;->b(Ljava/lang/Object;Ldefpackage/gn2;Ljava/lang/Object;JJJZZLdefpackage/an2;JJIIJ)V

    .line 1308
    .line 1309
    .line 1310
    move-object/from16 v0, v32

    .line 1311
    .line 1312
    iput-boolean v1, v0, Ldefpackage/bu4;->j:Z

    .line 1313
    .line 1314
    return-object v0

    .line 1315
    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public g(Landroidx/preference/Preference;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget p0, p0, Ldefpackage/tb4;->n:I

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    packed-switch p0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    check-cast p2, Ljava/lang/String;

    .line 8
    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    :goto_0
    return p1

    .line 20
    :pswitch_0
    instance-of p0, p2, Ljava/lang/Boolean;

    .line 21
    .line 22
    if-eqz p0, :cond_1

    .line 23
    .line 24
    check-cast p2, Ljava/lang/Boolean;

    .line 25
    .line 26
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    const-string p2, "mini_shuffle_button_visibility"

    .line 31
    .line 32
    invoke-static {p2, p0}, Ldefpackage/xa3;->t(Ljava/lang/String;Z)V

    .line 33
    .line 34
    .line 35
    :cond_1
    return p1

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public i(Landroid/widget/EditText;)V
    .locals 2

    .line 1
    const/4 p0, 0x2

    .line 2
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setInputType(I)V

    .line 3
    .line 4
    .line 5
    new-instance p0, Ldefpackage/sb4;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    new-array v0, v0, [Landroid/text/InputFilter;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    aput-object p0, v0, v1

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
