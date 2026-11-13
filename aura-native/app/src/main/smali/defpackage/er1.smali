.class public final synthetic Ldefpackage/er1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/bp3;
.implements Ldefpackage/kv1;
.implements Ldefpackage/r83;
.implements Ldefpackage/gz0;
.implements Ldefpackage/md4;
.implements Ldefpackage/wc0;
.implements Ldefpackage/ik2;
.implements Ldefpackage/qc2;
.implements Ldefpackage/lm2;
.implements Ldefpackage/eg1;
.implements Ldefpackage/yr2;


# instance fields
.field public final synthetic n:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Ldefpackage/er1;->n:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public synthetic constructor <init>(Ldefpackage/kj2;Ljava/lang/String;ILdefpackage/jn2;I)V
    .locals 0

    .line 7
    iput p5, p0, Ldefpackage/er1;->n:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()V
    .locals 1

    .line 1
    new-instance v0, Lkotlin/KotlinNothingValueException;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw v0
.end method

.method public static synthetic h(II)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "position="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string p0, ", limit="

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    .line 24
    .line 25
    invoke-direct {p1, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1
.end method

.method public static synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1
.end method

.method public static synthetic k(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    const/16 p0, 0x22

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1
.end method

.method public static synthetic l(Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    throw v0
.end method

.method public static synthetic m(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/RuntimeException;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    throw v0
.end method

.method public static synthetic n()V
    .locals 1

    .line 1
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw v0
.end method

.method public static synthetic o(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/IllegalStateException;

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
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw v0
.end method

.method public static p(ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Z)V
    .locals 34

    .line 1
    move/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    sget-object v2, Ldefpackage/rs1;->a:Ldefpackage/rs1;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v2, -0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    sget-object v2, Ldefpackage/qs1;->a:[I

    .line 12
    .line 13
    invoke-static {v0}, Ldefpackage/xa3;->w(I)I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    aget v2, v2, v3

    .line 18
    .line 19
    :goto_0
    const/4 v3, 0x1

    .line 20
    const-string v4, "track"

    .line 21
    .line 22
    const-string v5, "album"

    .line 23
    .line 24
    const-string v6, "artist"

    .line 25
    .line 26
    if-eq v2, v3, :cond_3

    .line 27
    .line 28
    const/4 v7, 0x2

    .line 29
    if-eq v2, v7, :cond_2

    .line 30
    .line 31
    const/4 v7, 0x3

    .line 32
    if-ne v2, v7, :cond_1

    .line 33
    .line 34
    move-object v2, v6

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    invoke-static {}, Ldefpackage/er1;->n()V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_2
    move-object v2, v5

    .line 41
    goto :goto_1

    .line 42
    :cond_3
    move-object v2, v4

    .line 43
    :goto_1
    const/4 v7, 0x0

    .line 44
    if-ne v0, v3, :cond_5

    .line 45
    .line 46
    invoke-static {v1}, Ldefpackage/ot1;->c(Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result v8

    .line 50
    if-eqz v8, :cond_5

    .line 51
    .line 52
    sget-object v8, Ldefpackage/b00;->a:Ldefpackage/b00;

    .line 53
    .line 54
    invoke-static {}, Ldefpackage/b00;->a()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v8

    .line 58
    if-nez v8, :cond_4

    .line 59
    .line 60
    return-void

    .line 61
    :cond_4
    move-object/from16 v24, v8

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_5
    move-object/from16 v24, v7

    .line 65
    .line 66
    :goto_2
    sget-object v8, Lcom/eddyizm/tempus/homemusic/PlayEvent;->Companion:Ldefpackage/ih3;

    .line 67
    .line 68
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    invoke-static {}, Ldefpackage/rs1;->f()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v17

    .line 78
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 79
    .line 80
    .line 81
    move-result-wide v9

    .line 82
    if-ne v0, v3, :cond_6

    .line 83
    .line 84
    invoke-static {v1}, Ldefpackage/rs1;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v11

    .line 88
    move-object/from16 v16, v11

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_6
    move-object/from16 v16, v2

    .line 92
    .line 93
    :goto_3
    if-ne v0, v3, :cond_7

    .line 94
    .line 95
    sget-object v11, Ldefpackage/rs1;->o:Ljava/util/Map;

    .line 96
    .line 97
    invoke-interface {v11, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v11

    .line 101
    check-cast v11, Ldefpackage/k62;

    .line 102
    .line 103
    if-eqz v11, :cond_7

    .line 104
    .line 105
    iget-object v11, v11, Ldefpackage/k62;->a:Ljava/lang/String;

    .line 106
    .line 107
    move-object/from16 v30, v11

    .line 108
    .line 109
    goto :goto_4

    .line 110
    :cond_7
    move-object/from16 v30, v7

    .line 111
    .line 112
    :goto_4
    if-ne v0, v3, :cond_8

    .line 113
    .line 114
    sget-object v0, Ldefpackage/rs1;->o:Ljava/util/Map;

    .line 115
    .line 116
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    check-cast v0, Ldefpackage/k62;

    .line 121
    .line 122
    if-eqz v0, :cond_8

    .line 123
    .line 124
    iget-object v0, v0, Ldefpackage/k62;->b:Ljava/lang/String;

    .line 125
    .line 126
    move-object/from16 v31, v0

    .line 127
    .line 128
    goto :goto_5

    .line 129
    :cond_8
    move-object/from16 v31, v7

    .line 130
    .line 131
    :goto_5
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    const/4 v0, 0x0

    .line 135
    const-string v3, "hub:"

    .line 136
    .line 137
    invoke-static {v1, v3, v0}, Ldefpackage/xm4;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    invoke-static {v9, v10}, Ldefpackage/ih3;->a(J)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v10

    .line 145
    if-eqz p2, :cond_9

    .line 146
    .line 147
    const-string v8, "like"

    .line 148
    .line 149
    :goto_6
    move-object v11, v8

    .line 150
    goto :goto_7

    .line 151
    :cond_9
    const-string v8, "unlike"

    .line 152
    .line 153
    goto :goto_6

    .line 154
    :goto_7
    if-eqz v0, :cond_a

    .line 155
    .line 156
    invoke-static {v1, v3}, Ldefpackage/qm4;->z0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    move-object v12, v3

    .line 161
    goto :goto_8

    .line 162
    :cond_a
    move-object v12, v7

    .line 163
    :goto_8
    if-nez v0, :cond_b

    .line 164
    .line 165
    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    if-eqz v3, :cond_b

    .line 170
    .line 171
    move-object v13, v1

    .line 172
    goto :goto_9

    .line 173
    :cond_b
    move-object v13, v7

    .line 174
    :goto_9
    if-nez v0, :cond_c

    .line 175
    .line 176
    invoke-virtual {v2, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    if-eqz v3, :cond_c

    .line 181
    .line 182
    move-object/from16 v19, v1

    .line 183
    .line 184
    goto :goto_a

    .line 185
    :cond_c
    move-object/from16 v19, v7

    .line 186
    .line 187
    :goto_a
    if-nez v0, :cond_d

    .line 188
    .line 189
    invoke-virtual {v2, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    if-eqz v0, :cond_d

    .line 194
    .line 195
    move-object/from16 v20, v1

    .line 196
    .line 197
    goto :goto_b

    .line 198
    :cond_d
    move-object/from16 v20, v7

    .line 199
    .line 200
    :goto_b
    new-instance v8, Lcom/eddyizm/tempus/homemusic/PlayEvent;

    .line 201
    .line 202
    const v32, 0x1f0060

    .line 203
    .line 204
    .line 205
    const/16 v33, 0x0

    .line 206
    .line 207
    const/4 v14, 0x0

    .line 208
    const/4 v15, 0x0

    .line 209
    const/16 v21, 0x0

    .line 210
    .line 211
    const/16 v25, 0x0

    .line 212
    .line 213
    const/16 v26, 0x0

    .line 214
    .line 215
    const/16 v27, 0x0

    .line 216
    .line 217
    const/16 v28, 0x0

    .line 218
    .line 219
    const/16 v29, 0x0

    .line 220
    .line 221
    move-object/from16 v9, p3

    .line 222
    .line 223
    move-object/from16 v22, p4

    .line 224
    .line 225
    move/from16 v23, p5

    .line 226
    .line 227
    move-object/from16 v18, v2

    .line 228
    .line 229
    invoke-direct/range {v8 .. v33}, Lcom/eddyizm/tempus/homemusic/PlayEvent;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILdefpackage/xj0;)V

    .line 230
    .line 231
    .line 232
    invoke-static {v8}, Ldefpackage/rs1;->j(Lcom/eddyizm/tempus/homemusic/PlayEvent;)V

    .line 233
    .line 234
    .line 235
    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget p0, p0, Ldefpackage/er1;->n:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    check-cast p1, Ldefpackage/aj2;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_1
    check-cast p1, Ldefpackage/aj2;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_2
    check-cast p1, Ljava/util/concurrent/ExecutorService;

    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget p0, p0, Ldefpackage/er1;->n:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Landroid/os/Bundle;

    .line 7
    .line 8
    sget-object p0, Ldefpackage/fn2;->h:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {p1, p0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Landroid/net/Uri;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    sget-object v0, Ldefpackage/fn2;->i:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sget-object v1, Ldefpackage/fn2;->j:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    sget-object v2, Ldefpackage/fn2;->k:Ljava/lang/String;

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    invoke-virtual {p1, v2, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    sget-object v4, Ldefpackage/fn2;->l:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {p1, v4, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    sget-object v4, Ldefpackage/fn2;->m:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {p1, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    sget-object v5, Ldefpackage/fn2;->n:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {p1, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    new-instance v5, Ldefpackage/en2;

    .line 57
    .line 58
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 59
    .line 60
    .line 61
    iput-object p0, v5, Ldefpackage/en2;->a:Landroid/net/Uri;

    .line 62
    .line 63
    invoke-static {v0}, Ldefpackage/lw2;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    iput-object p0, v5, Ldefpackage/en2;->b:Ljava/lang/String;

    .line 68
    .line 69
    iput-object v1, v5, Ldefpackage/en2;->c:Ljava/lang/String;

    .line 70
    .line 71
    iput v2, v5, Ldefpackage/en2;->d:I

    .line 72
    .line 73
    iput v3, v5, Ldefpackage/en2;->e:I

    .line 74
    .line 75
    iput-object v4, v5, Ldefpackage/en2;->f:Ljava/lang/String;

    .line 76
    .line 77
    iput-object p1, v5, Ldefpackage/en2;->g:Ljava/lang/String;

    .line 78
    .line 79
    new-instance p0, Ldefpackage/fn2;

    .line 80
    .line 81
    invoke-direct {p0, v5}, Ldefpackage/fn2;-><init>(Ldefpackage/en2;)V

    .line 82
    .line 83
    .line 84
    return-object p0

    .line 85
    :pswitch_0
    check-cast p1, Ldefpackage/fn2;

    .line 86
    .line 87
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    new-instance p0, Landroid/os/Bundle;

    .line 91
    .line 92
    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    .line 93
    .line 94
    .line 95
    sget-object v0, Ldefpackage/fn2;->h:Ljava/lang/String;

    .line 96
    .line 97
    iget-object v1, p1, Ldefpackage/fn2;->a:Landroid/net/Uri;

    .line 98
    .line 99
    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 100
    .line 101
    .line 102
    iget-object v0, p1, Ldefpackage/fn2;->b:Ljava/lang/String;

    .line 103
    .line 104
    if-eqz v0, :cond_0

    .line 105
    .line 106
    sget-object v1, Ldefpackage/fn2;->i:Ljava/lang/String;

    .line 107
    .line 108
    invoke-virtual {p0, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    :cond_0
    iget-object v0, p1, Ldefpackage/fn2;->c:Ljava/lang/String;

    .line 112
    .line 113
    if-eqz v0, :cond_1

    .line 114
    .line 115
    sget-object v1, Ldefpackage/fn2;->j:Ljava/lang/String;

    .line 116
    .line 117
    invoke-virtual {p0, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    :cond_1
    iget v0, p1, Ldefpackage/fn2;->d:I

    .line 121
    .line 122
    if-eqz v0, :cond_2

    .line 123
    .line 124
    sget-object v1, Ldefpackage/fn2;->k:Ljava/lang/String;

    .line 125
    .line 126
    invoke-virtual {p0, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 127
    .line 128
    .line 129
    :cond_2
    iget v0, p1, Ldefpackage/fn2;->e:I

    .line 130
    .line 131
    if-eqz v0, :cond_3

    .line 132
    .line 133
    sget-object v1, Ldefpackage/fn2;->l:Ljava/lang/String;

    .line 134
    .line 135
    invoke-virtual {p0, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 136
    .line 137
    .line 138
    :cond_3
    iget-object v0, p1, Ldefpackage/fn2;->f:Ljava/lang/String;

    .line 139
    .line 140
    if-eqz v0, :cond_4

    .line 141
    .line 142
    sget-object v1, Ldefpackage/fn2;->m:Ljava/lang/String;

    .line 143
    .line 144
    invoke-virtual {p0, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    :cond_4
    iget-object p1, p1, Ldefpackage/fn2;->g:Ljava/lang/String;

    .line 148
    .line 149
    if-eqz p1, :cond_5

    .line 150
    .line 151
    sget-object v0, Ldefpackage/fn2;->n:Ljava/lang/String;

    .line 152
    .line 153
    invoke-virtual {p0, v0, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    :cond_5
    return-object p0

    .line 157
    :pswitch_1
    check-cast p1, Ldefpackage/fm4;

    .line 158
    .line 159
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    new-instance p0, Landroid/os/Bundle;

    .line 163
    .line 164
    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    .line 165
    .line 166
    .line 167
    iget v0, p1, Ldefpackage/fm4;->n:I

    .line 168
    .line 169
    if-eqz v0, :cond_6

    .line 170
    .line 171
    sget-object v1, Ldefpackage/fm4;->q:Ljava/lang/String;

    .line 172
    .line 173
    invoke-virtual {p0, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 174
    .line 175
    .line 176
    :cond_6
    iget v0, p1, Ldefpackage/fm4;->o:I

    .line 177
    .line 178
    if-eqz v0, :cond_7

    .line 179
    .line 180
    sget-object v1, Ldefpackage/fm4;->r:Ljava/lang/String;

    .line 181
    .line 182
    invoke-virtual {p0, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 183
    .line 184
    .line 185
    :cond_7
    iget p1, p1, Ldefpackage/fm4;->p:I

    .line 186
    .line 187
    if-eqz p1, :cond_8

    .line 188
    .line 189
    sget-object v0, Ldefpackage/fm4;->s:Ljava/lang/String;

    .line 190
    .line 191
    invoke-virtual {p0, v0, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 192
    .line 193
    .line 194
    :cond_8
    return-object p0

    .line 195
    :pswitch_data_0
    .packed-switch 0x18
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public b()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public c(Ldefpackage/bm2;)V
    .locals 2

    .line 1
    iget p0, p0, Ldefpackage/er1;->n:I

    .line 2
    .line 3
    const/16 v0, 0x12

    .line 4
    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ldefpackage/bm2;->f1()Ldefpackage/sk2;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p1}, Ldefpackage/bm2;->f1()Ldefpackage/sk2;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    new-instance v1, Ldefpackage/qa1;

    .line 20
    .line 21
    invoke-direct {v1, v0, p1}, Ldefpackage/qa1;-><init>(ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v1}, Ldefpackage/sk2;->a1(Ljava/lang/Runnable;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_0
    iget-object p0, p1, Ldefpackage/bm2;->i:Ldefpackage/tc2;

    .line 29
    .line 30
    new-instance p1, Ldefpackage/mj0;

    .line 31
    .line 32
    invoke-direct {p1, v0}, Ldefpackage/mj0;-><init>(I)V

    .line 33
    .line 34
    .line 35
    const/16 v0, 0x1a

    .line 36
    .line 37
    invoke-virtual {p0, v0, p1}, Ldefpackage/tc2;->f(ILdefpackage/qc2;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :pswitch_1
    invoke-virtual {p1}, Ldefpackage/bm2;->Y()Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    if-nez p0, :cond_0

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_0
    invoke-virtual {p1}, Ldefpackage/bm2;->f1()Ldefpackage/sk2;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iget-object v0, p0, Ldefpackage/sk2;->f:Landroid/os/Handler;

    .line 60
    .line 61
    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    if-ne p1, v0, :cond_1

    .line 66
    .line 67
    const/4 p1, 0x1

    .line 68
    goto :goto_0

    .line 69
    :cond_1
    const/4 p1, 0x0

    .line 70
    :goto_0
    invoke-static {p1}, Ldefpackage/rr2;->w(Z)V

    .line 71
    .line 72
    .line 73
    iget-object p0, p0, Ldefpackage/sk2;->e:Ldefpackage/qk2;

    .line 74
    .line 75
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    :goto_1
    return-void

    .line 79
    :pswitch_data_0
    .packed-switch 0x15
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public d(IIIII)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public e(Ljava/lang/Object;)I
    .locals 1

    .line 1
    check-cast p1, Ldefpackage/dk2;

    .line 2
    .line 3
    iget-object p0, p1, Ldefpackage/dk2;->a:Ljava/lang/String;

    .line 4
    .line 5
    const-string p1, "OMX.google"

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-nez p1, :cond_2

    .line 12
    .line 13
    const-string p1, "c2.android"

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 23
    .line 24
    const/16 v0, 0x1a

    .line 25
    .line 26
    if-ge p1, v0, :cond_1

    .line 27
    .line 28
    const-string p1, "OMX.MTK.AUDIO.DECODER.RAW"

    .line 29
    .line 30
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-eqz p0, :cond_1

    .line 35
    .line 36
    const/4 p0, -0x1

    .line 37
    return p0

    .line 38
    :cond_1
    const/4 p0, 0x0

    .line 39
    return p0

    .line 40
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 41
    return p0
.end method

.method public f(Ldefpackage/er2;I)V
    .locals 0

    .line 1
    iget p0, p0, Ldefpackage/er1;->n:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, p2}, Ldefpackage/er2;->e(I)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x1b
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public g(Landroidx/preference/Preference;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-static {}, Ldefpackage/rr1;->m()V

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    sput-object p0, Ldefpackage/hw;->i:Ljava/lang/String;

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0
.end method

.method public i(Landroid/widget/EditText;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x1

    .line 5
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 6
    .line 7
    .line 8
    new-instance p0, Landroid/text/InputFilter$LengthFilter;

    .line 9
    .line 10
    const/16 v0, 0x28

    .line 11
    .line 12
    invoke-direct {p0, v0}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    .line 13
    .line 14
    .line 15
    filled-new-array {p0}, [Landroid/text/InputFilter$LengthFilter;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, [Landroid/text/InputFilter;

    .line 20
    .line 21
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    invoke-virtual {p1, p0}, Landroid/widget/EditText;->setSelection(I)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget p0, p0, Ldefpackage/er1;->n:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    check-cast p1, Ldefpackage/oi3;

    .line 8
    .line 9
    invoke-interface {p1, p0}, Ldefpackage/oi3;->s(F)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    check-cast p1, Ldefpackage/oi3;

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    invoke-interface {p1, p0}, Ldefpackage/oi3;->v(I)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x13
        :pswitch_0
    .end packed-switch
.end method

.method public x(Landroid/view/View;Ldefpackage/pb5;)Ldefpackage/pb5;
    .locals 3

    .line 1
    iget p0, p0, Ldefpackage/er1;->n:I

    .line 2
    .line 3
    const/16 v0, 0x207

    .line 4
    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget p0, Lcom/eddyizm/tempus/ui/login/LoginActivity;->R:I

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object p0, p2, Ldefpackage/pb5;->a:Ldefpackage/mb5;

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Ldefpackage/mb5;->h(I)Ldefpackage/vz1;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget v0, p0, Ldefpackage/vz1;->a:I

    .line 23
    .line 24
    iget v1, p0, Ldefpackage/vz1;->b:I

    .line 25
    .line 26
    iget v2, p0, Ldefpackage/vz1;->c:I

    .line 27
    .line 28
    iget p0, p0, Ldefpackage/vz1;->d:I

    .line 29
    .line 30
    invoke-virtual {p1, v0, v1, v2, p0}, Landroid/view/View;->setPadding(IIII)V

    .line 31
    .line 32
    .line 33
    return-object p2

    .line 34
    :pswitch_0
    sget p0, Lcom/eddyizm/tempus/lan/LanPlaybackActivity;->N:I

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    iget-object p0, p2, Ldefpackage/pb5;->a:Ldefpackage/mb5;

    .line 40
    .line 41
    invoke-virtual {p0, v0}, Ldefpackage/mb5;->h(I)Ldefpackage/vz1;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    iget v0, p0, Ldefpackage/vz1;->a:I

    .line 49
    .line 50
    iget v1, p0, Ldefpackage/vz1;->b:I

    .line 51
    .line 52
    iget v2, p0, Ldefpackage/vz1;->c:I

    .line 53
    .line 54
    iget p0, p0, Ldefpackage/vz1;->d:I

    .line 55
    .line 56
    invoke-virtual {p1, v0, v1, v2, p0}, Landroid/view/View;->setPadding(IIII)V

    .line 57
    .line 58
    .line 59
    return-object p2

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_0
    .end packed-switch
.end method
