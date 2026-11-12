.class public final Llb;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lrl0;
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final A:La0;

.field public final n:Lra;

.field public final o:Lna;

.field public p:Lgp3;

.field public final q:Ljava/util/ArrayList;

.field public final r:J

.field public s:Ljb;

.field public t:Z

.field public final u:Law;

.field public v:Li03;

.field public w:J

.field public final x:Li03;

.field public y:Lj94;

.field public z:Z


# direct methods
.method public constructor <init>(Lra;Lna;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Llb;->n:Lra;

    .line 5
    .line 6
    iput-object p2, p0, Llb;->o:Lna;

    .line 7
    .line 8
    new-instance p2, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p2, p0, Llb;->q:Ljava/util/ArrayList;

    .line 14
    .line 15
    const-wide/16 v0, 0x64

    .line 16
    .line 17
    iput-wide v0, p0, Llb;->r:J

    .line 18
    .line 19
    sget-object p2, Ljb;->n:Ljb;

    .line 20
    .line 21
    iput-object p2, p0, Llb;->s:Ljb;

    .line 22
    .line 23
    const/4 p2, 0x1

    .line 24
    iput-boolean p2, p0, Llb;->t:Z

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    const/4 v1, 0x6

    .line 28
    invoke-static {p2, v1, v0}, Lsu3;->a(IILwv;)Law;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    iput-object p2, p0, Llb;->u:Law;

    .line 33
    .line 34
    new-instance p2, Landroid/os/Handler;

    .line 35
    .line 36
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 41
    .line 42
    .line 43
    sget-object p2, Lf02;->a:Li03;

    .line 44
    .line 45
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    iput-object p2, p0, Llb;->v:Li03;

    .line 49
    .line 50
    new-instance v0, Li03;

    .line 51
    .line 52
    invoke-direct {v0}, Li03;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object v0, p0, Llb;->x:Li03;

    .line 56
    .line 57
    new-instance v0, Lj94;

    .line 58
    .line 59
    invoke-virtual {p1}, Lra;->getSemanticsOwner()Ll94;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {p1}, Ll94;->a()Li94;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-direct {v0, p1, p2}, Lj94;-><init>(Li94;Le02;)V

    .line 68
    .line 69
    .line 70
    iput-object v0, p0, Llb;->y:Lj94;

    .line 71
    .line 72
    new-instance p1, La0;

    .line 73
    .line 74
    const/4 p2, 0x5

    .line 75
    invoke-direct {p1, p2, p0}, La0;-><init>(ILjava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    iput-object p1, p0, Llb;->A:La0;

    .line 79
    .line 80
    return-void
.end method


# virtual methods
.method public final a(Lwd0;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p1, Lkb;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lkb;

    .line 7
    .line 8
    iget v1, v0, Lkb;->q:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lkb;->q:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lkb;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lkb;-><init>(Llb;Lwd0;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lkb;->o:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lkb;->q:I

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    const/4 v3, 0x1

    .line 31
    sget-object v4, Lxe0;->n:Lxe0;

    .line 32
    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    if-eq v1, v3, :cond_2

    .line 36
    .line 37
    if-ne v1, v2, :cond_1

    .line 38
    .line 39
    iget-object v1, v0, Lkb;->n:Lxv;

    .line 40
    .line 41
    invoke-static {p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 p0, 0x0

    .line 51
    return-object p0

    .line 52
    :cond_2
    iget-object v1, v0, Lkb;->n:Lxv;

    .line 53
    .line 54
    invoke-static {p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_3
    invoke-static {p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iget-object p1, p0, Llb;->u:Law;

    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    new-instance v1, Lxv;

    .line 67
    .line 68
    invoke-direct {v1, p1}, Lxv;-><init>(Law;)V

    .line 69
    .line 70
    .line 71
    :cond_4
    :goto_1
    iput-object v1, v0, Lkb;->n:Lxv;

    .line 72
    .line 73
    iput v3, v0, Lkb;->q:I

    .line 74
    .line 75
    invoke-virtual {v1, v0}, Lxv;->b(Lwd0;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    if-ne p1, v4, :cond_5

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_5
    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    .line 83
    .line 84
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    if-eqz p1, :cond_8

    .line 89
    .line 90
    invoke-virtual {v1}, Lxv;->c()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0}, Llb;->e()Z

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    if-eqz p1, :cond_6

    .line 98
    .line 99
    invoke-virtual {p0}, Llb;->f()V

    .line 100
    .line 101
    .line 102
    :cond_6
    iget-object p1, p0, Llb;->n:Lra;

    .line 103
    .line 104
    invoke-virtual {p1}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    iget-boolean v5, p0, Llb;->z:Z

    .line 109
    .line 110
    if-nez v5, :cond_7

    .line 111
    .line 112
    if-eqz p1, :cond_7

    .line 113
    .line 114
    iput-boolean v3, p0, Llb;->z:Z

    .line 115
    .line 116
    iget-object v5, p0, Llb;->A:La0;

    .line 117
    .line 118
    invoke-virtual {p1, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 119
    .line 120
    .line 121
    :cond_7
    iput-object v1, v0, Lkb;->n:Lxv;

    .line 122
    .line 123
    iput v2, v0, Lkb;->q:I

    .line 124
    .line 125
    iget-wide v5, p0, Llb;->r:J

    .line 126
    .line 127
    invoke-static {v5, v6, v0}, Lau0;->j(JLwd0;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    if-ne p1, v4, :cond_4

    .line 132
    .line 133
    :goto_3
    return-object v4

    .line 134
    :cond_8
    sget-object p0, Lj15;->a:Lj15;

    .line 135
    .line 136
    return-object p0
.end method

.method public final c(Le02;)V
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v1, Le02;->b:[I

    .line 6
    .line 7
    iget-object v3, v1, Le02;->a:[J

    .line 8
    .line 9
    array-length v4, v3

    .line 10
    add-int/lit8 v4, v4, -0x2

    .line 11
    .line 12
    if-ltz v4, :cond_17

    .line 13
    .line 14
    const/4 v6, 0x0

    .line 15
    :goto_0
    aget-wide v7, v3, v6

    .line 16
    .line 17
    not-long v9, v7

    .line 18
    const/4 v11, 0x7

    .line 19
    shl-long/2addr v9, v11

    .line 20
    and-long/2addr v9, v7

    .line 21
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    and-long/2addr v9, v12

    .line 27
    cmp-long v9, v9, v12

    .line 28
    .line 29
    if-eqz v9, :cond_16

    .line 30
    .line 31
    sub-int v9, v6, v4

    .line 32
    .line 33
    not-int v9, v9

    .line 34
    ushr-int/lit8 v9, v9, 0x1f

    .line 35
    .line 36
    const/16 v10, 0x8

    .line 37
    .line 38
    rsub-int/lit8 v9, v9, 0x8

    .line 39
    .line 40
    const/4 v14, 0x0

    .line 41
    :goto_1
    if-ge v14, v9, :cond_15

    .line 42
    .line 43
    const-wide/16 v15, 0xff

    .line 44
    .line 45
    and-long v17, v7, v15

    .line 46
    .line 47
    const-wide/16 v19, 0x80

    .line 48
    .line 49
    cmp-long v17, v17, v19

    .line 50
    .line 51
    if-gez v17, :cond_14

    .line 52
    .line 53
    shl-int/lit8 v17, v6, 0x3

    .line 54
    .line 55
    add-int v17, v17, v14

    .line 56
    .line 57
    aget v5, v2, v17

    .line 58
    .line 59
    move/from16 v17, v11

    .line 60
    .line 61
    iget-object v11, v0, Llb;->x:Li03;

    .line 62
    .line 63
    invoke-virtual {v11, v5}, Le02;->b(I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v11

    .line 67
    check-cast v11, Lj94;

    .line 68
    .line 69
    invoke-virtual {v1, v5}, Le02;->b(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    check-cast v5, Lk94;

    .line 74
    .line 75
    const/16 v21, 0x0

    .line 76
    .line 77
    if-eqz v5, :cond_0

    .line 78
    .line 79
    iget-object v5, v5, Lk94;->a:Li94;

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_0
    move-object/from16 v5, v21

    .line 83
    .line 84
    :goto_2
    if-eqz v5, :cond_13

    .line 85
    .line 86
    move-wide/from16 v22, v12

    .line 87
    .line 88
    iget v12, v5, Li94;->f:I

    .line 89
    .line 90
    iget-object v5, v5, Li94;->d:Le94;

    .line 91
    .line 92
    iget-object v5, v5, Le94;->n:Lw03;

    .line 93
    .line 94
    if-nez v11, :cond_9

    .line 95
    .line 96
    iget-object v11, v5, Lw03;->b:[Ljava/lang/Object;

    .line 97
    .line 98
    iget-object v13, v5, Lw03;->a:[J

    .line 99
    .line 100
    move-wide/from16 v24, v15

    .line 101
    .line 102
    array-length v15, v13

    .line 103
    add-int/lit8 v15, v15, -0x2

    .line 104
    .line 105
    move-object/from16 v26, v2

    .line 106
    .line 107
    if-ltz v15, :cond_7

    .line 108
    .line 109
    move/from16 v16, v10

    .line 110
    .line 111
    const/4 v10, 0x0

    .line 112
    :goto_3
    aget-wide v1, v13, v10

    .line 113
    .line 114
    move-wide/from16 v27, v7

    .line 115
    .line 116
    not-long v7, v1

    .line 117
    shl-long v7, v7, v17

    .line 118
    .line 119
    and-long/2addr v7, v1

    .line 120
    and-long v7, v7, v22

    .line 121
    .line 122
    cmp-long v7, v7, v22

    .line 123
    .line 124
    if-eqz v7, :cond_6

    .line 125
    .line 126
    sub-int v7, v10, v15

    .line 127
    .line 128
    not-int v7, v7

    .line 129
    ushr-int/lit8 v7, v7, 0x1f

    .line 130
    .line 131
    rsub-int/lit8 v7, v7, 0x8

    .line 132
    .line 133
    const/4 v8, 0x0

    .line 134
    :goto_4
    if-ge v8, v7, :cond_5

    .line 135
    .line 136
    and-long v29, v1, v24

    .line 137
    .line 138
    cmp-long v29, v29, v19

    .line 139
    .line 140
    if-gez v29, :cond_3

    .line 141
    .line 142
    shl-int/lit8 v29, v10, 0x3

    .line 143
    .line 144
    add-int v29, v29, v8

    .line 145
    .line 146
    aget-object v29, v11, v29

    .line 147
    .line 148
    move-wide/from16 v30, v1

    .line 149
    .line 150
    move-object/from16 v1, v29

    .line 151
    .line 152
    check-cast v1, Lp94;

    .line 153
    .line 154
    sget-object v2, Ln94;->z:Lp94;

    .line 155
    .line 156
    invoke-static {v1, v2}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    if-eqz v1, :cond_4

    .line 161
    .line 162
    invoke-virtual {v5, v2}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    if-nez v1, :cond_1

    .line 167
    .line 168
    move-object/from16 v1, v21

    .line 169
    .line 170
    :cond_1
    check-cast v1, Ljava/util/List;

    .line 171
    .line 172
    if-eqz v1, :cond_2

    .line 173
    .line 174
    invoke-static {v1}, Lq40;->x0(Ljava/util/List;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    check-cast v1, Lhe;

    .line 179
    .line 180
    goto :goto_5

    .line 181
    :cond_2
    move-object/from16 v1, v21

    .line 182
    .line 183
    :goto_5
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    invoke-virtual {v0, v12, v1}, Llb;->h(ILjava/lang/String;)V

    .line 188
    .line 189
    .line 190
    goto :goto_6

    .line 191
    :cond_3
    move-wide/from16 v30, v1

    .line 192
    .line 193
    :cond_4
    :goto_6
    shr-long v1, v30, v16

    .line 194
    .line 195
    add-int/lit8 v8, v8, 0x1

    .line 196
    .line 197
    goto :goto_4

    .line 198
    :cond_5
    move/from16 v1, v16

    .line 199
    .line 200
    if-ne v7, v1, :cond_8

    .line 201
    .line 202
    :cond_6
    if-eq v10, v15, :cond_8

    .line 203
    .line 204
    add-int/lit8 v10, v10, 0x1

    .line 205
    .line 206
    move-wide/from16 v7, v27

    .line 207
    .line 208
    const/16 v16, 0x8

    .line 209
    .line 210
    goto :goto_3

    .line 211
    :cond_7
    move-wide/from16 v27, v7

    .line 212
    .line 213
    :cond_8
    move v15, v14

    .line 214
    goto/16 :goto_d

    .line 215
    .line 216
    :cond_9
    move-object/from16 v26, v2

    .line 217
    .line 218
    move-wide/from16 v27, v7

    .line 219
    .line 220
    move-wide/from16 v24, v15

    .line 221
    .line 222
    iget-object v1, v5, Lw03;->b:[Ljava/lang/Object;

    .line 223
    .line 224
    iget-object v2, v5, Lw03;->a:[J

    .line 225
    .line 226
    array-length v7, v2

    .line 227
    add-int/lit8 v7, v7, -0x2

    .line 228
    .line 229
    if-ltz v7, :cond_8

    .line 230
    .line 231
    move-object v10, v1

    .line 232
    move-object v13, v2

    .line 233
    const/4 v8, 0x0

    .line 234
    :goto_7
    aget-wide v1, v13, v8

    .line 235
    .line 236
    move-object/from16 v29, v13

    .line 237
    .line 238
    move v15, v14

    .line 239
    not-long v13, v1

    .line 240
    shl-long v13, v13, v17

    .line 241
    .line 242
    and-long/2addr v13, v1

    .line 243
    and-long v13, v13, v22

    .line 244
    .line 245
    cmp-long v13, v13, v22

    .line 246
    .line 247
    if-eqz v13, :cond_11

    .line 248
    .line 249
    sub-int v13, v8, v7

    .line 250
    .line 251
    not-int v13, v13

    .line 252
    ushr-int/lit8 v13, v13, 0x1f

    .line 253
    .line 254
    const/16 v16, 0x8

    .line 255
    .line 256
    rsub-int/lit8 v13, v13, 0x8

    .line 257
    .line 258
    const/4 v14, 0x0

    .line 259
    :goto_8
    if-ge v14, v13, :cond_10

    .line 260
    .line 261
    and-long v30, v1, v24

    .line 262
    .line 263
    cmp-long v30, v30, v19

    .line 264
    .line 265
    if-gez v30, :cond_f

    .line 266
    .line 267
    shl-int/lit8 v30, v8, 0x3

    .line 268
    .line 269
    add-int v30, v30, v14

    .line 270
    .line 271
    aget-object v30, v10, v30

    .line 272
    .line 273
    move-wide/from16 v31, v1

    .line 274
    .line 275
    move-object/from16 v1, v30

    .line 276
    .line 277
    check-cast v1, Lp94;

    .line 278
    .line 279
    sget-object v2, Ln94;->z:Lp94;

    .line 280
    .line 281
    invoke-static {v1, v2}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    move-result v1

    .line 285
    if-eqz v1, :cond_e

    .line 286
    .line 287
    iget-object v1, v11, Lj94;->a:Le94;

    .line 288
    .line 289
    iget-object v1, v1, Le94;->n:Lw03;

    .line 290
    .line 291
    invoke-virtual {v1, v2}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    if-nez v1, :cond_a

    .line 296
    .line 297
    move-object/from16 v1, v21

    .line 298
    .line 299
    :cond_a
    check-cast v1, Ljava/util/List;

    .line 300
    .line 301
    if-eqz v1, :cond_b

    .line 302
    .line 303
    invoke-static {v1}, Lq40;->x0(Ljava/util/List;)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v1

    .line 307
    check-cast v1, Lhe;

    .line 308
    .line 309
    goto :goto_9

    .line 310
    :cond_b
    move-object/from16 v1, v21

    .line 311
    .line 312
    :goto_9
    invoke-virtual {v5, v2}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v2

    .line 316
    if-nez v2, :cond_c

    .line 317
    .line 318
    move-object/from16 v2, v21

    .line 319
    .line 320
    :cond_c
    check-cast v2, Ljava/util/List;

    .line 321
    .line 322
    if-eqz v2, :cond_d

    .line 323
    .line 324
    invoke-static {v2}, Lq40;->x0(Ljava/util/List;)Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v2

    .line 328
    check-cast v2, Lhe;

    .line 329
    .line 330
    goto :goto_a

    .line 331
    :cond_d
    move-object/from16 v2, v21

    .line 332
    .line 333
    :goto_a
    invoke-static {v1, v2}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 334
    .line 335
    .line 336
    move-result v1

    .line 337
    if-nez v1, :cond_e

    .line 338
    .line 339
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v1

    .line 343
    invoke-virtual {v0, v12, v1}, Llb;->h(ILjava/lang/String;)V

    .line 344
    .line 345
    .line 346
    :cond_e
    :goto_b
    const/16 v1, 0x8

    .line 347
    .line 348
    goto :goto_c

    .line 349
    :cond_f
    move-wide/from16 v31, v1

    .line 350
    .line 351
    goto :goto_b

    .line 352
    :goto_c
    shr-long v30, v31, v1

    .line 353
    .line 354
    add-int/lit8 v14, v14, 0x1

    .line 355
    .line 356
    move-wide/from16 v1, v30

    .line 357
    .line 358
    goto :goto_8

    .line 359
    :cond_10
    const/16 v1, 0x8

    .line 360
    .line 361
    if-ne v13, v1, :cond_12

    .line 362
    .line 363
    :cond_11
    if-eq v8, v7, :cond_12

    .line 364
    .line 365
    add-int/lit8 v8, v8, 0x1

    .line 366
    .line 367
    move v14, v15

    .line 368
    move-object/from16 v13, v29

    .line 369
    .line 370
    goto/16 :goto_7

    .line 371
    .line 372
    :cond_12
    :goto_d
    const/16 v1, 0x8

    .line 373
    .line 374
    goto :goto_e

    .line 375
    :cond_13
    const-string v0, "no value for specified key"

    .line 376
    .line 377
    invoke-static {v0}, Lxa3;->l(Ljava/lang/String;)Lkotlin/KotlinNothingValueException;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    throw v0

    .line 382
    :cond_14
    move-object/from16 v26, v2

    .line 383
    .line 384
    move-wide/from16 v27, v7

    .line 385
    .line 386
    move/from16 v17, v11

    .line 387
    .line 388
    move-wide/from16 v22, v12

    .line 389
    .line 390
    move v15, v14

    .line 391
    move v1, v10

    .line 392
    :goto_e
    shr-long v7, v27, v1

    .line 393
    .line 394
    add-int/lit8 v14, v15, 0x1

    .line 395
    .line 396
    move v10, v1

    .line 397
    move/from16 v11, v17

    .line 398
    .line 399
    move-wide/from16 v12, v22

    .line 400
    .line 401
    move-object/from16 v2, v26

    .line 402
    .line 403
    move-object/from16 v1, p1

    .line 404
    .line 405
    goto/16 :goto_1

    .line 406
    .line 407
    :cond_15
    move-object/from16 v26, v2

    .line 408
    .line 409
    move v1, v10

    .line 410
    if-ne v9, v1, :cond_17

    .line 411
    .line 412
    goto :goto_f

    .line 413
    :cond_16
    move-object/from16 v26, v2

    .line 414
    .line 415
    :goto_f
    if-eq v6, v4, :cond_17

    .line 416
    .line 417
    add-int/lit8 v6, v6, 0x1

    .line 418
    .line 419
    move-object/from16 v1, p1

    .line 420
    .line 421
    move-object/from16 v2, v26

    .line 422
    .line 423
    goto/16 :goto_0

    .line 424
    .line 425
    :cond_17
    return-void
.end method

.method public final d()Le02;
    .locals 4

    .line 1
    iget-boolean v0, p0, Llb;->t:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Llb;->t:Z

    .line 7
    .line 8
    iget-object v1, p0, Llb;->n:Lra;

    .line 9
    .line 10
    invoke-virtual {v1}, Lra;->getSemanticsOwner()Ll94;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    new-instance v2, Lk2;

    .line 15
    .line 16
    const/4 v3, 0x5

    .line 17
    invoke-direct {v2, v3, v0}, Lk2;-><init>(IB)V

    .line 18
    .line 19
    .line 20
    invoke-static {v1, v2}, Lwr1;->o(Ll94;Lif1;)Li03;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, Llb;->v:Li03;

    .line 25
    .line 26
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    iput-wide v0, p0, Llb;->w:J

    .line 31
    .line 32
    :cond_0
    iget-object p0, p0, Llb;->v:Li03;

    .line 33
    .line 34
    return-object p0
.end method

.method public final e()Z
    .locals 0

    .line 1
    iget-object p0, p0, Llb;->p:Lgp3;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public final f()V
    .locals 9

    .line 1
    iget-object v0, p0, Llb;->p:Lgp3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_2

    .line 6
    .line 7
    :cond_0
    iget-object v1, v0, Lgp3;->o:Ljava/lang/Object;

    .line 8
    .line 9
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 10
    .line 11
    const/16 v3, 0x1d

    .line 12
    .line 13
    if-ge v2, v3, :cond_1

    .line 14
    .line 15
    goto/16 :goto_2

    .line 16
    .line 17
    :cond_1
    iget-object p0, p0, Llb;->q:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_7

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    const/4 v4, 0x0

    .line 30
    move v5, v4

    .line 31
    :goto_0
    const/4 v6, 0x1

    .line 32
    if-ge v5, v2, :cond_5

    .line 33
    .line 34
    invoke-virtual {p0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v7

    .line 38
    check-cast v7, Lyc0;

    .line 39
    .line 40
    iget-object v8, v7, Lyc0;->c:Lzc0;

    .line 41
    .line 42
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 43
    .line 44
    .line 45
    move-result v8

    .line 46
    if-eqz v8, :cond_3

    .line 47
    .line 48
    if-ne v8, v6, :cond_2

    .line 49
    .line 50
    iget v6, v7, Lyc0;->a:I

    .line 51
    .line 52
    int-to-long v6, v6

    .line 53
    invoke-virtual {v0, v6, v7}, Lgp3;->q(J)Landroid/view/autofill/AutofillId;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    if-eqz v6, :cond_4

    .line 58
    .line 59
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 60
    .line 61
    if-lt v7, v3, :cond_4

    .line 62
    .line 63
    invoke-static {v1}, Lkz;->d(Ljava/lang/Object;)Landroid/view/contentcapture/ContentCaptureSession;

    .line 64
    .line 65
    .line 66
    move-result-object v7

    .line 67
    invoke-static {v7, v6}, Lyh;->g(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/autofill/AutofillId;)V

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    invoke-static {}, Ler1;->n()V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_3
    iget-object v6, v7, Lyc0;->d:Loz4;

    .line 76
    .line 77
    if-eqz v6, :cond_4

    .line 78
    .line 79
    iget-object v6, v6, Loz4;->n:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v6, Landroid/view/ViewStructure;

    .line 82
    .line 83
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 84
    .line 85
    if-lt v7, v3, :cond_4

    .line 86
    .line 87
    invoke-static {v1}, Lkz;->d(Ljava/lang/Object;)Landroid/view/contentcapture/ContentCaptureSession;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    invoke-static {v7, v6}, Lyh;->f(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/ViewStructure;)V

    .line 92
    .line 93
    .line 94
    :cond_4
    :goto_1
    add-int/lit8 v5, v5, 0x1

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_5
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 98
    .line 99
    if-lt v2, v3, :cond_6

    .line 100
    .line 101
    invoke-static {v1}, Lkz;->d(Ljava/lang/Object;)Landroid/view/contentcapture/ContentCaptureSession;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    iget-object v0, v0, Lgp3;->p:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v0, Landroid/view/View;

    .line 108
    .line 109
    invoke-static {v0}, Lbu;->l(Landroid/view/View;)Lhg3;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    iget-object v0, v0, Lhg3;->o:Ljava/lang/Object;

    .line 117
    .line 118
    invoke-static {v0}, Ltn;->f(Ljava/lang/Object;)Landroid/view/autofill/AutofillId;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    new-array v2, v6, [J

    .line 123
    .line 124
    const-wide/high16 v5, -0x8000000000000000L

    .line 125
    .line 126
    aput-wide v5, v2, v4

    .line 127
    .line 128
    invoke-static {v1, v0, v2}, Lyh;->i(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/autofill/AutofillId;[J)V

    .line 129
    .line 130
    .line 131
    :cond_6
    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    .line 132
    .line 133
    .line 134
    :cond_7
    :goto_2
    return-void
.end method

.method public final g(Li94;Lj94;)V
    .locals 9

    .line 1
    new-instance v0, Lib;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, p2, p0}, Lib;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/4 p2, 0x4

    .line 11
    invoke-static {p2, p1}, Li94;->j(ILi94;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    move v4, v1

    .line 20
    move v5, v4

    .line 21
    :goto_0
    if-ge v4, v3, :cond_1

    .line 22
    .line 23
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    move-object v7, v6

    .line 28
    check-cast v7, Li94;

    .line 29
    .line 30
    invoke-virtual {p0}, Llb;->d()Le02;

    .line 31
    .line 32
    .line 33
    move-result-object v8

    .line 34
    iget v7, v7, Li94;->f:I

    .line 35
    .line 36
    invoke-virtual {v8, v7}, Le02;->a(I)Z

    .line 37
    .line 38
    .line 39
    move-result v7

    .line 40
    if-eqz v7, :cond_0

    .line 41
    .line 42
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    invoke-interface {v0, v7, v6}, Lwf1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    add-int/lit8 v5, v5, 0x1

    .line 50
    .line 51
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    invoke-static {p2, p1}, Li94;->j(ILi94;)Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    :goto_1
    if-ge v1, p2, :cond_4

    .line 63
    .line 64
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    check-cast v0, Li94;

    .line 69
    .line 70
    invoke-virtual {p0}, Llb;->d()Le02;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    iget v3, v0, Li94;->f:I

    .line 75
    .line 76
    invoke-virtual {v2, v3}, Le02;->a(I)Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eqz v2, :cond_3

    .line 81
    .line 82
    iget-object v2, p0, Llb;->x:Li03;

    .line 83
    .line 84
    invoke-virtual {v2, v3}, Le02;->a(I)Z

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    if-eqz v4, :cond_3

    .line 89
    .line 90
    invoke-virtual {v2, v3}, Le02;->b(I)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    if-eqz v2, :cond_2

    .line 95
    .line 96
    check-cast v2, Lj94;

    .line 97
    .line 98
    invoke-virtual {p0, v0, v2}, Llb;->g(Li94;Lj94;)V

    .line 99
    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_2
    const-string p0, "node not present in pruned tree before this change"

    .line 103
    .line 104
    invoke-static {p0}, Lxa3;->l(Ljava/lang/String;)Lkotlin/KotlinNothingValueException;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    throw p0

    .line 109
    :cond_3
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_4
    return-void
.end method

.method public final h(ILjava/lang/String;)V
    .locals 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object p0, p0, Llb;->p:Lgp3;

    .line 9
    .line 10
    if-nez p0, :cond_1

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_1
    int-to-long v2, p1

    .line 14
    invoke-virtual {p0, v2, v3}, Lgp3;->q(J)Landroid/view/autofill/AutofillId;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    if-eqz p1, :cond_3

    .line 19
    .line 20
    if-lt v0, v1, :cond_2

    .line 21
    .line 22
    iget-object p0, p0, Lgp3;->o:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-static {p0}, Lkz;->d(Ljava/lang/Object;)Landroid/view/contentcapture/ContentCaptureSession;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {p0, p1, p2}, Lyh;->h(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/autofill/AutofillId;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    :cond_2
    :goto_0
    return-void

    .line 32
    :cond_3
    const-string p0, "Invalid content capture ID"

    .line 33
    .line 34
    invoke-static {p0}, Lxa3;->l(Ljava/lang/String;)Lkotlin/KotlinNothingValueException;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    throw p0
.end method

.method public final i(ILi94;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    invoke-virtual {v0}, Llb;->e()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object v2, v1, Li94;->d:Le94;

    .line 13
    .line 14
    iget-object v2, v2, Le94;->n:Lw03;

    .line 15
    .line 16
    sget-object v3, Ln94;->B:Lp94;

    .line 17
    .line 18
    invoke-virtual {v2, v3}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    const/4 v4, 0x0

    .line 23
    if-nez v3, :cond_1

    .line 24
    .line 25
    move-object v3, v4

    .line 26
    :cond_1
    check-cast v3, Ljava/lang/Boolean;

    .line 27
    .line 28
    iget-object v5, v0, Llb;->s:Ljb;

    .line 29
    .line 30
    sget-object v6, Ljb;->n:Ljb;

    .line 31
    .line 32
    if-ne v5, v6, :cond_3

    .line 33
    .line 34
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 35
    .line 36
    invoke-static {v3, v5}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-eqz v5, :cond_3

    .line 41
    .line 42
    sget-object v3, Ld94;->m:Lp94;

    .line 43
    .line 44
    invoke-virtual {v2, v3}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    if-nez v2, :cond_2

    .line 49
    .line 50
    move-object v2, v4

    .line 51
    :cond_2
    check-cast v2, Lw2;

    .line 52
    .line 53
    if-eqz v2, :cond_5

    .line 54
    .line 55
    iget-object v2, v2, Lw2;->b:Lsf1;

    .line 56
    .line 57
    check-cast v2, Lif1;

    .line 58
    .line 59
    if-eqz v2, :cond_5

    .line 60
    .line 61
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 62
    .line 63
    invoke-interface {v2, v3}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    check-cast v2, Ljava/lang/Boolean;

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_3
    iget-object v5, v0, Llb;->s:Ljb;

    .line 71
    .line 72
    sget-object v6, Ljb;->o:Ljb;

    .line 73
    .line 74
    if-ne v5, v6, :cond_5

    .line 75
    .line 76
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 77
    .line 78
    invoke-static {v3, v5}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    if-eqz v3, :cond_5

    .line 83
    .line 84
    sget-object v3, Ld94;->m:Lp94;

    .line 85
    .line 86
    invoke-virtual {v2, v3}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    if-nez v2, :cond_4

    .line 91
    .line 92
    move-object v2, v4

    .line 93
    :cond_4
    check-cast v2, Lw2;

    .line 94
    .line 95
    if-eqz v2, :cond_5

    .line 96
    .line 97
    iget-object v2, v2, Lw2;->b:Lsf1;

    .line 98
    .line 99
    check-cast v2, Lif1;

    .line 100
    .line 101
    if-eqz v2, :cond_5

    .line 102
    .line 103
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 104
    .line 105
    invoke-interface {v2, v3}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    check-cast v2, Ljava/lang/Boolean;

    .line 110
    .line 111
    :cond_5
    :goto_0
    iget v6, v1, Li94;->f:I

    .line 112
    .line 113
    iget-object v2, v0, Llb;->p:Lgp3;

    .line 114
    .line 115
    const/4 v3, 0x0

    .line 116
    if-nez v2, :cond_6

    .line 117
    .line 118
    :goto_1
    move-object v10, v4

    .line 119
    goto/16 :goto_4

    .line 120
    .line 121
    :cond_6
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 122
    .line 123
    const/16 v7, 0x1d

    .line 124
    .line 125
    if-ge v5, v7, :cond_7

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_7
    iget-object v8, v0, Llb;->n:Lra;

    .line 129
    .line 130
    invoke-static {v8}, Lbu;->l(Landroid/view/View;)Lhg3;

    .line 131
    .line 132
    .line 133
    move-result-object v8

    .line 134
    if-nez v8, :cond_8

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_8
    invoke-virtual {v1}, Li94;->l()Li94;

    .line 138
    .line 139
    .line 140
    move-result-object v9

    .line 141
    iget v10, v1, Li94;->f:I

    .line 142
    .line 143
    if-eqz v9, :cond_9

    .line 144
    .line 145
    iget v8, v9, Li94;->f:I

    .line 146
    .line 147
    int-to-long v8, v8

    .line 148
    invoke-virtual {v2, v8, v9}, Lgp3;->q(J)Landroid/view/autofill/AutofillId;

    .line 149
    .line 150
    .line 151
    move-result-object v8

    .line 152
    if-nez v8, :cond_a

    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_9
    iget-object v8, v8, Lhg3;->o:Ljava/lang/Object;

    .line 156
    .line 157
    invoke-static {v8}, Ltn;->f(Ljava/lang/Object;)Landroid/view/autofill/AutofillId;

    .line 158
    .line 159
    .line 160
    move-result-object v8

    .line 161
    :cond_a
    int-to-long v11, v10

    .line 162
    if-lt v5, v7, :cond_b

    .line 163
    .line 164
    iget-object v2, v2, Lgp3;->o:Ljava/lang/Object;

    .line 165
    .line 166
    invoke-static {v2}, Lkz;->d(Ljava/lang/Object;)Landroid/view/contentcapture/ContentCaptureSession;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    invoke-static {v2, v8, v11, v12}, Lyh;->e(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/autofill/AutofillId;J)Landroid/view/ViewStructure;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    new-instance v5, Loz4;

    .line 175
    .line 176
    invoke-direct {v5, v2}, Loz4;-><init>(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    goto :goto_2

    .line 180
    :cond_b
    move-object v5, v4

    .line 181
    :goto_2
    if-nez v5, :cond_c

    .line 182
    .line 183
    goto :goto_1

    .line 184
    :cond_c
    iget-object v2, v5, Loz4;->n:Ljava/lang/Object;

    .line 185
    .line 186
    move-object v11, v2

    .line 187
    check-cast v11, Landroid/view/ViewStructure;

    .line 188
    .line 189
    iget-object v2, v1, Li94;->d:Le94;

    .line 190
    .line 191
    sget-object v7, Ln94;->J:Lp94;

    .line 192
    .line 193
    iget-object v8, v2, Le94;->n:Lw03;

    .line 194
    .line 195
    invoke-virtual {v8, v7}, Lw03;->c(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v7

    .line 199
    if-eqz v7, :cond_d

    .line 200
    .line 201
    goto :goto_1

    .line 202
    :cond_d
    invoke-virtual {v11}, Landroid/view/ViewStructure;->getExtras()Landroid/os/Bundle;

    .line 203
    .line 204
    .line 205
    move-result-object v7

    .line 206
    if-eqz v7, :cond_e

    .line 207
    .line 208
    const-string v9, "android.view.contentcapture.EventTimestamp"

    .line 209
    .line 210
    iget-wide v12, v0, Llb;->w:J

    .line 211
    .line 212
    invoke-virtual {v7, v9, v12, v13}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 213
    .line 214
    .line 215
    const-string v9, "android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX"

    .line 216
    .line 217
    move/from16 v12, p1

    .line 218
    .line 219
    invoke-virtual {v7, v9, v12}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 220
    .line 221
    .line 222
    :cond_e
    sget-object v7, Ln94;->x:Lp94;

    .line 223
    .line 224
    invoke-virtual {v8, v7}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v7

    .line 228
    if-nez v7, :cond_f

    .line 229
    .line 230
    move-object v7, v4

    .line 231
    :cond_f
    check-cast v7, Ljava/lang/String;

    .line 232
    .line 233
    if-eqz v7, :cond_10

    .line 234
    .line 235
    invoke-virtual {v11, v10, v4, v4, v7}, Landroid/view/ViewStructure;->setId(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    :cond_10
    sget-object v7, Ln94;->m:Lp94;

    .line 239
    .line 240
    invoke-virtual {v8, v7}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v7

    .line 244
    if-nez v7, :cond_11

    .line 245
    .line 246
    move-object v7, v4

    .line 247
    :cond_11
    check-cast v7, Ljava/lang/Boolean;

    .line 248
    .line 249
    if-eqz v7, :cond_12

    .line 250
    .line 251
    const-string v7, "android.widget.ViewGroup"

    .line 252
    .line 253
    invoke-virtual {v11, v7}, Landroid/view/ViewStructure;->setClassName(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    :cond_12
    sget-object v7, Ln94;->z:Lp94;

    .line 257
    .line 258
    invoke-virtual {v8, v7}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v7

    .line 262
    if-nez v7, :cond_13

    .line 263
    .line 264
    move-object v7, v4

    .line 265
    :cond_13
    check-cast v7, Ljava/util/List;

    .line 266
    .line 267
    const/16 v9, 0x3e

    .line 268
    .line 269
    const-string v10, "\n"

    .line 270
    .line 271
    if-eqz v7, :cond_14

    .line 272
    .line 273
    const-string v12, "android.widget.TextView"

    .line 274
    .line 275
    invoke-virtual {v11, v12}, Landroid/view/ViewStructure;->setClassName(Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    invoke-static {v7, v10, v4, v9}, Lgc2;->a(Ljava/util/List;Ljava/lang/String;Lk52;I)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v7

    .line 282
    invoke-virtual {v11, v7}, Landroid/view/ViewStructure;->setText(Ljava/lang/CharSequence;)V

    .line 283
    .line 284
    .line 285
    :cond_14
    sget-object v7, Ln94;->D:Lp94;

    .line 286
    .line 287
    invoke-virtual {v8, v7}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v7

    .line 291
    if-nez v7, :cond_15

    .line 292
    .line 293
    move-object v7, v4

    .line 294
    :cond_15
    check-cast v7, Lhe;

    .line 295
    .line 296
    if-eqz v7, :cond_16

    .line 297
    .line 298
    const-string v12, "android.widget.EditText"

    .line 299
    .line 300
    invoke-virtual {v11, v12}, Landroid/view/ViewStructure;->setClassName(Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v11, v7}, Landroid/view/ViewStructure;->setText(Ljava/lang/CharSequence;)V

    .line 304
    .line 305
    .line 306
    :cond_16
    sget-object v7, Ln94;->a:Lp94;

    .line 307
    .line 308
    invoke-virtual {v8, v7}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v7

    .line 312
    if-nez v7, :cond_17

    .line 313
    .line 314
    move-object v7, v4

    .line 315
    :cond_17
    check-cast v7, Ljava/util/List;

    .line 316
    .line 317
    if-eqz v7, :cond_18

    .line 318
    .line 319
    invoke-static {v7, v10, v4, v9}, Lgc2;->a(Ljava/util/List;Ljava/lang/String;Lk52;I)Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v7

    .line 323
    invoke-virtual {v11, v7}, Landroid/view/ViewStructure;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 324
    .line 325
    .line 326
    :cond_18
    sget-object v7, Ln94;->w:Lp94;

    .line 327
    .line 328
    invoke-virtual {v8, v7}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v7

    .line 332
    if-nez v7, :cond_19

    .line 333
    .line 334
    move-object v7, v4

    .line 335
    :cond_19
    check-cast v7, Lm24;

    .line 336
    .line 337
    if-eqz v7, :cond_1a

    .line 338
    .line 339
    const-string v7, "android.widget.ImageView"

    .line 340
    .line 341
    invoke-virtual {v11, v7}, Landroid/view/ViewStructure;->setClassName(Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    :cond_1a
    invoke-static {v2}, Lgh0;->p(Le94;)Lms4;

    .line 345
    .line 346
    .line 347
    move-result-object v2

    .line 348
    if-eqz v2, :cond_1b

    .line 349
    .line 350
    iget-object v2, v2, Lms4;->a:Lls4;

    .line 351
    .line 352
    iget-object v7, v2, Lls4;->b:Lzs4;

    .line 353
    .line 354
    iget-object v2, v2, Lls4;->g:Loo0;

    .line 355
    .line 356
    iget-object v7, v7, Lzs4;->a:Lij4;

    .line 357
    .line 358
    iget-wide v7, v7, Lij4;->b:J

    .line 359
    .line 360
    invoke-static {v7, v8}, Lbt4;->c(J)F

    .line 361
    .line 362
    .line 363
    move-result v7

    .line 364
    invoke-interface {v2}, Loo0;->g()F

    .line 365
    .line 366
    .line 367
    move-result v8

    .line 368
    mul-float/2addr v8, v7

    .line 369
    invoke-interface {v2}, Loo0;->J()F

    .line 370
    .line 371
    .line 372
    move-result v2

    .line 373
    mul-float/2addr v2, v8

    .line 374
    invoke-virtual {v11, v2, v3, v3, v3}, Landroid/view/ViewStructure;->setTextStyle(FIII)V

    .line 375
    .line 376
    .line 377
    :cond_1b
    invoke-virtual {v1}, Li94;->d()Lf63;

    .line 378
    .line 379
    .line 380
    move-result-object v2

    .line 381
    if-eqz v2, :cond_1d

    .line 382
    .line 383
    invoke-virtual {v2}, Lf63;->A0()Lcx2;

    .line 384
    .line 385
    .line 386
    move-result-object v7

    .line 387
    iget-boolean v7, v7, Lcx2;->A:Z

    .line 388
    .line 389
    if-eqz v7, :cond_1c

    .line 390
    .line 391
    move-object v4, v2

    .line 392
    :cond_1c
    if-eqz v4, :cond_1d

    .line 393
    .line 394
    invoke-virtual {v1, v4}, Li94;->a(Lf63;)Lwv3;

    .line 395
    .line 396
    .line 397
    move-result-object v2

    .line 398
    goto :goto_3

    .line 399
    :cond_1d
    sget-object v2, Lwv3;->e:Lwv3;

    .line 400
    .line 401
    :goto_3
    iget v4, v2, Lwv3;->a:F

    .line 402
    .line 403
    float-to-int v12, v4

    .line 404
    iget v7, v2, Lwv3;->b:F

    .line 405
    .line 406
    float-to-int v13, v7

    .line 407
    iget v8, v2, Lwv3;->c:F

    .line 408
    .line 409
    sub-float/2addr v8, v4

    .line 410
    float-to-int v4, v8

    .line 411
    iget v2, v2, Lwv3;->d:F

    .line 412
    .line 413
    sub-float/2addr v2, v7

    .line 414
    float-to-int v2, v2

    .line 415
    const/4 v14, 0x0

    .line 416
    const/4 v15, 0x0

    .line 417
    move/from16 v17, v2

    .line 418
    .line 419
    move/from16 v16, v4

    .line 420
    .line 421
    invoke-virtual/range {v11 .. v17}, Landroid/view/ViewStructure;->setDimens(IIIIII)V

    .line 422
    .line 423
    .line 424
    move-object v10, v5

    .line 425
    :goto_4
    if-nez v10, :cond_1e

    .line 426
    .line 427
    goto :goto_5

    .line 428
    :cond_1e
    new-instance v5, Lyc0;

    .line 429
    .line 430
    iget-wide v7, v0, Llb;->w:J

    .line 431
    .line 432
    sget-object v9, Lzc0;->n:Lzc0;

    .line 433
    .line 434
    invoke-direct/range {v5 .. v10}, Lyc0;-><init>(IJLzc0;Loz4;)V

    .line 435
    .line 436
    .line 437
    iget-object v2, v0, Llb;->q:Ljava/util/ArrayList;

    .line 438
    .line 439
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 440
    .line 441
    .line 442
    :goto_5
    const/4 v2, 0x4

    .line 443
    invoke-static {v2, v1}, Li94;->j(ILi94;)Ljava/util/List;

    .line 444
    .line 445
    .line 446
    move-result-object v1

    .line 447
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 448
    .line 449
    .line 450
    move-result v2

    .line 451
    move v4, v3

    .line 452
    :goto_6
    if-ge v3, v2, :cond_20

    .line 453
    .line 454
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    move-result-object v5

    .line 458
    move-object v6, v5

    .line 459
    check-cast v6, Li94;

    .line 460
    .line 461
    invoke-virtual {v0}, Llb;->d()Le02;

    .line 462
    .line 463
    .line 464
    move-result-object v7

    .line 465
    iget v6, v6, Li94;->f:I

    .line 466
    .line 467
    invoke-virtual {v7, v6}, Le02;->a(I)Z

    .line 468
    .line 469
    .line 470
    move-result v6

    .line 471
    if-eqz v6, :cond_1f

    .line 472
    .line 473
    check-cast v5, Li94;

    .line 474
    .line 475
    invoke-virtual {v0, v4, v5}, Llb;->i(ILi94;)V

    .line 476
    .line 477
    .line 478
    add-int/lit8 v4, v4, 0x1

    .line 479
    .line 480
    :cond_1f
    add-int/lit8 v3, v3, 0x1

    .line 481
    .line 482
    goto :goto_6

    .line 483
    :cond_20
    return-void
.end method

.method public final k(Li94;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Llb;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    iget v2, p1, Li94;->f:I

    .line 9
    .line 10
    new-instance v1, Lyc0;

    .line 11
    .line 12
    iget-wide v3, p0, Llb;->w:J

    .line 13
    .line 14
    sget-object v5, Lzc0;->o:Lzc0;

    .line 15
    .line 16
    const/4 v6, 0x0

    .line 17
    invoke-direct/range {v1 .. v6}, Lyc0;-><init>(IJLzc0;Loz4;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Llb;->q:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x4

    .line 26
    invoke-static {v0, p1}, Li94;->j(ILi94;)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const/4 v1, 0x0

    .line 35
    :goto_0
    if-ge v1, v0, :cond_1

    .line 36
    .line 37
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, Li94;

    .line 42
    .line 43
    invoke-virtual {p0, v2}, Llb;->k(Li94;)V

    .line 44
    .line 45
    .line 46
    add-int/lit8 v1, v1, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    :goto_1
    return-void
.end method

.method public final l()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Llb;->x:Li03;

    .line 4
    .line 5
    invoke-virtual {v1}, Li03;->c()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Llb;->d()Le02;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    iget-object v3, v2, Le02;->b:[I

    .line 13
    .line 14
    iget-object v4, v2, Le02;->c:[Ljava/lang/Object;

    .line 15
    .line 16
    iget-object v2, v2, Le02;->a:[J

    .line 17
    .line 18
    array-length v5, v2

    .line 19
    add-int/lit8 v5, v5, -0x2

    .line 20
    .line 21
    if-ltz v5, :cond_3

    .line 22
    .line 23
    const/4 v7, 0x0

    .line 24
    :goto_0
    aget-wide v8, v2, v7

    .line 25
    .line 26
    not-long v10, v8

    .line 27
    const/4 v12, 0x7

    .line 28
    shl-long/2addr v10, v12

    .line 29
    and-long/2addr v10, v8

    .line 30
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    and-long/2addr v10, v12

    .line 36
    cmp-long v10, v10, v12

    .line 37
    .line 38
    if-eqz v10, :cond_2

    .line 39
    .line 40
    sub-int v10, v7, v5

    .line 41
    .line 42
    not-int v10, v10

    .line 43
    ushr-int/lit8 v10, v10, 0x1f

    .line 44
    .line 45
    const/16 v11, 0x8

    .line 46
    .line 47
    rsub-int/lit8 v10, v10, 0x8

    .line 48
    .line 49
    const/4 v12, 0x0

    .line 50
    :goto_1
    if-ge v12, v10, :cond_1

    .line 51
    .line 52
    const-wide/16 v13, 0xff

    .line 53
    .line 54
    and-long/2addr v13, v8

    .line 55
    const-wide/16 v15, 0x80

    .line 56
    .line 57
    cmp-long v13, v13, v15

    .line 58
    .line 59
    if-gez v13, :cond_0

    .line 60
    .line 61
    shl-int/lit8 v13, v7, 0x3

    .line 62
    .line 63
    add-int/2addr v13, v12

    .line 64
    aget v14, v3, v13

    .line 65
    .line 66
    aget-object v13, v4, v13

    .line 67
    .line 68
    check-cast v13, Lk94;

    .line 69
    .line 70
    new-instance v15, Lj94;

    .line 71
    .line 72
    iget-object v13, v13, Lk94;->a:Li94;

    .line 73
    .line 74
    invoke-virtual {v0}, Llb;->d()Le02;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    invoke-direct {v15, v13, v6}, Lj94;-><init>(Li94;Le02;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1, v14, v15}, Li03;->i(ILjava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    :cond_0
    shr-long/2addr v8, v11

    .line 85
    add-int/lit8 v12, v12, 0x1

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_1
    if-ne v10, v11, :cond_3

    .line 89
    .line 90
    :cond_2
    if-eq v7, v5, :cond_3

    .line 91
    .line 92
    add-int/lit8 v7, v7, 0x1

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_3
    new-instance v1, Lj94;

    .line 96
    .line 97
    iget-object v2, v0, Llb;->n:Lra;

    .line 98
    .line 99
    invoke-virtual {v2}, Lra;->getSemanticsOwner()Ll94;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-virtual {v2}, Ll94;->a()Li94;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    invoke-virtual {v0}, Llb;->d()Le02;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    invoke-direct {v1, v2, v3}, Lj94;-><init>(Li94;Le02;)V

    .line 112
    .line 113
    .line 114
    iput-object v1, v0, Llb;->y:Lj94;

    .line 115
    .line 116
    return-void
.end method

.method public final onStart(Lba2;)V
    .locals 1

    .line 1
    iget-object p1, p0, Llb;->o:Lna;

    .line 2
    .line 3
    invoke-virtual {p1}, Lna;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lgp3;

    .line 8
    .line 9
    iput-object p1, p0, Llb;->p:Lgp3;

    .line 10
    .line 11
    iget-object p1, p0, Llb;->n:Lra;

    .line 12
    .line 13
    invoke-virtual {p1}, Lra;->getSemanticsOwner()Ll94;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Ll94;->a()Li94;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const/4 v0, -0x1

    .line 22
    invoke-virtual {p0, v0, p1}, Llb;->i(ILi94;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Llb;->f()V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final onStop(Lba2;)V
    .locals 0

    .line 1
    iget-object p1, p0, Llb;->n:Lra;

    .line 2
    .line 3
    invoke-virtual {p1}, Lra;->getSemanticsOwner()Ll94;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Ll94;->a()Li94;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p0, p1}, Llb;->k(Li94;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Llb;->f()V

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    iput-object p1, p0, Llb;->p:Lgp3;

    .line 19
    .line 20
    return-void
.end method

.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Llb;->n:Lra;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Llb;->A:La0;

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    iput-object p1, p0, Llb;->p:Lgp3;

    .line 17
    .line 18
    return-void
.end method
