.class public final Lbk2;
.super Lgk2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lyj2;


# instance fields
.field public final U0:Landroid/content/Context;

.field public final V0:Lxc5;

.field public final W0:Lsm;

.field public final X0:Lns3;

.field public Y0:I

.field public Z0:Z

.field public a1:Ltb1;

.field public b1:Ltb1;

.field public c1:J

.field public d1:Z

.field public e1:Z

.field public f1:Z

.field public g1:Z

.field public h1:I

.field public i1:Z

.field public j1:J


# direct methods
.method public constructor <init>(Landroid/content/Context;Lzj2;Landroid/os/Handler;Lqm;Lsm;)V
    .locals 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x23

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    new-instance v0, Lns3;

    .line 8
    .line 9
    const/4 v1, 0x6

    .line 10
    invoke-direct {v0, v1}, Lns3;-><init>(I)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const/4 v2, 0x1

    .line 20
    const v3, 0x472c4400    # 44100.0f

    .line 21
    .line 22
    .line 23
    invoke-direct {p0, v1, v2, p2, v3}, Lgk2;-><init>(Landroid/content/Context;ILzj2;F)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, Lbk2;->U0:Landroid/content/Context;

    .line 31
    .line 32
    iput-object p5, p0, Lbk2;->W0:Lsm;

    .line 33
    .line 34
    iput-object v0, p0, Lbk2;->X0:Lns3;

    .line 35
    .line 36
    const/16 p1, -0x3e8

    .line 37
    .line 38
    iput p1, p0, Lbk2;->h1:I

    .line 39
    .line 40
    new-instance p1, Lxc5;

    .line 41
    .line 42
    invoke-direct {p1, p3, p4}, Lxc5;-><init>(Landroid/os/Handler;Lqm;)V

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, Lbk2;->V0:Lxc5;

    .line 46
    .line 47
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    iput-wide p1, p0, Lbk2;->j1:J

    .line 53
    .line 54
    new-instance p1, Lsi1;

    .line 55
    .line 56
    const/16 p2, 0x8

    .line 57
    .line 58
    invoke-direct {p1, p2, p0}, Lsi1;-><init>(ILjava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    check-cast p5, Ltj0;

    .line 62
    .line 63
    iput-object p1, p5, Ltj0;->n:Lrm;

    .line 64
    .line 65
    return-void
.end method


# virtual methods
.method public final A0(Lkf2;Ltb1;)I
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    invoke-static {v2, v3, v3, v3}, Lkq;->a(IIII)I

    .line 8
    .line 9
    .line 10
    move-result v4

    .line 11
    iget-object v5, v1, Ltb1;->n:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v6, v1, Ltb1;->n:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v5}, Llw2;->i(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    if-nez v5, :cond_0

    .line 20
    .line 21
    invoke-static {v3, v3, v3, v3}, Lkq;->a(IIII)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    return v0

    .line 26
    :cond_0
    iget v5, v1, Ltb1;->O:I

    .line 27
    .line 28
    if-eqz v5, :cond_1

    .line 29
    .line 30
    move v7, v2

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    move v7, v3

    .line 33
    :goto_0
    const/4 v8, 0x2

    .line 34
    if-eqz v5, :cond_3

    .line 35
    .line 36
    if-ne v5, v8, :cond_2

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    move v5, v3

    .line 40
    goto :goto_2

    .line 41
    :cond_3
    :goto_1
    move v5, v2

    .line 42
    :goto_2
    const/16 v9, 0x20

    .line 43
    .line 44
    const/4 v10, 0x0

    .line 45
    const-string v11, "audio/raw"

    .line 46
    .line 47
    const/16 v12, 0x8

    .line 48
    .line 49
    const/4 v13, 0x4

    .line 50
    iget-object v14, v0, Lbk2;->W0:Lsm;

    .line 51
    .line 52
    if-eqz v5, :cond_6

    .line 53
    .line 54
    if-eqz v7, :cond_5

    .line 55
    .line 56
    invoke-static {v3, v3, v11}, Ljk2;->e(ZZLjava/lang/String;)Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 61
    .line 62
    .line 63
    move-result v15

    .line 64
    if-eqz v15, :cond_4

    .line 65
    .line 66
    move-object v7, v10

    .line 67
    goto :goto_3

    .line 68
    :cond_4
    invoke-interface {v7, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v7

    .line 72
    check-cast v7, Ldk2;

    .line 73
    .line 74
    :goto_3
    if-eqz v7, :cond_6

    .line 75
    .line 76
    :cond_5
    invoke-virtual {v0, v1}, Lbk2;->E0(Ltb1;)I

    .line 77
    .line 78
    .line 79
    move-result v7

    .line 80
    move-object v15, v14

    .line 81
    check-cast v15, Ltj0;

    .line 82
    .line 83
    invoke-virtual {v15, v1}, Ltj0;->j(Ltb1;)I

    .line 84
    .line 85
    .line 86
    move-result v15

    .line 87
    if-eqz v15, :cond_7

    .line 88
    .line 89
    invoke-static {v13, v12, v9, v7}, Lkq;->a(IIII)I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    return v0

    .line 94
    :cond_6
    move v7, v3

    .line 95
    :cond_7
    invoke-virtual {v11, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v15

    .line 99
    if-eqz v15, :cond_8

    .line 100
    .line 101
    move-object v15, v14

    .line 102
    check-cast v15, Ltj0;

    .line 103
    .line 104
    invoke-virtual {v15, v1}, Ltj0;->j(Ltb1;)I

    .line 105
    .line 106
    .line 107
    move-result v15

    .line 108
    if-eqz v15, :cond_14

    .line 109
    .line 110
    :cond_8
    iget v15, v1, Ltb1;->F:I

    .line 111
    .line 112
    iget v2, v1, Ltb1;->G:I

    .line 113
    .line 114
    invoke-static {v8, v15, v2}, Lf35;->D(III)Ltb1;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    check-cast v14, Ltj0;

    .line 119
    .line 120
    invoke-virtual {v14, v2}, Ltj0;->j(Ltb1;)I

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    if-eqz v2, :cond_14

    .line 125
    .line 126
    if-nez v6, :cond_9

    .line 127
    .line 128
    sget-object v2, Lgy3;->r:Lgy3;

    .line 129
    .line 130
    goto :goto_5

    .line 131
    :cond_9
    invoke-virtual {v14, v1}, Ltj0;->j(Ltb1;)I

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    if-eqz v2, :cond_b

    .line 136
    .line 137
    invoke-static {v3, v3, v11}, Ljk2;->e(ZZLjava/lang/String;)Ljava/util/List;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 142
    .line 143
    .line 144
    move-result v6

    .line 145
    if-eqz v6, :cond_a

    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_a
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    move-object v10, v2

    .line 153
    check-cast v10, Ldk2;

    .line 154
    .line 155
    :goto_4
    if-eqz v10, :cond_b

    .line 156
    .line 157
    invoke-static {v10}, Lyw1;->o(Ljava/lang/Object;)Lgy3;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    goto :goto_5

    .line 162
    :cond_b
    move-object/from16 v2, p1

    .line 163
    .line 164
    invoke-static {v2, v1, v3, v3}, Ljk2;->g(Lkf2;Ltb1;ZZ)Lgy3;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    :goto_5
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 169
    .line 170
    .line 171
    move-result v6

    .line 172
    if-eqz v6, :cond_c

    .line 173
    .line 174
    goto :goto_a

    .line 175
    :cond_c
    if-nez v5, :cond_d

    .line 176
    .line 177
    invoke-static {v8, v3, v3, v3}, Lkq;->a(IIII)I

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    return v0

    .line 182
    :cond_d
    invoke-virtual {v2, v3}, Lgy3;->get(I)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v4

    .line 186
    check-cast v4, Ldk2;

    .line 187
    .line 188
    iget-object v0, v0, Lbk2;->U0:Landroid/content/Context;

    .line 189
    .line 190
    invoke-virtual {v4, v0, v1}, Ldk2;->e(Landroid/content/Context;Ltb1;)Z

    .line 191
    .line 192
    .line 193
    move-result v5

    .line 194
    if-nez v5, :cond_f

    .line 195
    .line 196
    const/4 v6, 0x1

    .line 197
    :goto_6
    iget v8, v2, Lgy3;->q:I

    .line 198
    .line 199
    if-ge v6, v8, :cond_f

    .line 200
    .line 201
    invoke-virtual {v2, v6}, Lgy3;->get(I)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v8

    .line 205
    check-cast v8, Ldk2;

    .line 206
    .line 207
    invoke-virtual {v8, v0, v1}, Ldk2;->e(Landroid/content/Context;Ltb1;)Z

    .line 208
    .line 209
    .line 210
    move-result v10

    .line 211
    if-eqz v10, :cond_e

    .line 212
    .line 213
    move/from16 v16, v3

    .line 214
    .line 215
    move-object v4, v8

    .line 216
    const/4 v2, 0x1

    .line 217
    goto :goto_7

    .line 218
    :cond_e
    add-int/lit8 v6, v6, 0x1

    .line 219
    .line 220
    goto :goto_6

    .line 221
    :cond_f
    move v2, v5

    .line 222
    const/16 v16, 0x1

    .line 223
    .line 224
    :goto_7
    if-eqz v2, :cond_10

    .line 225
    .line 226
    goto :goto_8

    .line 227
    :cond_10
    const/4 v13, 0x3

    .line 228
    :goto_8
    if-eqz v2, :cond_11

    .line 229
    .line 230
    invoke-virtual {v4, v1}, Ldk2;->f(Ltb1;)Z

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    if-eqz v0, :cond_11

    .line 235
    .line 236
    const/16 v12, 0x10

    .line 237
    .line 238
    :cond_11
    iget-boolean v0, v4, Ldk2;->g:Z

    .line 239
    .line 240
    if-eqz v0, :cond_12

    .line 241
    .line 242
    const/16 v0, 0x40

    .line 243
    .line 244
    goto :goto_9

    .line 245
    :cond_12
    move v0, v3

    .line 246
    :goto_9
    if-eqz v16, :cond_13

    .line 247
    .line 248
    const/16 v3, 0x80

    .line 249
    .line 250
    :cond_13
    or-int v1, v13, v12

    .line 251
    .line 252
    or-int/2addr v1, v9

    .line 253
    or-int/2addr v0, v1

    .line 254
    or-int/2addr v0, v3

    .line 255
    or-int/2addr v0, v7

    .line 256
    return v0

    .line 257
    :cond_14
    :goto_a
    return v4
.end method

.method public final E0(Ltb1;)I
    .locals 1

    .line 1
    iget-object p0, p0, Lbk2;->W0:Lsm;

    .line 2
    .line 3
    check-cast p0, Ltj0;

    .line 4
    .line 5
    iget-boolean v0, p0, Ltj0;->X:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object p0, Lzl;->d:Lzl;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, Ltj0;->r:Ldn;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Ltj0;->i(Ltb1;)Lam;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {v0, p0}, Ldn;->b(Lam;)Lcm;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    new-instance p1, Lyl;

    .line 23
    .line 24
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 25
    .line 26
    .line 27
    iget-boolean v0, p0, Lcm;->a:Z

    .line 28
    .line 29
    iput-boolean v0, p1, Lyl;->a:Z

    .line 30
    .line 31
    iget-boolean v0, p0, Lcm;->b:Z

    .line 32
    .line 33
    iput-boolean v0, p1, Lyl;->b:Z

    .line 34
    .line 35
    iget-boolean p0, p0, Lcm;->c:Z

    .line 36
    .line 37
    iput-boolean p0, p1, Lyl;->c:Z

    .line 38
    .line 39
    invoke-virtual {p1}, Lyl;->a()Lzl;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    :goto_0
    iget-boolean p1, p0, Lzl;->a:Z

    .line 44
    .line 45
    if-nez p1, :cond_1

    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return p0

    .line 49
    :cond_1
    iget-boolean p1, p0, Lzl;->b:Z

    .line 50
    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    const/16 p1, 0x600

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    const/16 p1, 0x200

    .line 57
    .line 58
    :goto_1
    iget-boolean p0, p0, Lzl;->c:Z

    .line 59
    .line 60
    if-eqz p0, :cond_3

    .line 61
    .line 62
    or-int/lit16 p0, p1, 0x800

    .line 63
    .line 64
    return p0

    .line 65
    :cond_3
    return p1
.end method

.method public final F0()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lbk2;->m()Z

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lbk2;->W0:Lsm;

    .line 5
    .line 6
    check-cast v0, Ltj0;

    .line 7
    .line 8
    invoke-virtual {v0}, Ltj0;->h()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    const-wide/high16 v2, -0x8000000000000000L

    .line 13
    .line 14
    cmp-long v2, v0, v2

    .line 15
    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    iget-boolean v2, p0, Lbk2;->d1:Z

    .line 19
    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-wide v2, p0, Lbk2;->c1:J

    .line 24
    .line 25
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    :goto_0
    iput-wide v0, p0, Lbk2;->c1:J

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    iput-boolean v0, p0, Lbk2;->d1:Z

    .line 33
    .line 34
    :cond_1
    return-void
.end method

.method public final J(Ldk2;Ltb1;Ltb1;)Lej0;
    .locals 8

    .line 1
    invoke-virtual {p1, p2, p3}, Ldk2;->b(Ltb1;Ltb1;)Lej0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, v0, Lej0;->e:I

    .line 6
    .line 7
    iget-object v2, p0, Lgk2;->U:Lpw0;

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, p3}, Lbk2;->z0(Ltb1;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    const v2, 0x8000

    .line 18
    .line 19
    .line 20
    or-int/2addr v1, v2

    .line 21
    :cond_0
    const-string v2, "OMX.google.raw.decoder"

    .line 22
    .line 23
    iget-object v3, p1, Ldk2;->a:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    iget v2, p3, Ltb1;->o:I

    .line 29
    .line 30
    iget p0, p0, Lbk2;->Y0:I

    .line 31
    .line 32
    if-le v2, p0, :cond_1

    .line 33
    .line 34
    or-int/lit8 v1, v1, 0x40

    .line 35
    .line 36
    :cond_1
    move v7, v1

    .line 37
    new-instance v2, Lej0;

    .line 38
    .line 39
    iget-object v3, p1, Ldk2;->a:Ljava/lang/String;

    .line 40
    .line 41
    if-eqz v7, :cond_2

    .line 42
    .line 43
    const/4 p0, 0x0

    .line 44
    :goto_0
    move v6, p0

    .line 45
    move-object v4, p2

    .line 46
    move-object v5, p3

    .line 47
    goto :goto_1

    .line 48
    :cond_2
    iget p0, v0, Lej0;->d:I

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :goto_1
    invoke-direct/range {v2 .. v7}, Lej0;-><init>(Ljava/lang/String;Ltb1;Ltb1;II)V

    .line 52
    .line 53
    .line 54
    return-object v2
.end method

.method public final Q(FLtb1;[Ltb1;)F
    .locals 3

    .line 1
    array-length p0, p3

    .line 2
    const/4 p2, -0x1

    .line 3
    const/4 v0, 0x0

    .line 4
    move v1, p2

    .line 5
    :goto_0
    if-ge v0, p0, :cond_1

    .line 6
    .line 7
    aget-object v2, p3, v0

    .line 8
    .line 9
    iget v2, v2, Ltb1;->G:I

    .line 10
    .line 11
    if-eq v2, p2, :cond_0

    .line 12
    .line 13
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    if-ne v1, p2, :cond_2

    .line 21
    .line 22
    const/high16 p0, -0x40800000    # -1.0f

    .line 23
    .line 24
    return p0

    .line 25
    :cond_2
    int-to-float p0, v1

    .line 26
    mul-float/2addr p0, p1

    .line 27
    return p0
.end method

.method public final R(Lkf2;Ltb1;Z)Ljava/util/ArrayList;
    .locals 3

    .line 1
    iget-object v0, p2, Ltb1;->n:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object p1, Lgy3;->r:Lgy3;

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    iget-object v0, p0, Lbk2;->W0:Lsm;

    .line 9
    .line 10
    check-cast v0, Ltj0;

    .line 11
    .line 12
    invoke-virtual {v0, p2}, Ltj0;->j(Ltb1;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x0

    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    const-string v0, "audio/raw"

    .line 20
    .line 21
    invoke-static {v1, v1, v0}, Ljk2;->e(ZZLjava/lang/String;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Ldk2;

    .line 38
    .line 39
    :goto_0
    if-eqz v0, :cond_2

    .line 40
    .line 41
    invoke-static {v0}, Lyw1;->o(Ljava/lang/Object;)Lgy3;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    goto :goto_1

    .line 46
    :cond_2
    invoke-static {p1, p2, p3, v1}, Ljk2;->g(Lkf2;Ltb1;ZZ)Lgy3;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    :goto_1
    sget-object p3, Ljk2;->a:Ljava/util/HashMap;

    .line 51
    .line 52
    new-instance p3, Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-direct {p3, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 55
    .line 56
    .line 57
    new-instance p1, Lef0;

    .line 58
    .line 59
    const/16 v0, 0xa

    .line 60
    .line 61
    iget-object p0, p0, Lbk2;->U0:Landroid/content/Context;

    .line 62
    .line 63
    invoke-direct {p1, v0, p0, p2}, Lef0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    new-instance p0, Lw60;

    .line 67
    .line 68
    const/4 p2, 0x2

    .line 69
    invoke-direct {p0, p2, p1}, Lw60;-><init>(ILjava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    invoke-static {p3, p0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 73
    .line 74
    .line 75
    return-object p3
.end method

.method public final S(JJ)J
    .locals 7

    .line 1
    iget-object p3, p0, Lbk2;->W0:Lsm;

    .line 2
    .line 3
    check-cast p3, Ltj0;

    .line 4
    .line 5
    invoke-virtual {p3}, Ltj0;->n()Z

    .line 6
    .line 7
    .line 8
    move-result p4

    .line 9
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    if-eqz p4, :cond_0

    .line 15
    .line 16
    iget-wide v2, p0, Lbk2;->j1:J

    .line 17
    .line 18
    cmp-long p4, v2, v0

    .line 19
    .line 20
    if-eqz p4, :cond_0

    .line 21
    .line 22
    const/4 p4, 0x1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 p4, 0x0

    .line 25
    :goto_0
    iget-boolean v2, p0, Lbk2;->i1:Z

    .line 26
    .line 27
    const-wide/16 v3, 0x2710

    .line 28
    .line 29
    if-nez v2, :cond_2

    .line 30
    .line 31
    if-nez p4, :cond_1

    .line 32
    .line 33
    iget-boolean p0, p0, Lgk2;->F0:Z

    .line 34
    .line 35
    if-eqz p0, :cond_5

    .line 36
    .line 37
    :cond_1
    const-wide/32 p0, 0xf4240

    .line 38
    .line 39
    .line 40
    return-wide p0

    .line 41
    :cond_2
    invoke-virtual {p3}, Ltj0;->g()J

    .line 42
    .line 43
    .line 44
    move-result-wide v5

    .line 45
    iget-boolean p3, p0, Lbk2;->g1:Z

    .line 46
    .line 47
    if-eqz p3, :cond_5

    .line 48
    .line 49
    if-eqz p4, :cond_5

    .line 50
    .line 51
    cmp-long p3, v5, v0

    .line 52
    .line 53
    if-nez p3, :cond_3

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_3
    iget-wide p3, p0, Lbk2;->j1:J

    .line 57
    .line 58
    sub-long/2addr p3, p1

    .line 59
    invoke-static {v5, v6, p3, p4}, Ljava/lang/Math;->min(JJ)J

    .line 60
    .line 61
    .line 62
    move-result-wide p1

    .line 63
    long-to-float p1, p1

    .line 64
    invoke-virtual {p0}, Lbk2;->i()Lqh3;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    if-eqz p2, :cond_4

    .line 69
    .line 70
    invoke-virtual {p0}, Lbk2;->i()Lqh3;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    iget p0, p0, Lqh3;->a:F

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_4
    const/high16 p0, 0x3f800000    # 1.0f

    .line 78
    .line 79
    :goto_1
    div-float/2addr p1, p0

    .line 80
    const/high16 p0, 0x40000000    # 2.0f

    .line 81
    .line 82
    div-float/2addr p1, p0

    .line 83
    float-to-long p0, p1

    .line 84
    invoke-static {v3, v4, p0, p1}, Ljava/lang/Math;->max(JJ)J

    .line 85
    .line 86
    .line 87
    move-result-wide p0

    .line 88
    return-wide p0

    .line 89
    :cond_5
    :goto_2
    return-wide v3
.end method

.method public final U(Ldk2;Ltb1;Landroid/media/MediaCrypto;F)Lml3;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move/from16 v2, p4

    .line 8
    .line 9
    iget-object v4, v0, Lkq;->w:[Ltb1;

    .line 10
    .line 11
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v5, v1, Ldk2;->a:Ljava/lang/String;

    .line 15
    .line 16
    const-string v6, "OMX.google.raw.decoder"

    .line 17
    .line 18
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    iget v7, v3, Ltb1;->o:I

    .line 22
    .line 23
    iget-object v8, v3, Ltb1;->n:Ljava/lang/String;

    .line 24
    .line 25
    iget v9, v3, Ltb1;->F:I

    .line 26
    .line 27
    array-length v10, v4

    .line 28
    const/4 v11, 0x0

    .line 29
    const/4 v12, 0x1

    .line 30
    if-ne v10, v12, :cond_0

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    array-length v10, v4

    .line 34
    move v13, v11

    .line 35
    :goto_0
    if-ge v13, v10, :cond_2

    .line 36
    .line 37
    aget-object v14, v4, v13

    .line 38
    .line 39
    invoke-virtual {v1, v3, v14}, Ldk2;->b(Ltb1;Ltb1;)Lej0;

    .line 40
    .line 41
    .line 42
    move-result-object v15

    .line 43
    iget v15, v15, Lej0;->d:I

    .line 44
    .line 45
    if-eqz v15, :cond_1

    .line 46
    .line 47
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    iget v14, v14, Ltb1;->o:I

    .line 51
    .line 52
    invoke-static {v7, v14}, Ljava/lang/Math;->max(II)I

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    :cond_1
    add-int/lit8 v13, v13, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    :goto_1
    iput v7, v0, Lbk2;->Y0:I

    .line 60
    .line 61
    const-string v4, "OMX.google.opus.decoder"

    .line 62
    .line 63
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-nez v4, :cond_4

    .line 68
    .line 69
    const-string v4, "c2.android.opus.decoder"

    .line 70
    .line 71
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    if-nez v4, :cond_4

    .line 76
    .line 77
    const-string v4, "OMX.google.vorbis.decoder"

    .line 78
    .line 79
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    if-nez v4, :cond_4

    .line 84
    .line 85
    const-string v4, "c2.android.vorbis.decoder"

    .line 86
    .line 87
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    if-eqz v4, :cond_3

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_3
    move v4, v11

    .line 95
    goto :goto_3

    .line 96
    :cond_4
    :goto_2
    move v4, v12

    .line 97
    :goto_3
    iput-boolean v4, v0, Lbk2;->Z0:Z

    .line 98
    .line 99
    iget-object v4, v1, Ldk2;->c:Ljava/lang/String;

    .line 100
    .line 101
    iget v5, v0, Lbk2;->Y0:I

    .line 102
    .line 103
    new-instance v6, Landroid/media/MediaFormat;

    .line 104
    .line 105
    invoke-direct {v6}, Landroid/media/MediaFormat;-><init>()V

    .line 106
    .line 107
    .line 108
    const-string v7, "mime"

    .line 109
    .line 110
    invoke-virtual {v6, v7, v4}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    const-string v4, "channel-count"

    .line 114
    .line 115
    invoke-virtual {v6, v4, v9}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 116
    .line 117
    .line 118
    iget v4, v3, Ltb1;->G:I

    .line 119
    .line 120
    const-string v7, "sample-rate"

    .line 121
    .line 122
    invoke-virtual {v6, v7, v4}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 123
    .line 124
    .line 125
    iget-object v7, v3, Ltb1;->q:Ljava/util/List;

    .line 126
    .line 127
    invoke-static {v6, v7}, Le35;->R(Landroid/media/MediaFormat;Ljava/util/List;)V

    .line 128
    .line 129
    .line 130
    const-string v7, "max-input-size"

    .line 131
    .line 132
    invoke-static {v6, v7, v5}, Le35;->J(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    .line 133
    .line 134
    .line 135
    const-string v5, "priority"

    .line 136
    .line 137
    invoke-virtual {v6, v5, v11}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 138
    .line 139
    .line 140
    const/high16 v5, -0x40800000    # -1.0f

    .line 141
    .line 142
    cmpl-float v5, v2, v5

    .line 143
    .line 144
    if-eqz v5, :cond_5

    .line 145
    .line 146
    const-string v5, "operating-rate"

    .line 147
    .line 148
    invoke-virtual {v6, v5, v2}, Landroid/media/MediaFormat;->setFloat(Ljava/lang/String;F)V

    .line 149
    .line 150
    .line 151
    :cond_5
    const-string v2, "audio/ac4"

    .line 152
    .line 153
    invoke-virtual {v2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    if-eqz v2, :cond_7

    .line 158
    .line 159
    invoke-static {v3}, Li40;->b(Ltb1;)Landroid/util/Pair;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    if-eqz v2, :cond_6

    .line 164
    .line 165
    iget-object v5, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v5, Ljava/lang/Integer;

    .line 168
    .line 169
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 170
    .line 171
    .line 172
    move-result v5

    .line 173
    const-string v7, "profile"

    .line 174
    .line 175
    invoke-static {v6, v7, v5}, Le35;->J(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    .line 176
    .line 177
    .line 178
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v2, Ljava/lang/Integer;

    .line 181
    .line 182
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 183
    .line 184
    .line 185
    move-result v2

    .line 186
    const-string v5, "level"

    .line 187
    .line 188
    invoke-static {v6, v5, v2}, Le35;->J(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    .line 189
    .line 190
    .line 191
    :cond_6
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 192
    .line 193
    const/16 v5, 0x1c

    .line 194
    .line 195
    if-gt v2, v5, :cond_7

    .line 196
    .line 197
    const-string v2, "ac4-is-sync"

    .line 198
    .line 199
    invoke-virtual {v6, v2, v12}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 200
    .line 201
    .line 202
    :cond_7
    const/4 v2, 0x4

    .line 203
    invoke-static {v2, v9, v4}, Lf35;->D(III)Ltb1;

    .line 204
    .line 205
    .line 206
    move-result-object v4

    .line 207
    iget-object v5, v0, Lbk2;->W0:Lsm;

    .line 208
    .line 209
    check-cast v5, Ltj0;

    .line 210
    .line 211
    invoke-virtual {v5, v4}, Ltj0;->j(Ltb1;)I

    .line 212
    .line 213
    .line 214
    move-result v4

    .line 215
    const/4 v5, 0x2

    .line 216
    if-ne v4, v5, :cond_8

    .line 217
    .line 218
    const-string v4, "pcm-encoding"

    .line 219
    .line 220
    invoke-virtual {v6, v4, v2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 221
    .line 222
    .line 223
    :cond_8
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 224
    .line 225
    const/16 v4, 0x20

    .line 226
    .line 227
    if-lt v2, v4, :cond_9

    .line 228
    .line 229
    const-string v4, "max-output-channel-count"

    .line 230
    .line 231
    const/16 v5, 0x63

    .line 232
    .line 233
    invoke-virtual {v6, v4, v5}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 234
    .line 235
    .line 236
    :cond_9
    const/16 v4, 0x23

    .line 237
    .line 238
    if-lt v2, v4, :cond_a

    .line 239
    .line 240
    iget v2, v0, Lbk2;->h1:I

    .line 241
    .line 242
    neg-int v2, v2

    .line 243
    invoke-static {v11, v2}, Ljava/lang/Math;->max(II)I

    .line 244
    .line 245
    .line 246
    move-result v2

    .line 247
    const-string v4, "importance"

    .line 248
    .line 249
    invoke-virtual {v6, v4, v2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 250
    .line 251
    .line 252
    :cond_a
    invoke-virtual {v0, v6}, Lgk2;->H(Landroid/media/MediaFormat;)V

    .line 253
    .line 254
    .line 255
    iget-object v2, v1, Ldk2;->b:Ljava/lang/String;

    .line 256
    .line 257
    const-string v4, "audio/raw"

    .line 258
    .line 259
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result v2

    .line 263
    if-eqz v2, :cond_b

    .line 264
    .line 265
    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    move-result v2

    .line 269
    if-nez v2, :cond_b

    .line 270
    .line 271
    move-object v2, v3

    .line 272
    goto :goto_4

    .line 273
    :cond_b
    const/4 v2, 0x0

    .line 274
    :goto_4
    iput-object v2, v0, Lbk2;->b1:Ltb1;

    .line 275
    .line 276
    new-instance v2, Lml3;

    .line 277
    .line 278
    const/4 v4, 0x0

    .line 279
    iget-object v0, v0, Lbk2;->X0:Lns3;

    .line 280
    .line 281
    move-object v5, v6

    .line 282
    move-object v6, v0

    .line 283
    move-object v0, v2

    .line 284
    move-object v2, v5

    .line 285
    move-object/from16 v5, p3

    .line 286
    .line 287
    invoke-direct/range {v0 .. v6}, Lml3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 288
    .line 289
    .line 290
    return-object v0
.end method

.method public final V(Lcj0;)V
    .locals 6

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_1

    .line 6
    .line 7
    iget-object v2, p1, Lcj0;->p:Ltb1;

    .line 8
    .line 9
    if-eqz v2, :cond_1

    .line 10
    .line 11
    iget-object v2, v2, Ltb1;->n:Ljava/lang/String;

    .line 12
    .line 13
    const-string v3, "audio/opus"

    .line 14
    .line 15
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    iget-boolean v2, p0, Lgk2;->t0:Z

    .line 22
    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    iget-object v2, p1, Lcj0;->u:Ljava/nio/ByteBuffer;

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object p1, p1, Lcj0;->p:Ltb1;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    iget p1, p1, Ltb1;->I:I

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/nio/Buffer;->remaining()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    const/16 v4, 0x8

    .line 42
    .line 43
    if-ne v3, v4, :cond_1

    .line 44
    .line 45
    sget-object v3, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 46
    .line 47
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->getLong()J

    .line 52
    .line 53
    .line 54
    move-result-wide v2

    .line 55
    const-wide/32 v4, 0xbb80

    .line 56
    .line 57
    .line 58
    mul-long/2addr v2, v4

    .line 59
    const-wide/32 v4, 0x3b9aca00

    .line 60
    .line 61
    .line 62
    div-long/2addr v2, v4

    .line 63
    long-to-int v2, v2

    .line 64
    iget-object p0, p0, Lbk2;->W0:Lsm;

    .line 65
    .line 66
    check-cast p0, Ltj0;

    .line 67
    .line 68
    iget-object v3, p0, Ltj0;->t:Lan;

    .line 69
    .line 70
    if-eqz v3, :cond_1

    .line 71
    .line 72
    invoke-virtual {v3}, Lan;->c()Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-eqz v3, :cond_1

    .line 77
    .line 78
    iget-object v3, p0, Ltj0;->p:Lqj0;

    .line 79
    .line 80
    if-eqz v3, :cond_1

    .line 81
    .line 82
    iget-object v3, v3, Lqj0;->e:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v3, Lem;

    .line 85
    .line 86
    iget-boolean v3, v3, Lem;->k:Z

    .line 87
    .line 88
    if-eqz v3, :cond_1

    .line 89
    .line 90
    iget-object p0, p0, Ltj0;->t:Lan;

    .line 91
    .line 92
    if-ge v0, v1, :cond_0

    .line 93
    .line 94
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :cond_0
    iget-object p0, p0, Lan;->a:Landroid/media/AudioTrack;

    .line 99
    .line 100
    invoke-static {p0, p1, v2}, Lz9;->o(Landroid/media/AudioTrack;II)V

    .line 101
    .line 102
    .line 103
    :cond_1
    return-void
.end method

.method public final b0(Ljava/lang/Exception;)V
    .locals 3

    .line 1
    const-string v0, "MediaCodecAudioRenderer"

    .line 2
    .line 3
    const-string v1, "Audio codec error"

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lbk2;->V0:Lxc5;

    .line 9
    .line 10
    iget-object v0, p0, Lxc5;->o:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Landroid/os/Handler;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    new-instance v1, Ljm;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-direct {v1, p0, p1, v2}, Ljm;-><init>(Lxc5;Ljava/lang/Exception;I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public final c(ILjava/lang/Object;)V
    .locals 8

    .line 1
    const/4 v0, 0x2

    .line 2
    iget-object v1, p0, Lbk2;->W0:Lsm;

    .line 3
    .line 4
    if-eq p1, v0, :cond_12

    .line 5
    .line 6
    const/4 v0, 0x3

    .line 7
    if-eq p1, v0, :cond_f

    .line 8
    .line 9
    const/4 v0, 0x6

    .line 10
    if-eq p1, v0, :cond_e

    .line 11
    .line 12
    const/16 v0, 0xc

    .line 13
    .line 14
    if-eq p1, v0, :cond_d

    .line 15
    .line 16
    const/16 v0, 0x10

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    const/16 v3, 0x23

    .line 20
    .line 21
    if-eq p1, v0, :cond_b

    .line 22
    .line 23
    const/16 v0, 0x9

    .line 24
    .line 25
    if-eq p1, v0, :cond_8

    .line 26
    .line 27
    const/16 v0, 0xa

    .line 28
    .line 29
    if-eq p1, v0, :cond_7

    .line 30
    .line 31
    const/16 v0, 0x13

    .line 32
    .line 33
    if-eq p1, v0, :cond_4

    .line 34
    .line 35
    const/16 v0, 0x14

    .line 36
    .line 37
    if-eq p1, v0, :cond_0

    .line 38
    .line 39
    invoke-super {p0, p1, p2}, Lgk2;->c(ILjava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    check-cast p2, Ldn;

    .line 47
    .line 48
    check-cast v1, Ltj0;

    .line 49
    .line 50
    iget-object p0, v1, Ltj0;->r:Ldn;

    .line 51
    .line 52
    if-eq p2, p0, :cond_3

    .line 53
    .line 54
    invoke-virtual {p0}, Ldn;->d()V

    .line 55
    .line 56
    .line 57
    iput-object p2, v1, Ltj0;->r:Ldn;

    .line 58
    .line 59
    iget-object p0, v1, Ltj0;->s:Loj0;

    .line 60
    .line 61
    if-eqz p0, :cond_2

    .line 62
    .line 63
    invoke-virtual {p2}, Ldn;->f()V

    .line 64
    .line 65
    .line 66
    iget-object p1, p2, Ldn;->e:Ltc2;

    .line 67
    .line 68
    if-nez p1, :cond_1

    .line 69
    .line 70
    new-instance p1, Ltc2;

    .line 71
    .line 72
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-direct {p1, v0}, Ltc2;-><init>(Ljava/lang/Thread;)V

    .line 77
    .line 78
    .line 79
    iput-object p1, p2, Ldn;->e:Ltc2;

    .line 80
    .line 81
    iput-boolean v2, p1, Ltc2;->i:Z

    .line 82
    .line 83
    :cond_1
    iget-object p1, p2, Ldn;->e:Ltc2;

    .line 84
    .line 85
    invoke-virtual {p1, p0}, Ltc2;->a(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    :cond_2
    invoke-virtual {v1}, Ltj0;->v()V

    .line 89
    .line 90
    .line 91
    :cond_3
    return-void

    .line 92
    :cond_4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    check-cast p2, Ljava/lang/Integer;

    .line 96
    .line 97
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    check-cast v1, Ltj0;

    .line 102
    .line 103
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    const/4 p1, -0x1

    .line 107
    if-eqz p0, :cond_5

    .line 108
    .line 109
    if-eq p0, p1, :cond_5

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_5
    move p0, p1

    .line 113
    :goto_0
    iget p1, v1, Ltj0;->U:I

    .line 114
    .line 115
    if-ne p1, p0, :cond_6

    .line 116
    .line 117
    goto/16 :goto_3

    .line 118
    .line 119
    :cond_6
    iput p0, v1, Ltj0;->U:I

    .line 120
    .line 121
    invoke-virtual {v1}, Ltj0;->v()V

    .line 122
    .line 123
    .line 124
    return-void

    .line 125
    :cond_7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    check-cast p2, Ljava/lang/Integer;

    .line 129
    .line 130
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    check-cast v1, Ltj0;

    .line 135
    .line 136
    invoke-virtual {v1, p1}, Ltj0;->y(I)V

    .line 137
    .line 138
    .line 139
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 140
    .line 141
    if-lt p2, v3, :cond_13

    .line 142
    .line 143
    iget-object p0, p0, Lbk2;->X0:Lns3;

    .line 144
    .line 145
    if-eqz p0, :cond_13

    .line 146
    .line 147
    invoke-virtual {p0, p1}, Lns3;->f(I)V

    .line 148
    .line 149
    .line 150
    return-void

    .line 151
    :cond_8
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    check-cast p2, Ljava/lang/Boolean;

    .line 155
    .line 156
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 157
    .line 158
    .line 159
    move-result p0

    .line 160
    check-cast v1, Ltj0;

    .line 161
    .line 162
    iput-boolean p0, v1, Ltj0;->y:Z

    .line 163
    .line 164
    invoke-virtual {v1}, Ltj0;->C()Z

    .line 165
    .line 166
    .line 167
    move-result p0

    .line 168
    if-eqz p0, :cond_9

    .line 169
    .line 170
    sget-object p0, Lqh3;->d:Lqh3;

    .line 171
    .line 172
    :goto_1
    move-object v3, p0

    .line 173
    goto :goto_2

    .line 174
    :cond_9
    iget-object p0, v1, Ltj0;->x:Lqh3;

    .line 175
    .line 176
    goto :goto_1

    .line 177
    :goto_2
    new-instance v2, Lrj0;

    .line 178
    .line 179
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    invoke-direct/range {v2 .. v7}, Lrj0;-><init>(Lqh3;JJ)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v1}, Ltj0;->p()Z

    .line 193
    .line 194
    .line 195
    move-result p0

    .line 196
    if-eqz p0, :cond_a

    .line 197
    .line 198
    iput-object v2, v1, Ltj0;->v:Lrj0;

    .line 199
    .line 200
    return-void

    .line 201
    :cond_a
    iput-object v2, v1, Ltj0;->w:Lrj0;

    .line 202
    .line 203
    return-void

    .line 204
    :cond_b
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    check-cast p2, Ljava/lang/Integer;

    .line 208
    .line 209
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 210
    .line 211
    .line 212
    move-result p1

    .line 213
    iput p1, p0, Lbk2;->h1:I

    .line 214
    .line 215
    iget-object p1, p0, Lgk2;->a0:Lak2;

    .line 216
    .line 217
    if-nez p1, :cond_c

    .line 218
    .line 219
    goto :goto_3

    .line 220
    :cond_c
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 221
    .line 222
    if-lt p2, v3, :cond_13

    .line 223
    .line 224
    new-instance p2, Landroid/os/Bundle;

    .line 225
    .line 226
    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    .line 227
    .line 228
    .line 229
    iget p0, p0, Lbk2;->h1:I

    .line 230
    .line 231
    neg-int p0, p0

    .line 232
    invoke-static {v2, p0}, Ljava/lang/Math;->max(II)I

    .line 233
    .line 234
    .line 235
    move-result p0

    .line 236
    const-string v0, "importance"

    .line 237
    .line 238
    invoke-virtual {p2, v0, p0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 239
    .line 240
    .line 241
    invoke-interface {p1, p2}, Lak2;->c(Landroid/os/Bundle;)V

    .line 242
    .line 243
    .line 244
    return-void

    .line 245
    :cond_d
    check-cast p2, Landroid/media/AudioDeviceInfo;

    .line 246
    .line 247
    check-cast v1, Ltj0;

    .line 248
    .line 249
    iput-object p2, v1, Ltj0;->T:Landroid/media/AudioDeviceInfo;

    .line 250
    .line 251
    iget-object p0, v1, Ltj0;->t:Lan;

    .line 252
    .line 253
    if-eqz p0, :cond_13

    .line 254
    .line 255
    iget-object p0, p0, Lan;->a:Landroid/media/AudioTrack;

    .line 256
    .line 257
    invoke-virtual {p0, p2}, Landroid/media/AudioTrack;->setPreferredDevice(Landroid/media/AudioDeviceInfo;)Z

    .line 258
    .line 259
    .line 260
    return-void

    .line 261
    :cond_e
    check-cast p2, Lxn;

    .line 262
    .line 263
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    check-cast v1, Ltj0;

    .line 267
    .line 268
    invoke-virtual {v1, p2}, Ltj0;->z(Lxn;)V

    .line 269
    .line 270
    .line 271
    return-void

    .line 272
    :cond_f
    check-cast p2, Lil;

    .line 273
    .line 274
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 275
    .line 276
    .line 277
    check-cast v1, Ltj0;

    .line 278
    .line 279
    iget-object p0, v1, Ltj0;->u:Lil;

    .line 280
    .line 281
    invoke-virtual {p0, p2}, Lil;->equals(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    move-result p0

    .line 285
    if-eqz p0, :cond_10

    .line 286
    .line 287
    goto :goto_3

    .line 288
    :cond_10
    iput-object p2, v1, Ltj0;->u:Lil;

    .line 289
    .line 290
    iget-boolean p0, v1, Ltj0;->V:Z

    .line 291
    .line 292
    if-eqz p0, :cond_11

    .line 293
    .line 294
    goto :goto_3

    .line 295
    :cond_11
    invoke-virtual {v1}, Ltj0;->v()V

    .line 296
    .line 297
    .line 298
    return-void

    .line 299
    :cond_12
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    check-cast p2, Ljava/lang/Float;

    .line 303
    .line 304
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 305
    .line 306
    .line 307
    move-result p0

    .line 308
    check-cast v1, Ltj0;

    .line 309
    .line 310
    iget p1, v1, Ltj0;->H:F

    .line 311
    .line 312
    cmpl-float p1, p1, p0

    .line 313
    .line 314
    if-eqz p1, :cond_13

    .line 315
    .line 316
    iput p0, v1, Ltj0;->H:F

    .line 317
    .line 318
    invoke-virtual {v1}, Ltj0;->p()Z

    .line 319
    .line 320
    .line 321
    move-result p0

    .line 322
    if-eqz p0, :cond_13

    .line 323
    .line 324
    iget-object p0, v1, Ltj0;->t:Lan;

    .line 325
    .line 326
    iget p1, v1, Ltj0;->H:F

    .line 327
    .line 328
    iget-object p0, p0, Lan;->a:Landroid/media/AudioTrack;

    .line 329
    .line 330
    invoke-virtual {p0, p1}, Landroid/media/AudioTrack;->setVolume(F)I

    .line 331
    .line 332
    .line 333
    :cond_13
    :goto_3
    return-void
.end method

.method public final c0(JJLjava/lang/String;)V
    .locals 8

    .line 1
    iget-object v1, p0, Lbk2;->V0:Lxc5;

    .line 2
    .line 3
    iget-object p0, v1, Lxc5;->o:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Landroid/os/Handler;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    new-instance v0, Lom;

    .line 10
    .line 11
    const/4 v7, 0x0

    .line 12
    move-wide v3, p1

    .line 13
    move-wide v5, p3

    .line 14
    move-object v2, p5

    .line 15
    invoke-direct/range {v0 .. v7}, Lom;-><init>(Ljava/lang/Object;Ljava/lang/String;JJI)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public final d(Lqh3;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lbk2;->W0:Lsm;

    .line 2
    .line 3
    check-cast p0, Ltj0;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ltj0;->B(Lqh3;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final d0(Lh40;)V
    .locals 3

    .line 1
    iget-object p0, p0, Lbk2;->V0:Lxc5;

    .line 2
    .line 3
    iget-object v0, p0, Lxc5;->o:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Landroid/os/Handler;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v1, Lk6;

    .line 10
    .line 11
    const/4 v2, 0x6

    .line 12
    invoke-direct {v1, v2, p0, p1}, Lk6;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final e0(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object p0, p0, Lbk2;->V0:Lxc5;

    .line 2
    .line 3
    iget-object v0, p0, Lxc5;->o:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Landroid/os/Handler;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v1, Lk6;

    .line 10
    .line 11
    const/4 v2, 0x5

    .line 12
    invoke-direct {v1, v2, p0, p1}, Lk6;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final f0(Lgp3;)Lej0;
    .locals 4

    .line 1
    iget-object v0, p1, Lgp3;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ltb1;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, Lbk2;->a1:Ltb1;

    .line 9
    .line 10
    invoke-super {p0, p1}, Lgk2;->f0(Lgp3;)Lej0;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-object p0, p0, Lbk2;->V0:Lxc5;

    .line 15
    .line 16
    iget-object v1, p0, Lxc5;->o:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Landroid/os/Handler;

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    new-instance v2, Lv6;

    .line 23
    .line 24
    const/4 v3, 0x1

    .line 25
    invoke-direct {v2, p0, v0, p1, v3}, Lv6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 29
    .line 30
    .line 31
    :cond_0
    return-object p1
.end method

.method public final g()Lyj2;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final g0(Ltb1;Landroid/media/MediaFormat;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lbk2;->b1:Ltb1;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    move-object p1, v0

    .line 9
    goto/16 :goto_1

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lgk2;->a0:Lak2;

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    goto/16 :goto_1

    .line 16
    .line 17
    :cond_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object v0, p1, Ltb1;->n:Ljava/lang/String;

    .line 21
    .line 22
    const-string v4, "audio/raw"

    .line 23
    .line 24
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    const/4 v5, 0x2

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    iget v0, p1, Ltb1;->H:I

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    const-string v0, "pcm-encoding"

    .line 35
    .line 36
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    if-eqz v6, :cond_3

    .line 41
    .line 42
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    goto :goto_0

    .line 47
    :cond_3
    const-string v0, "v-bits-per-sample"

    .line 48
    .line 49
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    if-eqz v6, :cond_4

    .line 54
    .line 55
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    sget-object v6, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 60
    .line 61
    invoke-static {v0, v6}, Lf35;->C(ILjava/nio/ByteOrder;)I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    goto :goto_0

    .line 66
    :cond_4
    move v0, v5

    .line 67
    :goto_0
    new-instance v6, Lsb1;

    .line 68
    .line 69
    invoke-direct {v6}, Lsb1;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-static {v4}, Llw2;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    iput-object v4, v6, Lsb1;->m:Ljava/lang/String;

    .line 77
    .line 78
    iput v0, v6, Lsb1;->G:I

    .line 79
    .line 80
    iget v0, p1, Ltb1;->I:I

    .line 81
    .line 82
    iput v0, v6, Lsb1;->H:I

    .line 83
    .line 84
    iget v0, p1, Ltb1;->J:I

    .line 85
    .line 86
    iput v0, v6, Lsb1;->I:I

    .line 87
    .line 88
    iget-object v0, p1, Ltb1;->l:Lqv2;

    .line 89
    .line 90
    iput-object v0, v6, Lsb1;->k:Lqv2;

    .line 91
    .line 92
    iget-object v0, p1, Ltb1;->a:Ljava/lang/String;

    .line 93
    .line 94
    iput-object v0, v6, Lsb1;->a:Ljava/lang/String;

    .line 95
    .line 96
    iget-object v0, p1, Ltb1;->b:Ljava/lang/String;

    .line 97
    .line 98
    iput-object v0, v6, Lsb1;->b:Ljava/lang/String;

    .line 99
    .line 100
    iget-object v0, p1, Ltb1;->c:Lyw1;

    .line 101
    .line 102
    invoke-static {v0}, Lyw1;->k(Ljava/util/Collection;)Lyw1;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    iput-object v0, v6, Lsb1;->c:Lyw1;

    .line 107
    .line 108
    iget-object v0, p1, Ltb1;->d:Ljava/lang/String;

    .line 109
    .line 110
    iput-object v0, v6, Lsb1;->d:Ljava/lang/String;

    .line 111
    .line 112
    iget v0, p1, Ltb1;->e:I

    .line 113
    .line 114
    iput v0, v6, Lsb1;->e:I

    .line 115
    .line 116
    iget p1, p1, Ltb1;->f:I

    .line 117
    .line 118
    iput p1, v6, Lsb1;->f:I

    .line 119
    .line 120
    const-string p1, "channel-count"

    .line 121
    .line 122
    invoke-virtual {p2, p1}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    iput p1, v6, Lsb1;->E:I

    .line 127
    .line 128
    const-string p1, "sample-rate"

    .line 129
    .line 130
    invoke-virtual {p2, p1}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    iput p1, v6, Lsb1;->F:I

    .line 135
    .line 136
    new-instance p1, Ltb1;

    .line 137
    .line 138
    invoke-direct {p1, v6}, Ltb1;-><init>(Lsb1;)V

    .line 139
    .line 140
    .line 141
    iget-boolean p2, p0, Lbk2;->Z0:Z

    .line 142
    .line 143
    if-eqz p2, :cond_a

    .line 144
    .line 145
    const/4 p2, 0x3

    .line 146
    iget v0, p1, Ltb1;->F:I

    .line 147
    .line 148
    if-eq v0, p2, :cond_9

    .line 149
    .line 150
    const/4 v4, 0x5

    .line 151
    if-eq v0, v4, :cond_8

    .line 152
    .line 153
    const/4 p2, 0x6

    .line 154
    if-eq v0, p2, :cond_7

    .line 155
    .line 156
    const/4 p2, 0x7

    .line 157
    if-eq v0, p2, :cond_6

    .line 158
    .line 159
    const/16 p2, 0x8

    .line 160
    .line 161
    if-eq v0, p2, :cond_5

    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_5
    new-array v3, p2, [I

    .line 165
    .line 166
    fill-array-data v3, :array_0

    .line 167
    .line 168
    .line 169
    goto :goto_1

    .line 170
    :cond_6
    new-array v3, p2, [I

    .line 171
    .line 172
    fill-array-data v3, :array_1

    .line 173
    .line 174
    .line 175
    goto :goto_1

    .line 176
    :cond_7
    new-array v3, p2, [I

    .line 177
    .line 178
    fill-array-data v3, :array_2

    .line 179
    .line 180
    .line 181
    goto :goto_1

    .line 182
    :cond_8
    const/4 v0, 0x4

    .line 183
    filled-new-array {v2, v5, v1, p2, v0}, [I

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    goto :goto_1

    .line 188
    :cond_9
    filled-new-array {v2, v5, v1}, [I

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    :cond_a
    :goto_1
    :try_start_0
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_0
    .catch Landroidx/media3/exoplayer/audio/AudioSink$ConfigurationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 193
    .line 194
    const/16 v0, 0x1d

    .line 195
    .line 196
    iget-object v4, p0, Lbk2;->W0:Lsm;

    .line 197
    .line 198
    if-lt p2, v0, :cond_e

    .line 199
    .line 200
    :try_start_1
    iget-boolean v5, p0, Lgk2;->t0:Z

    .line 201
    .line 202
    if-eqz v5, :cond_c

    .line 203
    .line 204
    iget-object v5, p0, Lkq;->q:Ldz3;

    .line 205
    .line 206
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    iget v5, v5, Ldz3;->a:I

    .line 210
    .line 211
    if-eqz v5, :cond_c

    .line 212
    .line 213
    iget-object v5, p0, Lkq;->q:Ldz3;

    .line 214
    .line 215
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    iget v5, v5, Ldz3;->a:I

    .line 219
    .line 220
    move-object v6, v4

    .line 221
    check-cast v6, Ltj0;

    .line 222
    .line 223
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    if-lt p2, v0, :cond_b

    .line 227
    .line 228
    goto :goto_2

    .line 229
    :cond_b
    move v1, v2

    .line 230
    :goto_2
    invoke-static {v1}, Lrr2;->w(Z)V

    .line 231
    .line 232
    .line 233
    iput v5, v6, Ltj0;->i:I

    .line 234
    .line 235
    goto :goto_4

    .line 236
    :catch_0
    move-exception p1

    .line 237
    goto :goto_5

    .line 238
    :cond_c
    move-object v5, v4

    .line 239
    check-cast v5, Ltj0;

    .line 240
    .line 241
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    if-lt p2, v0, :cond_d

    .line 245
    .line 246
    goto :goto_3

    .line 247
    :cond_d
    move v1, v2

    .line 248
    :goto_3
    invoke-static {v1}, Lrr2;->w(Z)V

    .line 249
    .line 250
    .line 251
    iput v2, v5, Ltj0;->i:I

    .line 252
    .line 253
    :cond_e
    :goto_4
    check-cast v4, Ltj0;

    .line 254
    .line 255
    invoke-virtual {v4, p1, v3}, Ltj0;->c(Ltb1;[I)V
    :try_end_1
    .catch Landroidx/media3/exoplayer/audio/AudioSink$ConfigurationException; {:try_start_1 .. :try_end_1} :catch_0

    .line 256
    .line 257
    .line 258
    return-void

    .line 259
    :goto_5
    iget-object p2, p1, Landroidx/media3/exoplayer/audio/AudioSink$ConfigurationException;->n:Ltb1;

    .line 260
    .line 261
    const/16 v0, 0x1389

    .line 262
    .line 263
    invoke-virtual {p0, p1, p2, v2, v0}, Lkq;->b(Ljava/lang/Throwable;Ltb1;ZI)Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 264
    .line 265
    .line 266
    move-result-object p0

    .line 267
    throw p0

    .line 268
    nop

    .line 269
    :array_0
    .array-data 4
        0x0
        0x2
        0x1
        0x7
        0x5
        0x6
        0x3
        0x4
    .end array-data

    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    :array_1
    .array-data 4
        0x0
        0x2
        0x1
        0x6
        0x5
        0x3
        0x4
    .end array-data

    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    :array_2
    .array-data 4
        0x0
        0x2
        0x1
        0x5
        0x3
        0x4
    .end array-data
.end method

.method public final h()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "MediaCodecAudioRenderer"

    .line 2
    .line 3
    return-object p0
.end method

.method public final h0()V
    .locals 0

    .line 1
    iget-object p0, p0, Lbk2;->W0:Lsm;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final i()Lqh3;
    .locals 0

    .line 1
    iget-object p0, p0, Lbk2;->W0:Lsm;

    .line 2
    .line 3
    check-cast p0, Ltj0;

    .line 4
    .line 5
    iget-object p0, p0, Ltj0;->x:Lqh3;

    .line 6
    .line 7
    return-object p0
.end method

.method public final j()J
    .locals 2

    .line 1
    iget v0, p0, Lkq;->u:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Lbk2;->F0()V

    .line 7
    .line 8
    .line 9
    :cond_0
    iget-wide v0, p0, Lbk2;->c1:J

    .line 10
    .line 11
    return-wide v0
.end method

.method public final j0()V
    .locals 1

    .line 1
    iget-object p0, p0, Lbk2;->W0:Lsm;

    .line 2
    .line 3
    check-cast p0, Ltj0;

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Ltj0;->E:Z

    .line 7
    .line 8
    return-void
.end method

.method public final k()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lbk2;->f1:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-boolean v1, p0, Lbk2;->f1:Z

    .line 5
    .line 6
    return v0
.end method

.method public final m()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lgk2;->F0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object p0, p0, Lbk2;->W0:Lsm;

    .line 6
    .line 7
    check-cast p0, Ltj0;

    .line 8
    .line 9
    invoke-virtual {p0}, Ltj0;->p()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-boolean v0, p0, Ltj0;->L:Z

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0}, Ltj0;->n()Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-nez p0, :cond_1

    .line 24
    .line 25
    :cond_0
    const/4 p0, 0x1

    .line 26
    return p0

    .line 27
    :cond_1
    const/4 p0, 0x0

    .line 28
    return p0
.end method

.method public final m0(JJLak2;Ljava/nio/ByteBuffer;IIIJZZLtb1;)Z
    .locals 0

    .line 1
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    iput-wide p1, p0, Lbk2;->j1:J

    .line 10
    .line 11
    iget-object p1, p0, Lbk2;->b1:Ltb1;

    .line 12
    .line 13
    const/4 p2, 0x1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    and-int/lit8 p1, p8, 0x2

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-interface {p5, p7}, Lak2;->g(I)V

    .line 24
    .line 25
    .line 26
    return p2

    .line 27
    :cond_0
    iget-object p1, p0, Lbk2;->W0:Lsm;

    .line 28
    .line 29
    if-eqz p12, :cond_2

    .line 30
    .line 31
    if-eqz p5, :cond_1

    .line 32
    .line 33
    invoke-interface {p5, p7}, Lak2;->g(I)V

    .line 34
    .line 35
    .line 36
    :cond_1
    iget-object p0, p0, Lgk2;->J0:Lbj0;

    .line 37
    .line 38
    iget p3, p0, Lbj0;->f:I

    .line 39
    .line 40
    add-int/2addr p3, p9

    .line 41
    iput p3, p0, Lbj0;->f:I

    .line 42
    .line 43
    check-cast p1, Ltj0;

    .line 44
    .line 45
    iput-boolean p2, p1, Ltj0;->E:Z

    .line 46
    .line 47
    return p2

    .line 48
    :cond_2
    :try_start_0
    check-cast p1, Ltj0;

    .line 49
    .line 50
    invoke-virtual {p1, p9, p10, p11, p6}, Ltj0;->m(IJLjava/nio/ByteBuffer;)Z

    .line 51
    .line 52
    .line 53
    move-result p1
    :try_end_0
    .catch Landroidx/media3/exoplayer/audio/AudioSink$InitializationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroidx/media3/exoplayer/audio/AudioSink$WriteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 54
    if-eqz p1, :cond_4

    .line 55
    .line 56
    if-eqz p5, :cond_3

    .line 57
    .line 58
    invoke-interface {p5, p7}, Lak2;->g(I)V

    .line 59
    .line 60
    .line 61
    :cond_3
    iget-object p0, p0, Lgk2;->J0:Lbj0;

    .line 62
    .line 63
    iget p1, p0, Lbj0;->e:I

    .line 64
    .line 65
    add-int/2addr p1, p9

    .line 66
    iput p1, p0, Lbj0;->e:I

    .line 67
    .line 68
    return p2

    .line 69
    :cond_4
    iput-wide p10, p0, Lbk2;->j1:J

    .line 70
    .line 71
    const/4 p0, 0x0

    .line 72
    return p0

    .line 73
    :catch_0
    move-exception p1

    .line 74
    goto :goto_0

    .line 75
    :catch_1
    move-exception p1

    .line 76
    goto :goto_2

    .line 77
    :goto_0
    iget-boolean p2, p0, Lgk2;->t0:Z

    .line 78
    .line 79
    if-eqz p2, :cond_5

    .line 80
    .line 81
    iget-object p2, p0, Lkq;->q:Ldz3;

    .line 82
    .line 83
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    iget p2, p2, Ldz3;->a:I

    .line 87
    .line 88
    if-eqz p2, :cond_5

    .line 89
    .line 90
    const/16 p2, 0x138b

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_5
    const/16 p2, 0x138a

    .line 94
    .line 95
    :goto_1
    iget-boolean p3, p1, Landroidx/media3/exoplayer/audio/AudioSink$WriteException;->o:Z

    .line 96
    .line 97
    invoke-virtual {p0, p1, p14, p3, p2}, Lkq;->b(Ljava/lang/Throwable;Ltb1;ZI)Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    throw p0

    .line 102
    :goto_2
    iget-object p2, p0, Lbk2;->a1:Ltb1;

    .line 103
    .line 104
    iget-boolean p3, p0, Lgk2;->t0:Z

    .line 105
    .line 106
    if-eqz p3, :cond_6

    .line 107
    .line 108
    iget-object p3, p0, Lkq;->q:Ldz3;

    .line 109
    .line 110
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    iget p3, p3, Ldz3;->a:I

    .line 114
    .line 115
    if-eqz p3, :cond_6

    .line 116
    .line 117
    const/16 p3, 0x138c

    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_6
    const/16 p3, 0x1389

    .line 121
    .line 122
    :goto_3
    iget-boolean p4, p1, Landroidx/media3/exoplayer/audio/AudioSink$InitializationException;->n:Z

    .line 123
    .line 124
    invoke-virtual {p0, p1, p2, p4, p3}, Lkq;->b(Ljava/lang/Throwable;Ltb1;ZI)Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    throw p0
.end method

.method public final o()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lbk2;->W0:Lsm;

    .line 2
    .line 3
    check-cast p0, Ltj0;

    .line 4
    .line 5
    invoke-virtual {p0}, Ltj0;->n()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final p()V
    .locals 3

    .line 1
    iget-object v0, p0, Lbk2;->V0:Lxc5;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iput-boolean v1, p0, Lbk2;->e1:Z

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iput-object v1, p0, Lbk2;->a1:Ltb1;

    .line 8
    .line 9
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    iput-wide v1, p0, Lbk2;->j1:J

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    iput-boolean v1, p0, Lbk2;->g1:Z

    .line 18
    .line 19
    :try_start_0
    iget-object v1, p0, Lbk2;->W0:Lsm;

    .line 20
    .line 21
    check-cast v1, Ltj0;

    .line 22
    .line 23
    invoke-virtual {v1}, Ltj0;->f()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 24
    .line 25
    .line 26
    :try_start_1
    invoke-super {p0}, Lgk2;->p()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, Lgk2;->J0:Lbj0;

    .line 30
    .line 31
    invoke-virtual {v0, p0}, Lxc5;->o(Lbj0;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :catchall_0
    move-exception v1

    .line 36
    iget-object p0, p0, Lgk2;->J0:Lbj0;

    .line 37
    .line 38
    invoke-virtual {v0, p0}, Lxc5;->o(Lbj0;)V

    .line 39
    .line 40
    .line 41
    throw v1

    .line 42
    :catchall_1
    move-exception v1

    .line 43
    :try_start_2
    invoke-super {p0}, Lgk2;->p()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 44
    .line 45
    .line 46
    iget-object p0, p0, Lgk2;->J0:Lbj0;

    .line 47
    .line 48
    invoke-virtual {v0, p0}, Lxc5;->o(Lbj0;)V

    .line 49
    .line 50
    .line 51
    throw v1

    .line 52
    :catchall_2
    move-exception v1

    .line 53
    iget-object p0, p0, Lgk2;->J0:Lbj0;

    .line 54
    .line 55
    invoke-virtual {v0, p0}, Lxc5;->o(Lbj0;)V

    .line 56
    .line 57
    .line 58
    throw v1
.end method

.method public final p0()V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lbk2;->W0:Lsm;

    .line 2
    .line 3
    check-cast v0, Ltj0;

    .line 4
    .line 5
    invoke-virtual {v0}, Ltj0;->t()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lgk2;->K0:Lfk2;

    .line 9
    .line 10
    iget-wide v0, v0, Lfk2;->e:J

    .line 11
    .line 12
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    cmp-long v2, v0, v2

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    iput-wide v0, p0, Lbk2;->j1:J
    :try_end_0
    .catch Landroidx/media3/exoplayer/audio/AudioSink$WriteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    .line 23
    return-void

    .line 24
    :catch_0
    move-exception v0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void

    .line 27
    :goto_0
    iget-boolean v1, p0, Lgk2;->t0:Z

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    const/16 v1, 0x138b

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    const/16 v1, 0x138a

    .line 35
    .line 36
    :goto_1
    iget-object v2, v0, Landroidx/media3/exoplayer/audio/AudioSink$WriteException;->p:Ltb1;

    .line 37
    .line 38
    iget-boolean v3, v0, Landroidx/media3/exoplayer/audio/AudioSink$WriteException;->o:Z

    .line 39
    .line 40
    invoke-virtual {p0, v0, v2, v3, v1}, Lkq;->b(Ljava/lang/Throwable;Ltb1;ZI)Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    throw p0
.end method

.method public final q(ZZ)V
    .locals 3

    .line 1
    new-instance p1, Lbj0;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lgk2;->J0:Lbj0;

    .line 7
    .line 8
    iget-object p2, p0, Lbk2;->V0:Lxc5;

    .line 9
    .line 10
    iget-object v0, p2, Lxc5;->o:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Landroid/os/Handler;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    new-instance v2, Lkm;

    .line 18
    .line 19
    invoke-direct {v2, p2, p1, v1}, Lkm;-><init>(Lxc5;Lbj0;I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object p1, p0, Lkq;->q:Ldz3;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-boolean p1, p1, Ldz3;->b:Z

    .line 31
    .line 32
    iget-object p2, p0, Lbk2;->W0:Lsm;

    .line 33
    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    move-object p1, p2

    .line 37
    check-cast p1, Ltj0;

    .line 38
    .line 39
    iget-boolean v0, p1, Ltj0;->P:Z

    .line 40
    .line 41
    invoke-static {v0}, Lrr2;->w(Z)V

    .line 42
    .line 43
    .line 44
    iget-boolean v0, p1, Ltj0;->V:Z

    .line 45
    .line 46
    if-nez v0, :cond_2

    .line 47
    .line 48
    iput-boolean v1, p1, Ltj0;->V:Z

    .line 49
    .line 50
    invoke-virtual {p1}, Ltj0;->v()V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    move-object p1, p2

    .line 55
    check-cast p1, Ltj0;

    .line 56
    .line 57
    iget-boolean v0, p1, Ltj0;->V:Z

    .line 58
    .line 59
    if-eqz v0, :cond_2

    .line 60
    .line 61
    const/4 v0, 0x0

    .line 62
    iput-boolean v0, p1, Ltj0;->V:Z

    .line 63
    .line 64
    invoke-virtual {p1}, Ltj0;->v()V

    .line 65
    .line 66
    .line 67
    :cond_2
    :goto_0
    iget-object p1, p0, Lkq;->s:Lik3;

    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    check-cast p2, Ltj0;

    .line 73
    .line 74
    iput-object p1, p2, Ltj0;->m:Lik3;

    .line 75
    .line 76
    iget-object p0, p0, Lkq;->t:Lvp4;

    .line 77
    .line 78
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    iget-object p1, p2, Ltj0;->r:Ldn;

    .line 82
    .line 83
    iput-object p0, p1, Ldn;->f:Lvp4;

    .line 84
    .line 85
    return-void
.end method

.method public final r(JZZ)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Lgk2;->r(JZZ)V

    .line 2
    .line 3
    .line 4
    iget-object p3, p0, Lbk2;->W0:Lsm;

    .line 5
    .line 6
    check-cast p3, Ltj0;

    .line 7
    .line 8
    invoke-virtual {p3}, Ltj0;->f()V

    .line 9
    .line 10
    .line 11
    iput-wide p1, p0, Lbk2;->c1:J

    .line 12
    .line 13
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    iput-wide p1, p0, Lbk2;->j1:J

    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    iput-boolean p1, p0, Lbk2;->f1:Z

    .line 22
    .line 23
    iput-boolean p1, p0, Lbk2;->g1:Z

    .line 24
    .line 25
    const/4 p1, 0x1

    .line 26
    iput-boolean p1, p0, Lbk2;->d1:Z

    .line 27
    .line 28
    return-void
.end method

.method public final s()V
    .locals 2

    .line 1
    iget-object v0, p0, Lbk2;->W0:Lsm;

    .line 2
    .line 3
    check-cast v0, Ltj0;

    .line 4
    .line 5
    iget-object v0, v0, Ltj0;->r:Ldn;

    .line 6
    .line 7
    invoke-virtual {v0}, Ldn;->d()V

    .line 8
    .line 9
    .line 10
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 11
    .line 12
    const/16 v1, 0x23

    .line 13
    .line 14
    if-lt v0, v1, :cond_0

    .line 15
    .line 16
    iget-object p0, p0, Lbk2;->X0:Lns3;

    .line 17
    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, Lns3;->o:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Ljava/util/HashSet;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 25
    .line 26
    .line 27
    iget-object p0, p0, Lns3;->q:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p0, Landroid/media/LoudnessCodecController;

    .line 30
    .line 31
    if-eqz p0, :cond_0

    .line 32
    .line 33
    invoke-static {p0}, Lvk;->e(Landroid/media/LoudnessCodecController;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void
.end method

.method public final u()V
    .locals 5

    .line 1
    iget-object v0, p0, Lbk2;->W0:Lsm;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-boolean v1, p0, Lbk2;->f1:Z

    .line 5
    .line 6
    iput-boolean v1, p0, Lbk2;->g1:Z

    .line 7
    .line 8
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    iput-wide v2, p0, Lbk2;->j1:J

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    :try_start_0
    iput-boolean v1, p0, Lgk2;->t0:Z

    .line 17
    .line 18
    invoke-virtual {p0}, Lgk2;->q0()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lgk2;->o0()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 22
    .line 23
    .line 24
    :try_start_1
    iget-object v3, p0, Lgk2;->U:Lpw0;

    .line 25
    .line 26
    invoke-static {v3, v2}, Lpw0;->b(Lpw0;Lpw0;)V

    .line 27
    .line 28
    .line 29
    iput-object v2, p0, Lgk2;->U:Lpw0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    .line 31
    iget-boolean v2, p0, Lbk2;->e1:Z

    .line 32
    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    iput-boolean v1, p0, Lbk2;->e1:Z

    .line 36
    .line 37
    check-cast v0, Ltj0;

    .line 38
    .line 39
    invoke-virtual {v0}, Ltj0;->w()V

    .line 40
    .line 41
    .line 42
    :cond_0
    return-void

    .line 43
    :catchall_0
    move-exception v2

    .line 44
    goto :goto_0

    .line 45
    :catchall_1
    move-exception v3

    .line 46
    :try_start_2
    iget-object v4, p0, Lgk2;->U:Lpw0;

    .line 47
    .line 48
    invoke-static {v4, v2}, Lpw0;->b(Lpw0;Lpw0;)V

    .line 49
    .line 50
    .line 51
    iput-object v2, p0, Lgk2;->U:Lpw0;

    .line 52
    .line 53
    throw v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 54
    :goto_0
    iget-boolean v3, p0, Lbk2;->e1:Z

    .line 55
    .line 56
    if-eqz v3, :cond_1

    .line 57
    .line 58
    iput-boolean v1, p0, Lbk2;->e1:Z

    .line 59
    .line 60
    check-cast v0, Ltj0;

    .line 61
    .line 62
    invoke-virtual {v0}, Ltj0;->w()V

    .line 63
    .line 64
    .line 65
    :cond_1
    throw v2
.end method

.method public final v()V
    .locals 1

    .line 1
    iget-object v0, p0, Lbk2;->W0:Lsm;

    .line 2
    .line 3
    check-cast v0, Ltj0;

    .line 4
    .line 5
    invoke-virtual {v0}, Ltj0;->r()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Lbk2;->i1:Z

    .line 10
    .line 11
    return-void
.end method

.method public final w()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lbk2;->F0()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lbk2;->i1:Z

    .line 6
    .line 7
    iget-object v1, p0, Lbk2;->W0:Lsm;

    .line 8
    .line 9
    check-cast v1, Ltj0;

    .line 10
    .line 11
    invoke-virtual {v1}, Ltj0;->q()V

    .line 12
    .line 13
    .line 14
    iput-boolean v0, p0, Lbk2;->g1:Z

    .line 15
    .line 16
    return-void
.end method

.method public final z0(Ltb1;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lkq;->q:Ldz3;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget v0, v0, Ldz3;->a:I

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lbk2;->E0(Ltb1;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    and-int/lit16 v2, v0, 0x200

    .line 16
    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    iget-object v2, p0, Lkq;->q:Ldz3;

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget v2, v2, Ldz3;->a:I

    .line 25
    .line 26
    const/4 v3, 0x2

    .line 27
    if-eq v2, v3, :cond_0

    .line 28
    .line 29
    and-int/lit16 v0, v0, 0x400

    .line 30
    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    iget v0, p1, Ltb1;->I:I

    .line 34
    .line 35
    if-nez v0, :cond_1

    .line 36
    .line 37
    iget v0, p1, Ltb1;->J:I

    .line 38
    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    :cond_0
    return v1

    .line 42
    :cond_1
    iget-object p0, p0, Lbk2;->W0:Lsm;

    .line 43
    .line 44
    check-cast p0, Ltj0;

    .line 45
    .line 46
    invoke-virtual {p0, p1}, Ltj0;->j(Ltb1;)I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    if-eqz p0, :cond_2

    .line 51
    .line 52
    return v1

    .line 53
    :cond_2
    const/4 p0, 0x0

    .line 54
    return p0
.end method
