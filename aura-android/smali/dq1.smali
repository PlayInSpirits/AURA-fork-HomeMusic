.class public final Ldq1;
.super Lbq1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final q:Lgr1;

.field public r:J

.field public s:Z

.field public final synthetic t:Lhq1;


# direct methods
.method public constructor <init>(Lhq1;Lgr1;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldq1;->t:Lhq1;

    .line 5
    .line 6
    invoke-direct {p0, p1}, Lbq1;-><init>(Lhq1;)V

    .line 7
    .line 8
    .line 9
    iput-object p2, p0, Ldq1;->q:Lgr1;

    .line 10
    .line 11
    const-wide/16 p1, -0x1

    .line 12
    .line 13
    iput-wide p1, p0, Ldq1;->r:J

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    iput-boolean p1, p0, Ldq1;->s:Z

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lbq1;->o:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-boolean v0, p0, Ldq1;->s:Z

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    sget-object v0, Lze5;->a:Ltl1;

    .line 11
    .line 12
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const/16 v0, 0x64

    .line 18
    .line 19
    :try_start_0
    invoke-static {p0, v0}, Lze5;->h(Lej4;I)Z

    .line 20
    .line 21
    .line 22
    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    goto :goto_0

    .line 24
    :catch_0
    const/4 v0, 0x0

    .line 25
    :goto_0
    if-nez v0, :cond_1

    .line 26
    .line 27
    iget-object v0, p0, Ldq1;->t:Lhq1;

    .line 28
    .line 29
    iget-object v0, v0, Lhq1;->c:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Lq21;

    .line 32
    .line 33
    invoke-interface {v0}, Lq21;->a()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lbq1;->b()V

    .line 37
    .line 38
    .line 39
    :cond_1
    const/4 v0, 0x1

    .line 40
    iput-boolean v0, p0, Lbq1;->o:Z

    .line 41
    .line 42
    return-void
.end method

.method public final read(Ltv;J)J
    .locals 11

    .line 1
    iget-object v0, p0, Ldq1;->t:Lhq1;

    .line 2
    .line 3
    iget-object v1, v0, Lhq1;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lfw;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const-wide/16 v2, 0x0

    .line 11
    .line 12
    cmp-long v4, p2, v2

    .line 13
    .line 14
    if-ltz v4, :cond_a

    .line 15
    .line 16
    iget-boolean v4, p0, Lbq1;->o:Z

    .line 17
    .line 18
    if-nez v4, :cond_9

    .line 19
    .line 20
    iget-boolean v4, p0, Ldq1;->s:Z

    .line 21
    .line 22
    const-wide/16 v5, -0x1

    .line 23
    .line 24
    if-nez v4, :cond_0

    .line 25
    .line 26
    goto/16 :goto_2

    .line 27
    .line 28
    :cond_0
    iget-wide v7, p0, Ldq1;->r:J

    .line 29
    .line 30
    cmp-long v4, v7, v2

    .line 31
    .line 32
    if-eqz v4, :cond_1

    .line 33
    .line 34
    cmp-long v4, v7, v5

    .line 35
    .line 36
    if-nez v4, :cond_6

    .line 37
    .line 38
    :cond_1
    const-string v4, "expected chunk size and optional extensions but was \""

    .line 39
    .line 40
    cmp-long v7, v7, v5

    .line 41
    .line 42
    if-eqz v7, :cond_2

    .line 43
    .line 44
    invoke-interface {v1}, Lfw;->I()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    :cond_2
    :try_start_0
    invoke-interface {v1}, Lfw;->S()J

    .line 48
    .line 49
    .line 50
    move-result-wide v7

    .line 51
    iput-wide v7, p0, Ldq1;->r:J

    .line 52
    .line 53
    invoke-interface {v1}, Lfw;->I()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-static {v1}, Lqm4;->K0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    iget-wide v7, p0, Ldq1;->r:J

    .line 66
    .line 67
    cmp-long v7, v7, v2

    .line 68
    .line 69
    if-ltz v7, :cond_8

    .line 70
    .line 71
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    const/4 v8, 0x0

    .line 76
    if-lez v7, :cond_3

    .line 77
    .line 78
    const-string v7, ";"

    .line 79
    .line 80
    invoke-static {v1, v7, v8}, Lxm4;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 81
    .line 82
    .line 83
    move-result v7
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 84
    if-eqz v7, :cond_8

    .line 85
    .line 86
    :cond_3
    iget-wide v9, p0, Ldq1;->r:J

    .line 87
    .line 88
    cmp-long v1, v9, v2

    .line 89
    .line 90
    if-nez v1, :cond_5

    .line 91
    .line 92
    iput-boolean v8, p0, Ldq1;->s:Z

    .line 93
    .line 94
    iget-object v1, v0, Lhq1;->f:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v1, Le20;

    .line 97
    .line 98
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    new-instance v2, Lsl1;

    .line 102
    .line 103
    invoke-direct {v2}, Lsl1;-><init>()V

    .line 104
    .line 105
    .line 106
    :goto_0
    iget-object v3, v1, Le20;->p:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v3, Lfw;

    .line 109
    .line 110
    iget-wide v7, v1, Le20;->o:J

    .line 111
    .line 112
    invoke-interface {v3, v7, v8}, Lfw;->t(J)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    iget-wide v7, v1, Le20;->o:J

    .line 117
    .line 118
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    int-to-long v9, v4

    .line 123
    sub-long/2addr v7, v9

    .line 124
    iput-wide v7, v1, Le20;->o:J

    .line 125
    .line 126
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    if-nez v4, :cond_4

    .line 131
    .line 132
    invoke-virtual {v2}, Lsl1;->c()Ltl1;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    iput-object v1, v0, Lhq1;->g:Ljava/lang/Object;

    .line 137
    .line 138
    iget-object v1, v0, Lhq1;->b:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v1, Lo83;

    .line 141
    .line 142
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    iget-object v1, v1, Lo83;->j:Lbe0;

    .line 146
    .line 147
    iget-object v2, v0, Lhq1;->g:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v2, Ltl1;

    .line 150
    .line 151
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    iget-object v3, p0, Ldq1;->q:Lgr1;

    .line 155
    .line 156
    invoke-static {v1, v3, v2}, Lbr1;->b(Lbe0;Lgr1;Ltl1;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {p0}, Lbq1;->b()V

    .line 160
    .line 161
    .line 162
    goto :goto_1

    .line 163
    :cond_4
    invoke-virtual {v2, v3}, Lsl1;->b(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    goto :goto_0

    .line 167
    :cond_5
    :goto_1
    iget-boolean v1, p0, Ldq1;->s:Z

    .line 168
    .line 169
    if-nez v1, :cond_6

    .line 170
    .line 171
    :goto_2
    return-wide v5

    .line 172
    :cond_6
    iget-wide v1, p0, Ldq1;->r:J

    .line 173
    .line 174
    invoke-static {p2, p3, v1, v2}, Ljava/lang/Math;->min(JJ)J

    .line 175
    .line 176
    .line 177
    move-result-wide p2

    .line 178
    invoke-super {p0, p1, p2, p3}, Lbq1;->read(Ltv;J)J

    .line 179
    .line 180
    .line 181
    move-result-wide p1

    .line 182
    cmp-long p3, p1, v5

    .line 183
    .line 184
    if-eqz p3, :cond_7

    .line 185
    .line 186
    iget-wide v0, p0, Ldq1;->r:J

    .line 187
    .line 188
    sub-long/2addr v0, p1

    .line 189
    iput-wide v0, p0, Ldq1;->r:J

    .line 190
    .line 191
    return-wide p1

    .line 192
    :cond_7
    iget-object p1, v0, Lhq1;->c:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast p1, Lq21;

    .line 195
    .line 196
    invoke-interface {p1}, Lq21;->a()V

    .line 197
    .line 198
    .line 199
    new-instance p1, Ljava/net/ProtocolException;

    .line 200
    .line 201
    const-string p2, "unexpected end of stream"

    .line 202
    .line 203
    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {p0}, Lbq1;->b()V

    .line 207
    .line 208
    .line 209
    throw p1

    .line 210
    :cond_8
    :try_start_1
    new-instance p1, Ljava/net/ProtocolException;

    .line 211
    .line 212
    new-instance p2, Ljava/lang/StringBuilder;

    .line 213
    .line 214
    invoke-direct {p2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    iget-wide v2, p0, Ldq1;->r:J

    .line 218
    .line 219
    invoke-virtual {p2, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    const/16 p0, 0x22

    .line 226
    .line 227
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object p0

    .line 234
    invoke-direct {p1, p0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    throw p1
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    .line 238
    :catch_0
    move-exception p0

    .line 239
    new-instance p1, Ljava/net/ProtocolException;

    .line 240
    .line 241
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object p0

    .line 245
    invoke-direct {p1, p0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    throw p1

    .line 249
    :cond_9
    const-string p0, "closed"

    .line 250
    .line 251
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    return-wide v2

    .line 255
    :cond_a
    const-string p0, "byteCount < 0: "

    .line 256
    .line 257
    invoke-static {p0, p2, p3}, Lb11;->k(Ljava/lang/String;J)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object p0

    .line 261
    invoke-static {p0}, Lkf2;->e(Ljava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    return-wide v2
.end method
