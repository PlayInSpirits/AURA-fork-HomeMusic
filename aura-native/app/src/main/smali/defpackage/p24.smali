.class public final Ldefpackage/p24;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public a:Z

.field public b:Z

.field public final c:Ldefpackage/li0;

.field public final d:Ldefpackage/qz0;

.field public final e:Ljava/util/List;

.field public final f:Ldefpackage/fa0;

.field public g:Ldefpackage/we1;


# direct methods
.method public constructor <init>(Ldefpackage/li0;Ldefpackage/kl3;)V
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v8, v1, Ldefpackage/li0;->g:Ldefpackage/r24;

    .line 192
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 193
    iput-object v1, v0, Ldefpackage/p24;->c:Ldefpackage/li0;

    .line 194
    new-instance v2, Ldefpackage/n24;

    const/4 v3, -0x1

    .line 195
    const-string v4, ""

    invoke-direct {v2, v3, v4, v4}, Ldefpackage/qz0;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 196
    iput-object v2, v0, Ldefpackage/p24;->d:Ldefpackage/qz0;

    .line 197
    iget-object v2, v1, Ldefpackage/li0;->e:Ljava/util/List;

    sget-object v3, Ldefpackage/u01;->n:Ldefpackage/u01;

    if-nez v2, :cond_0

    move-object v4, v3

    goto :goto_0

    :cond_0
    move-object v4, v2

    :goto_0
    iput-object v4, v0, Ldefpackage/p24;->e:Ljava/util/List;

    .line 198
    new-instance v4, Ldefpackage/kl3;

    const/4 v5, 0x3

    invoke-direct {v4, v5, v0}, Ldefpackage/kl3;-><init>(ILjava/lang/Object;)V

    if-nez v2, :cond_1

    move-object v2, v3

    .line 199
    :cond_1
    new-instance v3, Ldefpackage/m30;

    invoke-direct {v3, v4}, Ldefpackage/m30;-><init>(Ldefpackage/kl3;)V

    .line 200
    invoke-static {v3, v2}, Ldefpackage/q40;->F0(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v6

    .line 201
    iget-object v2, v1, Ldefpackage/li0;->a:Landroid/content/Context;

    .line 202
    iget-object v3, v1, Ldefpackage/li0;->b:Ljava/lang/String;

    .line 203
    iget-object v4, v1, Ldefpackage/li0;->c:Ldefpackage/ro4;

    .line 204
    iget-object v5, v1, Ldefpackage/li0;->d:Ldefpackage/pz1;

    .line 205
    iget-boolean v7, v1, Ldefpackage/li0;->f:Z

    .line 206
    iget-object v9, v1, Ldefpackage/li0;->h:Ljava/util/concurrent/Executor;

    .line 207
    iget-object v10, v1, Ldefpackage/li0;->i:Ljava/util/concurrent/Executor;

    .line 208
    iget-object v11, v1, Ldefpackage/li0;->j:Landroid/content/Intent;

    .line 209
    iget-boolean v12, v1, Ldefpackage/li0;->k:Z

    .line 210
    iget-boolean v13, v1, Ldefpackage/li0;->l:Z

    .line 211
    iget-object v14, v1, Ldefpackage/li0;->m:Ljava/util/Set;

    .line 212
    iget-object v15, v1, Ldefpackage/li0;->n:Ljava/lang/String;

    move-object/from16 v16, v2

    .line 213
    iget-object v2, v1, Ldefpackage/li0;->o:Ljava/io/File;

    move-object/from16 v17, v2

    .line 214
    iget-object v2, v1, Ldefpackage/li0;->p:Ljava/util/concurrent/Callable;

    move-object/from16 v18, v2

    .line 215
    iget-object v2, v1, Ldefpackage/li0;->q:Ljava/util/List;

    move-object/from16 v19, v2

    .line 216
    iget-object v2, v1, Ldefpackage/li0;->r:Ljava/util/List;

    move-object/from16 v20, v2

    .line 217
    iget-boolean v2, v1, Ldefpackage/li0;->s:Z

    move/from16 v21, v2

    .line 218
    iget-object v2, v1, Ldefpackage/li0;->t:Ldefpackage/y34;

    .line 219
    iget-object v1, v1, Ldefpackage/li0;->u:Ldefpackage/ne0;

    .line 220
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v22, v1

    .line 221
    new-instance v1, Ldefpackage/li0;

    move/from16 v23, v21

    move-object/from16 v21, v2

    move-object/from16 v2, v16

    move-object/from16 v16, v17

    move-object/from16 v17, v18

    move-object/from16 v18, v19

    move-object/from16 v19, v20

    move/from16 v20, v23

    invoke-direct/range {v1 .. v22}, Ldefpackage/li0;-><init>(Landroid/content/Context;Ljava/lang/String;Ldefpackage/ro4;Ldefpackage/pz1;Ljava/util/List;ZLdefpackage/r24;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroid/content/Intent;ZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Ljava/util/List;Ljava/util/List;ZLdefpackage/y34;Ldefpackage/ne0;)V

    .line 222
    new-instance v2, Ldefpackage/qo4;

    .line 223
    new-instance v3, Ldefpackage/pz1;

    move-object/from16 v4, p2

    .line 224
    invoke-virtual {v4, v1}, Ldefpackage/kl3;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ldefpackage/so4;

    .line 225
    invoke-direct {v3, v1}, Ldefpackage/pz1;-><init>(Ldefpackage/so4;)V

    .line 226
    invoke-direct {v2, v3}, Ldefpackage/qo4;-><init>(Ldefpackage/pz1;)V

    .line 227
    iput-object v2, v0, Ldefpackage/p24;->f:Ldefpackage/fa0;

    .line 228
    sget-object v1, Ldefpackage/r24;->p:Ldefpackage/r24;

    if-ne v8, v1, :cond_2

    const/4 v1, 0x1

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    .line 229
    :goto_1
    invoke-virtual {v0}, Ldefpackage/p24;->c()Ldefpackage/so4;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-interface {v0, v1}, Ldefpackage/so4;->setWriteAheadLoggingEnabled(Z)V

    :cond_3
    return-void
.end method

.method public constructor <init>(Ldefpackage/li0;Ldefpackage/qz0;)V
    .locals 9

    .line 1
    iget-object v0, p1, Ldefpackage/li0;->g:Ldefpackage/r24;

    .line 2
    .line 3
    iget-object v1, p1, Ldefpackage/li0;->c:Ldefpackage/ro4;

    .line 4
    .line 5
    iget-object v4, p1, Ldefpackage/li0;->b:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Ldefpackage/p24;->c:Ldefpackage/li0;

    .line 11
    .line 12
    iput-object p2, p0, Ldefpackage/p24;->d:Ldefpackage/qz0;

    .line 13
    .line 14
    iget-object v2, p1, Ldefpackage/li0;->e:Ljava/util/List;

    .line 15
    .line 16
    if-nez v2, :cond_0

    .line 17
    .line 18
    sget-object v2, Ldefpackage/u01;->n:Ldefpackage/u01;

    .line 19
    .line 20
    :cond_0
    iput-object v2, p0, Ldefpackage/p24;->e:Ljava/util/List;

    .line 21
    .line 22
    iget-object v2, p1, Ldefpackage/li0;->t:Ldefpackage/y34;

    .line 23
    .line 24
    const/4 v8, 0x1

    .line 25
    if-nez v2, :cond_2

    .line 26
    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    iget-object v3, p1, Ldefpackage/li0;->a:Landroid/content/Context;

    .line 30
    .line 31
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    new-instance v5, Ldefpackage/o24;

    .line 35
    .line 36
    iget p1, p2, Ldefpackage/qz0;->a:I

    .line 37
    .line 38
    invoke-direct {v5, p0, p1}, Ldefpackage/o24;-><init>(Ldefpackage/p24;I)V

    .line 39
    .line 40
    .line 41
    new-instance v2, Ldefpackage/y10;

    .line 42
    .line 43
    const/4 v6, 0x0

    .line 44
    const/4 v7, 0x0

    .line 45
    invoke-direct/range {v2 .. v7}, Ldefpackage/y10;-><init>(Landroid/content/Context;Ljava/lang/String;Ldefpackage/uv;ZZ)V

    .line 46
    .line 47
    .line 48
    new-instance p1, Ldefpackage/qo4;

    .line 49
    .line 50
    new-instance p2, Ldefpackage/pz1;

    .line 51
    .line 52
    invoke-interface {v1, v2}, Ldefpackage/ro4;->c(Ldefpackage/y10;)Ldefpackage/so4;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-direct {p2, v1}, Ldefpackage/pz1;-><init>(Ldefpackage/so4;)V

    .line 57
    .line 58
    .line 59
    invoke-direct {p1, p2}, Ldefpackage/qo4;-><init>(Ldefpackage/pz1;)V

    .line 60
    .line 61
    .line 62
    iput-object p1, p0, Ldefpackage/p24;->f:Ldefpackage/fa0;

    .line 63
    .line 64
    goto/16 :goto_3

    .line 65
    .line 66
    :cond_1
    const-string p0, "SQLiteManager was constructed with both null driver and open helper factory!"

    .line 67
    .line 68
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const/4 p0, 0x0

    .line 72
    throw p0

    .line 73
    :cond_2
    if-nez v4, :cond_3

    .line 74
    .line 75
    new-instance p1, Ldefpackage/rf2;

    .line 76
    .line 77
    invoke-direct {p1, p0, v2}, Ldefpackage/rf2;-><init>(Ldefpackage/p24;Ldefpackage/y34;)V

    .line 78
    .line 79
    .line 80
    new-instance p2, Ldefpackage/ia0;

    .line 81
    .line 82
    invoke-direct {p2, p1}, Ldefpackage/ia0;-><init>(Ldefpackage/rf2;)V

    .line 83
    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_3
    new-instance p1, Ldefpackage/rf2;

    .line 87
    .line 88
    invoke-direct {p1, p0, v2}, Ldefpackage/rf2;-><init>(Ldefpackage/p24;Ldefpackage/y34;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 92
    .line 93
    .line 94
    move-result p2

    .line 95
    const/16 v1, 0x27

    .line 96
    .line 97
    const/4 v2, 0x2

    .line 98
    if-eq p2, v8, :cond_5

    .line 99
    .line 100
    if-ne p2, v2, :cond_4

    .line 101
    .line 102
    const/4 p2, 0x4

    .line 103
    goto :goto_0

    .line 104
    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 105
    .line 106
    new-instance p1, Ljava/lang/StringBuilder;

    .line 107
    .line 108
    const-string p2, "Can\'t get max number of reader for journal mode \'"

    .line 109
    .line 110
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    throw p0

    .line 131
    :cond_5
    move p2, v8

    .line 132
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    if-eq v3, v8, :cond_7

    .line 137
    .line 138
    if-ne v3, v2, :cond_6

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_6
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 142
    .line 143
    new-instance p1, Ljava/lang/StringBuilder;

    .line 144
    .line 145
    const-string p2, "Can\'t get max number of writers for journal mode \'"

    .line 146
    .line 147
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    throw p0

    .line 168
    :cond_7
    :goto_1
    new-instance v1, Ldefpackage/ia0;

    .line 169
    .line 170
    invoke-direct {v1, p1, v4, p2}, Ldefpackage/ia0;-><init>(Ldefpackage/rf2;Ljava/lang/String;I)V

    .line 171
    .line 172
    .line 173
    move-object p2, v1

    .line 174
    :goto_2
    iput-object p2, p0, Ldefpackage/p24;->f:Ldefpackage/fa0;

    .line 175
    .line 176
    :goto_3
    sget-object p1, Ldefpackage/r24;->p:Ldefpackage/r24;

    .line 177
    .line 178
    if-ne v0, p1, :cond_8

    .line 179
    .line 180
    goto :goto_4

    .line 181
    :cond_8
    const/4 v8, 0x0

    .line 182
    :goto_4
    invoke-virtual {p0}, Ldefpackage/p24;->c()Ldefpackage/so4;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    if-eqz p0, :cond_9

    .line 187
    .line 188
    invoke-interface {p0, v8}, Ldefpackage/so4;->setWriteAheadLoggingEnabled(Z)V

    .line 189
    .line 190
    .line 191
    :cond_9
    return-void
.end method

.method public static final a(Ldefpackage/p24;Ldefpackage/x34;)V
    .locals 5

    .line 1
    iget-object v0, p0, Ldefpackage/p24;->d:Ldefpackage/qz0;

    .line 2
    .line 3
    const-string v1, "PRAGMA user_version = "

    .line 4
    .line 5
    iget-object v2, p0, Ldefpackage/p24;->c:Ldefpackage/li0;

    .line 6
    .line 7
    iget-object v3, v2, Ldefpackage/li0;->g:Ldefpackage/r24;

    .line 8
    .line 9
    sget-object v4, Ldefpackage/r24;->p:Ldefpackage/r24;

    .line 10
    .line 11
    if-ne v3, v4, :cond_0

    .line 12
    .line 13
    const-string v3, "PRAGMA journal_mode = WAL"

    .line 14
    .line 15
    invoke-static {p1, v3}, Ldefpackage/h12;->n(Ldefpackage/x34;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-string v3, "PRAGMA journal_mode = TRUNCATE"

    .line 20
    .line 21
    invoke-static {p1, v3}, Ldefpackage/h12;->n(Ldefpackage/x34;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :goto_0
    iget-object v2, v2, Ldefpackage/li0;->g:Ldefpackage/r24;

    .line 25
    .line 26
    if-ne v2, v4, :cond_1

    .line 27
    .line 28
    const-string v2, "PRAGMA synchronous = NORMAL"

    .line 29
    .line 30
    invoke-static {p1, v2}, Ldefpackage/h12;->n(Ldefpackage/x34;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    const-string v2, "PRAGMA synchronous = FULL"

    .line 35
    .line 36
    invoke-static {p1, v2}, Ldefpackage/h12;->n(Ldefpackage/x34;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :goto_1
    invoke-static {p1}, Ldefpackage/p24;->b(Ldefpackage/x34;)V

    .line 40
    .line 41
    .line 42
    const-string v2, "PRAGMA user_version"

    .line 43
    .line 44
    invoke-interface {p1, v2}, Ldefpackage/x34;->U(Ljava/lang/String;)Ldefpackage/z34;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    :try_start_0
    invoke-interface {v2}, Ldefpackage/z34;->O()Z

    .line 49
    .line 50
    .line 51
    const/4 v3, 0x0

    .line 52
    invoke-interface {v2, v3}, Ldefpackage/z34;->getLong(I)J

    .line 53
    .line 54
    .line 55
    move-result-wide v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 56
    long-to-int v3, v3

    .line 57
    const/4 v4, 0x0

    .line 58
    invoke-static {v2, v4}, Ldefpackage/ud3;->e(Ldefpackage/z34;Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    iget v0, v0, Ldefpackage/qz0;->a:I

    .line 62
    .line 63
    if-eq v3, v0, :cond_5

    .line 64
    .line 65
    const-string v2, "BEGIN EXCLUSIVE TRANSACTION"

    .line 66
    .line 67
    invoke-static {p1, v2}, Ldefpackage/h12;->n(Ldefpackage/x34;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    if-nez v3, :cond_2

    .line 71
    .line 72
    :try_start_1
    invoke-virtual {p0, p1}, Ldefpackage/p24;->d(Ldefpackage/x34;)V

    .line 73
    .line 74
    .line 75
    goto :goto_2

    .line 76
    :catchall_0
    move-exception v0

    .line 77
    goto :goto_3

    .line 78
    :cond_2
    invoke-virtual {p0, p1, v3, v0}, Ldefpackage/p24;->e(Ldefpackage/x34;II)V

    .line 79
    .line 80
    .line 81
    :goto_2
    new-instance v2, Ljava/lang/StringBuilder;

    .line 82
    .line 83
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-static {p1, v0}, Ldefpackage/h12;->n(Ldefpackage/x34;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    sget-object v0, Ldefpackage/j15;->a:Ldefpackage/j15;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 97
    .line 98
    goto :goto_4

    .line 99
    :goto_3
    new-instance v1, Ldefpackage/s14;

    .line 100
    .line 101
    invoke-direct {v1, v0}, Ldefpackage/s14;-><init>(Ljava/lang/Throwable;)V

    .line 102
    .line 103
    .line 104
    move-object v0, v1

    .line 105
    :goto_4
    nop

    .line 106
    instance-of v1, v0, Ldefpackage/s14;

    .line 107
    .line 108
    if-nez v1, :cond_3

    .line 109
    .line 110
    move-object v1, v0

    .line 111
    check-cast v1, Ldefpackage/j15;

    .line 112
    .line 113
    const-string v1, "END TRANSACTION"

    .line 114
    .line 115
    invoke-static {p1, v1}, Ldefpackage/h12;->n(Ldefpackage/x34;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    :cond_3
    invoke-static {v0}, Ldefpackage/bb3;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    if-nez v0, :cond_4

    .line 123
    .line 124
    goto :goto_5

    .line 125
    :cond_4
    const-string p0, "ROLLBACK TRANSACTION"

    .line 126
    .line 127
    invoke-static {p1, p0}, Ldefpackage/h12;->n(Ldefpackage/x34;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    throw v0

    .line 131
    :cond_5
    :goto_5
    invoke-virtual {p0, p1}, Ldefpackage/p24;->f(Ldefpackage/x34;)V

    .line 132
    .line 133
    .line 134
    return-void

    .line 135
    :catchall_1
    move-exception p0

    .line 136
    :try_start_2
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 137
    :catchall_2
    move-exception p1

    .line 138
    invoke-static {v2, p0}, Ldefpackage/ud3;->e(Ldefpackage/z34;Ljava/lang/Throwable;)V

    .line 139
    .line 140
    .line 141
    throw p1
.end method

.method public static b(Ldefpackage/x34;)V
    .locals 5

    .line 1
    const-string v0, "PRAGMA busy_timeout"

    .line 2
    .line 3
    invoke-interface {p0, v0}, Ldefpackage/x34;->U(Ljava/lang/String;)Ldefpackage/z34;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :try_start_0
    invoke-interface {v0}, Ldefpackage/z34;->O()Z

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-interface {v0, v1}, Ldefpackage/z34;->getLong(I)J

    .line 12
    .line 13
    .line 14
    move-result-wide v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-static {v0, v3}, Ldefpackage/ud3;->e(Ldefpackage/z34;Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    const-wide/16 v3, 0xbb8

    .line 20
    .line 21
    cmp-long v0, v1, v3

    .line 22
    .line 23
    if-gez v0, :cond_0

    .line 24
    .line 25
    const-string v0, "PRAGMA busy_timeout = 3000"

    .line 26
    .line 27
    invoke-static {p0, v0}, Ldefpackage/h12;->n(Ldefpackage/x34;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void

    .line 31
    :catchall_0
    move-exception p0

    .line 32
    :try_start_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 33
    :catchall_1
    move-exception v1

    .line 34
    invoke-static {v0, p0}, Ldefpackage/ud3;->e(Ldefpackage/z34;Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    throw v1
.end method


# virtual methods
.method public final c()Ldefpackage/so4;
    .locals 2

    .line 1
    iget-object p0, p0, Ldefpackage/p24;->f:Ldefpackage/fa0;

    .line 2
    .line 3
    instance-of v0, p0, Ldefpackage/qo4;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p0, Ldefpackage/qo4;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object p0, v1

    .line 12
    :goto_0
    if-eqz p0, :cond_1

    .line 13
    .line 14
    iget-object p0, p0, Ldefpackage/qo4;->n:Ldefpackage/pz1;

    .line 15
    .line 16
    iget-object p0, p0, Ldefpackage/pz1;->o:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Ldefpackage/so4;

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_1
    return-object v1
.end method

.method public final d(Ldefpackage/x34;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "SELECT count(*) FROM sqlite_master WHERE name != \'android_metadata\'"

    .line 5
    .line 6
    invoke-interface {p1, v0}, Ldefpackage/x34;->U(Ljava/lang/String;)Ldefpackage/z34;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    :try_start_0
    invoke-interface {v0}, Ldefpackage/z34;->O()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v0, v2}, Ldefpackage/z34;->getLong(I)J

    .line 18
    .line 19
    .line 20
    move-result-wide v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    const-wide/16 v5, 0x0

    .line 22
    .line 23
    cmp-long v1, v3, v5

    .line 24
    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    const/4 v2, 0x1

    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception p0

    .line 30
    goto :goto_3

    .line 31
    :cond_0
    :goto_0
    const/4 v1, 0x0

    .line 32
    invoke-static {v0, v1}, Ldefpackage/ud3;->e(Ldefpackage/z34;Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Ldefpackage/p24;->d:Ldefpackage/qz0;

    .line 36
    .line 37
    invoke-virtual {v0, p1}, Ldefpackage/qz0;->a(Ldefpackage/x34;)V

    .line 38
    .line 39
    .line 40
    if-nez v2, :cond_2

    .line 41
    .line 42
    invoke-virtual {v0, p1}, Ldefpackage/qz0;->v(Ldefpackage/x34;)Ldefpackage/u24;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    iget-boolean v2, v1, Ldefpackage/u24;->a:Z

    .line 47
    .line 48
    if-eqz v2, :cond_1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    iget-object p1, v1, Ldefpackage/u24;->b:Ljava/lang/String;

    .line 54
    .line 55
    new-instance v0, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string v1, "Pre-packaged database has an invalid schema: "

    .line 58
    .line 59
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw p0

    .line 77
    :cond_2
    :goto_1
    const-string v1, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"

    .line 78
    .line 79
    invoke-static {p1, v1}, Ldefpackage/h12;->n(Ldefpackage/x34;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    iget-object v1, v0, Ldefpackage/qz0;->b:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v1, Ljava/lang/String;

    .line 85
    .line 86
    new-instance v2, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    const-string v3, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'"

    .line 89
    .line 90
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string v1, "\')"

    .line 97
    .line 98
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-static {p1, v1}, Ldefpackage/h12;->n(Ldefpackage/x34;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0, p1}, Ldefpackage/qz0;->r(Ldefpackage/x34;)V

    .line 109
    .line 110
    .line 111
    iget-object p0, p0, Ldefpackage/p24;->e:Ljava/util/List;

    .line 112
    .line 113
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    :cond_3
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-eqz v0, :cond_4

    .line 122
    .line 123
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    check-cast v0, Ldefpackage/m30;

    .line 128
    .line 129
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    instance-of v0, p1, Ldefpackage/po4;

    .line 133
    .line 134
    if-eqz v0, :cond_3

    .line 135
    .line 136
    move-object v0, p1

    .line 137
    check-cast v0, Ldefpackage/po4;

    .line 138
    .line 139
    iget-object v0, v0, Ldefpackage/po4;->n:Ldefpackage/we1;

    .line 140
    .line 141
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_4
    return-void

    .line 146
    :goto_3
    :try_start_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 147
    :catchall_1
    move-exception p1

    .line 148
    invoke-static {v0, p0}, Ldefpackage/ud3;->e(Ldefpackage/z34;Ljava/lang/Throwable;)V

    .line 149
    .line 150
    .line 151
    throw p1
.end method

.method public final e(Ldefpackage/x34;II)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ldefpackage/p24;->c:Ldefpackage/li0;

    .line 5
    .line 6
    iget-object v1, v0, Ldefpackage/li0;->d:Ldefpackage/pz1;

    .line 7
    .line 8
    invoke-static {v1, p2, p3}, Ldefpackage/si0;->u(Ldefpackage/pz1;II)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget-object v2, p0, Ldefpackage/p24;->d:Ldefpackage/qz0;

    .line 13
    .line 14
    if-eqz v1, :cond_2

    .line 15
    .line 16
    invoke-virtual {v2, p1}, Ldefpackage/qz0;->u(Ldefpackage/x34;)V

    .line 17
    .line 18
    .line 19
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    if-eqz p2, :cond_0

    .line 28
    .line 29
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    check-cast p2, Ldefpackage/jw2;

    .line 34
    .line 35
    invoke-virtual {p2, p1}, Ldefpackage/jw2;->b(Ldefpackage/x34;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-virtual {v2, p1}, Ldefpackage/qz0;->v(Ldefpackage/x34;)Ldefpackage/u24;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    iget-boolean p2, p0, Ldefpackage/u24;->a:Z

    .line 44
    .line 45
    if-eqz p2, :cond_1

    .line 46
    .line 47
    invoke-virtual {v2, p1}, Ldefpackage/qz0;->t(Ldefpackage/x34;)V

    .line 48
    .line 49
    .line 50
    const-string p0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"

    .line 51
    .line 52
    invoke-static {p1, p0}, Ldefpackage/h12;->n(Ldefpackage/x34;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    iget-object p0, v2, Ldefpackage/qz0;->b:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p0, Ljava/lang/String;

    .line 58
    .line 59
    new-instance p2, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    const-string p3, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'"

    .line 62
    .line 63
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string p0, "\')"

    .line 70
    .line 71
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-static {p1, p0}, Ldefpackage/h12;->n(Ldefpackage/x34;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 83
    .line 84
    iget-object p0, p0, Ldefpackage/u24;->b:Ljava/lang/String;

    .line 85
    .line 86
    new-instance p2, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    const-string p3, "Migration didn\'t properly handle: "

    .line 89
    .line 90
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    throw p1

    .line 108
    :cond_2
    invoke-static {v0, p2, p3}, Ldefpackage/si0;->B(Ldefpackage/li0;II)Z

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    if-nez v1, :cond_b

    .line 113
    .line 114
    iget-boolean p2, v0, Ldefpackage/li0;->s:Z

    .line 115
    .line 116
    if-eqz p2, :cond_7

    .line 117
    .line 118
    const-string p2, "SELECT name, type FROM sqlite_master WHERE type = \'table\' OR type = \'view\'"

    .line 119
    .line 120
    invoke-interface {p1, p2}, Ldefpackage/x34;->U(Ljava/lang/String;)Ldefpackage/z34;

    .line 121
    .line 122
    .line 123
    move-result-object p2

    .line 124
    :try_start_0
    invoke-static {}, Ldefpackage/gb;->r()Ldefpackage/qb2;

    .line 125
    .line 126
    .line 127
    move-result-object p3

    .line 128
    :cond_3
    :goto_1
    invoke-interface {p2}, Ldefpackage/z34;->O()Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    const/4 v1, 0x0

    .line 133
    if-eqz v0, :cond_5

    .line 134
    .line 135
    invoke-interface {p2, v1}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    const-string v3, "sqlite_"

    .line 140
    .line 141
    invoke-static {v0, v3, v1}, Ldefpackage/xm4;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    if-nez v1, :cond_3

    .line 146
    .line 147
    const-string v1, "android_metadata"

    .line 148
    .line 149
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    if-eqz v1, :cond_4

    .line 154
    .line 155
    goto :goto_1

    .line 156
    :cond_4
    const/4 v1, 0x1

    .line 157
    invoke-interface {p2, v1}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    const-string v3, "view"

    .line 162
    .line 163
    invoke-static {v1, v3}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    new-instance v3, Ldefpackage/kd3;

    .line 172
    .line 173
    invoke-direct {v3, v0, v1}, Ldefpackage/kd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {p3, v3}, Ldefpackage/qb2;->add(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    goto :goto_1

    .line 180
    :catchall_0
    move-exception p0

    .line 181
    goto :goto_3

    .line 182
    :cond_5
    invoke-static {p3}, Ldefpackage/gb;->f(Ldefpackage/qb2;)Ldefpackage/qb2;

    .line 183
    .line 184
    .line 185
    move-result-object p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 186
    const/4 v0, 0x0

    .line 187
    invoke-static {p2, v0}, Ldefpackage/ud3;->e(Ldefpackage/z34;Ljava/lang/Throwable;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {p3, v1}, Ldefpackage/qb2;->listIterator(I)Ljava/util/ListIterator;

    .line 191
    .line 192
    .line 193
    move-result-object p2

    .line 194
    :goto_2
    move-object p3, p2

    .line 195
    check-cast p3, Ldefpackage/dm1;

    .line 196
    .line 197
    invoke-virtual {p3}, Ldefpackage/dm1;->hasNext()Z

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    if-eqz v0, :cond_8

    .line 202
    .line 203
    invoke-virtual {p3}, Ldefpackage/dm1;->next()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object p3

    .line 207
    check-cast p3, Ldefpackage/kd3;

    .line 208
    .line 209
    iget-object v0, p3, Ldefpackage/kd3;->n:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast v0, Ljava/lang/String;

    .line 212
    .line 213
    iget-object p3, p3, Ldefpackage/kd3;->o:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast p3, Ljava/lang/Boolean;

    .line 216
    .line 217
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 218
    .line 219
    .line 220
    move-result p3

    .line 221
    if-eqz p3, :cond_6

    .line 222
    .line 223
    new-instance p3, Ljava/lang/StringBuilder;

    .line 224
    .line 225
    const-string v1, "DROP VIEW IF EXISTS "

    .line 226
    .line 227
    invoke-direct {p3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object p3

    .line 237
    invoke-static {p1, p3}, Ldefpackage/h12;->n(Ldefpackage/x34;Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    goto :goto_2

    .line 241
    :cond_6
    new-instance p3, Ljava/lang/StringBuilder;

    .line 242
    .line 243
    const-string v1, "DROP TABLE IF EXISTS "

    .line 244
    .line 245
    invoke-direct {p3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object p3

    .line 255
    invoke-static {p1, p3}, Ldefpackage/h12;->n(Ldefpackage/x34;Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    goto :goto_2

    .line 259
    :goto_3
    :try_start_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 260
    :catchall_1
    move-exception p1

    .line 261
    invoke-static {p2, p0}, Ldefpackage/ud3;->e(Ldefpackage/z34;Ljava/lang/Throwable;)V

    .line 262
    .line 263
    .line 264
    throw p1

    .line 265
    :cond_7
    invoke-virtual {v2, p1}, Ldefpackage/qz0;->c(Ldefpackage/x34;)V

    .line 266
    .line 267
    .line 268
    :cond_8
    iget-object p0, p0, Ldefpackage/p24;->e:Ljava/util/List;

    .line 269
    .line 270
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 271
    .line 272
    .line 273
    move-result-object p0

    .line 274
    :cond_9
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 275
    .line 276
    .line 277
    move-result p2

    .line 278
    if-eqz p2, :cond_a

    .line 279
    .line 280
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object p2

    .line 284
    check-cast p2, Ldefpackage/m30;

    .line 285
    .line 286
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    instance-of p2, p1, Ldefpackage/po4;

    .line 290
    .line 291
    if-eqz p2, :cond_9

    .line 292
    .line 293
    move-object p2, p1

    .line 294
    check-cast p2, Ldefpackage/po4;

    .line 295
    .line 296
    iget-object p2, p2, Ldefpackage/po4;->n:Ldefpackage/we1;

    .line 297
    .line 298
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 299
    .line 300
    .line 301
    goto :goto_4

    .line 302
    :cond_a
    invoke-virtual {v2, p1}, Ldefpackage/qz0;->a(Ldefpackage/x34;)V

    .line 303
    .line 304
    .line 305
    return-void

    .line 306
    :cond_b
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 307
    .line 308
    new-instance p1, Ljava/lang/StringBuilder;

    .line 309
    .line 310
    const-string v0, "A migration from "

    .line 311
    .line 312
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    .line 318
    const-string p2, " to "

    .line 319
    .line 320
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 321
    .line 322
    .line 323
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 324
    .line 325
    .line 326
    const-string p2, " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions."

    .line 327
    .line 328
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 329
    .line 330
    .line 331
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object p1

    .line 335
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    move-result-object p1

    .line 339
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    throw p0
.end method

.method public final f(Ldefpackage/x34;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "Pre-packaged database has an invalid schema: "

    .line 5
    .line 6
    const-string v1, "SELECT 1 FROM sqlite_master WHERE type = \'table\' AND name = \'room_master_table\'"

    .line 7
    .line 8
    invoke-interface {p1, v1}, Ldefpackage/x34;->U(Ljava/lang/String;)Ldefpackage/z34;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    :try_start_0
    invoke-interface {v1}, Ldefpackage/z34;->O()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const/4 v3, 0x1

    .line 17
    const/4 v4, 0x0

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-interface {v1, v4}, Ldefpackage/z34;->getLong(I)J

    .line 21
    .line 22
    .line 23
    move-result-wide v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    const-wide/16 v7, 0x0

    .line 25
    .line 26
    cmp-long v2, v5, v7

    .line 27
    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    move v2, v3

    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception p0

    .line 33
    goto/16 :goto_7

    .line 34
    .line 35
    :cond_0
    move v2, v4

    .line 36
    :goto_0
    const/4 v5, 0x0

    .line 37
    invoke-static {v1, v5}, Ldefpackage/ud3;->e(Ldefpackage/z34;Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    iget-object v1, p0, Ldefpackage/p24;->d:Ldefpackage/qz0;

    .line 41
    .line 42
    if-eqz v2, :cond_3

    .line 43
    .line 44
    const-string v0, "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"

    .line 45
    .line 46
    invoke-interface {p1, v0}, Ldefpackage/x34;->U(Ljava/lang/String;)Ldefpackage/z34;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    :try_start_1
    invoke-interface {v0}, Ldefpackage/z34;->O()Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_1

    .line 55
    .line 56
    invoke-interface {v0, v4}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 60
    goto :goto_1

    .line 61
    :catchall_1
    move-exception p0

    .line 62
    goto :goto_2

    .line 63
    :cond_1
    move-object v2, v5

    .line 64
    :goto_1
    invoke-static {v0, v5}, Ldefpackage/ud3;->e(Ldefpackage/z34;Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    iget-object v0, v1, Ldefpackage/qz0;->b:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v0, Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-nez v0, :cond_6

    .line 76
    .line 77
    iget-object v0, v1, Ldefpackage/qz0;->c:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v0, Ljava/lang/String;

    .line 80
    .line 81
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-eqz v0, :cond_2

    .line 86
    .line 87
    goto/16 :goto_5

    .line 88
    .line 89
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 90
    .line 91
    iget-object p1, v1, Ldefpackage/qz0;->b:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast p1, Ljava/lang/String;

    .line 94
    .line 95
    new-instance v0, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    const-string v1, "Room cannot verify the data integrity. Looks like you\'ve changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: "

    .line 98
    .line 99
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    const-string p1, ", found: "

    .line 106
    .line 107
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    throw p0

    .line 125
    :goto_2
    :try_start_2
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 126
    :catchall_2
    move-exception p1

    .line 127
    invoke-static {v0, p0}, Ldefpackage/ud3;->e(Ldefpackage/z34;Ljava/lang/Throwable;)V

    .line 128
    .line 129
    .line 130
    throw p1

    .line 131
    :cond_3
    const-string v2, "BEGIN EXCLUSIVE TRANSACTION"

    .line 132
    .line 133
    invoke-static {p1, v2}, Ldefpackage/h12;->n(Ldefpackage/x34;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    :try_start_3
    invoke-virtual {v1, p1}, Ldefpackage/qz0;->v(Ldefpackage/x34;)Ldefpackage/u24;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    iget-boolean v4, v2, Ldefpackage/u24;->a:Z

    .line 141
    .line 142
    if-eqz v4, :cond_4

    .line 143
    .line 144
    invoke-virtual {v1, p1}, Ldefpackage/qz0;->t(Ldefpackage/x34;)V

    .line 145
    .line 146
    .line 147
    const-string v0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"

    .line 148
    .line 149
    invoke-static {p1, v0}, Ldefpackage/h12;->n(Ldefpackage/x34;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    iget-object v0, v1, Ldefpackage/qz0;->b:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v0, Ljava/lang/String;

    .line 155
    .line 156
    new-instance v2, Ljava/lang/StringBuilder;

    .line 157
    .line 158
    const-string v4, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'"

    .line 159
    .line 160
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    const-string v0, "\')"

    .line 167
    .line 168
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-static {p1, v0}, Ldefpackage/h12;->n(Ldefpackage/x34;Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    sget-object v0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 179
    .line 180
    goto :goto_4

    .line 181
    :catchall_3
    move-exception v0

    .line 182
    goto :goto_3

    .line 183
    :cond_4
    new-instance v4, Ljava/lang/IllegalStateException;

    .line 184
    .line 185
    new-instance v5, Ljava/lang/StringBuilder;

    .line 186
    .line 187
    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    iget-object v0, v2, Ldefpackage/u24;->b:Ljava/lang/String;

    .line 191
    .line 192
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-direct {v4, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    throw v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 207
    :goto_3
    new-instance v2, Ldefpackage/s14;

    .line 208
    .line 209
    invoke-direct {v2, v0}, Ldefpackage/s14;-><init>(Ljava/lang/Throwable;)V

    .line 210
    .line 211
    .line 212
    move-object v0, v2

    .line 213
    :goto_4
    nop

    .line 214
    instance-of v2, v0, Ldefpackage/s14;

    .line 215
    .line 216
    if-nez v2, :cond_5

    .line 217
    .line 218
    move-object v2, v0

    .line 219
    check-cast v2, Ldefpackage/j15;

    .line 220
    .line 221
    const-string v2, "END TRANSACTION"

    .line 222
    .line 223
    invoke-static {p1, v2}, Ldefpackage/h12;->n(Ldefpackage/x34;Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    :cond_5
    invoke-static {v0}, Ldefpackage/bb3;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    if-nez v0, :cond_9

    .line 231
    .line 232
    :cond_6
    :goto_5
    invoke-virtual {v1, p1}, Ldefpackage/qz0;->s(Ldefpackage/x34;)V

    .line 233
    .line 234
    .line 235
    iget-object v0, p0, Ldefpackage/p24;->e:Ljava/util/List;

    .line 236
    .line 237
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    :cond_7
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 242
    .line 243
    .line 244
    move-result v1

    .line 245
    if-eqz v1, :cond_8

    .line 246
    .line 247
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    check-cast v1, Ldefpackage/m30;

    .line 252
    .line 253
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    instance-of v2, p1, Ldefpackage/po4;

    .line 257
    .line 258
    if-eqz v2, :cond_7

    .line 259
    .line 260
    move-object v2, p1

    .line 261
    check-cast v2, Ldefpackage/po4;

    .line 262
    .line 263
    iget-object v2, v2, Ldefpackage/po4;->n:Ldefpackage/we1;

    .line 264
    .line 265
    invoke-virtual {v1, v2}, Ldefpackage/m30;->a(Ldefpackage/we1;)V

    .line 266
    .line 267
    .line 268
    goto :goto_6

    .line 269
    :cond_8
    iput-boolean v3, p0, Ldefpackage/p24;->a:Z

    .line 270
    .line 271
    return-void

    .line 272
    :cond_9
    const-string p0, "ROLLBACK TRANSACTION"

    .line 273
    .line 274
    invoke-static {p1, p0}, Ldefpackage/h12;->n(Ldefpackage/x34;Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    throw v0

    .line 278
    :goto_7
    :try_start_4
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 279
    :catchall_4
    move-exception p1

    .line 280
    invoke-static {v1, p0}, Ldefpackage/ud3;->e(Ldefpackage/z34;Ljava/lang/Throwable;)V

    .line 281
    .line 282
    .line 283
    throw p1
.end method
