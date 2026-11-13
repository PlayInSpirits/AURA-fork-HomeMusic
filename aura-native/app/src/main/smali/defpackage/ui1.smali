.class public final Ldefpackage/ui1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final synthetic B:I


# instance fields
.field public final A:Ldefpackage/zh0;

.field public final a:Ldefpackage/ri1;

.field public final b:Ljava/util/HashMap;

.field public c:Ldefpackage/wq2;

.field public d:Ldefpackage/oq2;

.field public e:Ldefpackage/uq2;

.field public final f:Landroid/content/Context;

.field public final g:Ljava/util/ArrayList;

.field public final h:Ljava/util/ArrayList;

.field public final i:Ljava/util/HashMap;

.field public final j:Ljava/util/HashMap;

.field public final k:Ljava/util/ArrayList;

.field public final l:Ljava/util/ArrayList;

.field public final m:Ldefpackage/hh3;

.field public final n:Ldefpackage/si1;

.field public final o:Z

.field public final p:Z

.field public final q:Ldefpackage/zo2;

.field public final r:Ldefpackage/vg3;

.field public final s:Ldefpackage/zq2;

.field public t:Ldefpackage/wq2;

.field public u:Ldefpackage/wq2;

.field public v:Ldefpackage/wq2;

.field public w:Ldefpackage/nq2;

.field public x:Ldefpackage/up2;

.field public y:Ldefpackage/up2;

.field public z:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "AxMediaRouter"

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-static {v0, v1}, Landroid/util/Ldefpackage/og;->isLoggable(Ljava/lang/String;I)Z

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ldefpackage/ri1;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Ldefpackage/ri1;-><init>(Ldefpackage/ui1;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ldefpackage/ui1;->a:Ldefpackage/ri1;

    .line 10
    .line 11
    new-instance v0, Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Ldefpackage/ui1;->b:Ljava/util/HashMap;

    .line 17
    .line 18
    new-instance v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Ldefpackage/ui1;->g:Ljava/util/ArrayList;

    .line 24
    .line 25
    new-instance v0, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Ldefpackage/ui1;->h:Ljava/util/ArrayList;

    .line 31
    .line 32
    new-instance v0, Ljava/util/HashMap;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, Ldefpackage/ui1;->i:Ljava/util/HashMap;

    .line 38
    .line 39
    new-instance v0, Ljava/util/HashMap;

    .line 40
    .line 41
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, Ldefpackage/ui1;->j:Ljava/util/HashMap;

    .line 45
    .line 46
    new-instance v0, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object v0, p0, Ldefpackage/ui1;->k:Ljava/util/ArrayList;

    .line 52
    .line 53
    new-instance v0, Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object v0, p0, Ldefpackage/ui1;->l:Ljava/util/ArrayList;

    .line 59
    .line 60
    new-instance v0, Ldefpackage/hh3;

    .line 61
    .line 62
    const/16 v1, 0xd

    .line 63
    .line 64
    invoke-direct {v0, v1}, Ldefpackage/hh3;-><init>(I)V

    .line 65
    .line 66
    .line 67
    iput-object v0, p0, Ldefpackage/ui1;->m:Ldefpackage/hh3;

    .line 68
    .line 69
    new-instance v0, Ldefpackage/si1;

    .line 70
    .line 71
    const/4 v1, 0x0

    .line 72
    invoke-direct {v0, v1, p0}, Ldefpackage/si1;-><init>(ILjava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    iput-object v0, p0, Ldefpackage/ui1;->n:Ldefpackage/si1;

    .line 76
    .line 77
    new-instance v0, Ldefpackage/zh0;

    .line 78
    .line 79
    const/16 v2, 0x1c

    .line 80
    .line 81
    invoke-direct {v0, v2, p0}, Ldefpackage/zh0;-><init>(ILjava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    iput-object v0, p0, Ldefpackage/ui1;->A:Ldefpackage/zh0;

    .line 85
    .line 86
    iput-object p1, p0, Ldefpackage/ui1;->f:Landroid/content/Context;

    .line 87
    .line 88
    const-string v0, "activity"

    .line 89
    .line 90
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    check-cast v0, Landroid/app/ActivityManager;

    .line 95
    .line 96
    invoke-virtual {v0}, Landroid/app/ActivityManager;->isLowRamDevice()Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    iput-boolean v0, p0, Ldefpackage/ui1;->o:Z

    .line 101
    .line 102
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 103
    .line 104
    const/4 v2, 0x1

    .line 105
    const/16 v3, 0x1e

    .line 106
    .line 107
    if-lt v0, v3, :cond_0

    .line 108
    .line 109
    sget v4, Ldefpackage/fu2;->b:I

    .line 110
    .line 111
    new-instance v4, Landroid/content/Intent;

    .line 112
    .line 113
    const-class v5, Ldefpackage/fu2;

    .line 114
    .line 115
    invoke-direct {v4, p1, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    invoke-virtual {v4, v5}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    invoke-virtual {v5, v4, v1}, Landroid/content/pm/PackageManager;->queryBroadcastReceivers(Landroid/content/Intent;I)Ljava/util/List;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 134
    .line 135
    .line 136
    move-result v4

    .line 137
    if-lez v4, :cond_0

    .line 138
    .line 139
    move v4, v2

    .line 140
    goto :goto_0

    .line 141
    :cond_0
    move v4, v1

    .line 142
    :goto_0
    iput-boolean v4, p0, Ldefpackage/ui1;->p:Z

    .line 143
    .line 144
    sget v5, Ldefpackage/fq4;->a:I

    .line 145
    .line 146
    new-instance v5, Landroid/content/Intent;

    .line 147
    .line 148
    const-class v6, Ldefpackage/fq4;

    .line 149
    .line 150
    invoke-direct {v5, p1, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v6

    .line 157
    invoke-virtual {v5, v6}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 158
    .line 159
    .line 160
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 161
    .line 162
    .line 163
    move-result-object v6

    .line 164
    invoke-virtual {v6, v5, v1}, Landroid/content/pm/PackageManager;->queryBroadcastReceivers(Landroid/content/Intent;I)Ljava/util/List;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 169
    .line 170
    .line 171
    const/4 v1, 0x0

    .line 172
    if-lt v0, v3, :cond_1

    .line 173
    .line 174
    if-eqz v4, :cond_1

    .line 175
    .line 176
    new-instance v0, Ldefpackage/zo2;

    .line 177
    .line 178
    new-instance v3, Ldefpackage/hg3;

    .line 179
    .line 180
    const/16 v4, 0x16

    .line 181
    .line 182
    invoke-direct {v3, v4, p0}, Ldefpackage/hg3;-><init>(ILjava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    invoke-direct {v0, p1, v3}, Ldefpackage/zo2;-><init>(Landroid/content/Context;Ldefpackage/hg3;)V

    .line 186
    .line 187
    .line 188
    goto :goto_1

    .line 189
    :cond_1
    move-object v0, v1

    .line 190
    :goto_1
    iput-object v0, p0, Ldefpackage/ui1;->q:Ldefpackage/zo2;

    .line 191
    .line 192
    new-instance v3, Ldefpackage/vg3;

    .line 193
    .line 194
    invoke-direct {v3, p1, p0}, Ldefpackage/vg3;-><init>(Landroid/content/Context;Ldefpackage/ui1;)V

    .line 195
    .line 196
    .line 197
    iput-object v3, p0, Ldefpackage/ui1;->r:Ldefpackage/vg3;

    .line 198
    .line 199
    new-instance v4, Ldefpackage/zq2;

    .line 200
    .line 201
    new-instance v5, Ldefpackage/qa1;

    .line 202
    .line 203
    const/4 v6, 0x2

    .line 204
    invoke-direct {v5, v6, p0}, Ldefpackage/qa1;-><init>(ILjava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    invoke-direct {v4, v5}, Ldefpackage/zq2;-><init>(Ldefpackage/qa1;)V

    .line 208
    .line 209
    .line 210
    iput-object v4, p0, Ldefpackage/ui1;->s:Ldefpackage/zq2;

    .line 211
    .line 212
    invoke-virtual {p0, v3, v2}, Ldefpackage/ui1;->a(Ldefpackage/qq2;Z)V

    .line 213
    .line 214
    .line 215
    if-eqz v0, :cond_2

    .line 216
    .line 217
    invoke-virtual {p0, v0, v2}, Ldefpackage/ui1;->a(Ldefpackage/qq2;Z)V

    .line 218
    .line 219
    .line 220
    :cond_2
    new-instance v0, Ldefpackage/ip0;

    .line 221
    .line 222
    invoke-direct {v0, p1, p0}, Ldefpackage/ip0;-><init>(Landroid/content/Context;Ldefpackage/ui1;)V

    .line 223
    .line 224
    .line 225
    iget-object p0, v0, Ldefpackage/ip0;->d:Ljava/lang/Object;

    .line 226
    .line 227
    check-cast p0, Landroid/os/Handler;

    .line 228
    .line 229
    iget-boolean p1, v0, Ldefpackage/ip0;->a:Z

    .line 230
    .line 231
    if-nez p1, :cond_3

    .line 232
    .line 233
    iput-boolean v2, v0, Ldefpackage/ip0;->a:Z

    .line 234
    .line 235
    new-instance p1, Landroid/content/IntentFilter;

    .line 236
    .line 237
    invoke-direct {p1}, Landroid/content/IntentFilter;-><init>()V

    .line 238
    .line 239
    .line 240
    const-string v2, "android.intent.action.PACKAGE_ADDED"

    .line 241
    .line 242
    invoke-virtual {p1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    const-string v2, "android.intent.action.PACKAGE_REMOVED"

    .line 246
    .line 247
    invoke-virtual {p1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    const-string v2, "android.intent.action.PACKAGE_CHANGED"

    .line 251
    .line 252
    invoke-virtual {p1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    const-string v2, "android.intent.action.PACKAGE_REPLACED"

    .line 256
    .line 257
    invoke-virtual {p1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    const-string v2, "android.intent.action.PACKAGE_RESTARTED"

    .line 261
    .line 262
    invoke-virtual {p1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    const-string v2, "package"

    .line 266
    .line 267
    invoke-virtual {p1, v2}, Landroid/content/IntentFilter;->addDataScheme(Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    iget-object v2, v0, Ldefpackage/ip0;->b:Ljava/lang/Object;

    .line 271
    .line 272
    check-cast v2, Landroid/content/Context;

    .line 273
    .line 274
    iget-object v3, v0, Ldefpackage/ip0;->g:Ljava/lang/Object;

    .line 275
    .line 276
    check-cast v3, Ldefpackage/v9;

    .line 277
    .line 278
    invoke-virtual {v2, v3, p1, v1, p0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 279
    .line 280
    .line 281
    iget-object p1, v0, Ldefpackage/ip0;->h:Ljava/lang/Object;

    .line 282
    .line 283
    check-cast p1, Ldefpackage/g5;

    .line 284
    .line 285
    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 286
    .line 287
    .line 288
    :cond_3
    return-void
.end method


# virtual methods
.method public final a(Ldefpackage/qq2;Z)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Ldefpackage/ui1;->d(Ldefpackage/qq2;)Ldefpackage/vq2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ldefpackage/vq2;

    .line 8
    .line 9
    invoke-direct {v0, p1, p2}, Ldefpackage/vq2;-><init>(Ldefpackage/qq2;Z)V

    .line 10
    .line 11
    .line 12
    iget-object p2, p0, Ldefpackage/ui1;->k:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    iget-object p2, p0, Ldefpackage/ui1;->a:Ldefpackage/ri1;

    .line 18
    .line 19
    const/16 v1, 0x201

    .line 20
    .line 21
    invoke-virtual {p2, v1, v0}, Ldefpackage/ri1;->b(ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object p2, p1, Ldefpackage/qq2;->t:Ldefpackage/xk0;

    .line 25
    .line 26
    invoke-virtual {p0, v0, p2}, Ldefpackage/ui1;->m(Ldefpackage/vq2;Ldefpackage/xk0;)V

    .line 27
    .line 28
    .line 29
    invoke-static {}, Ldefpackage/yq2;->b()V

    .line 30
    .line 31
    .line 32
    iget-object p2, p0, Ldefpackage/ui1;->n:Ldefpackage/si1;

    .line 33
    .line 34
    iput-object p2, p1, Ldefpackage/qq2;->q:Ldefpackage/si1;

    .line 35
    .line 36
    iget-object p0, p0, Ldefpackage/ui1;->x:Ldefpackage/up2;

    .line 37
    .line 38
    invoke-virtual {p1, p0}, Ldefpackage/qq2;->g(Ldefpackage/up2;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    return-void
.end method

.method public final b(Ldefpackage/vq2;Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 1
    iget-object v0, p1, Ldefpackage/vq2;->d:Ldefpackage/om1;

    .line 2
    .line 3
    iget-object v0, v0, Ldefpackage/om1;->o:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Landroid/content/ComponentName;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/content/ComponentName;->flattenToShortString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-boolean p1, p1, Ldefpackage/vq2;->c:Z

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    move-object v1, p2

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-string v1, ":"

    .line 18
    .line 19
    invoke-static {v0, v1, p2}, Ldefpackage/b11;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    :goto_0
    iget-object v2, p0, Ldefpackage/ui1;->j:Ljava/util/HashMap;

    .line 24
    .line 25
    if-nez p1, :cond_7

    .line 26
    .line 27
    iget-object p0, p0, Ldefpackage/ui1;->h:Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    const/4 v3, 0x0

    .line 34
    move v4, v3

    .line 35
    :goto_1
    const/4 v5, -0x1

    .line 36
    if-ge v4, p1, :cond_2

    .line 37
    .line 38
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    check-cast v6, Ldefpackage/wq2;

    .line 43
    .line 44
    iget-object v6, v6, Ldefpackage/wq2;->c:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    if-eqz v6, :cond_1

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    move v4, v5

    .line 57
    :goto_2
    if-gez v4, :cond_3

    .line 58
    .line 59
    goto :goto_6

    .line 60
    :cond_3
    const-string p1, " isn\'t unique in "

    .line 61
    .line 62
    const-string v4, " or we\'re trying to assign a unique ID for an already added route"

    .line 63
    .line 64
    const-string v6, "Either "

    .line 65
    .line 66
    invoke-static {v6, p2, p1, v0, v4}, Ldefpackage/f34;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    const-string v4, "AxMediaRouter"

    .line 71
    .line 72
    invoke-static {v4, p1}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 73
    .line 74
    .line 75
    const/4 p1, 0x2

    .line 76
    :goto_3
    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 77
    .line 78
    new-instance v4, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string v6, "_"

    .line 87
    .line 88
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 99
    .line 100
    .line 101
    move-result v6

    .line 102
    move v7, v3

    .line 103
    :goto_4
    if-ge v7, v6, :cond_5

    .line 104
    .line 105
    invoke-virtual {p0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v8

    .line 109
    check-cast v8, Ldefpackage/wq2;

    .line 110
    .line 111
    iget-object v8, v8, Ldefpackage/wq2;->c:Ljava/lang/String;

    .line 112
    .line 113
    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v8

    .line 117
    if-eqz v8, :cond_4

    .line 118
    .line 119
    goto :goto_5

    .line 120
    :cond_4
    add-int/lit8 v7, v7, 0x1

    .line 121
    .line 122
    goto :goto_4

    .line 123
    :cond_5
    move v7, v5

    .line 124
    :goto_5
    if-gez v7, :cond_6

    .line 125
    .line 126
    new-instance p0, Ldefpackage/ld3;

    .line 127
    .line 128
    invoke-direct {p0, v0, p2}, Ldefpackage/ld3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2, p0, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    return-object v4

    .line 135
    :cond_6
    add-int/lit8 p1, p1, 0x1

    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_7
    :goto_6
    new-instance p0, Ldefpackage/ld3;

    .line 139
    .line 140
    invoke-direct {p0, v0, p2}, Ldefpackage/ld3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v2, p0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    return-object v1
.end method

.method public final c()Ldefpackage/wq2;
    .locals 6

    .line 1
    iget-object v0, p0, Ldefpackage/ui1;->h:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    :cond_0
    if-ge v2, v1, :cond_1

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    add-int/lit8 v2, v2, 0x1

    .line 15
    .line 16
    check-cast v3, Ldefpackage/wq2;

    .line 17
    .line 18
    iget-object v4, p0, Ldefpackage/ui1;->t:Ldefpackage/wq2;

    .line 19
    .line 20
    if-eq v3, v4, :cond_0

    .line 21
    .line 22
    invoke-virtual {v3}, Ldefpackage/wq2;->c()Ldefpackage/qq2;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    iget-object v5, p0, Ldefpackage/ui1;->r:Ldefpackage/vg3;

    .line 27
    .line 28
    if-ne v4, v5, :cond_0

    .line 29
    .line 30
    const-string v4, "android.media.intent.category.LIVE_AUDIO"

    .line 31
    .line 32
    invoke-virtual {v3, v4}, Ldefpackage/wq2;->l(Ljava/lang/String;)Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-eqz v4, :cond_0

    .line 37
    .line 38
    const-string v4, "android.media.intent.category.LIVE_VIDEO"

    .line 39
    .line 40
    invoke-virtual {v3, v4}, Ldefpackage/wq2;->l(Ljava/lang/String;)Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-nez v4, :cond_0

    .line 45
    .line 46
    invoke-virtual {v3}, Ldefpackage/wq2;->f()Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-eqz v4, :cond_0

    .line 51
    .line 52
    return-object v3

    .line 53
    :cond_1
    iget-object p0, p0, Ldefpackage/ui1;->t:Ldefpackage/wq2;

    .line 54
    .line 55
    return-object p0
.end method

.method public final d(Ldefpackage/qq2;)Ldefpackage/vq2;
    .locals 4

    .line 1
    iget-object p0, p0, Ldefpackage/ui1;->k:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :cond_0
    if-ge v1, v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    add-int/lit8 v1, v1, 0x1

    .line 15
    .line 16
    check-cast v2, Ldefpackage/vq2;

    .line 17
    .line 18
    iget-object v3, v2, Ldefpackage/vq2;->a:Ldefpackage/qq2;

    .line 19
    .line 20
    if-ne v3, p1, :cond_0

    .line 21
    .line 22
    return-object v2

    .line 23
    :cond_1
    const/4 p0, 0x0

    .line 24
    return-object p0
.end method

.method public final e()V
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/ui1;->i:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-static {p0}, Ldefpackage/xa3;->d(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    throw p0
.end method

.method public final f(Ldefpackage/wq2;)Ldefpackage/oq2;
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/ui1;->c:Ldefpackage/wq2;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Ldefpackage/ui1;->d:Ldefpackage/oq2;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    instance-of v0, p1, Ldefpackage/tq2;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    move-object v0, p1

    .line 15
    check-cast v0, Ldefpackage/tq2;

    .line 16
    .line 17
    invoke-virtual {v0}, Ldefpackage/tq2;->m()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, Ldefpackage/ui1;->e()V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    return-object p0

    .line 28
    :cond_1
    iget-object v0, p0, Ldefpackage/ui1;->b:Ljava/util/HashMap;

    .line 29
    .line 30
    iget-object p1, p1, Ldefpackage/wq2;->c:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, Ldefpackage/oq2;

    .line 37
    .line 38
    if-eqz p1, :cond_2

    .line 39
    .line 40
    return-object p1

    .line 41
    :cond_2
    iget-object p0, p0, Ldefpackage/ui1;->i:Ljava/util/HashMap;

    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_3

    .line 56
    .line 57
    return-object p1

    .line 58
    :cond_3
    invoke-static {p0}, Ldefpackage/xa3;->d(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    throw p0
.end method

.method public final g()Ldefpackage/wq2;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ui1;->c:Ldefpackage/wq2;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "There is no currently selected route.  The media router has not yet been fully initialized."

    .line 7
    .line 8
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0
.end method

.method public final h()V
    .locals 6

    .line 1
    iget-object v0, p0, Ldefpackage/ui1;->c:Ldefpackage/wq2;

    .line 2
    .line 3
    invoke-virtual {v0}, Ldefpackage/wq2;->e()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_3

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Ldefpackage/ui1;->c:Ldefpackage/wq2;

    .line 12
    .line 13
    iget-object v0, v0, Ldefpackage/wq2;->v:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, Ljava/util/HashSet;

    .line 20
    .line 21
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Ldefpackage/wq2;

    .line 39
    .line 40
    iget-object v3, v3, Ldefpackage/wq2;->c:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    iget-object v2, p0, Ldefpackage/ui1;->b:Ljava/util/HashMap;

    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    :cond_2
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-eqz v4, :cond_3

    .line 61
    .line 62
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    check-cast v4, Ljava/util/Map$Entry;

    .line 67
    .line 68
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    invoke-virtual {v1, v5}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    if-nez v5, :cond_2

    .line 77
    .line 78
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    check-cast v4, Ldefpackage/oq2;

    .line 83
    .line 84
    const/4 v5, 0x0

    .line 85
    invoke-virtual {v4, v5}, Ldefpackage/oq2;->h(I)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v4}, Ldefpackage/oq2;->d()V

    .line 89
    .line 90
    .line 91
    invoke-interface {v3}, Ljava/util/Iterator;->remove()V

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    :cond_4
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    if-eqz v1, :cond_5

    .line 104
    .line 105
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    check-cast v1, Ldefpackage/wq2;

    .line 110
    .line 111
    iget-object v3, v1, Ldefpackage/wq2;->c:Ljava/lang/String;

    .line 112
    .line 113
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    if-nez v3, :cond_4

    .line 118
    .line 119
    invoke-virtual {v1}, Ldefpackage/wq2;->c()Ldefpackage/qq2;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    iget-object v4, v1, Ldefpackage/wq2;->b:Ljava/lang/String;

    .line 124
    .line 125
    iget-object v5, p0, Ldefpackage/ui1;->c:Ldefpackage/wq2;

    .line 126
    .line 127
    iget-object v5, v5, Ldefpackage/wq2;->b:Ljava/lang/String;

    .line 128
    .line 129
    invoke-virtual {v3, v4, v5}, Ldefpackage/qq2;->d(Ljava/lang/String;Ljava/lang/String;)Ldefpackage/oq2;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    if-eqz v3, :cond_4

    .line 134
    .line 135
    invoke-virtual {v3}, Ldefpackage/oq2;->e()V

    .line 136
    .line 137
    .line 138
    iget-object v1, v1, Ldefpackage/wq2;->c:Ljava/lang/String;

    .line 139
    .line 140
    invoke-virtual {v2, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_5
    :goto_3
    return-void
.end method

.method public final i(Ldefpackage/wq2;IZ)V
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/ui1;->h:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const-string v1, "AxMediaRouter"

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance p0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string p2, "Ignoring attempt to select removed route: "

    .line 14
    .line 15
    invoke-direct {p0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {v1, p0}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    iget-boolean v0, p1, Ldefpackage/wq2;->g:Z

    .line 30
    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    new-instance p0, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    const-string p2, "Ignoring attempt to select disabled route: "

    .line 36
    .line 37
    invoke-direct {p0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-static {v1, p0}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_1
    iget-object v0, p0, Ldefpackage/ui1;->c:Ldefpackage/wq2;

    .line 52
    .line 53
    if-ne v0, p1, :cond_2

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_2
    if-eqz v0, :cond_3

    .line 57
    .line 58
    invoke-virtual {v0}, Ldefpackage/wq2;->a()Ldefpackage/tq2;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    goto :goto_0

    .line 63
    :cond_3
    const/4 v0, 0x0

    .line 64
    :goto_0
    if-eqz v0, :cond_6

    .line 65
    .line 66
    iget-object v2, v0, Ldefpackage/wq2;->v:Ljava/util/ArrayList;

    .line 67
    .line 68
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    const/4 v3, 0x1

    .line 77
    if-ne v2, v3, :cond_6

    .line 78
    .line 79
    iget-object v0, v0, Ldefpackage/tq2;->x:Ldefpackage/oi;

    .line 80
    .line 81
    iget-object v2, p1, Ldefpackage/wq2;->c:Ljava/lang/String;

    .line 82
    .line 83
    invoke-virtual {v0, v2}, Ldefpackage/yd4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    check-cast v0, Ldefpackage/mq2;

    .line 88
    .line 89
    if-eqz v0, :cond_4

    .line 90
    .line 91
    iget v0, v0, Ldefpackage/mq2;->b:I

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_4
    const/4 v0, 0x4

    .line 95
    :goto_1
    const/4 v2, 0x3

    .line 96
    if-eq v0, v2, :cond_5

    .line 97
    .line 98
    const/4 v2, 0x2

    .line 99
    if-ne v0, v2, :cond_6

    .line 100
    .line 101
    :cond_5
    :goto_2
    new-instance p0, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    const-string p2, "Ignoring attempt to select selected route: "

    .line 104
    .line 105
    invoke-direct {p0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    invoke-static {v1, p0}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :cond_6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 120
    .line 121
    const/16 v1, 0x1e

    .line 122
    .line 123
    if-lt v0, v1, :cond_9

    .line 124
    .line 125
    invoke-virtual {p1}, Ldefpackage/wq2;->c()Ldefpackage/qq2;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    iget-object v1, p0, Ldefpackage/ui1;->q:Ldefpackage/zo2;

    .line 130
    .line 131
    if-ne v0, v1, :cond_9

    .line 132
    .line 133
    iget-object v0, p0, Ldefpackage/ui1;->c:Ldefpackage/wq2;

    .line 134
    .line 135
    if-eq v0, p1, :cond_9

    .line 136
    .line 137
    iget-object p0, p1, Ldefpackage/wq2;->b:Ljava/lang/String;

    .line 138
    .line 139
    invoke-virtual {v1, p0}, Ldefpackage/zo2;->h(Ljava/lang/String;)Landroid/media/MediaRoute2Info;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    const-string p2, "MR2Provider"

    .line 144
    .line 145
    if-nez p1, :cond_7

    .line 146
    .line 147
    new-instance p1, Ljava/lang/StringBuilder;

    .line 148
    .line 149
    const-string p3, "transferTo: Specified route not found. routeId="

    .line 150
    .line 151
    invoke-direct {p1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    invoke-static {p2, p0}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 162
    .line 163
    .line 164
    return-void

    .line 165
    :cond_7
    iget-object p3, v1, Ldefpackage/zo2;->E:Ljava/lang/String;

    .line 166
    .line 167
    invoke-static {p3, p0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 168
    .line 169
    .line 170
    move-result p3

    .line 171
    if-eqz p3, :cond_8

    .line 172
    .line 173
    new-instance p0, Ljava/lang/StringBuilder;

    .line 174
    .line 175
    const-string p3, "Ignoring attempt to transfer to pending transfer route: "

    .line 176
    .line 177
    invoke-direct {p0, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    invoke-static {p2, p0}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 188
    .line 189
    .line 190
    return-void

    .line 191
    :cond_8
    iput-object p0, v1, Ldefpackage/zo2;->E:Ljava/lang/String;

    .line 192
    .line 193
    iget-object p0, v1, Ldefpackage/zo2;->v:Landroid/media/MediaRouter2;

    .line 194
    .line 195
    invoke-static {p0, p1}, Ldefpackage/l3;->v(Landroid/media/MediaRouter2;Landroid/media/MediaRoute2Info;)V

    .line 196
    .line 197
    .line 198
    return-void

    .line 199
    :cond_9
    invoke-virtual {p0, p1, p2, p3}, Ldefpackage/ui1;->j(Ldefpackage/wq2;IZ)V

    .line 200
    .line 201
    .line 202
    return-void
.end method

.method public final j(Ldefpackage/wq2;IZ)V
    .locals 14

    .line 1
    move/from16 v5, p3

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/ui1;->c:Ldefpackage/wq2;

    .line 4
    .line 5
    if-ne v0, p1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Ldefpackage/ui1;->t:Ldefpackage/wq2;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    const/4 v3, 0x1

    .line 12
    if-ne p1, v0, :cond_1

    .line 13
    .line 14
    move v0, v3

    .line 15
    goto :goto_0

    .line 16
    :cond_1
    move v0, v1

    .line 17
    :goto_0
    iget-object v4, p0, Ldefpackage/ui1;->u:Ldefpackage/wq2;

    .line 18
    .line 19
    const/4 v6, 0x3

    .line 20
    const/4 v7, 0x0

    .line 21
    if-eqz v4, :cond_6

    .line 22
    .line 23
    if-eqz v0, :cond_6

    .line 24
    .line 25
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    new-instance v4, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    const-string v8, "- Stacktrace: ["

    .line 36
    .line 37
    invoke-direct {v4, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    move v8, v6

    .line 41
    :cond_2
    :goto_1
    array-length v9, v0

    .line 42
    if-ge v8, v9, :cond_3

    .line 43
    .line 44
    aget-object v9, v0, v8

    .line 45
    .line 46
    invoke-virtual {v9}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v10

    .line 50
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v10, "."

    .line 54
    .line 55
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v9}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v10

    .line 62
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v10, ":"

    .line 66
    .line 67
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v9}, Ljava/lang/StackTraceElement;->getLineNumber()I

    .line 71
    .line 72
    .line 73
    move-result v9

    .line 74
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    add-int/lit8 v8, v8, 0x1

    .line 78
    .line 79
    array-length v9, v0

    .line 80
    if-ge v8, v9, :cond_2

    .line 81
    .line 82
    const-string v9, ", "

    .line 83
    .line 84
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_3
    const-string v0, "]"

    .line 89
    .line 90
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    iget-object v0, p0, Ldefpackage/ui1;->c:Ldefpackage/wq2;

    .line 94
    .line 95
    if-eqz v0, :cond_5

    .line 96
    .line 97
    sget-object v8, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 98
    .line 99
    iget-object v8, v0, Ldefpackage/wq2;->d:Ljava/lang/String;

    .line 100
    .line 101
    invoke-static {}, Ldefpackage/yq2;->b()V

    .line 102
    .line 103
    .line 104
    invoke-static {}, Ldefpackage/yq2;->c()Ldefpackage/ui1;

    .line 105
    .line 106
    .line 107
    move-result-object v9

    .line 108
    iget-object v9, v9, Ldefpackage/ui1;->u:Ldefpackage/wq2;

    .line 109
    .line 110
    if-ne v9, v0, :cond_4

    .line 111
    .line 112
    move v1, v3

    .line 113
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 114
    .line 115
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    const-string v3, "(BT="

    .line 122
    .line 123
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    const-string v1, ", syncMediaRoute1Provider="

    .line 130
    .line 131
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    const-string v1, ")"

    .line 138
    .line 139
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    goto :goto_2

    .line 147
    :cond_5
    move-object v0, v7

    .line 148
    :goto_2
    const-string v1, "AxMediaRouter"

    .line 149
    .line 150
    const-string v3, "Changing selection("

    .line 151
    .line 152
    const-string v8, ") to default while BT is available: pkgName="

    .line 153
    .line 154
    invoke-static {v3, v0, v8}, Ldefpackage/xa3;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    iget-object v3, p0, Ldefpackage/ui1;->f:Landroid/content/Context;

    .line 159
    .line 160
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-static {v1, v0}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 175
    .line 176
    .line 177
    :cond_6
    iget-object v0, p0, Ldefpackage/ui1;->v:Ldefpackage/wq2;

    .line 178
    .line 179
    if-eqz v0, :cond_7

    .line 180
    .line 181
    iput-object v7, p0, Ldefpackage/ui1;->v:Ldefpackage/wq2;

    .line 182
    .line 183
    iget-object v0, p0, Ldefpackage/ui1;->w:Ldefpackage/nq2;

    .line 184
    .line 185
    if-eqz v0, :cond_7

    .line 186
    .line 187
    invoke-virtual {v0, v6}, Ldefpackage/oq2;->h(I)V

    .line 188
    .line 189
    .line 190
    iget-object v0, p0, Ldefpackage/ui1;->w:Ldefpackage/nq2;

    .line 191
    .line 192
    invoke-virtual {v0}, Ldefpackage/oq2;->d()V

    .line 193
    .line 194
    .line 195
    iput-object v7, p0, Ldefpackage/ui1;->w:Ldefpackage/nq2;

    .line 196
    .line 197
    :cond_7
    iget-boolean v0, p0, Ldefpackage/ui1;->p:Z

    .line 198
    .line 199
    if-eqz v0, :cond_c

    .line 200
    .line 201
    iget-object v0, p1, Ldefpackage/wq2;->a:Ldefpackage/vq2;

    .line 202
    .line 203
    iget-object v0, v0, Ldefpackage/vq2;->e:Ldefpackage/xk0;

    .line 204
    .line 205
    if-eqz v0, :cond_c

    .line 206
    .line 207
    iget-boolean v0, v0, Ldefpackage/xk0;->o:Z

    .line 208
    .line 209
    if-eqz v0, :cond_c

    .line 210
    .line 211
    invoke-virtual {p1}, Ldefpackage/wq2;->c()Ldefpackage/qq2;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    iget-object v1, p1, Ldefpackage/wq2;->b:Ljava/lang/String;

    .line 216
    .line 217
    new-instance v3, Landroid/os/Bundle;

    .line 218
    .line 219
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 220
    .line 221
    .line 222
    iget-object v4, p0, Ldefpackage/ui1;->f:Landroid/content/Context;

    .line 223
    .line 224
    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v4

    .line 228
    const-string v6, "clientPackageName"

    .line 229
    .line 230
    invoke-virtual {v3, v6, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    new-instance v4, Ldefpackage/pq2;

    .line 234
    .line 235
    invoke-direct {v4, v3}, Ldefpackage/pq2;-><init>(Landroid/os/Bundle;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v0, v1, v4}, Ldefpackage/qq2;->a(Ljava/lang/String;Ldefpackage/pq2;)Ldefpackage/nq2;

    .line 239
    .line 240
    .line 241
    move-result-object v9

    .line 242
    if-eqz v9, :cond_b

    .line 243
    .line 244
    iget-object v0, p0, Ldefpackage/ui1;->f:Landroid/content/Context;

    .line 245
    .line 246
    invoke-static {v0}, Ldefpackage/ud3;->w(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    iget-object v10, p0, Ldefpackage/ui1;->A:Ldefpackage/zh0;

    .line 251
    .line 252
    iget-object v1, v9, Ldefpackage/nq2;->a:Ljava/lang/Object;

    .line 253
    .line 254
    monitor-enter v1

    .line 255
    if-eqz v0, :cond_a

    .line 256
    .line 257
    if-eqz v10, :cond_9

    .line 258
    .line 259
    :try_start_0
    iput-object v0, v9, Ldefpackage/nq2;->b:Ljava/util/concurrent/Executor;

    .line 260
    .line 261
    iput-object v10, v9, Ldefpackage/nq2;->c:Ldefpackage/zh0;

    .line 262
    .line 263
    iget-object v0, v9, Ldefpackage/nq2;->e:Ljava/util/ArrayList;

    .line 264
    .line 265
    if-eqz v0, :cond_8

    .line 266
    .line 267
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 268
    .line 269
    .line 270
    move-result v0

    .line 271
    if-nez v0, :cond_8

    .line 272
    .line 273
    iget-object v11, v9, Ldefpackage/nq2;->d:Ldefpackage/sp2;

    .line 274
    .line 275
    iget-object v12, v9, Ldefpackage/nq2;->e:Ljava/util/ArrayList;

    .line 276
    .line 277
    iput-object v7, v9, Ldefpackage/nq2;->d:Ldefpackage/sp2;

    .line 278
    .line 279
    iput-object v7, v9, Ldefpackage/nq2;->e:Ljava/util/ArrayList;

    .line 280
    .line 281
    iget-object v0, v9, Ldefpackage/nq2;->b:Ljava/util/concurrent/Executor;

    .line 282
    .line 283
    new-instance v8, Ldefpackage/t6;

    .line 284
    .line 285
    const/16 v13, 0x14

    .line 286
    .line 287
    invoke-direct/range {v8 .. v13}, Ldefpackage/t6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 288
    .line 289
    .line 290
    invoke-interface {v0, v8}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 291
    .line 292
    .line 293
    goto :goto_3

    .line 294
    :catchall_0
    move-exception v0

    .line 295
    move-object p0, v0

    .line 296
    goto :goto_4

    .line 297
    :cond_8
    :goto_3
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 298
    iput-object p1, p0, Ldefpackage/ui1;->v:Ldefpackage/wq2;

    .line 299
    .line 300
    iput-object v9, p0, Ldefpackage/ui1;->w:Ldefpackage/nq2;

    .line 301
    .line 302
    invoke-virtual {v9}, Ldefpackage/oq2;->e()V

    .line 303
    .line 304
    .line 305
    return-void

    .line 306
    :cond_9
    :try_start_1
    new-instance p0, Ljava/lang/NullPointerException;

    .line 307
    .line 308
    const-string v0, "Listener shouldn\'t be null"

    .line 309
    .line 310
    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    throw p0

    .line 314
    :cond_a
    new-instance p0, Ljava/lang/NullPointerException;

    .line 315
    .line 316
    const-string v0, "Executor shouldn\'t be null"

    .line 317
    .line 318
    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    throw p0

    .line 322
    :goto_4
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 323
    throw p0

    .line 324
    :cond_b
    const-string v0, "AxMediaRouter"

    .line 325
    .line 326
    new-instance v1, Ljava/lang/StringBuilder;

    .line 327
    .line 328
    const-string v3, "setSelectedRouteInternal: Failed to create dynamic group route controller. route="

    .line 329
    .line 330
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v1

    .line 340
    invoke-static {v0, v1}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 341
    .line 342
    .line 343
    :cond_c
    invoke-virtual {p1}, Ldefpackage/wq2;->c()Ldefpackage/qq2;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    iget-object v1, p1, Ldefpackage/wq2;->b:Ljava/lang/String;

    .line 348
    .line 349
    new-instance v3, Landroid/os/Bundle;

    .line 350
    .line 351
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 352
    .line 353
    .line 354
    iget-object v4, p0, Ldefpackage/ui1;->f:Landroid/content/Context;

    .line 355
    .line 356
    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v4

    .line 360
    const-string v6, "clientPackageName"

    .line 361
    .line 362
    invoke-virtual {v3, v6, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    new-instance v4, Ldefpackage/pq2;

    .line 366
    .line 367
    invoke-direct {v4, v3}, Ldefpackage/pq2;-><init>(Landroid/os/Bundle;)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {v0, v1, v4}, Ldefpackage/qq2;->c(Ljava/lang/String;Ldefpackage/pq2;)Ldefpackage/oq2;

    .line 371
    .line 372
    .line 373
    move-result-object v3

    .line 374
    if-eqz v3, :cond_d

    .line 375
    .line 376
    invoke-virtual {v3}, Ldefpackage/oq2;->e()V

    .line 377
    .line 378
    .line 379
    :cond_d
    iget-object v0, p0, Ldefpackage/ui1;->c:Ldefpackage/wq2;

    .line 380
    .line 381
    if-nez v0, :cond_e

    .line 382
    .line 383
    iput-object p1, p0, Ldefpackage/ui1;->c:Ldefpackage/wq2;

    .line 384
    .line 385
    iput-object v3, p0, Ldefpackage/ui1;->d:Ldefpackage/oq2;

    .line 386
    .line 387
    iget-object p0, p0, Ldefpackage/ui1;->a:Ldefpackage/ri1;

    .line 388
    .line 389
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 390
    .line 391
    .line 392
    new-instance v0, Ldefpackage/ti1;

    .line 393
    .line 394
    invoke-direct {v0, v7, p1, v5}, Ldefpackage/ti1;-><init>(Ldefpackage/wq2;Ldefpackage/wq2;Z)V

    .line 395
    .line 396
    .line 397
    const/16 v1, 0x106

    .line 398
    .line 399
    invoke-virtual {p0, v1, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 400
    .line 401
    .line 402
    move-result-object p0

    .line 403
    move/from16 v4, p2

    .line 404
    .line 405
    iput v4, p0, Landroid/os/Message;->arg1:I

    .line 406
    .line 407
    invoke-virtual {p0}, Landroid/os/Message;->sendToTarget()V

    .line 408
    .line 409
    .line 410
    return-void

    .line 411
    :cond_e
    move/from16 v4, p2

    .line 412
    .line 413
    iget-object v0, p0, Ldefpackage/ui1;->e:Ldefpackage/uq2;

    .line 414
    .line 415
    if-eqz v0, :cond_f

    .line 416
    .line 417
    invoke-virtual {v0}, Ldefpackage/uq2;->a()V

    .line 418
    .line 419
    .line 420
    iput-object v7, p0, Ldefpackage/ui1;->e:Ldefpackage/uq2;

    .line 421
    .line 422
    :cond_f
    new-instance v0, Ldefpackage/uq2;

    .line 423
    .line 424
    const/4 v6, 0x0

    .line 425
    const/4 v7, 0x0

    .line 426
    move-object v1, p0

    .line 427
    move-object v2, p1

    .line 428
    invoke-direct/range {v0 .. v7}, Ldefpackage/uq2;-><init>(Ldefpackage/ui1;Ldefpackage/wq2;Ldefpackage/oq2;IZLdefpackage/wq2;Ljava/util/Collection;)V

    .line 429
    .line 430
    .line 431
    iput-object v0, p0, Ldefpackage/ui1;->e:Ldefpackage/uq2;

    .line 432
    .line 433
    invoke-virtual {v0}, Ldefpackage/uq2;->b()V

    .line 434
    .line 435
    .line 436
    return-void
.end method

.method public final k()V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Ldefpackage/c52;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object v2, v0, Ldefpackage/ui1;->s:Ldefpackage/zq2;

    .line 9
    .line 10
    const-wide/16 v3, 0x0

    .line 11
    .line 12
    iput-wide v3, v2, Ldefpackage/zq2;->n:J

    .line 13
    .line 14
    const/4 v5, 0x0

    .line 15
    iput-boolean v5, v2, Ldefpackage/zq2;->p:Z

    .line 16
    .line 17
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 18
    .line 19
    .line 20
    move-result-wide v6

    .line 21
    iput-wide v6, v2, Ldefpackage/zq2;->o:J

    .line 22
    .line 23
    iget-object v6, v2, Ldefpackage/zq2;->q:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v6, Landroid/os/Handler;

    .line 26
    .line 27
    iget-object v7, v2, Ldefpackage/zq2;->r:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v7, Ldefpackage/qa1;

    .line 30
    .line 31
    invoke-virtual {v6, v7}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 32
    .line 33
    .line 34
    iget-object v6, v0, Ldefpackage/ui1;->g:Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v7

    .line 40
    move v8, v5

    .line 41
    move v9, v8

    .line 42
    :goto_0
    add-int/lit8 v7, v7, -0x1

    .line 43
    .line 44
    if-ltz v7, :cond_7

    .line 45
    .line 46
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v10

    .line 50
    check-cast v10, Ljava/lang/ref/WeakReference;

    .line 51
    .line 52
    invoke-virtual {v10}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v10

    .line 56
    check-cast v10, Ldefpackage/yq2;

    .line 57
    .line 58
    if-nez v10, :cond_1

    .line 59
    .line 60
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    :cond_0
    move-wide/from16 v16, v3

    .line 64
    .line 65
    move-object/from16 v18, v6

    .line 66
    .line 67
    goto/16 :goto_6

    .line 68
    .line 69
    :cond_1
    iget-object v10, v10, Ldefpackage/yq2;->b:Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 72
    .line 73
    .line 74
    move-result v11

    .line 75
    add-int/2addr v8, v11

    .line 76
    move v12, v5

    .line 77
    :goto_1
    if-ge v12, v11, :cond_0

    .line 78
    .line 79
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v13

    .line 83
    check-cast v13, Ldefpackage/sq2;

    .line 84
    .line 85
    iget-object v14, v13, Ldefpackage/sq2;->c:Ldefpackage/rq2;

    .line 86
    .line 87
    if-eqz v14, :cond_6

    .line 88
    .line 89
    invoke-virtual {v14}, Ldefpackage/rq2;->b()Ljava/util/ArrayList;

    .line 90
    .line 91
    .line 92
    move-result-object v14

    .line 93
    invoke-virtual {v1, v14}, Ldefpackage/c52;->a(Ljava/util/ArrayList;)V

    .line 94
    .line 95
    .line 96
    iget v14, v13, Ldefpackage/sq2;->d:I

    .line 97
    .line 98
    const/4 v15, 0x1

    .line 99
    and-int/2addr v14, v15

    .line 100
    if-eqz v14, :cond_2

    .line 101
    .line 102
    move v14, v15

    .line 103
    :goto_2
    move-wide/from16 v16, v3

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_2
    move v14, v5

    .line 107
    goto :goto_2

    .line 108
    :goto_3
    iget-wide v3, v13, Ldefpackage/sq2;->e:J

    .line 109
    .line 110
    if-nez v14, :cond_3

    .line 111
    .line 112
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    move-object/from16 v18, v6

    .line 116
    .line 117
    goto :goto_4

    .line 118
    :cond_3
    move-object/from16 v18, v6

    .line 119
    .line 120
    iget-wide v5, v2, Ldefpackage/zq2;->o:J

    .line 121
    .line 122
    sub-long v19, v5, v3

    .line 123
    .line 124
    const-wide/16 v21, 0x7530

    .line 125
    .line 126
    cmp-long v19, v19, v21

    .line 127
    .line 128
    if-ltz v19, :cond_4

    .line 129
    .line 130
    :goto_4
    move/from16 v19, v14

    .line 131
    .line 132
    goto :goto_5

    .line 133
    :cond_4
    move/from16 v19, v14

    .line 134
    .line 135
    iget-wide v13, v2, Ldefpackage/zq2;->n:J

    .line 136
    .line 137
    add-long v3, v3, v21

    .line 138
    .line 139
    sub-long/2addr v3, v5

    .line 140
    invoke-static {v13, v14, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 141
    .line 142
    .line 143
    move-result-wide v3

    .line 144
    iput-wide v3, v2, Ldefpackage/zq2;->n:J

    .line 145
    .line 146
    iput-boolean v15, v2, Ldefpackage/zq2;->p:Z

    .line 147
    .line 148
    :goto_5
    if-eqz v19, :cond_5

    .line 149
    .line 150
    move v9, v15

    .line 151
    :cond_5
    add-int/lit8 v12, v12, 0x1

    .line 152
    .line 153
    move-wide/from16 v3, v16

    .line 154
    .line 155
    move-object/from16 v6, v18

    .line 156
    .line 157
    const/4 v5, 0x0

    .line 158
    goto :goto_1

    .line 159
    :cond_6
    const-string v0, "selector must not be null"

    .line 160
    .line 161
    invoke-static {v0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    return-void

    .line 165
    :goto_6
    move-wide/from16 v3, v16

    .line 166
    .line 167
    move-object/from16 v6, v18

    .line 168
    .line 169
    const/4 v5, 0x0

    .line 170
    goto/16 :goto_0

    .line 171
    .line 172
    :cond_7
    move-wide/from16 v16, v3

    .line 173
    .line 174
    iget-boolean v3, v2, Ldefpackage/zq2;->p:Z

    .line 175
    .line 176
    if-eqz v3, :cond_8

    .line 177
    .line 178
    iget-wide v3, v2, Ldefpackage/zq2;->n:J

    .line 179
    .line 180
    cmp-long v5, v3, v16

    .line 181
    .line 182
    if-lez v5, :cond_8

    .line 183
    .line 184
    iget-object v5, v2, Ldefpackage/zq2;->q:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v5, Landroid/os/Handler;

    .line 187
    .line 188
    iget-object v6, v2, Ldefpackage/zq2;->r:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v6, Ldefpackage/qa1;

    .line 191
    .line 192
    invoke-virtual {v5, v6, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 193
    .line 194
    .line 195
    :cond_8
    iget-boolean v2, v2, Ldefpackage/zq2;->p:Z

    .line 196
    .line 197
    iput v8, v0, Ldefpackage/ui1;->z:I

    .line 198
    .line 199
    if-eqz v9, :cond_9

    .line 200
    .line 201
    invoke-virtual {v1}, Ldefpackage/c52;->d()Ldefpackage/rq2;

    .line 202
    .line 203
    .line 204
    move-result-object v3

    .line 205
    goto :goto_7

    .line 206
    :cond_9
    sget-object v3, Ldefpackage/rq2;->c:Ldefpackage/rq2;

    .line 207
    .line 208
    :goto_7
    invoke-virtual {v1}, Ldefpackage/c52;->d()Ldefpackage/rq2;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    iget-boolean v4, v0, Ldefpackage/ui1;->p:Z

    .line 213
    .line 214
    iget-object v5, v0, Ldefpackage/ui1;->q:Ldefpackage/zo2;

    .line 215
    .line 216
    const/4 v6, 0x0

    .line 217
    if-nez v4, :cond_a

    .line 218
    .line 219
    goto :goto_9

    .line 220
    :cond_a
    iget-object v4, v0, Ldefpackage/ui1;->y:Ldefpackage/up2;

    .line 221
    .line 222
    if-eqz v4, :cond_b

    .line 223
    .line 224
    invoke-virtual {v4}, Ldefpackage/up2;->a()V

    .line 225
    .line 226
    .line 227
    iget-object v4, v4, Ldefpackage/up2;->b:Ldefpackage/rq2;

    .line 228
    .line 229
    invoke-virtual {v4, v1}, Ldefpackage/rq2;->equals(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    move-result v4

    .line 233
    if-eqz v4, :cond_b

    .line 234
    .line 235
    iget-object v4, v0, Ldefpackage/ui1;->y:Ldefpackage/up2;

    .line 236
    .line 237
    invoke-virtual {v4}, Ldefpackage/up2;->b()Z

    .line 238
    .line 239
    .line 240
    move-result v4

    .line 241
    if-ne v4, v2, :cond_b

    .line 242
    .line 243
    goto :goto_9

    .line 244
    :cond_b
    invoke-virtual {v1}, Ldefpackage/rq2;->c()Z

    .line 245
    .line 246
    .line 247
    move-result v4

    .line 248
    if-eqz v4, :cond_d

    .line 249
    .line 250
    if-nez v2, :cond_d

    .line 251
    .line 252
    iget-object v1, v0, Ldefpackage/ui1;->y:Ldefpackage/up2;

    .line 253
    .line 254
    if-nez v1, :cond_c

    .line 255
    .line 256
    goto :goto_9

    .line 257
    :cond_c
    iput-object v6, v0, Ldefpackage/ui1;->y:Ldefpackage/up2;

    .line 258
    .line 259
    goto :goto_8

    .line 260
    :cond_d
    new-instance v4, Ldefpackage/up2;

    .line 261
    .line 262
    invoke-direct {v4, v1, v2}, Ldefpackage/up2;-><init>(Ldefpackage/rq2;Z)V

    .line 263
    .line 264
    .line 265
    iput-object v4, v0, Ldefpackage/ui1;->y:Ldefpackage/up2;

    .line 266
    .line 267
    :goto_8
    iget-object v1, v0, Ldefpackage/ui1;->y:Ldefpackage/up2;

    .line 268
    .line 269
    invoke-virtual {v5, v1}, Ldefpackage/qq2;->g(Ldefpackage/up2;)V

    .line 270
    .line 271
    .line 272
    :goto_9
    iget-object v1, v0, Ldefpackage/ui1;->x:Ldefpackage/up2;

    .line 273
    .line 274
    if-eqz v1, :cond_e

    .line 275
    .line 276
    invoke-virtual {v1}, Ldefpackage/up2;->a()V

    .line 277
    .line 278
    .line 279
    iget-object v1, v1, Ldefpackage/up2;->b:Ldefpackage/rq2;

    .line 280
    .line 281
    invoke-virtual {v1, v3}, Ldefpackage/rq2;->equals(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    move-result v1

    .line 285
    if-eqz v1, :cond_e

    .line 286
    .line 287
    iget-object v1, v0, Ldefpackage/ui1;->x:Ldefpackage/up2;

    .line 288
    .line 289
    invoke-virtual {v1}, Ldefpackage/up2;->b()Z

    .line 290
    .line 291
    .line 292
    move-result v1

    .line 293
    if-ne v1, v2, :cond_e

    .line 294
    .line 295
    goto :goto_c

    .line 296
    :cond_e
    invoke-virtual {v3}, Ldefpackage/rq2;->c()Z

    .line 297
    .line 298
    .line 299
    move-result v1

    .line 300
    if-eqz v1, :cond_10

    .line 301
    .line 302
    if-nez v2, :cond_10

    .line 303
    .line 304
    iget-object v1, v0, Ldefpackage/ui1;->x:Ldefpackage/up2;

    .line 305
    .line 306
    if-nez v1, :cond_f

    .line 307
    .line 308
    goto :goto_c

    .line 309
    :cond_f
    iput-object v6, v0, Ldefpackage/ui1;->x:Ldefpackage/up2;

    .line 310
    .line 311
    goto :goto_a

    .line 312
    :cond_10
    new-instance v1, Ldefpackage/up2;

    .line 313
    .line 314
    invoke-direct {v1, v3, v2}, Ldefpackage/up2;-><init>(Ldefpackage/rq2;Z)V

    .line 315
    .line 316
    .line 317
    iput-object v1, v0, Ldefpackage/ui1;->x:Ldefpackage/up2;

    .line 318
    .line 319
    :goto_a
    if-eqz v9, :cond_11

    .line 320
    .line 321
    if-nez v2, :cond_11

    .line 322
    .line 323
    iget-boolean v1, v0, Ldefpackage/ui1;->o:Z

    .line 324
    .line 325
    if-eqz v1, :cond_11

    .line 326
    .line 327
    const-string v1, "AxMediaRouter"

    .line 328
    .line 329
    const-string v2, "Forcing passive route discovery on a low-RAM device, system performance may be affected.  Please consider using CALLBACK_FLAG_REQUEST_DISCOVERY instead of CALLBACK_FLAG_FORCE_DISCOVERY."

    .line 330
    .line 331
    invoke-static {v1, v2}, Landroid/util/Ldefpackage/og;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 332
    .line 333
    .line 334
    :cond_11
    iget-object v1, v0, Ldefpackage/ui1;->k:Ljava/util/ArrayList;

    .line 335
    .line 336
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 337
    .line 338
    .line 339
    move-result v2

    .line 340
    const/4 v3, 0x0

    .line 341
    :goto_b
    if-ge v3, v2, :cond_13

    .line 342
    .line 343
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v4

    .line 347
    add-int/lit8 v3, v3, 0x1

    .line 348
    .line 349
    check-cast v4, Ldefpackage/vq2;

    .line 350
    .line 351
    iget-object v4, v4, Ldefpackage/vq2;->a:Ldefpackage/qq2;

    .line 352
    .line 353
    if-ne v4, v5, :cond_12

    .line 354
    .line 355
    goto :goto_b

    .line 356
    :cond_12
    iget-object v6, v0, Ldefpackage/ui1;->x:Ldefpackage/up2;

    .line 357
    .line 358
    invoke-virtual {v4, v6}, Ldefpackage/qq2;->g(Ldefpackage/up2;)V

    .line 359
    .line 360
    .line 361
    goto :goto_b

    .line 362
    :cond_13
    :goto_c
    return-void
.end method

.method public final l()V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/ui1;->c:Ldefpackage/wq2;

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    iget-object v1, p0, Ldefpackage/ui1;->m:Ldefpackage/hh3;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ldefpackage/wq2;->e()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    sget-object v0, Ldefpackage/yq2;->c:Ldefpackage/ui1;

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-static {}, Ldefpackage/yq2;->c()Ldefpackage/ui1;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    :cond_1
    :goto_0
    iget-object v0, p0, Ldefpackage/ui1;->c:Ldefpackage/wq2;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Ldefpackage/ui1;->c:Ldefpackage/wq2;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget-boolean v0, p0, Ldefpackage/ui1;->p:Z

    .line 39
    .line 40
    if-eqz v0, :cond_4

    .line 41
    .line 42
    iget-object v0, p0, Ldefpackage/ui1;->c:Ldefpackage/wq2;

    .line 43
    .line 44
    invoke-virtual {v0}, Ldefpackage/wq2;->c()Ldefpackage/qq2;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget-object v1, p0, Ldefpackage/ui1;->q:Ldefpackage/zo2;

    .line 49
    .line 50
    if-ne v0, v1, :cond_4

    .line 51
    .line 52
    iget-object v0, p0, Ldefpackage/ui1;->d:Ldefpackage/oq2;

    .line 53
    .line 54
    sget v1, Ldefpackage/zo2;->F:I

    .line 55
    .line 56
    instance-of v1, v0, Ldefpackage/vo2;

    .line 57
    .line 58
    if-nez v1, :cond_2

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    check-cast v0, Ldefpackage/vo2;

    .line 62
    .line 63
    iget-object v0, v0, Ldefpackage/vo2;->g:Landroid/media/MediaRouter2$RoutingController;

    .line 64
    .line 65
    if-nez v0, :cond_3

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_3
    invoke-static {v0}, Ldefpackage/to2;->j(Landroid/media/MediaRouter2$RoutingController;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    :cond_4
    :goto_1
    iget-object p0, p0, Ldefpackage/ui1;->l:Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-nez v0, :cond_5

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_5
    invoke-static {p0}, Ldefpackage/xa3;->d(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    throw p0

    .line 89
    :cond_6
    :goto_2
    return-void
.end method

.method public final m(Ldefpackage/vq2;Ldefpackage/xk0;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v1, Ldefpackage/vq2;->e:Ldefpackage/xk0;

    .line 8
    .line 9
    iget-object v4, v1, Ldefpackage/vq2;->b:Ljava/util/ArrayList;

    .line 10
    .line 11
    if-eq v3, v2, :cond_14

    .line 12
    .line 13
    iput-object v2, v1, Ldefpackage/vq2;->e:Ldefpackage/xk0;

    .line 14
    .line 15
    iget-object v3, v0, Ldefpackage/ui1;->h:Ljava/util/ArrayList;

    .line 16
    .line 17
    const-string v5, "AxMediaRouter"

    .line 18
    .line 19
    iget-object v6, v0, Ldefpackage/ui1;->a:Ldefpackage/ri1;

    .line 20
    .line 21
    if-eqz v2, :cond_2

    .line 22
    .line 23
    iget-object v9, v2, Ldefpackage/xk0;->p:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v9, Ljava/util/List;

    .line 26
    .line 27
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 28
    .line 29
    .line 30
    move-result v10

    .line 31
    const/4 v11, 0x0

    .line 32
    :goto_0
    if-ge v11, v10, :cond_3

    .line 33
    .line 34
    invoke-interface {v9, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v12

    .line 38
    check-cast v12, Ldefpackage/sp2;

    .line 39
    .line 40
    if-eqz v12, :cond_1

    .line 41
    .line 42
    invoke-virtual {v12}, Ldefpackage/sp2;->e()Z

    .line 43
    .line 44
    .line 45
    move-result v12

    .line 46
    if-nez v12, :cond_0

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_0
    add-int/lit8 v11, v11, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    :goto_1
    iget-object v10, v0, Ldefpackage/ui1;->r:Ldefpackage/vg3;

    .line 53
    .line 54
    iget-object v10, v10, Ldefpackage/qq2;->t:Ldefpackage/xk0;

    .line 55
    .line 56
    if-ne v2, v10, :cond_2

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_2
    const/4 v12, 0x0

    .line 60
    const/16 v16, 0x1

    .line 61
    .line 62
    goto/16 :goto_c

    .line 63
    .line 64
    :cond_3
    :goto_2
    new-instance v2, Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 67
    .line 68
    .line 69
    new-instance v10, Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 72
    .line 73
    .line 74
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object v9

    .line 78
    const/4 v11, 0x0

    .line 79
    const/4 v12, 0x0

    .line 80
    :goto_3
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v13

    .line 84
    if-eqz v13, :cond_d

    .line 85
    .line 86
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v13

    .line 90
    check-cast v13, Ldefpackage/sp2;

    .line 91
    .line 92
    if-eqz v13, :cond_4

    .line 93
    .line 94
    invoke-virtual {v13}, Ldefpackage/sp2;->e()Z

    .line 95
    .line 96
    .line 97
    move-result v15

    .line 98
    if-nez v15, :cond_5

    .line 99
    .line 100
    :cond_4
    move-object/from16 v17, v9

    .line 101
    .line 102
    move/from16 v18, v12

    .line 103
    .line 104
    const/4 v12, 0x0

    .line 105
    const/16 v16, 0x1

    .line 106
    .line 107
    goto/16 :goto_9

    .line 108
    .line 109
    :cond_5
    invoke-virtual {v13}, Ldefpackage/sp2;->d()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v15

    .line 113
    const/16 v16, 0x1

    .line 114
    .line 115
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 116
    .line 117
    .line 118
    move-result v8

    .line 119
    const/4 v14, 0x0

    .line 120
    :goto_4
    if-ge v14, v8, :cond_7

    .line 121
    .line 122
    invoke-virtual {v4, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v17

    .line 126
    move-object/from16 v7, v17

    .line 127
    .line 128
    check-cast v7, Ldefpackage/wq2;

    .line 129
    .line 130
    iget-object v7, v7, Ldefpackage/wq2;->b:Ljava/lang/String;

    .line 131
    .line 132
    invoke-virtual {v7, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v7

    .line 136
    if-eqz v7, :cond_6

    .line 137
    .line 138
    goto :goto_5

    .line 139
    :cond_6
    add-int/lit8 v14, v14, 0x1

    .line 140
    .line 141
    goto :goto_4

    .line 142
    :cond_7
    const/4 v14, -0x1

    .line 143
    :goto_5
    if-gez v14, :cond_9

    .line 144
    .line 145
    invoke-virtual {v0, v1, v15}, Ldefpackage/ui1;->b(Ldefpackage/vq2;Ljava/lang/String;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v7

    .line 149
    new-instance v8, Ldefpackage/wq2;

    .line 150
    .line 151
    iget-object v14, v13, Ldefpackage/sp2;->a:Landroid/os/Bundle;

    .line 152
    .line 153
    move-object/from16 v17, v9

    .line 154
    .line 155
    const-string v9, "isSystemRoute"

    .line 156
    .line 157
    move/from16 v18, v12

    .line 158
    .line 159
    const/4 v12, 0x0

    .line 160
    invoke-virtual {v14, v9, v12}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 161
    .line 162
    .line 163
    move-result v9

    .line 164
    invoke-direct {v8, v1, v15, v7, v9}, Ldefpackage/wq2;-><init>(Ldefpackage/vq2;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 165
    .line 166
    .line 167
    add-int/lit8 v7, v11, 0x1

    .line 168
    .line 169
    invoke-virtual {v4, v11, v8}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    invoke-virtual {v13}, Ldefpackage/sp2;->c()Ljava/util/ArrayList;

    .line 176
    .line 177
    .line 178
    move-result-object v9

    .line 179
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 180
    .line 181
    .line 182
    move-result v9

    .line 183
    if-nez v9, :cond_8

    .line 184
    .line 185
    new-instance v9, Ldefpackage/ld3;

    .line 186
    .line 187
    invoke-direct {v9, v8, v13}, Ldefpackage/ld3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    goto :goto_6

    .line 194
    :cond_8
    invoke-virtual {v8, v13}, Ldefpackage/wq2;->i(Ldefpackage/sp2;)I

    .line 195
    .line 196
    .line 197
    const/16 v9, 0x101

    .line 198
    .line 199
    invoke-virtual {v6, v9, v8}, Ldefpackage/ri1;->b(ILjava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    :goto_6
    move v11, v7

    .line 203
    goto :goto_8

    .line 204
    :cond_9
    move-object/from16 v17, v9

    .line 205
    .line 206
    move/from16 v18, v12

    .line 207
    .line 208
    const/4 v12, 0x0

    .line 209
    if-ge v14, v11, :cond_a

    .line 210
    .line 211
    new-instance v7, Ljava/lang/StringBuilder;

    .line 212
    .line 213
    const-string v8, "Ignoring route descriptor with duplicate id: "

    .line 214
    .line 215
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v7

    .line 225
    invoke-static {v5, v7}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 226
    .line 227
    .line 228
    goto :goto_8

    .line 229
    :cond_a
    invoke-virtual {v4, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v7

    .line 233
    check-cast v7, Ldefpackage/wq2;

    .line 234
    .line 235
    add-int/lit8 v8, v11, 0x1

    .line 236
    .line 237
    invoke-static {v4, v14, v11}, Ljava/util/Collections;->swap(Ljava/util/List;II)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v13}, Ldefpackage/sp2;->c()Ljava/util/ArrayList;

    .line 241
    .line 242
    .line 243
    move-result-object v9

    .line 244
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 245
    .line 246
    .line 247
    move-result v9

    .line 248
    if-nez v9, :cond_b

    .line 249
    .line 250
    new-instance v9, Ldefpackage/ld3;

    .line 251
    .line 252
    invoke-direct {v9, v7, v13}, Ldefpackage/ld3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    goto :goto_7

    .line 259
    :cond_b
    invoke-virtual {v0, v7, v13}, Ldefpackage/ui1;->n(Ldefpackage/wq2;Ldefpackage/sp2;)I

    .line 260
    .line 261
    .line 262
    move-result v9

    .line 263
    if-eqz v9, :cond_c

    .line 264
    .line 265
    iget-object v9, v0, Ldefpackage/ui1;->c:Ldefpackage/wq2;

    .line 266
    .line 267
    if-ne v7, v9, :cond_c

    .line 268
    .line 269
    move v11, v8

    .line 270
    move/from16 v18, v16

    .line 271
    .line 272
    goto :goto_8

    .line 273
    :cond_c
    :goto_7
    move v11, v8

    .line 274
    :goto_8
    move-object/from16 v9, v17

    .line 275
    .line 276
    move/from16 v12, v18

    .line 277
    .line 278
    goto/16 :goto_3

    .line 279
    .line 280
    :goto_9
    new-instance v7, Ljava/lang/StringBuilder;

    .line 281
    .line 282
    const-string v8, "Ignoring invalid route descriptor: "

    .line 283
    .line 284
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v7

    .line 294
    invoke-static {v5, v7}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 295
    .line 296
    .line 297
    goto :goto_8

    .line 298
    :cond_d
    move/from16 v18, v12

    .line 299
    .line 300
    const/4 v12, 0x0

    .line 301
    const/16 v16, 0x1

    .line 302
    .line 303
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 304
    .line 305
    .line 306
    move-result v5

    .line 307
    move v7, v12

    .line 308
    :goto_a
    if-ge v7, v5, :cond_e

    .line 309
    .line 310
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v8

    .line 314
    add-int/lit8 v7, v7, 0x1

    .line 315
    .line 316
    check-cast v8, Ldefpackage/ld3;

    .line 317
    .line 318
    iget-object v9, v8, Ldefpackage/ld3;->a:Ljava/lang/Object;

    .line 319
    .line 320
    check-cast v9, Ldefpackage/wq2;

    .line 321
    .line 322
    iget-object v8, v8, Ldefpackage/ld3;->b:Ljava/lang/Object;

    .line 323
    .line 324
    check-cast v8, Ldefpackage/sp2;

    .line 325
    .line 326
    invoke-virtual {v9, v8}, Ldefpackage/wq2;->i(Ldefpackage/sp2;)I

    .line 327
    .line 328
    .line 329
    const/16 v8, 0x101

    .line 330
    .line 331
    invoke-virtual {v6, v8, v9}, Ldefpackage/ri1;->b(ILjava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    goto :goto_a

    .line 335
    :cond_e
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 336
    .line 337
    .line 338
    move-result v2

    .line 339
    move/from16 v7, v18

    .line 340
    .line 341
    :cond_f
    :goto_b
    if-ge v12, v2, :cond_10

    .line 342
    .line 343
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v5

    .line 347
    add-int/lit8 v12, v12, 0x1

    .line 348
    .line 349
    check-cast v5, Ldefpackage/ld3;

    .line 350
    .line 351
    iget-object v8, v5, Ldefpackage/ld3;->a:Ljava/lang/Object;

    .line 352
    .line 353
    check-cast v8, Ldefpackage/wq2;

    .line 354
    .line 355
    iget-object v5, v5, Ldefpackage/ld3;->b:Ljava/lang/Object;

    .line 356
    .line 357
    check-cast v5, Ldefpackage/sp2;

    .line 358
    .line 359
    invoke-virtual {v0, v8, v5}, Ldefpackage/ui1;->n(Ldefpackage/wq2;Ldefpackage/sp2;)I

    .line 360
    .line 361
    .line 362
    move-result v5

    .line 363
    if-eqz v5, :cond_f

    .line 364
    .line 365
    iget-object v5, v0, Ldefpackage/ui1;->c:Ldefpackage/wq2;

    .line 366
    .line 367
    if-ne v8, v5, :cond_f

    .line 368
    .line 369
    move/from16 v7, v16

    .line 370
    .line 371
    goto :goto_b

    .line 372
    :cond_10
    move v12, v7

    .line 373
    move v7, v11

    .line 374
    goto :goto_e

    .line 375
    :goto_c
    if-eqz v2, :cond_11

    .line 376
    .line 377
    new-instance v7, Ljava/lang/StringBuilder;

    .line 378
    .line 379
    const-string v8, "Ignoring invalid provider descriptor: "

    .line 380
    .line 381
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 385
    .line 386
    .line 387
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 388
    .line 389
    .line 390
    move-result-object v2

    .line 391
    goto :goto_d

    .line 392
    :cond_11
    new-instance v2, Ljava/lang/StringBuilder;

    .line 393
    .line 394
    const-string v7, "Ignoring null provider descriptor from "

    .line 395
    .line 396
    invoke-direct {v2, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 397
    .line 398
    .line 399
    iget-object v7, v1, Ldefpackage/vq2;->d:Ldefpackage/om1;

    .line 400
    .line 401
    iget-object v7, v7, Ldefpackage/om1;->o:Ljava/lang/Object;

    .line 402
    .line 403
    check-cast v7, Landroid/content/ComponentName;

    .line 404
    .line 405
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 406
    .line 407
    .line 408
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object v2

    .line 412
    :goto_d
    invoke-static {v5, v2}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 413
    .line 414
    .line 415
    move v7, v12

    .line 416
    :goto_e
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 417
    .line 418
    .line 419
    move-result v2

    .line 420
    add-int/lit8 v2, v2, -0x1

    .line 421
    .line 422
    :goto_f
    if-lt v2, v7, :cond_12

    .line 423
    .line 424
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v5

    .line 428
    check-cast v5, Ldefpackage/wq2;

    .line 429
    .line 430
    const/4 v8, 0x0

    .line 431
    invoke-virtual {v5, v8}, Ldefpackage/wq2;->i(Ldefpackage/sp2;)I

    .line 432
    .line 433
    .line 434
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 435
    .line 436
    .line 437
    add-int/lit8 v2, v2, -0x1

    .line 438
    .line 439
    goto :goto_f

    .line 440
    :cond_12
    invoke-virtual {v0, v12}, Ldefpackage/ui1;->o(Z)V

    .line 441
    .line 442
    .line 443
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 444
    .line 445
    .line 446
    move-result v0

    .line 447
    add-int/lit8 v0, v0, -0x1

    .line 448
    .line 449
    :goto_10
    if-lt v0, v7, :cond_13

    .line 450
    .line 451
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object v2

    .line 455
    check-cast v2, Ldefpackage/wq2;

    .line 456
    .line 457
    const/16 v3, 0x102

    .line 458
    .line 459
    invoke-virtual {v6, v3, v2}, Ldefpackage/ri1;->b(ILjava/lang/Object;)V

    .line 460
    .line 461
    .line 462
    add-int/lit8 v0, v0, -0x1

    .line 463
    .line 464
    goto :goto_10

    .line 465
    :cond_13
    const/16 v0, 0x203

    .line 466
    .line 467
    invoke-virtual {v6, v0, v1}, Ldefpackage/ri1;->b(ILjava/lang/Object;)V

    .line 468
    .line 469
    .line 470
    :cond_14
    return-void
.end method

.method public final n(Ldefpackage/wq2;Ldefpackage/sp2;)I
    .locals 1

    .line 1
    invoke-virtual {p1, p2}, Ldefpackage/wq2;->i(Ldefpackage/sp2;)I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    if-eqz p2, :cond_2

    .line 6
    .line 7
    and-int/lit8 v0, p2, 0x1

    .line 8
    .line 9
    iget-object p0, p0, Ldefpackage/ui1;->a:Ldefpackage/ri1;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/16 v0, 0x103

    .line 14
    .line 15
    invoke-virtual {p0, v0, p1}, Ldefpackage/ri1;->b(ILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    and-int/lit8 v0, p2, 0x2

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    const/16 v0, 0x104

    .line 23
    .line 24
    invoke-virtual {p0, v0, p1}, Ldefpackage/ri1;->b(ILjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    and-int/lit8 v0, p2, 0x4

    .line 28
    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    const/16 v0, 0x105

    .line 32
    .line 33
    invoke-virtual {p0, v0, p1}, Ldefpackage/ri1;->b(ILjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    :cond_2
    return p2
.end method

.method public final o(Z)V
    .locals 10

    .line 1
    iget-object v0, p0, Ldefpackage/ui1;->t:Ldefpackage/wq2;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "AxMediaRouter"

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Ldefpackage/wq2;->f()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    new-instance v0, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v3, "Clearing the default route because it is no longer selectable: "

    .line 17
    .line 18
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget-object v3, p0, Ldefpackage/ui1;->t:Ldefpackage/wq2;

    .line 22
    .line 23
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {v2, v0}, Landroid/util/Ldefpackage/og;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    iput-object v1, p0, Ldefpackage/ui1;->t:Ldefpackage/wq2;

    .line 34
    .line 35
    :cond_0
    iget-object v0, p0, Ldefpackage/ui1;->t:Ldefpackage/wq2;

    .line 36
    .line 37
    iget-object v3, p0, Ldefpackage/ui1;->r:Ldefpackage/vg3;

    .line 38
    .line 39
    iget-object v4, p0, Ldefpackage/ui1;->h:Ljava/util/ArrayList;

    .line 40
    .line 41
    const/4 v5, 0x0

    .line 42
    if-nez v0, :cond_2

    .line 43
    .line 44
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    move v6, v5

    .line 49
    :cond_1
    if-ge v6, v0, :cond_2

    .line 50
    .line 51
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v7

    .line 55
    add-int/lit8 v6, v6, 0x1

    .line 56
    .line 57
    check-cast v7, Ldefpackage/wq2;

    .line 58
    .line 59
    invoke-virtual {v7}, Ldefpackage/wq2;->c()Ldefpackage/qq2;

    .line 60
    .line 61
    .line 62
    move-result-object v8

    .line 63
    if-ne v8, v3, :cond_1

    .line 64
    .line 65
    iget-object v8, v7, Ldefpackage/wq2;->b:Ljava/lang/String;

    .line 66
    .line 67
    const-string v9, "DEFAULT_ROUTE"

    .line 68
    .line 69
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v8

    .line 73
    if-eqz v8, :cond_1

    .line 74
    .line 75
    invoke-virtual {v7}, Ldefpackage/wq2;->f()Z

    .line 76
    .line 77
    .line 78
    move-result v8

    .line 79
    if-eqz v8, :cond_1

    .line 80
    .line 81
    iput-object v7, p0, Ldefpackage/ui1;->t:Ldefpackage/wq2;

    .line 82
    .line 83
    new-instance v0, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    const-string v6, "Found default route: "

    .line 86
    .line 87
    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    iget-object v6, p0, Ldefpackage/ui1;->t:Ldefpackage/wq2;

    .line 91
    .line 92
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-static {v2, v0}, Landroid/util/Ldefpackage/og;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 100
    .line 101
    .line 102
    :cond_2
    iget-object v0, p0, Ldefpackage/ui1;->u:Ldefpackage/wq2;

    .line 103
    .line 104
    if-eqz v0, :cond_3

    .line 105
    .line 106
    invoke-virtual {v0}, Ldefpackage/wq2;->f()Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-nez v0, :cond_3

    .line 111
    .line 112
    new-instance v0, Ljava/lang/StringBuilder;

    .line 113
    .line 114
    const-string v6, "Clearing the bluetooth route because it is no longer selectable: "

    .line 115
    .line 116
    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    iget-object v6, p0, Ldefpackage/ui1;->u:Ldefpackage/wq2;

    .line 120
    .line 121
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-static {v2, v0}, Landroid/util/Ldefpackage/og;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 129
    .line 130
    .line 131
    iput-object v1, p0, Ldefpackage/ui1;->u:Ldefpackage/wq2;

    .line 132
    .line 133
    :cond_3
    iget-object v0, p0, Ldefpackage/ui1;->u:Ldefpackage/wq2;

    .line 134
    .line 135
    if-nez v0, :cond_5

    .line 136
    .line 137
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    move v1, v5

    .line 142
    :cond_4
    if-ge v1, v0, :cond_5

    .line 143
    .line 144
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v6

    .line 148
    add-int/lit8 v1, v1, 0x1

    .line 149
    .line 150
    check-cast v6, Ldefpackage/wq2;

    .line 151
    .line 152
    invoke-virtual {v6}, Ldefpackage/wq2;->c()Ldefpackage/qq2;

    .line 153
    .line 154
    .line 155
    move-result-object v7

    .line 156
    if-ne v7, v3, :cond_4

    .line 157
    .line 158
    const-string v7, "android.media.intent.category.LIVE_AUDIO"

    .line 159
    .line 160
    invoke-virtual {v6, v7}, Ldefpackage/wq2;->l(Ljava/lang/String;)Z

    .line 161
    .line 162
    .line 163
    move-result v7

    .line 164
    if-eqz v7, :cond_4

    .line 165
    .line 166
    const-string v7, "android.media.intent.category.LIVE_VIDEO"

    .line 167
    .line 168
    invoke-virtual {v6, v7}, Ldefpackage/wq2;->l(Ljava/lang/String;)Z

    .line 169
    .line 170
    .line 171
    move-result v7

    .line 172
    if-nez v7, :cond_4

    .line 173
    .line 174
    invoke-virtual {v6}, Ldefpackage/wq2;->f()Z

    .line 175
    .line 176
    .line 177
    move-result v7

    .line 178
    if-eqz v7, :cond_4

    .line 179
    .line 180
    iput-object v6, p0, Ldefpackage/ui1;->u:Ldefpackage/wq2;

    .line 181
    .line 182
    new-instance v0, Ljava/lang/StringBuilder;

    .line 183
    .line 184
    const-string v1, "Found bluetooth route: "

    .line 185
    .line 186
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    iget-object v1, p0, Ldefpackage/ui1;->u:Ldefpackage/wq2;

    .line 190
    .line 191
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    invoke-static {v2, v0}, Landroid/util/Ldefpackage/og;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 199
    .line 200
    .line 201
    :cond_5
    iget-object v0, p0, Ldefpackage/ui1;->c:Ldefpackage/wq2;

    .line 202
    .line 203
    if-eqz v0, :cond_8

    .line 204
    .line 205
    iget-boolean v0, v0, Ldefpackage/wq2;->g:Z

    .line 206
    .line 207
    if-nez v0, :cond_6

    .line 208
    .line 209
    goto :goto_0

    .line 210
    :cond_6
    if-eqz p1, :cond_7

    .line 211
    .line 212
    invoke-virtual {p0}, Ldefpackage/ui1;->h()V

    .line 213
    .line 214
    .line 215
    invoke-virtual {p0}, Ldefpackage/ui1;->l()V

    .line 216
    .line 217
    .line 218
    :cond_7
    return-void

    .line 219
    :cond_8
    :goto_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 220
    .line 221
    const-string v0, "Unselecting the current route because it is no longer selectable: "

    .line 222
    .line 223
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    iget-object v0, p0, Ldefpackage/ui1;->c:Ldefpackage/wq2;

    .line 227
    .line 228
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    invoke-static {v2, p1}, Landroid/util/Ldefpackage/og;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 236
    .line 237
    .line 238
    invoke-virtual {p0}, Ldefpackage/ui1;->c()Ldefpackage/wq2;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    const/4 v0, 0x1

    .line 243
    invoke-virtual {p0, p1, v5, v0}, Ldefpackage/ui1;->j(Ldefpackage/wq2;IZ)V

    .line 244
    .line 245
    .line 246
    return-void
.end method
