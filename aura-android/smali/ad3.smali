.class public abstract Lad3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements La74;


# instance fields
.field public final A:Lb13;

.field public final B:Lb13;

.field public final C:Lzd3;

.field public final D:Lzd3;

.field public final E:Lzd3;

.field public final F:Lzd3;

.field public a:Z

.field public b:Lqc3;

.field public final c:Lzd3;

.field public final d:Lnq;

.field public e:I

.field public f:I

.field public g:J

.field public h:J

.field public i:F

.field public j:F

.field public final k:Lml3;

.field public final l:Z

.field public final m:Lzd3;

.field public n:Loo0;

.field public o:I

.field public final p:Lrm2;

.field public final q:Lwd3;

.field public final r:Lwd3;

.field public final s:Ldp0;

.field public final t:Lq82;

.field public final u:Lfc3;

.field public final v:Lhg3;

.field public final w:Lio;

.field public final x:Lzd3;

.field public final y:Lyc3;

.field public final z:Ln82;


# direct methods
.method public constructor <init>(IF)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    float-to-double v0, p2

    .line 5
    const-wide/high16 v2, -0x4020000000000000L    # -0.5

    .line 6
    .line 7
    cmpg-double v2, v2, v0

    .line 8
    .line 9
    if-gtz v2, :cond_0

    .line 10
    .line 11
    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    .line 12
    .line 13
    cmpg-double v0, v0, v2

    .line 14
    .line 15
    if-gtz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v1, "currentPageOffsetFraction "

    .line 21
    .line 22
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, " is not within the range -0.5 to 0.5"

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {v0}, Lfz1;->a(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :goto_0
    new-instance v0, Lg83;

    .line 41
    .line 42
    const-wide/16 v1, 0x0

    .line 43
    .line 44
    invoke-direct {v0, v1, v2}, Lg83;-><init>(J)V

    .line 45
    .line 46
    .line 47
    invoke-static {v0}, Luc5;->B(Ljava/lang/Object;)Lzd3;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iput-object v0, p0, Lad3;->c:Lzd3;

    .line 52
    .line 53
    new-instance v0, Lnq;

    .line 54
    .line 55
    invoke-direct {v0, p1, p2, p0}, Lnq;-><init>(IFLad3;)V

    .line 56
    .line 57
    .line 58
    iput-object v0, p0, Lad3;->d:Lnq;

    .line 59
    .line 60
    iput p1, p0, Lad3;->e:I

    .line 61
    .line 62
    const-wide v0, 0x7fffffffffffffffL

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    iput-wide v0, p0, Lad3;->g:J

    .line 68
    .line 69
    new-instance p2, Luc3;

    .line 70
    .line 71
    const/4 v0, 0x0

    .line 72
    invoke-direct {p2, p0, v0}, Luc3;-><init>(Lad3;I)V

    .line 73
    .line 74
    .line 75
    new-instance v1, Lml3;

    .line 76
    .line 77
    invoke-direct {v1, p2}, Lml3;-><init>(Luc3;)V

    .line 78
    .line 79
    .line 80
    iput-object v1, p0, Lad3;->k:Lml3;

    .line 81
    .line 82
    const/4 p2, 0x1

    .line 83
    iput-boolean p2, p0, Lad3;->l:Z

    .line 84
    .line 85
    sget-object v1, Led3;->b:Lqc3;

    .line 86
    .line 87
    sget-object v2, Lrv2;->s:Lrv2;

    .line 88
    .line 89
    new-instance v3, Lzd3;

    .line 90
    .line 91
    invoke-direct {v3, v1, v2}, Lzd3;-><init>(Ljava/lang/Object;Lrv2;)V

    .line 92
    .line 93
    .line 94
    iput-object v3, p0, Lad3;->m:Lzd3;

    .line 95
    .line 96
    sget-object v1, Led3;->a:Ldd3;

    .line 97
    .line 98
    iput-object v1, p0, Lad3;->n:Loo0;

    .line 99
    .line 100
    new-instance v1, Lrm2;

    .line 101
    .line 102
    const/4 v3, 0x4

    .line 103
    invoke-direct {v1, v3}, Lrm2;-><init>(I)V

    .line 104
    .line 105
    .line 106
    iput-object v1, p0, Lad3;->p:Lrm2;

    .line 107
    .line 108
    new-instance v1, Lwd3;

    .line 109
    .line 110
    const/4 v3, -0x1

    .line 111
    invoke-direct {v1, v3}, Lwd3;-><init>(I)V

    .line 112
    .line 113
    .line 114
    iput-object v1, p0, Lad3;->q:Lwd3;

    .line 115
    .line 116
    new-instance v1, Lwd3;

    .line 117
    .line 118
    invoke-direct {v1, p1}, Lwd3;-><init>(I)V

    .line 119
    .line 120
    .line 121
    iput-object v1, p0, Lad3;->r:Lwd3;

    .line 122
    .line 123
    sget-object p1, Lrv2;->D:Lrv2;

    .line 124
    .line 125
    sget-object v1, Lph4;->a:Lz05;

    .line 126
    .line 127
    new-instance v1, Lfl;

    .line 128
    .line 129
    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 130
    .line 131
    .line 132
    new-instance v1, Lcp0;

    .line 133
    .line 134
    invoke-static {}, Ljh4;->j()Lch4;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    invoke-virtual {v3}, Lch4;->g()J

    .line 139
    .line 140
    .line 141
    move-result-wide v3

    .line 142
    invoke-direct {v1, v3, v4}, Lcp0;-><init>(J)V

    .line 143
    .line 144
    .line 145
    new-instance v1, Lvc3;

    .line 146
    .line 147
    invoke-direct {v1, p0, v0}, Lvc3;-><init>(Lad3;I)V

    .line 148
    .line 149
    .line 150
    new-instance v3, Ldp0;

    .line 151
    .line 152
    invoke-direct {v3, v1, p1}, Ldp0;-><init>(Lgf1;Lrv2;)V

    .line 153
    .line 154
    .line 155
    iput-object v3, p0, Lad3;->s:Ldp0;

    .line 156
    .line 157
    new-instance p1, Lq82;

    .line 158
    .line 159
    new-instance v1, Luc3;

    .line 160
    .line 161
    invoke-direct {v1, p0, p2}, Luc3;-><init>(Lad3;I)V

    .line 162
    .line 163
    .line 164
    invoke-direct {p1, v1}, Lq82;-><init>(Luc3;)V

    .line 165
    .line 166
    .line 167
    iput-object p1, p0, Lad3;->t:Lq82;

    .line 168
    .line 169
    new-instance v1, Lom1;

    .line 170
    .line 171
    const/16 v3, 0xf

    .line 172
    .line 173
    invoke-direct {v1, v3, p0}, Lom1;-><init>(ILjava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    new-instance v4, Lfc3;

    .line 177
    .line 178
    new-instance v5, Lvc3;

    .line 179
    .line 180
    invoke-direct {v5, p0, p2}, Lvc3;-><init>(Lad3;I)V

    .line 181
    .line 182
    .line 183
    invoke-direct {v4, v1, p1, v5}, Lfc3;-><init>(Lom1;Lq82;Lvc3;)V

    .line 184
    .line 185
    .line 186
    iput-object v4, p0, Lad3;->u:Lfc3;

    .line 187
    .line 188
    new-instance p1, Lhg3;

    .line 189
    .line 190
    const/16 p2, 0x19

    .line 191
    .line 192
    invoke-direct {p1, p2}, Lhg3;-><init>(I)V

    .line 193
    .line 194
    .line 195
    iput-object p1, p0, Lad3;->v:Lhg3;

    .line 196
    .line 197
    new-instance p1, Lio;

    .line 198
    .line 199
    invoke-direct {p1}, Lio;-><init>()V

    .line 200
    .line 201
    .line 202
    iput-object p1, p0, Lad3;->w:Lio;

    .line 203
    .line 204
    const/4 p1, 0x0

    .line 205
    invoke-static {p1}, Luc5;->B(Ljava/lang/Object;)Lzd3;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    iput-object p1, p0, Lad3;->x:Lzd3;

    .line 210
    .line 211
    new-instance p1, Lyc3;

    .line 212
    .line 213
    invoke-direct {p1, p0}, Lyc3;-><init>(Lad3;)V

    .line 214
    .line 215
    .line 216
    iput-object p1, p0, Lad3;->y:Lyc3;

    .line 217
    .line 218
    invoke-static {v0, v0, v3}, Lqc0;->b(III)J

    .line 219
    .line 220
    .line 221
    new-instance p1, Ln82;

    .line 222
    .line 223
    invoke-direct {p1}, Ln82;-><init>()V

    .line 224
    .line 225
    .line 226
    iput-object p1, p0, Lad3;->z:Ln82;

    .line 227
    .line 228
    new-instance p1, Lzd3;

    .line 229
    .line 230
    sget-object p2, Lj15;->a:Lj15;

    .line 231
    .line 232
    invoke-direct {p1, p2, v2}, Lzd3;-><init>(Ljava/lang/Object;Lrv2;)V

    .line 233
    .line 234
    .line 235
    iput-object p1, p0, Lad3;->A:Lb13;

    .line 236
    .line 237
    new-instance p1, Lzd3;

    .line 238
    .line 239
    invoke-direct {p1, p2, v2}, Lzd3;-><init>(Ljava/lang/Object;Lrv2;)V

    .line 240
    .line 241
    .line 242
    iput-object p1, p0, Lad3;->B:Lb13;

    .line 243
    .line 244
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 245
    .line 246
    invoke-static {p1}, Luc5;->B(Ljava/lang/Object;)Lzd3;

    .line 247
    .line 248
    .line 249
    move-result-object p2

    .line 250
    iput-object p2, p0, Lad3;->C:Lzd3;

    .line 251
    .line 252
    invoke-static {p1}, Luc5;->B(Ljava/lang/Object;)Lzd3;

    .line 253
    .line 254
    .line 255
    move-result-object p2

    .line 256
    iput-object p2, p0, Lad3;->D:Lzd3;

    .line 257
    .line 258
    invoke-static {p1}, Luc5;->B(Ljava/lang/Object;)Lzd3;

    .line 259
    .line 260
    .line 261
    move-result-object p2

    .line 262
    iput-object p2, p0, Lad3;->E:Lzd3;

    .line 263
    .line 264
    invoke-static {p1}, Luc5;->B(Ljava/lang/Object;)Lzd3;

    .line 265
    .line 266
    .line 267
    move-result-object p1

    .line 268
    iput-object p1, p0, Lad3;->F:Lzd3;

    .line 269
    .line 270
    return-void
.end method

.method public static synthetic g(Llm0;ILyy4;Lep4;I)Ljava/lang/Object;
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x4

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x7

    .line 6
    invoke-static {p2}, Lau0;->S(I)Lck4;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lad3;->f(ILwd;Lwd0;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static s(Lad3;Lh13;Lwf1;Lwd0;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p3, Lzc3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lzc3;

    .line 7
    .line 8
    iget v1, v0, Lzc3;->s:I

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
    iput v1, v0, Lzc3;->s:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lzc3;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lzc3;-><init>(Lad3;Lwd0;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lzc3;->q:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lzc3;->s:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x2

    .line 31
    const/4 v4, 0x1

    .line 32
    sget-object v5, Lxe0;->n:Lxe0;

    .line 33
    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    if-eq v1, v4, :cond_2

    .line 37
    .line 38
    if-ne v1, v3, :cond_1

    .line 39
    .line 40
    iget-object p0, v0, Lzc3;->n:Lad3;

    .line 41
    .line 42
    invoke-static {p3}, Lkb4;->X(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_3

    .line 46
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object v2

    .line 52
    :cond_2
    iget-object p0, v0, Lzc3;->p:Lep4;

    .line 53
    .line 54
    move-object p2, p0

    .line 55
    check-cast p2, Lwf1;

    .line 56
    .line 57
    iget-object p1, v0, Lzc3;->o:Lh13;

    .line 58
    .line 59
    iget-object p0, v0, Lzc3;->n:Lad3;

    .line 60
    .line 61
    invoke-static {p3}, Lkb4;->X(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    invoke-static {p3}, Lkb4;->X(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iput-object p0, v0, Lzc3;->n:Lad3;

    .line 69
    .line 70
    iput-object p1, v0, Lzc3;->o:Lh13;

    .line 71
    .line 72
    move-object p3, p2

    .line 73
    check-cast p3, Lep4;

    .line 74
    .line 75
    iput-object p3, v0, Lzc3;->p:Lep4;

    .line 76
    .line 77
    iput v4, v0, Lzc3;->s:I

    .line 78
    .line 79
    invoke-virtual {p0, v0}, Lad3;->i(Lwd0;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p3

    .line 83
    if-ne p3, v5, :cond_4

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_4
    :goto_1
    iget-object p3, p0, Lad3;->k:Lml3;

    .line 87
    .line 88
    invoke-virtual {p3}, Lml3;->a()Z

    .line 89
    .line 90
    .line 91
    move-result p3

    .line 92
    if-nez p3, :cond_5

    .line 93
    .line 94
    invoke-virtual {p0}, Lad3;->k()I

    .line 95
    .line 96
    .line 97
    move-result p3

    .line 98
    iget-object v1, p0, Lad3;->r:Lwd3;

    .line 99
    .line 100
    invoke-virtual {v1, p3}, Lwd3;->h(I)V

    .line 101
    .line 102
    .line 103
    :cond_5
    iget-object p3, p0, Lad3;->k:Lml3;

    .line 104
    .line 105
    iput-object p0, v0, Lzc3;->n:Lad3;

    .line 106
    .line 107
    iput-object v2, v0, Lzc3;->o:Lh13;

    .line 108
    .line 109
    iput-object v2, v0, Lzc3;->p:Lep4;

    .line 110
    .line 111
    iput v3, v0, Lzc3;->s:I

    .line 112
    .line 113
    invoke-virtual {p3, p1, p2, v0}, Lml3;->e(Lh13;Lwf1;Lwd0;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    if-ne p1, v5, :cond_6

    .line 118
    .line 119
    :goto_2
    return-object v5

    .line 120
    :cond_6
    :goto_3
    const/4 p1, -0x1

    .line 121
    iget-object p0, p0, Lad3;->q:Lwd3;

    .line 122
    .line 123
    invoke-virtual {p0, p1}, Lwd3;->h(I)V

    .line 124
    .line 125
    .line 126
    sget-object p0, Lj15;->a:Lj15;

    .line 127
    .line 128
    return-object p0
.end method


# virtual methods
.method public final a()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lad3;->k:Lml3;

    .line 2
    .line 3
    invoke-virtual {p0}, Lml3;->a()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final b()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lad3;->D:Lzd3;

    .line 2
    .line 3
    invoke-virtual {p0}, Lzd3;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final c()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lad3;->C:Lzd3;

    .line 2
    .line 3
    invoke-virtual {p0}, Lzd3;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final d(F)F
    .locals 0

    .line 1
    iget-object p0, p0, Lad3;->k:Lml3;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lml3;->d(F)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final e(Lh13;Lwf1;Lwd0;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lad3;->s(Lad3;Lh13;Lwf1;Lwd0;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final f(ILwd;Lwd0;)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v3, p3, Lwc3;

    .line 2
    .line 3
    if-eqz v3, :cond_0

    .line 4
    .line 5
    move-object v3, p3

    .line 6
    check-cast v3, Lwc3;

    .line 7
    .line 8
    iget v4, v3, Lwc3;->r:I

    .line 9
    .line 10
    const/high16 v5, -0x80000000

    .line 11
    .line 12
    and-int v6, v4, v5

    .line 13
    .line 14
    if-eqz v6, :cond_0

    .line 15
    .line 16
    sub-int/2addr v4, v5

    .line 17
    iput v4, v3, Lwc3;->r:I

    .line 18
    .line 19
    :goto_0
    move-object v6, v3

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v3, Lwc3;

    .line 22
    .line 23
    invoke-direct {v3, p0, p3}, Lwc3;-><init>(Lad3;Lwd0;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object v2, v6, Lwc3;->p:Ljava/lang/Object;

    .line 28
    .line 29
    iget v3, v6, Lwc3;->r:I

    .line 30
    .line 31
    const/4 v7, 0x0

    .line 32
    const/4 v4, 0x0

    .line 33
    sget-object v8, Lj15;->a:Lj15;

    .line 34
    .line 35
    const/4 v9, 0x2

    .line 36
    const/4 v5, 0x1

    .line 37
    sget-object v10, Lxe0;->n:Lxe0;

    .line 38
    .line 39
    if-eqz v3, :cond_3

    .line 40
    .line 41
    if-eq v3, v5, :cond_2

    .line 42
    .line 43
    if-ne v3, v9, :cond_1

    .line 44
    .line 45
    invoke-static {v2}, Lkb4;->X(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    return-object v8

    .line 49
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-static {v0}, Lkf2;->o(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-object v7

    .line 55
    :cond_2
    iget v0, v6, Lwc3;->n:I

    .line 56
    .line 57
    iget-object v3, v6, Lwc3;->o:Lwd;

    .line 58
    .line 59
    invoke-static {v2}, Lkb4;->X(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    move v2, v4

    .line 63
    move-object v4, v3

    .line 64
    goto :goto_2

    .line 65
    :cond_3
    invoke-static {v2}, Lkb4;->X(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Lad3;->k()I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-ne p1, v2, :cond_4

    .line 73
    .line 74
    invoke-virtual {p0}, Lad3;->l()F

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    cmpg-float v2, v2, v4

    .line 79
    .line 80
    if-nez v2, :cond_4

    .line 81
    .line 82
    goto :goto_4

    .line 83
    :cond_4
    invoke-virtual {p0}, Lad3;->n()I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-nez v2, :cond_5

    .line 88
    .line 89
    goto :goto_4

    .line 90
    :cond_5
    iput-object p2, v6, Lwc3;->o:Lwd;

    .line 91
    .line 92
    iput p1, v6, Lwc3;->n:I

    .line 93
    .line 94
    iput v5, v6, Lwc3;->r:I

    .line 95
    .line 96
    invoke-virtual {p0, v6}, Lad3;->i(Lwd0;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    if-ne v3, v10, :cond_6

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_6
    move v0, p1

    .line 104
    move v2, v4

    .line 105
    move-object v4, p2

    .line 106
    :goto_2
    invoke-virtual {p0, v0}, Lad3;->j(I)I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    invoke-virtual {p0}, Lad3;->p()I

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    int-to-float v3, v3

    .line 115
    mul-float/2addr v3, v2

    .line 116
    move v2, v0

    .line 117
    new-instance v0, Lxc3;

    .line 118
    .line 119
    const/4 v5, 0x0

    .line 120
    move-object v1, p0

    .line 121
    invoke-direct/range {v0 .. v5}, Lxc3;-><init>(Lad3;IFLwd;Lvd0;)V

    .line 122
    .line 123
    .line 124
    iput-object v7, v6, Lwc3;->o:Lwd;

    .line 125
    .line 126
    iput v9, v6, Lwc3;->r:I

    .line 127
    .line 128
    sget-object v2, Lh13;->n:Lh13;

    .line 129
    .line 130
    invoke-static {p0, v2, v0, v6}, Lad3;->s(Lad3;Lh13;Lwf1;Lwd0;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    if-ne v0, v10, :cond_7

    .line 135
    .line 136
    :goto_3
    return-object v10

    .line 137
    :cond_7
    :goto_4
    return-object v8
.end method

.method public final h(Lqc3;ZZ)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v1, Lqc3;->a:Ljava/util/List;

    .line 6
    .line 7
    iget v3, v1, Lqc3;->l:I

    .line 8
    .line 9
    iget-object v4, v1, Lqc3;->i:Lxi2;

    .line 10
    .line 11
    iget-object v5, v1, Lqc3;->j:Lxi2;

    .line 12
    .line 13
    iget v6, v1, Lqc3;->k:F

    .line 14
    .line 15
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result v7

    .line 19
    iget-object v8, v0, Lad3;->t:Lq82;

    .line 20
    .line 21
    iput v7, v8, Lq82;->d:I

    .line 22
    .line 23
    iget v7, v1, Lqc3;->b:I

    .line 24
    .line 25
    iget v8, v1, Lqc3;->c:I

    .line 26
    .line 27
    add-int/2addr v7, v8

    .line 28
    iput v7, v0, Lad3;->o:I

    .line 29
    .line 30
    if-nez p2, :cond_0

    .line 31
    .line 32
    iget-boolean v7, v0, Lad3;->a:Z

    .line 33
    .line 34
    if-eqz v7, :cond_0

    .line 35
    .line 36
    iput-object v1, v0, Lad3;->b:Lqc3;

    .line 37
    .line 38
    return-void

    .line 39
    :cond_0
    const/4 v7, 0x1

    .line 40
    if-eqz p2, :cond_1

    .line 41
    .line 42
    iput-boolean v7, v0, Lad3;->a:Z

    .line 43
    .line 44
    :cond_1
    iget-object v8, v0, Lad3;->u:Lfc3;

    .line 45
    .line 46
    iget-boolean v9, v0, Lad3;->l:Z

    .line 47
    .line 48
    const/16 v17, 0x0

    .line 49
    .line 50
    const/4 v10, 0x0

    .line 51
    iget-object v11, v0, Lad3;->d:Lnq;

    .line 52
    .line 53
    if-eqz p3, :cond_3

    .line 54
    .line 55
    iget-object v2, v11, Lnq;->q:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v2, Lvd3;

    .line 58
    .line 59
    invoke-virtual {v2, v6}, Lvd3;->h(F)V

    .line 60
    .line 61
    .line 62
    :cond_2
    move/from16 v18, v7

    .line 63
    .line 64
    move v5, v9

    .line 65
    move v2, v10

    .line 66
    goto/16 :goto_10

    .line 67
    .line 68
    :cond_3
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    if-eqz v5, :cond_4

    .line 72
    .line 73
    iget-object v12, v5, Lxi2;->d:Ljava/lang/Object;

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_4
    move-object/from16 v12, v17

    .line 77
    .line 78
    :goto_0
    iput-object v12, v11, Lnq;->r:Ljava/lang/Object;

    .line 79
    .line 80
    iget-boolean v12, v11, Lnq;->n:Z

    .line 81
    .line 82
    if-nez v12, :cond_5

    .line 83
    .line 84
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-nez v2, :cond_8

    .line 89
    .line 90
    :cond_5
    iput-boolean v7, v11, Lnq;->n:Z

    .line 91
    .line 92
    if-eqz v5, :cond_6

    .line 93
    .line 94
    iget v2, v5, Lxi2;->a:I

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_6
    move v2, v10

    .line 98
    :goto_1
    iget-object v5, v11, Lnq;->p:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v5, Lwd3;

    .line 101
    .line 102
    invoke-virtual {v5, v2}, Lwd3;->h(I)V

    .line 103
    .line 104
    .line 105
    iget-object v5, v11, Lnq;->s:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v5, Lg82;

    .line 108
    .line 109
    iget v12, v5, Lg82;->o:I

    .line 110
    .line 111
    if-eq v2, v12, :cond_7

    .line 112
    .line 113
    iput v2, v5, Lg82;->o:I

    .line 114
    .line 115
    div-int/lit8 v2, v2, 0x1e

    .line 116
    .line 117
    mul-int/lit8 v2, v2, 0x1e

    .line 118
    .line 119
    add-int/lit8 v12, v2, -0x64

    .line 120
    .line 121
    invoke-static {v12, v10}, Ljava/lang/Math;->max(II)I

    .line 122
    .line 123
    .line 124
    move-result v12

    .line 125
    add-int/lit16 v2, v2, 0x82

    .line 126
    .line 127
    invoke-static {v12, v2}, Lgb;->g0(II)Lj02;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    iget-object v5, v5, Lg82;->n:Lzd3;

    .line 132
    .line 133
    invoke-virtual {v5, v2}, Lzd3;->setValue(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    :cond_7
    iget-object v2, v11, Lnq;->q:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v2, Lvd3;

    .line 139
    .line 140
    invoke-virtual {v2, v6}, Lvd3;->h(F)V

    .line 141
    .line 142
    .line 143
    :cond_8
    if-eqz v9, :cond_2

    .line 144
    .line 145
    move v2, v9

    .line 146
    iget-object v9, v8, Lfc3;->o:Lqp4;

    .line 147
    .line 148
    iget-object v5, v8, Lfc3;->e:Li03;

    .line 149
    .line 150
    iput-object v1, v9, Lqp4;->b:Ljava/lang/Object;

    .line 151
    .line 152
    iget-object v6, v8, Lfc3;->n:Lq82;

    .line 153
    .line 154
    iput-object v6, v9, Lqp4;->c:Ljava/lang/Object;

    .line 155
    .line 156
    iget-object v6, v8, Lfc3;->a:Lom1;

    .line 157
    .line 158
    iget v11, v8, Lfc3;->g:I

    .line 159
    .line 160
    const/4 v12, 0x0

    .line 161
    const/4 v13, -0x1

    .line 162
    if-eq v11, v13, :cond_e

    .line 163
    .line 164
    invoke-virtual {v9}, Lqp4;->h()I

    .line 165
    .line 166
    .line 167
    move-result v14

    .line 168
    if-eq v11, v14, :cond_e

    .line 169
    .line 170
    iput-boolean v7, v8, Lfc3;->l:Z

    .line 171
    .line 172
    invoke-virtual {v9}, Lqp4;->c()Z

    .line 173
    .line 174
    .line 175
    move-result v11

    .line 176
    if-eqz v11, :cond_e

    .line 177
    .line 178
    iget v11, v8, Lfc3;->h:I

    .line 179
    .line 180
    if-gez v11, :cond_9

    .line 181
    .line 182
    move v11, v10

    .line 183
    :cond_9
    iput v11, v8, Lfc3;->h:I

    .line 184
    .line 185
    invoke-virtual {v9}, Lqp4;->e()Lqc3;

    .line 186
    .line 187
    .line 188
    move-result-object v11

    .line 189
    iget-object v11, v11, Lqc3;->a:Ljava/util/List;

    .line 190
    .line 191
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    .line 192
    .line 193
    .line 194
    move-result v11

    .line 195
    if-eqz v11, :cond_a

    .line 196
    .line 197
    move v11, v13

    .line 198
    goto :goto_2

    .line 199
    :cond_a
    invoke-virtual {v9}, Lqp4;->h()I

    .line 200
    .line 201
    .line 202
    move-result v11

    .line 203
    sub-int/2addr v11, v7

    .line 204
    :goto_2
    if-eq v11, v13, :cond_c

    .line 205
    .line 206
    iget v14, v8, Lfc3;->i:I

    .line 207
    .line 208
    if-le v14, v11, :cond_b

    .line 209
    .line 210
    goto :goto_3

    .line 211
    :cond_b
    move v11, v14

    .line 212
    :goto_3
    iput v11, v8, Lfc3;->i:I

    .line 213
    .line 214
    :cond_c
    iget v11, v8, Lfc3;->f:F

    .line 215
    .line 216
    cmpg-float v11, v11, v12

    .line 217
    .line 218
    if-gtz v11, :cond_d

    .line 219
    .line 220
    invoke-virtual {v9}, Lqp4;->d()I

    .line 221
    .line 222
    .line 223
    move-result v11

    .line 224
    iget v14, v8, Lfc3;->m:I

    .line 225
    .line 226
    sub-int/2addr v14, v7

    .line 227
    invoke-virtual {v8, v11, v14}, Lfc3;->e(II)V

    .line 228
    .line 229
    .line 230
    goto :goto_4

    .line 231
    :cond_d
    invoke-virtual {v9}, Lqp4;->b()I

    .line 232
    .line 233
    .line 234
    move-result v11

    .line 235
    invoke-virtual {v8, v10, v11}, Lfc3;->e(II)V

    .line 236
    .line 237
    .line 238
    :cond_e
    :goto_4
    invoke-virtual {v9}, Lqp4;->h()I

    .line 239
    .line 240
    .line 241
    move-result v11

    .line 242
    iput v11, v8, Lfc3;->m:I

    .line 243
    .line 244
    invoke-virtual {v9}, Lqp4;->c()Z

    .line 245
    .line 246
    .line 247
    move-result v11

    .line 248
    if-eqz v11, :cond_1f

    .line 249
    .line 250
    invoke-virtual {v9}, Lqp4;->e()Lqc3;

    .line 251
    .line 252
    .line 253
    move-result-object v11

    .line 254
    iget-object v11, v11, Lqc3;->q:Ljava/util/List;

    .line 255
    .line 256
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 257
    .line 258
    .line 259
    move-result v11

    .line 260
    invoke-virtual {v9}, Lqp4;->e()Lqc3;

    .line 261
    .line 262
    .line 263
    move-result-object v14

    .line 264
    iget-object v14, v14, Lqc3;->a:Ljava/util/List;

    .line 265
    .line 266
    invoke-interface {v14}, Ljava/util/List;->size()I

    .line 267
    .line 268
    .line 269
    move-result v14

    .line 270
    add-int/2addr v14, v11

    .line 271
    invoke-virtual {v9}, Lqp4;->e()Lqc3;

    .line 272
    .line 273
    .line 274
    move-result-object v11

    .line 275
    iget-object v11, v11, Lqc3;->r:Ljava/util/List;

    .line 276
    .line 277
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 278
    .line 279
    .line 280
    move-result v11

    .line 281
    add-int/2addr v11, v14

    .line 282
    move v14, v10

    .line 283
    :goto_5
    if-ge v14, v11, :cond_1a

    .line 284
    .line 285
    invoke-virtual {v9}, Lqp4;->e()Lqc3;

    .line 286
    .line 287
    .line 288
    move-result-object v15

    .line 289
    iget-object v15, v15, Lqc3;->q:Ljava/util/List;

    .line 290
    .line 291
    invoke-interface {v15}, Ljava/util/List;->size()I

    .line 292
    .line 293
    .line 294
    move-result v15

    .line 295
    invoke-virtual {v9}, Lqp4;->e()Lqc3;

    .line 296
    .line 297
    .line 298
    move-result-object v10

    .line 299
    iget-object v10, v10, Lqc3;->a:Ljava/util/List;

    .line 300
    .line 301
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 302
    .line 303
    .line 304
    move-result v10

    .line 305
    if-ge v14, v15, :cond_f

    .line 306
    .line 307
    invoke-virtual {v9}, Lqp4;->e()Lqc3;

    .line 308
    .line 309
    .line 310
    move-result-object v10

    .line 311
    iget-object v10, v10, Lqc3;->q:Ljava/util/List;

    .line 312
    .line 313
    invoke-interface {v10, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v10

    .line 317
    check-cast v10, Lxi2;

    .line 318
    .line 319
    iget v10, v10, Lxi2;->a:I

    .line 320
    .line 321
    move/from16 p3, v12

    .line 322
    .line 323
    goto :goto_6

    .line 324
    :cond_f
    move/from16 p3, v12

    .line 325
    .line 326
    if-lt v14, v15, :cond_10

    .line 327
    .line 328
    add-int v12, v15, v10

    .line 329
    .line 330
    if-ge v14, v12, :cond_10

    .line 331
    .line 332
    invoke-virtual {v9}, Lqp4;->e()Lqc3;

    .line 333
    .line 334
    .line 335
    move-result-object v10

    .line 336
    iget-object v10, v10, Lqc3;->a:Ljava/util/List;

    .line 337
    .line 338
    sub-int v12, v14, v15

    .line 339
    .line 340
    invoke-interface {v10, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v10

    .line 344
    check-cast v10, Lxi2;

    .line 345
    .line 346
    iget v10, v10, Lxi2;->a:I

    .line 347
    .line 348
    goto :goto_6

    .line 349
    :cond_10
    add-int v12, v15, v10

    .line 350
    .line 351
    if-lt v14, v12, :cond_11

    .line 352
    .line 353
    invoke-virtual {v9}, Lqp4;->e()Lqc3;

    .line 354
    .line 355
    .line 356
    move-result-object v12

    .line 357
    iget-object v12, v12, Lqc3;->r:Ljava/util/List;

    .line 358
    .line 359
    sub-int v15, v14, v15

    .line 360
    .line 361
    sub-int/2addr v15, v10

    .line 362
    invoke-interface {v12, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v10

    .line 366
    check-cast v10, Lxi2;

    .line 367
    .line 368
    iget v10, v10, Lxi2;->a:I

    .line 369
    .line 370
    goto :goto_6

    .line 371
    :cond_11
    move v10, v13

    .line 372
    :goto_6
    invoke-virtual {v9}, Lqp4;->e()Lqc3;

    .line 373
    .line 374
    .line 375
    move-result-object v12

    .line 376
    iget-object v12, v12, Lqc3;->q:Ljava/util/List;

    .line 377
    .line 378
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 379
    .line 380
    .line 381
    move-result v12

    .line 382
    invoke-virtual {v9}, Lqp4;->e()Lqc3;

    .line 383
    .line 384
    .line 385
    move-result-object v15

    .line 386
    iget-object v15, v15, Lqc3;->a:Ljava/util/List;

    .line 387
    .line 388
    invoke-interface {v15}, Ljava/util/List;->size()I

    .line 389
    .line 390
    .line 391
    move-result v15

    .line 392
    if-ge v14, v12, :cond_12

    .line 393
    .line 394
    invoke-virtual {v9}, Lqp4;->e()Lqc3;

    .line 395
    .line 396
    .line 397
    move-result-object v12

    .line 398
    iget-object v12, v12, Lqc3;->q:Ljava/util/List;

    .line 399
    .line 400
    invoke-interface {v12, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v12

    .line 404
    check-cast v12, Lxi2;

    .line 405
    .line 406
    iget-object v12, v12, Lxi2;->d:Ljava/lang/Object;

    .line 407
    .line 408
    goto :goto_7

    .line 409
    :cond_12
    if-lt v14, v12, :cond_13

    .line 410
    .line 411
    add-int v7, v12, v15

    .line 412
    .line 413
    if-ge v14, v7, :cond_13

    .line 414
    .line 415
    invoke-virtual {v9}, Lqp4;->e()Lqc3;

    .line 416
    .line 417
    .line 418
    move-result-object v7

    .line 419
    iget-object v7, v7, Lqc3;->a:Ljava/util/List;

    .line 420
    .line 421
    sub-int v12, v14, v12

    .line 422
    .line 423
    invoke-interface {v7, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v7

    .line 427
    check-cast v7, Lxi2;

    .line 428
    .line 429
    iget-object v12, v7, Lxi2;->d:Ljava/lang/Object;

    .line 430
    .line 431
    goto :goto_7

    .line 432
    :cond_13
    add-int v7, v12, v15

    .line 433
    .line 434
    if-lt v14, v7, :cond_14

    .line 435
    .line 436
    invoke-virtual {v9}, Lqp4;->e()Lqc3;

    .line 437
    .line 438
    .line 439
    move-result-object v7

    .line 440
    iget-object v7, v7, Lqc3;->r:Ljava/util/List;

    .line 441
    .line 442
    sub-int v12, v14, v12

    .line 443
    .line 444
    sub-int/2addr v12, v15

    .line 445
    invoke-interface {v7, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object v7

    .line 449
    check-cast v7, Lxi2;

    .line 450
    .line 451
    iget-object v12, v7, Lxi2;->d:Ljava/lang/Object;

    .line 452
    .line 453
    goto :goto_7

    .line 454
    :cond_14
    sget-object v12, Lzx;->c:Lpa;

    .line 455
    .line 456
    :goto_7
    invoke-virtual {v9}, Lqp4;->e()Lqc3;

    .line 457
    .line 458
    .line 459
    move-result-object v7

    .line 460
    iget v7, v7, Lqc3;->b:I

    .line 461
    .line 462
    if-eq v10, v13, :cond_18

    .line 463
    .line 464
    invoke-virtual {v5, v10}, Le02;->a(I)Z

    .line 465
    .line 466
    .line 467
    move-result v15

    .line 468
    if-eqz v15, :cond_16

    .line 469
    .line 470
    invoke-virtual {v5, v10}, Le02;->b(I)Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    move-result-object v15

    .line 474
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 475
    .line 476
    .line 477
    check-cast v15, Lzx;

    .line 478
    .line 479
    iget v15, v15, Lzx;->b:I

    .line 480
    .line 481
    invoke-virtual {v5, v10}, Le02;->b(I)Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    move-result-object v16

    .line 485
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 486
    .line 487
    .line 488
    move-object/from16 v13, v16

    .line 489
    .line 490
    check-cast v13, Lzx;

    .line 491
    .line 492
    iget-object v13, v13, Lzx;->a:Ljava/lang/Object;

    .line 493
    .line 494
    if-ne v15, v7, :cond_15

    .line 495
    .line 496
    invoke-static {v13, v12}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 497
    .line 498
    .line 499
    move-result v13

    .line 500
    if-nez v13, :cond_16

    .line 501
    .line 502
    :cond_15
    const/4 v13, 0x1

    .line 503
    goto :goto_8

    .line 504
    :cond_16
    const/4 v13, 0x1

    .line 505
    goto :goto_9

    .line 506
    :goto_8
    iput-boolean v13, v8, Lfc3;->l:Z

    .line 507
    .line 508
    :goto_9
    invoke-virtual {v5, v10}, Le02;->b(I)Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    move-result-object v15

    .line 512
    check-cast v15, Lzx;

    .line 513
    .line 514
    if-eqz v15, :cond_17

    .line 515
    .line 516
    iput v7, v15, Lzx;->b:I

    .line 517
    .line 518
    iput-object v12, v15, Lzx;->a:Ljava/lang/Object;

    .line 519
    .line 520
    goto :goto_a

    .line 521
    :cond_17
    new-instance v15, Lzx;

    .line 522
    .line 523
    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    .line 524
    .line 525
    .line 526
    iput-object v12, v15, Lzx;->a:Ljava/lang/Object;

    .line 527
    .line 528
    iput v7, v15, Lzx;->b:I

    .line 529
    .line 530
    :goto_a
    invoke-virtual {v5, v10, v15}, Li03;->i(ILjava/lang/Object;)V

    .line 531
    .line 532
    .line 533
    iget v7, v8, Lfc3;->h:I

    .line 534
    .line 535
    invoke-static {v7, v10}, Ljava/lang/Math;->min(II)I

    .line 536
    .line 537
    .line 538
    move-result v7

    .line 539
    iput v7, v8, Lfc3;->h:I

    .line 540
    .line 541
    iget v7, v8, Lfc3;->i:I

    .line 542
    .line 543
    invoke-static {v7, v10}, Ljava/lang/Math;->max(II)I

    .line 544
    .line 545
    .line 546
    move-result v7

    .line 547
    iput v7, v8, Lfc3;->i:I

    .line 548
    .line 549
    iget-object v7, v8, Lfc3;->b:Li03;

    .line 550
    .line 551
    invoke-virtual {v7, v10}, Li03;->g(I)Ljava/lang/Object;

    .line 552
    .line 553
    .line 554
    move-result-object v7

    .line 555
    check-cast v7, Ljava/util/List;

    .line 556
    .line 557
    if-eqz v7, :cond_19

    .line 558
    .line 559
    invoke-interface {v7}, Ljava/util/Collection;->size()I

    .line 560
    .line 561
    .line 562
    move-result v10

    .line 563
    const/4 v12, 0x0

    .line 564
    :goto_b
    if-ge v12, v10, :cond_19

    .line 565
    .line 566
    invoke-interface {v7, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 567
    .line 568
    .line 569
    move-result-object v15

    .line 570
    check-cast v15, Lp82;

    .line 571
    .line 572
    invoke-interface {v15}, Lp82;->cancel()V

    .line 573
    .line 574
    .line 575
    add-int/lit8 v12, v12, 0x1

    .line 576
    .line 577
    goto :goto_b

    .line 578
    :cond_18
    const/4 v13, 0x1

    .line 579
    :cond_19
    add-int/lit8 v14, v14, 0x1

    .line 580
    .line 581
    move/from16 v12, p3

    .line 582
    .line 583
    move v7, v13

    .line 584
    const/4 v10, 0x0

    .line 585
    const/4 v13, -0x1

    .line 586
    goto/16 :goto_5

    .line 587
    .line 588
    :cond_1a
    move v13, v7

    .line 589
    move/from16 p3, v12

    .line 590
    .line 591
    iget-boolean v5, v8, Lfc3;->l:Z

    .line 592
    .line 593
    if-eqz v5, :cond_1e

    .line 594
    .line 595
    iget v5, v8, Lfc3;->f:F

    .line 596
    .line 597
    cmpg-float v5, v5, p3

    .line 598
    .line 599
    if-gtz v5, :cond_1b

    .line 600
    .line 601
    move/from16 v16, v13

    .line 602
    .line 603
    goto :goto_c

    .line 604
    :cond_1b
    const/16 v16, 0x0

    .line 605
    .line 606
    :goto_c
    invoke-virtual {v9}, Lqp4;->c()Z

    .line 607
    .line 608
    .line 609
    move-result v5

    .line 610
    if-eqz v5, :cond_1d

    .line 611
    .line 612
    invoke-virtual {v9}, Lqp4;->e()Lqc3;

    .line 613
    .line 614
    .line 615
    move-result-object v5

    .line 616
    invoke-static {v5}, Lte5;->x(Lqc3;)I

    .line 617
    .line 618
    .line 619
    invoke-virtual {v9}, Lqp4;->e()Lqc3;

    .line 620
    .line 621
    .line 622
    move-result-object v5

    .line 623
    iget-object v5, v5, Lqc3;->t:Loo0;

    .line 624
    .line 625
    if-eqz v5, :cond_1c

    .line 626
    .line 627
    iget-object v5, v6, Lom1;->o:Ljava/lang/Object;

    .line 628
    .line 629
    check-cast v5, Lad3;

    .line 630
    .line 631
    iget v5, v5, Lad3;->o:I

    .line 632
    .line 633
    move v12, v5

    .line 634
    goto :goto_d

    .line 635
    :cond_1c
    const/4 v12, 0x0

    .line 636
    :goto_d
    invoke-virtual {v9}, Lqp4;->b()I

    .line 637
    .line 638
    .line 639
    move-result v10

    .line 640
    invoke-virtual {v9}, Lqp4;->d()I

    .line 641
    .line 642
    .line 643
    move-result v11

    .line 644
    invoke-virtual {v9}, Lqp4;->g()I

    .line 645
    .line 646
    .line 647
    move-result v14

    .line 648
    move/from16 v18, v13

    .line 649
    .line 650
    invoke-virtual {v9}, Lqp4;->f()I

    .line 651
    .line 652
    .line 653
    move-result v13

    .line 654
    const/4 v15, 0x0

    .line 655
    move v5, v2

    .line 656
    const/4 v2, 0x0

    .line 657
    invoke-virtual/range {v8 .. v16}, Lfc3;->c(Lqp4;IIIIIFZ)V

    .line 658
    .line 659
    .line 660
    goto :goto_e

    .line 661
    :cond_1d
    move v5, v2

    .line 662
    move/from16 v18, v13

    .line 663
    .line 664
    const/4 v2, 0x0

    .line 665
    :goto_e
    iput-boolean v2, v8, Lfc3;->l:Z

    .line 666
    .line 667
    goto :goto_f

    .line 668
    :cond_1e
    move v5, v2

    .line 669
    move/from16 v18, v13

    .line 670
    .line 671
    const/4 v2, 0x0

    .line 672
    goto :goto_f

    .line 673
    :cond_1f
    move v5, v2

    .line 674
    move/from16 v18, v7

    .line 675
    .line 676
    move v2, v10

    .line 677
    invoke-virtual {v8}, Lfc3;->f()V

    .line 678
    .line 679
    .line 680
    :goto_f
    invoke-virtual {v9}, Lqp4;->h()I

    .line 681
    .line 682
    .line 683
    move-result v6

    .line 684
    iput v6, v8, Lfc3;->g:I

    .line 685
    .line 686
    :goto_10
    iget-object v6, v0, Lad3;->m:Lzd3;

    .line 687
    .line 688
    invoke-virtual {v6, v1}, Lzd3;->setValue(Ljava/lang/Object;)V

    .line 689
    .line 690
    .line 691
    iget-boolean v6, v1, Lqc3;->m:Z

    .line 692
    .line 693
    iget-object v7, v0, Lad3;->C:Lzd3;

    .line 694
    .line 695
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 696
    .line 697
    .line 698
    move-result-object v6

    .line 699
    invoke-virtual {v7, v6}, Lzd3;->setValue(Ljava/lang/Object;)V

    .line 700
    .line 701
    .line 702
    if-eqz v4, :cond_20

    .line 703
    .line 704
    iget v10, v4, Lxi2;->a:I

    .line 705
    .line 706
    goto :goto_11

    .line 707
    :cond_20
    move v10, v2

    .line 708
    :goto_11
    if-nez v10, :cond_22

    .line 709
    .line 710
    if-eqz v3, :cond_21

    .line 711
    .line 712
    goto :goto_12

    .line 713
    :cond_21
    move v7, v2

    .line 714
    goto :goto_13

    .line 715
    :cond_22
    :goto_12
    move/from16 v7, v18

    .line 716
    .line 717
    :goto_13
    iget-object v6, v0, Lad3;->D:Lzd3;

    .line 718
    .line 719
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 720
    .line 721
    .line 722
    move-result-object v7

    .line 723
    invoke-virtual {v6, v7}, Lzd3;->setValue(Ljava/lang/Object;)V

    .line 724
    .line 725
    .line 726
    if-eqz v4, :cond_23

    .line 727
    .line 728
    iget v4, v4, Lxi2;->a:I

    .line 729
    .line 730
    iput v4, v0, Lad3;->e:I

    .line 731
    .line 732
    :cond_23
    iput v3, v0, Lad3;->f:I

    .line 733
    .line 734
    invoke-static {}, Lya4;->t()Lch4;

    .line 735
    .line 736
    .line 737
    move-result-object v3

    .line 738
    if-eqz v3, :cond_24

    .line 739
    .line 740
    invoke-virtual {v3}, Lch4;->e()Lif1;

    .line 741
    .line 742
    .line 743
    move-result-object v17

    .line 744
    :cond_24
    move-object/from16 v4, v17

    .line 745
    .line 746
    invoke-static {v3}, Lya4;->z(Lch4;)Lch4;

    .line 747
    .line 748
    .line 749
    move-result-object v6

    .line 750
    const/16 v7, 0x20

    .line 751
    .line 752
    const-wide v9, 0xffffffffL

    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    if-nez v5, :cond_26

    .line 758
    .line 759
    :cond_25
    :goto_14
    invoke-static {v3, v6, v4}, Lya4;->H(Lch4;Lch4;Lif1;)V

    .line 760
    .line 761
    .line 762
    goto :goto_16

    .line 763
    :cond_26
    :try_start_0
    iget v5, v1, Lqc3;->h:I

    .line 764
    .line 765
    invoke-virtual {v0}, Lad3;->n()I

    .line 766
    .line 767
    .line 768
    move-result v11

    .line 769
    if-lt v5, v11, :cond_27

    .line 770
    .line 771
    goto :goto_14

    .line 772
    :cond_27
    iget v5, v0, Lad3;->j:F

    .line 773
    .line 774
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 775
    .line 776
    .line 777
    move-result v5

    .line 778
    const/high16 v11, 0x3f000000    # 0.5f

    .line 779
    .line 780
    cmpg-float v5, v5, v11

    .line 781
    .line 782
    if-gtz v5, :cond_28

    .line 783
    .line 784
    goto :goto_14

    .line 785
    :cond_28
    iget v5, v0, Lad3;->j:F

    .line 786
    .line 787
    invoke-virtual {v0}, Lad3;->m()Lqc3;

    .line 788
    .line 789
    .line 790
    move-result-object v11

    .line 791
    iget-object v11, v11, Lqc3;->e:Lhb3;

    .line 792
    .line 793
    sget-object v12, Lhb3;->n:Lhb3;

    .line 794
    .line 795
    if-ne v11, v12, :cond_29

    .line 796
    .line 797
    invoke-static {v5}, Ljava/lang/Math;->signum(F)F

    .line 798
    .line 799
    .line 800
    move-result v5

    .line 801
    invoke-virtual {v0}, Lad3;->q()J

    .line 802
    .line 803
    .line 804
    move-result-wide v11

    .line 805
    and-long/2addr v11, v9

    .line 806
    long-to-int v11, v11

    .line 807
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 808
    .line 809
    .line 810
    move-result v11

    .line 811
    neg-float v11, v11

    .line 812
    invoke-static {v11}, Ljava/lang/Math;->signum(F)F

    .line 813
    .line 814
    .line 815
    move-result v11

    .line 816
    cmpg-float v5, v5, v11

    .line 817
    .line 818
    if-nez v5, :cond_2a

    .line 819
    .line 820
    goto :goto_15

    .line 821
    :cond_29
    invoke-static {v5}, Ljava/lang/Math;->signum(F)F

    .line 822
    .line 823
    .line 824
    move-result v5

    .line 825
    invoke-virtual {v0}, Lad3;->q()J

    .line 826
    .line 827
    .line 828
    move-result-wide v11

    .line 829
    shr-long/2addr v11, v7

    .line 830
    long-to-int v11, v11

    .line 831
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 832
    .line 833
    .line 834
    move-result v11

    .line 835
    neg-float v11, v11

    .line 836
    invoke-static {v11}, Ljava/lang/Math;->signum(F)F

    .line 837
    .line 838
    .line 839
    move-result v11

    .line 840
    cmpg-float v5, v5, v11

    .line 841
    .line 842
    if-nez v5, :cond_2a

    .line 843
    .line 844
    goto :goto_15

    .line 845
    :cond_2a
    invoke-virtual {v0}, Lad3;->r()Z

    .line 846
    .line 847
    .line 848
    move-result v5

    .line 849
    if-eqz v5, :cond_25

    .line 850
    .line 851
    :goto_15
    iget v5, v0, Lad3;->j:F

    .line 852
    .line 853
    invoke-virtual {v8, v5, v1}, Lfc3;->d(FLqc3;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 854
    .line 855
    .line 856
    goto :goto_14

    .line 857
    :catchall_0
    move-exception v0

    .line 858
    goto :goto_19

    .line 859
    :goto_16
    invoke-virtual {v0}, Lad3;->n()I

    .line 860
    .line 861
    .line 862
    move-result v3

    .line 863
    invoke-static {v1, v3}, Led3;->a(Lqc3;I)J

    .line 864
    .line 865
    .line 866
    move-result-wide v3

    .line 867
    iput-wide v3, v0, Lad3;->g:J

    .line 868
    .line 869
    invoke-virtual {v0}, Lad3;->n()I

    .line 870
    .line 871
    .line 872
    iget-object v3, v1, Lqc3;->e:Lhb3;

    .line 873
    .line 874
    sget-object v4, Lhb3;->o:Lhb3;

    .line 875
    .line 876
    if-ne v3, v4, :cond_2b

    .line 877
    .line 878
    invoke-virtual {v1}, Lqc3;->i()J

    .line 879
    .line 880
    .line 881
    move-result-wide v3

    .line 882
    shr-long/2addr v3, v7

    .line 883
    :goto_17
    long-to-int v3, v3

    .line 884
    goto :goto_18

    .line 885
    :cond_2b
    invoke-virtual {v1}, Lqc3;->i()J

    .line 886
    .line 887
    .line 888
    move-result-wide v3

    .line 889
    and-long/2addr v3, v9

    .line 890
    goto :goto_17

    .line 891
    :goto_18
    iget-object v1, v1, Lqc3;->n:Lrv2;

    .line 892
    .line 893
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 894
    .line 895
    .line 896
    invoke-static {v2, v2, v3}, Lgb;->m(III)I

    .line 897
    .line 898
    .line 899
    move-result v1

    .line 900
    int-to-long v1, v1

    .line 901
    iget-wide v3, v0, Lad3;->g:J

    .line 902
    .line 903
    cmp-long v5, v1, v3

    .line 904
    .line 905
    if-lez v5, :cond_2c

    .line 906
    .line 907
    move-wide v1, v3

    .line 908
    :cond_2c
    iput-wide v1, v0, Lad3;->h:J

    .line 909
    .line 910
    return-void

    .line 911
    :goto_19
    invoke-static {v3, v6, v4}, Lya4;->H(Lch4;Lch4;Lif1;)V

    .line 912
    .line 913
    .line 914
    throw v0
.end method

.method public final i(Lwd0;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-object v0, p0, Lad3;->m:Lzd3;

    .line 2
    .line 3
    invoke-virtual {v0}, Lzd3;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Led3;->b:Lqc3;

    .line 8
    .line 9
    sget-object v2, Lj15;->a:Lj15;

    .line 10
    .line 11
    if-ne v0, v1, :cond_6

    .line 12
    .line 13
    iget-object p0, p0, Lad3;->w:Lio;

    .line 14
    .line 15
    iget-object v0, p0, Lio;->b:Lx60;

    .line 16
    .line 17
    if-nez v0, :cond_4

    .line 18
    .line 19
    new-instance v0, Lx60;

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-direct {v0, v1}, La32;-><init>(Z)V

    .line 23
    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    invoke-virtual {v0, v3}, La32;->N(Ls22;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Lio;->b:Lx60;

    .line 30
    .line 31
    iget-object p0, p0, Lio;->a:Lho;

    .line 32
    .line 33
    if-eqz p0, :cond_4

    .line 34
    .line 35
    iget-boolean v3, p0, Lcx2;->A:Z

    .line 36
    .line 37
    if-eqz v3, :cond_4

    .line 38
    .line 39
    iget-object v3, p0, Lho;->C:Lio;

    .line 40
    .line 41
    new-instance v4, Lo;

    .line 42
    .line 43
    invoke-direct {v4, v1, p0, v3}, Lo;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    invoke-static {p0}, Lj51;->O(Leo0;)Lc72;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    iget v5, v3, Lc72;->o:I

    .line 51
    .line 52
    invoke-static {v3}, Lh12;->L(Lc72;)Lub3;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    check-cast v3, Lra;

    .line 57
    .line 58
    invoke-virtual {v3}, Lra;->getRectManager()Lyv3;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    iget-object v6, v3, Lyv3;->d:Lpt4;

    .line 63
    .line 64
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    iget-object v7, v6, Lpt4;->a:Li03;

    .line 68
    .line 69
    new-instance v8, Lot4;

    .line 70
    .line 71
    invoke-direct {v8, v6, v5, p0, v4}, Lot4;-><init>(Lpt4;ILho;Lo;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v7, v5}, Le02;->b(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    if-nez v4, :cond_0

    .line 79
    .line 80
    invoke-virtual {v7, v5, v8}, Li03;->i(ILjava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    move-object v4, v8

    .line 84
    :cond_0
    check-cast v4, Lot4;

    .line 85
    .line 86
    if-eq v4, v8, :cond_2

    .line 87
    .line 88
    :goto_0
    iget-object v5, v4, Lot4;->d:Lot4;

    .line 89
    .line 90
    if-eqz v5, :cond_1

    .line 91
    .line 92
    move-object v4, v5

    .line 93
    goto :goto_0

    .line 94
    :cond_1
    iput-object v8, v4, Lot4;->d:Lot4;

    .line 95
    .line 96
    :cond_2
    iget-object v4, p0, Lcx2;->n:Lcx2;

    .line 97
    .line 98
    invoke-static {v4}, Lj51;->O(Leo0;)Lc72;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    invoke-static {v4}, Lyv3;->d(Lc72;)Z

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    if-eqz v5, :cond_3

    .line 107
    .line 108
    iget-object v5, v3, Lyv3;->c:Lue1;

    .line 109
    .line 110
    invoke-virtual {v3, v4}, Lyv3;->e(Lc72;)I

    .line 111
    .line 112
    .line 113
    move-result v4

    .line 114
    iget-object v5, v5, Lue1;->p:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v5, [J

    .line 117
    .line 118
    add-int/lit8 v4, v4, 0x2

    .line 119
    .line 120
    aget-wide v6, v5, v4

    .line 121
    .line 122
    const-wide v9, 0x6fffffffffffffffL    # 3.1050361846014175E231

    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    and-long/2addr v6, v9

    .line 128
    const-wide/high16 v9, -0x7000000000000000L

    .line 129
    .line 130
    or-long/2addr v6, v9

    .line 131
    aput-wide v6, v5, v4

    .line 132
    .line 133
    :cond_3
    iput-boolean v1, v3, Lyv3;->f:Z

    .line 134
    .line 135
    invoke-virtual {v3}, Lyv3;->k()V

    .line 136
    .line 137
    .line 138
    iput-object v8, p0, Lho;->B:Lot4;

    .line 139
    .line 140
    :cond_4
    invoke-virtual {v0, p1}, Lx60;->j0(Lwd0;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    sget-object p1, Lxe0;->n:Lxe0;

    .line 145
    .line 146
    if-ne p0, p1, :cond_5

    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_5
    move-object p0, v2

    .line 150
    :goto_1
    if-ne p0, p1, :cond_6

    .line 151
    .line 152
    return-object p0

    .line 153
    :cond_6
    return-object v2
.end method

.method public final j(I)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lad3;->n()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-lez v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lad3;->n()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    add-int/lit8 p0, p0, -0x1

    .line 13
    .line 14
    invoke-static {p1, v1, p0}, Lgb;->m(III)I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0

    .line 19
    :cond_0
    return v1
.end method

.method public final k()I
    .locals 0

    .line 1
    iget-object p0, p0, Lad3;->d:Lnq;

    .line 2
    .line 3
    iget-object p0, p0, Lnq;->p:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lwd3;

    .line 6
    .line 7
    invoke-virtual {p0}, Lwd3;->g()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final l()F
    .locals 0

    .line 1
    iget-object p0, p0, Lad3;->d:Lnq;

    .line 2
    .line 3
    iget-object p0, p0, Lnq;->q:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lvd3;

    .line 6
    .line 7
    invoke-virtual {p0}, Lvd3;->g()F

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final m()Lqc3;
    .locals 0

    .line 1
    iget-object p0, p0, Lad3;->m:Lzd3;

    .line 2
    .line 3
    invoke-virtual {p0}, Lzd3;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lqc3;

    .line 8
    .line 9
    return-object p0
.end method

.method public abstract n()I
.end method

.method public final o()I
    .locals 0

    .line 1
    iget-object p0, p0, Lad3;->m:Lzd3;

    .line 2
    .line 3
    invoke-virtual {p0}, Lzd3;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lqc3;

    .line 8
    .line 9
    iget p0, p0, Lqc3;->b:I

    .line 10
    .line 11
    return p0
.end method

.method public final p()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lad3;->o()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object p0, p0, Lad3;->m:Lzd3;

    .line 6
    .line 7
    invoke-virtual {p0}, Lzd3;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Lqc3;

    .line 12
    .line 13
    iget p0, p0, Lqc3;->c:I

    .line 14
    .line 15
    add-int/2addr p0, v0

    .line 16
    return p0
.end method

.method public final q()J
    .locals 2

    .line 1
    iget-object p0, p0, Lad3;->c:Lzd3;

    .line 2
    .line 3
    invoke-virtual {p0}, Lzd3;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lg83;

    .line 8
    .line 9
    iget-wide v0, p0, Lg83;->a:J

    .line 10
    .line 11
    return-wide v0
.end method

.method public final r()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Lad3;->q()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const/16 v2, 0x20

    .line 6
    .line 7
    shr-long/2addr v0, v2

    .line 8
    long-to-int v0, v0

    .line 9
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    float-to-int v0, v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Lad3;->q()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    const-wide v2, 0xffffffffL

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    and-long/2addr v0, v2

    .line 26
    long-to-int p0, v0

    .line 27
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    float-to-int p0, p0

    .line 32
    if-nez p0, :cond_0

    .line 33
    .line 34
    const/4 p0, 0x1

    .line 35
    return p0

    .line 36
    :cond_0
    const/4 p0, 0x0

    .line 37
    return p0
.end method

.method public final t(FIZ)V
    .locals 5

    .line 1
    iget-object v0, p0, Lad3;->d:Lnq;

    .line 2
    .line 3
    iget-object v1, v0, Lnq;->p:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lwd3;

    .line 6
    .line 7
    iget-object v2, v0, Lnq;->q:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Lvd3;

    .line 10
    .line 11
    invoke-virtual {v1}, Lwd3;->g()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-ne v1, p2, :cond_0

    .line 16
    .line 17
    invoke-virtual {v2}, Lvd3;->g()F

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    cmpg-float v1, v1, p1

    .line 22
    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object v1, p0, Lad3;->u:Lfc3;

    .line 27
    .line 28
    invoke-virtual {v1}, Lfc3;->f()V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v1, v0, Lnq;->p:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, Lwd3;

    .line 34
    .line 35
    invoke-virtual {v1, p2}, Lwd3;->h(I)V

    .line 36
    .line 37
    .line 38
    iget-object v1, v0, Lnq;->s:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v1, Lg82;

    .line 41
    .line 42
    iget v3, v1, Lg82;->o:I

    .line 43
    .line 44
    if-eq p2, v3, :cond_1

    .line 45
    .line 46
    iput p2, v1, Lg82;->o:I

    .line 47
    .line 48
    div-int/lit8 p2, p2, 0x1e

    .line 49
    .line 50
    mul-int/lit8 p2, p2, 0x1e

    .line 51
    .line 52
    add-int/lit8 v3, p2, -0x64

    .line 53
    .line 54
    const/4 v4, 0x0

    .line 55
    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    add-int/lit16 p2, p2, 0x82

    .line 60
    .line 61
    invoke-static {v3, p2}, Lgb;->g0(II)Lj02;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    iget-object v1, v1, Lg82;->n:Lzd3;

    .line 66
    .line 67
    invoke-virtual {v1, p2}, Lzd3;->setValue(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    :cond_1
    invoke-virtual {v2, p1}, Lvd3;->h(F)V

    .line 71
    .line 72
    .line 73
    const/4 p1, 0x0

    .line 74
    iput-object p1, v0, Lnq;->r:Ljava/lang/Object;

    .line 75
    .line 76
    if-eqz p3, :cond_3

    .line 77
    .line 78
    iget-object p0, p0, Lad3;->x:Lzd3;

    .line 79
    .line 80
    invoke-virtual {p0}, Lzd3;->getValue()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    check-cast p0, Lc72;

    .line 85
    .line 86
    if-eqz p0, :cond_2

    .line 87
    .line 88
    invoke-virtual {p0}, Lc72;->l()V

    .line 89
    .line 90
    .line 91
    :cond_2
    return-void

    .line 92
    :cond_3
    iget-object p0, p0, Lad3;->B:Lb13;

    .line 93
    .line 94
    sget-object p1, Lj15;->a:Lj15;

    .line 95
    .line 96
    invoke-interface {p0, p1}, Lb13;->setValue(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    return-void
.end method
