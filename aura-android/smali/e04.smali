.class public final Le04;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/os/Handler$Callback;


# static fields
.field public static final r:Lhh3;


# instance fields
.field public volatile n:Lc04;

.field public final o:Ld04;

.field public final p:Lpe1;

.field public final q:Lrf2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lhh3;

    .line 2
    .line 3
    const/16 v1, 0xf

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lhh3;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Le04;->r:Lhh3;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Ld04;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    sget-object p1, Le04;->r:Lhh3;

    .line 8
    .line 9
    :goto_0
    iput-object p1, p0, Le04;->o:Ld04;

    .line 10
    .line 11
    new-instance v0, Lrf2;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    new-instance v1, Ljava/util/HashMap;

    .line 17
    .line 18
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v1, v0, Lrf2;->n:Ljava/lang/Object;

    .line 22
    .line 23
    iput-object p1, v0, Lrf2;->o:Ljava/lang/Object;

    .line 24
    .line 25
    iput-object v0, p0, Le04;->q:Lrf2;

    .line 26
    .line 27
    sget-boolean p1, Lll1;->f:Z

    .line 28
    .line 29
    if-eqz p1, :cond_2

    .line 30
    .line 31
    sget-boolean p1, Lll1;->e:Z

    .line 32
    .line 33
    if-nez p1, :cond_1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    new-instance p1, Lj71;

    .line 37
    .line 38
    invoke-direct {p1}, Lj71;-><init>()V

    .line 39
    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_2
    :goto_1
    new-instance p1, Lom0;

    .line 43
    .line 44
    const/4 v0, 0x7

    .line 45
    invoke-direct {p1, v0}, Lom0;-><init>(I)V

    .line 46
    .line 47
    .line 48
    :goto_2
    iput-object p1, p0, Le04;->p:Lpe1;

    .line 49
    .line 50
    return-void
.end method

.method public static a(Landroid/content/Context;)Landroid/app/Activity;
    .locals 1

    .line 1
    instance-of v0, p0, Landroid/app/Activity;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Landroid/app/Activity;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    instance-of v0, p0, Landroid/content/ContextWrapper;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    check-cast p0, Landroid/content/ContextWrapper;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-static {p0}, Le04;->a(Landroid/content/Context;)Landroid/app/Activity;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :cond_1
    const/4 p0, 0x0

    .line 24
    return-object p0
.end method


# virtual methods
.method public final b(Landroid/content/Context;)Lc04;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_b

    .line 3
    .line 4
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    if-ne v1, v2, :cond_8

    .line 13
    .line 14
    instance-of v1, p1, Landroid/app/Application;

    .line 15
    .line 16
    if-nez v1, :cond_8

    .line 17
    .line 18
    instance-of v1, p1, Lnc1;

    .line 19
    .line 20
    if-eqz v1, :cond_7

    .line 21
    .line 22
    check-cast p1, Lnc1;

    .line 23
    .line 24
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    const/4 v3, 0x0

    .line 33
    const/4 v4, 0x1

    .line 34
    if-ne v1, v2, :cond_0

    .line 35
    .line 36
    move v1, v4

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move v1, v3

    .line 39
    :goto_0
    if-nez v1, :cond_1

    .line 40
    .line 41
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p0, p1}, Le04;->b(Landroid/content/Context;)Lc04;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0

    .line 50
    :cond_1
    invoke-virtual {p1}, Landroid/app/Activity;->isDestroyed()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_6

    .line 55
    .line 56
    iget-object v0, p0, Le04;->p:Lpe1;

    .line 57
    .line 58
    invoke-interface {v0, p1}, Lpe1;->i(Lnc1;)V

    .line 59
    .line 60
    .line 61
    invoke-static {p1}, Le04;->a(Landroid/content/Context;)Landroid/app/Activity;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    if-eqz v0, :cond_2

    .line 66
    .line 67
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-nez v0, :cond_3

    .line 72
    .line 73
    :cond_2
    move v3, v4

    .line 74
    :cond_3
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-static {v0}, Lcom/bumptech/glide/a;->a(Landroid/content/Context;)Lcom/bumptech/glide/a;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    iget-object p0, p0, Le04;->q:Lrf2;

    .line 83
    .line 84
    iget-object v1, p1, Lk70;->n:Lea2;

    .line 85
    .line 86
    invoke-virtual {p1}, Lnc1;->k()Lmd1;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    invoke-static {}, Le35;->m()V

    .line 93
    .line 94
    .line 95
    invoke-static {}, Le35;->m()V

    .line 96
    .line 97
    .line 98
    iget-object v2, p0, Lrf2;->n:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v2, Ljava/util/HashMap;

    .line 101
    .line 102
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    check-cast v2, Lc04;

    .line 107
    .line 108
    if-nez v2, :cond_5

    .line 109
    .line 110
    new-instance v2, Ly92;

    .line 111
    .line 112
    invoke-direct {v2, v1}, Ly92;-><init>(Lea2;)V

    .line 113
    .line 114
    .line 115
    iget-object v4, p0, Lrf2;->o:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v4, Ld04;

    .line 118
    .line 119
    new-instance v5, Ltv1;

    .line 120
    .line 121
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 122
    .line 123
    .line 124
    invoke-interface {v4, v0, v2, v5, p1}, Ld04;->a(Lcom/bumptech/glide/a;Ls92;Lf04;Landroid/content/Context;)Lc04;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    iget-object v0, p0, Lrf2;->n:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v0, Ljava/util/HashMap;

    .line 131
    .line 132
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    new-instance v0, Lfa2;

    .line 136
    .line 137
    invoke-direct {v0, p0, v1}, Lfa2;-><init>(Lrf2;Lea2;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2, v0}, Ly92;->f(Lz92;)V

    .line 141
    .line 142
    .line 143
    if-eqz v3, :cond_4

    .line 144
    .line 145
    invoke-virtual {p1}, Lc04;->n()V

    .line 146
    .line 147
    .line 148
    :cond_4
    return-object p1

    .line 149
    :cond_5
    return-object v2

    .line 150
    :cond_6
    const-string p0, "You cannot start a load for a destroyed activity"

    .line 151
    .line 152
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    return-object v0

    .line 156
    :cond_7
    instance-of v0, p1, Landroid/content/ContextWrapper;

    .line 157
    .line 158
    if-eqz v0, :cond_8

    .line 159
    .line 160
    move-object v0, p1

    .line 161
    check-cast v0, Landroid/content/ContextWrapper;

    .line 162
    .line 163
    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    if-eqz v1, :cond_8

    .line 172
    .line 173
    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    invoke-virtual {p0, p1}, Le04;->b(Landroid/content/Context;)Lc04;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    return-object p0

    .line 182
    :cond_8
    iget-object v0, p0, Le04;->n:Lc04;

    .line 183
    .line 184
    if-nez v0, :cond_a

    .line 185
    .line 186
    monitor-enter p0

    .line 187
    :try_start_0
    iget-object v0, p0, Le04;->n:Lc04;

    .line 188
    .line 189
    if-nez v0, :cond_9

    .line 190
    .line 191
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    invoke-static {v0}, Lcom/bumptech/glide/a;->a(Landroid/content/Context;)Lcom/bumptech/glide/a;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    iget-object v1, p0, Le04;->o:Ld04;

    .line 200
    .line 201
    new-instance v2, Lpa;

    .line 202
    .line 203
    const/16 v3, 0x8

    .line 204
    .line 205
    invoke-direct {v2, v3}, Lpa;-><init>(I)V

    .line 206
    .line 207
    .line 208
    new-instance v3, Lom0;

    .line 209
    .line 210
    const/16 v4, 0x17

    .line 211
    .line 212
    invoke-direct {v3, v4}, Lom0;-><init>(I)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    invoke-interface {v1, v0, v2, v3, p1}, Ld04;->a(Lcom/bumptech/glide/a;Ls92;Lf04;Landroid/content/Context;)Lc04;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    iput-object p1, p0, Le04;->n:Lc04;

    .line 224
    .line 225
    goto :goto_1

    .line 226
    :catchall_0
    move-exception p1

    .line 227
    goto :goto_2

    .line 228
    :cond_9
    :goto_1
    monitor-exit p0

    .line 229
    goto :goto_3

    .line 230
    :goto_2
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 231
    throw p1

    .line 232
    :cond_a
    :goto_3
    iget-object p0, p0, Le04;->n:Lc04;

    .line 233
    .line 234
    return-object p0

    .line 235
    :cond_b
    const-string p0, "You cannot start a load on a null Context"

    .line 236
    .line 237
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    return-object v0
.end method

.method public final handleMessage(Landroid/os/Message;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method
