.class public final Lc60;
.super Lep4;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lwf1;


# instance fields
.field public o:Ly00;

.field public p:[B

.field public q:I

.field public r:I

.field public s:I

.field public synthetic t:Ljava/lang/Object;

.field public final synthetic u:[Lp81;

.field public final synthetic v:Lzf0;

.field public final synthetic w:Lkc5;

.field public final synthetic x:Lq81;


# direct methods
.method public constructor <init>([Lp81;Lzf0;Lkc5;Lq81;Lvd0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc60;->u:[Lp81;

    .line 2
    .line 3
    iput-object p2, p0, Lc60;->v:Lzf0;

    .line 4
    .line 5
    iput-object p3, p0, Lc60;->w:Lkc5;

    .line 6
    .line 7
    iput-object p4, p0, Lc60;->x:Lq81;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lep4;-><init>(ILvd0;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvd0;)Lvd0;
    .locals 6

    .line 1
    new-instance v0, Lc60;

    .line 2
    .line 3
    iget-object v3, p0, Lc60;->w:Lkc5;

    .line 4
    .line 5
    iget-object v4, p0, Lc60;->x:Lq81;

    .line 6
    .line 7
    iget-object v1, p0, Lc60;->u:[Lp81;

    .line 8
    .line 9
    iget-object v2, p0, Lc60;->v:Lzf0;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lc60;-><init>([Lp81;Lzf0;Lkc5;Lq81;Lvd0;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, Lc60;->t:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lwe0;

    .line 2
    .line 3
    check-cast p2, Lvd0;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lc60;->create(Ljava/lang/Object;Lvd0;)Lvd0;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lc60;

    .line 10
    .line 11
    sget-object p1, Lj15;->a:Lj15;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lc60;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lxl;->f:Lf01;

    .line 4
    .line 5
    iget v2, v0, Lc60;->s:I

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x3

    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v6, 0x1

    .line 11
    sget-object v7, Lxe0;->n:Lxe0;

    .line 12
    .line 13
    if-eqz v2, :cond_3

    .line 14
    .line 15
    if-eq v2, v6, :cond_2

    .line 16
    .line 17
    const/4 v8, 0x2

    .line 18
    if-eq v2, v8, :cond_1

    .line 19
    .line 20
    if-ne v2, v4, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    invoke-static {v0}, Lkf2;->o(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-object v5

    .line 29
    :cond_1
    :goto_0
    iget v2, v0, Lc60;->r:I

    .line 30
    .line 31
    iget v8, v0, Lc60;->q:I

    .line 32
    .line 33
    iget-object v9, v0, Lc60;->p:[B

    .line 34
    .line 35
    iget-object v10, v0, Lc60;->o:Ly00;

    .line 36
    .line 37
    iget-object v11, v0, Lc60;->t:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v11, [Ljava/lang/Object;

    .line 40
    .line 41
    invoke-static/range {p1 .. p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_2
    iget v2, v0, Lc60;->r:I

    .line 46
    .line 47
    iget v8, v0, Lc60;->q:I

    .line 48
    .line 49
    iget-object v9, v0, Lc60;->p:[B

    .line 50
    .line 51
    iget-object v10, v0, Lc60;->o:Ly00;

    .line 52
    .line 53
    iget-object v11, v0, Lc60;->t:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v11, [Ljava/lang/Object;

    .line 56
    .line 57
    invoke-static/range {p1 .. p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    move-object/from16 v12, p1

    .line 61
    .line 62
    check-cast v12, Lj10;

    .line 63
    .line 64
    iget-object v12, v12, Lj10;->a:Ljava/lang/Object;

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_3
    invoke-static/range {p1 .. p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    iget-object v2, v0, Lc60;->t:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v2, Lwe0;

    .line 73
    .line 74
    iget-object v8, v0, Lc60;->u:[Lp81;

    .line 75
    .line 76
    array-length v8, v8

    .line 77
    if-nez v8, :cond_4

    .line 78
    .line 79
    goto :goto_5

    .line 80
    :cond_4
    new-array v11, v8, [Ljava/lang/Object;

    .line 81
    .line 82
    invoke-static {v3, v8, v1, v11}, Lti;->f0(IILjava/lang/Object;[Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    const/4 v9, 0x6

    .line 86
    invoke-static {v8, v9, v5}, Lsu3;->a(IILwv;)Law;

    .line 87
    .line 88
    .line 89
    move-result-object v16

    .line 90
    new-instance v15, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 91
    .line 92
    invoke-direct {v15, v8}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 93
    .line 94
    .line 95
    move v14, v3

    .line 96
    :goto_1
    if-ge v14, v8, :cond_5

    .line 97
    .line 98
    new-instance v12, Lb60;

    .line 99
    .line 100
    iget-object v13, v0, Lc60;->u:[Lp81;

    .line 101
    .line 102
    const/16 v17, 0x0

    .line 103
    .line 104
    invoke-direct/range {v12 .. v17}, Lb60;-><init>([Lp81;ILjava/util/concurrent/atomic/AtomicInteger;Law;Lvd0;)V

    .line 105
    .line 106
    .line 107
    invoke-static {v2, v5, v5, v12, v4}, Lfu;->G(Lwe0;Lne0;Lze0;Lwf1;I)Lsk4;

    .line 108
    .line 109
    .line 110
    add-int/lit8 v14, v14, 0x1

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_5
    new-array v9, v8, [B

    .line 114
    .line 115
    move v2, v3

    .line 116
    move-object/from16 v10, v16

    .line 117
    .line 118
    :cond_6
    :goto_2
    add-int/2addr v2, v6

    .line 119
    int-to-byte v2, v2

    .line 120
    iput-object v11, v0, Lc60;->t:Ljava/lang/Object;

    .line 121
    .line 122
    iput-object v10, v0, Lc60;->o:Ly00;

    .line 123
    .line 124
    iput-object v9, v0, Lc60;->p:[B

    .line 125
    .line 126
    iput v8, v0, Lc60;->q:I

    .line 127
    .line 128
    iput v2, v0, Lc60;->r:I

    .line 129
    .line 130
    iput v6, v0, Lc60;->s:I

    .line 131
    .line 132
    invoke-interface {v10, v0}, Ly00;->i(Lc60;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v12

    .line 136
    if-ne v12, v7, :cond_7

    .line 137
    .line 138
    goto :goto_7

    .line 139
    :cond_7
    :goto_3
    instance-of v13, v12, Li10;

    .line 140
    .line 141
    if-nez v13, :cond_8

    .line 142
    .line 143
    goto :goto_4

    .line 144
    :cond_8
    move-object v12, v5

    .line 145
    :goto_4
    check-cast v12, Lyx1;

    .line 146
    .line 147
    if-nez v12, :cond_9

    .line 148
    .line 149
    :goto_5
    sget-object v0, Lj15;->a:Lj15;

    .line 150
    .line 151
    return-object v0

    .line 152
    :cond_9
    iget v13, v12, Lyx1;->a:I

    .line 153
    .line 154
    aget-object v14, v11, v13

    .line 155
    .line 156
    iget-object v12, v12, Lyx1;->b:Ljava/lang/Object;

    .line 157
    .line 158
    aput-object v12, v11, v13

    .line 159
    .line 160
    if-ne v14, v1, :cond_a

    .line 161
    .line 162
    add-int/lit8 v8, v8, -0x1

    .line 163
    .line 164
    :cond_a
    aget-byte v12, v9, v13

    .line 165
    .line 166
    if-eq v12, v2, :cond_c

    .line 167
    .line 168
    int-to-byte v12, v2

    .line 169
    aput-byte v12, v9, v13

    .line 170
    .line 171
    invoke-interface {v10}, Ly00;->g()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v12

    .line 175
    instance-of v13, v12, Li10;

    .line 176
    .line 177
    if-nez v13, :cond_b

    .line 178
    .line 179
    goto :goto_6

    .line 180
    :cond_b
    move-object v12, v5

    .line 181
    :goto_6
    check-cast v12, Lyx1;

    .line 182
    .line 183
    if-nez v12, :cond_9

    .line 184
    .line 185
    :cond_c
    if-nez v8, :cond_6

    .line 186
    .line 187
    iget-object v12, v0, Lc60;->v:Lzf0;

    .line 188
    .line 189
    iget-object v12, v12, Lzf0;->o:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast v12, [Lp81;

    .line 192
    .line 193
    array-length v12, v12

    .line 194
    new-array v12, v12, [Ltc0;

    .line 195
    .line 196
    const/16 v13, 0xe

    .line 197
    .line 198
    invoke-static {v3, v3, v13, v11, v12}, Lti;->c0(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    iput-object v11, v0, Lc60;->t:Ljava/lang/Object;

    .line 202
    .line 203
    iput-object v10, v0, Lc60;->o:Ly00;

    .line 204
    .line 205
    iput-object v9, v0, Lc60;->p:[B

    .line 206
    .line 207
    iput v8, v0, Lc60;->q:I

    .line 208
    .line 209
    iput v2, v0, Lc60;->r:I

    .line 210
    .line 211
    iput v4, v0, Lc60;->s:I

    .line 212
    .line 213
    iget-object v13, v0, Lc60;->w:Lkc5;

    .line 214
    .line 215
    iget-object v14, v0, Lc60;->x:Lq81;

    .line 216
    .line 217
    invoke-virtual {v13, v14, v12, v0}, Lkc5;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v12

    .line 221
    if-ne v12, v7, :cond_6

    .line 222
    .line 223
    :goto_7
    return-object v7
.end method
