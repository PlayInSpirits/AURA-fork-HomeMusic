.class public final Ldefpackage/qr2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lretrofit2/Callback;
.implements Ldefpackage/w04;
.implements Ldefpackage/ce3;
.implements Ldefpackage/cp3;


# static fields
.field public static final q:Ldefpackage/om0;


# instance fields
.field public final synthetic n:I

.field public final o:Ljava/lang/Object;

.field public p:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ldefpackage/om0;

    .line 2
    .line 3
    const/16 v1, 0xe

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ldefpackage/om0;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Ldefpackage/qr2;->q:Ldefpackage/om0;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    iput p1, p0, Ldefpackage/qr2;->n:I

    sparse-switch p1, :sswitch_data_0

    .line 242
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 243
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 244
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Ldefpackage/qr2;->p:Ljava/lang/Object;

    return-void

    .line 245
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 246
    new-instance p1, Ldefpackage/sj0;

    const-wide/16 v0, 0x3e8

    invoke-direct {p1, v0, v1}, Ldefpackage/sj0;-><init>(J)V

    iput-object p1, p0, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 247
    new-instance p1, Ldefpackage/hh3;

    const/16 v0, 0x12

    .line 248
    invoke-direct {p1, v0}, Ldefpackage/hh3;-><init>(I)V

    const/16 v0, 0xa

    .line 249
    invoke-static {v0, p1}, Ldefpackage/s51;->a(ILdefpackage/q51;)Ldefpackage/i61;

    move-result-object p1

    iput-object p1, p0, Ldefpackage/qr2;->p:Ljava/lang/Object;

    return-void

    .line 250
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 251
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 252
    new-instance p1, Ldefpackage/oi;

    const/4 v0, 0x0

    .line 253
    invoke-direct {p1, v0}, Ldefpackage/yd4;-><init>(I)V

    .line 254
    iput-object p1, p0, Ldefpackage/qr2;->p:Ljava/lang/Object;

    return-void

    .line 255
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 256
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ldefpackage/qr2;->o:Ljava/lang/Object;

    return-void

    .line 257
    :sswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 258
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 259
    sget-object p1, Ldefpackage/h40;->b:Ldefpackage/h40;

    iput-object p1, p0, Ldefpackage/qr2;->p:Ljava/lang/Object;

    return-void

    .line 260
    :sswitch_4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 261
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Ldefpackage/qr2;->o:Ljava/lang/Object;

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x6 -> :sswitch_4
        0x8 -> :sswitch_3
        0xa -> :sswitch_2
        0xd -> :sswitch_1
        0x11 -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 241
    iput p1, p0, Ldefpackage/qr2;->n:I

    iput-object p2, p0, Ldefpackage/qr2;->o:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 201
    iput p1, p0, Ldefpackage/qr2;->n:I

    iput-object p2, p0, Ldefpackage/qr2;->p:Ljava/lang/Object;

    iput-object p3, p0, Ldefpackage/qr2;->o:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/view/WindowInsetsAnimation$Bounds;)V
    .locals 1

    const/16 v0, 0x15

    iput v0, p0, Ldefpackage/qr2;->n:I

    .line 236
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 237
    invoke-static {p1}, Ldefpackage/xq2;->A(Landroid/view/WindowInsetsAnimation$Bounds;)Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, Ldefpackage/vz1;->c(Landroid/graphics/Insets;)Ldefpackage/vz1;

    move-result-object v0

    .line 238
    iput-object v0, p0, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 239
    invoke-static {p1}, Ldefpackage/xq2;->h(Landroid/view/WindowInsetsAnimation$Bounds;)Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {p1}, Ldefpackage/vz1;->c(Landroid/graphics/Insets;)Ldefpackage/vz1;

    move-result-object p1

    .line 240
    iput-object p1, p0, Ldefpackage/qr2;->p:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ldefpackage/ba2;Ldefpackage/e75;)V
    .locals 2

    const/16 v0, 0xb

    iput v0, p0, Ldefpackage/qr2;->n:I

    .line 208
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 209
    iput-object p1, p0, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 210
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    sget-object p1, Ldefpackage/sf0;->b:Ldefpackage/sf0;

    .line 212
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    new-instance v0, Ldefpackage/bq4;

    sget-object v1, Ldefpackage/nd2;->d:Ldefpackage/un0;

    invoke-direct {v0, p2, v1, p1}, Ldefpackage/bq4;-><init>(Ldefpackage/e75;Ldefpackage/b75;Ldefpackage/tf0;)V

    .line 214
    const-class p1, Ldefpackage/nd2;

    .line 215
    invoke-static {p1}, Ldefpackage/kx3;->a(Ljava/lang/Class;)Ldefpackage/i30;

    move-result-object p1

    .line 216
    invoke-virtual {p1}, Ldefpackage/i30;->b()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 217
    const-string v1, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    invoke-virtual {v1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 218
    invoke-virtual {v0, p1, p2}, Ldefpackage/bq4;->l(Ldefpackage/i30;Ljava/lang/String;)Ldefpackage/x65;

    move-result-object p1

    .line 219
    check-cast p1, Ldefpackage/nd2;

    .line 220
    iput-object p1, p0, Ldefpackage/qr2;->p:Ljava/lang/Object;

    return-void

    .line 221
    :cond_0
    const-string p0, "Local and anonymous classes can not be ViewModels"

    .line 222
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public constructor <init>(Lcom/eddyizm/tempus/service/MediaService;Ljava/lang/String;Landroid/content/ComponentName;Landroid/app/PendingIntent;Landroid/os/Bundle;)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Ldefpackage/qr2;->n:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-nez v1, :cond_8

    .line 13
    .line 14
    const-string v1, "android.intent.action.MEDIA_BUTTON"

    .line 15
    .line 16
    if-nez p3, :cond_2

    .line 17
    .line 18
    sget p3, Ldefpackage/fu2;->b:I

    .line 19
    .line 20
    new-instance p3, Landroid/content/Intent;

    .line 21
    .line 22
    invoke-direct {p3, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-virtual {p3, v3}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-virtual {v3, p3, v0}, Landroid/content/pm/PackageManager;->queryBroadcastReceivers(Landroid/content/Intent;I)Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object p3

    .line 40
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    const/4 v4, 0x1

    .line 45
    if-ne v3, v4, :cond_1

    .line 46
    .line 47
    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p3

    .line 51
    check-cast p3, Landroid/content/pm/ResolveInfo;

    .line 52
    .line 53
    new-instance v2, Landroid/content/ComponentName;

    .line 54
    .line 55
    iget-object p3, p3, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 56
    .line 57
    iget-object v3, p3, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 58
    .line 59
    iget-object p3, p3, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    .line 60
    .line 61
    invoke-direct {v2, v3, p3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    :cond_0
    :goto_0
    move-object p3, v2

    .line 65
    goto :goto_1

    .line 66
    :cond_1
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 67
    .line 68
    .line 69
    move-result p3

    .line 70
    if-le p3, v4, :cond_0

    .line 71
    .line 72
    const-string p3, "MediaButtonReceiver"

    .line 73
    .line 74
    const-string v3, "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null."

    .line 75
    .line 76
    invoke-static {p3, v3}, Ldefpackage/l93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :goto_1
    if-nez p3, :cond_2

    .line 81
    .line 82
    const-string v2, "MediaSessionCompat"

    .line 83
    .line 84
    const-string v3, "Couldn\'t find a unique registered media button receiver in the given context."

    .line 85
    .line 86
    invoke-static {v2, v3}, Ldefpackage/l93;->K(Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    :cond_2
    if-eqz p3, :cond_4

    .line 90
    .line 91
    if-nez p4, :cond_4

    .line 92
    .line 93
    new-instance p4, Landroid/content/Intent;

    .line 94
    .line 95
    invoke-direct {p4, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p4, p3}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 99
    .line 100
    .line 101
    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 102
    .line 103
    const/16 v1, 0x1f

    .line 104
    .line 105
    if-lt p3, v1, :cond_3

    .line 106
    .line 107
    const/high16 p3, 0x2000000

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_3
    move p3, v0

    .line 111
    :goto_2
    invoke-static {p1, v0, p4, p3}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 112
    .line 113
    .line 114
    move-result-object p4

    .line 115
    :cond_4
    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 116
    .line 117
    const/16 v0, 0x1d

    .line 118
    .line 119
    if-lt p3, v0, :cond_5

    .line 120
    .line 121
    new-instance p3, Ldefpackage/mr2;

    .line 122
    .line 123
    invoke-direct {p3, p1, p2, p5}, Ldefpackage/kr2;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 124
    .line 125
    .line 126
    iput-object p3, p0, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_5
    const/16 v0, 0x1c

    .line 130
    .line 131
    if-lt p3, v0, :cond_6

    .line 132
    .line 133
    new-instance p3, Ldefpackage/lr2;

    .line 134
    .line 135
    invoke-direct {p3, p1, p2, p5}, Ldefpackage/kr2;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 136
    .line 137
    .line 138
    iput-object p3, p0, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_6
    new-instance p3, Ldefpackage/kr2;

    .line 142
    .line 143
    invoke-direct {p3, p1, p2, p5}, Ldefpackage/kr2;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 144
    .line 145
    .line 146
    iput-object p3, p0, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 147
    .line 148
    :goto_3
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 149
    .line 150
    .line 151
    move-result-object p2

    .line 152
    new-instance p3, Landroid/os/Handler;

    .line 153
    .line 154
    if-eqz p2, :cond_7

    .line 155
    .line 156
    goto :goto_4

    .line 157
    :cond_7
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 158
    .line 159
    .line 160
    move-result-object p2

    .line 161
    :goto_4
    invoke-direct {p3, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 162
    .line 163
    .line 164
    new-instance p2, Ldefpackage/hr2;

    .line 165
    .line 166
    invoke-direct {p2}, Ldefpackage/ir2;-><init>()V

    .line 167
    .line 168
    .line 169
    invoke-virtual {p0, p2, p3}, Ldefpackage/qr2;->u(Ldefpackage/ir2;Landroid/os/Handler;)V

    .line 170
    .line 171
    .line 172
    iget-object p2, p0, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast p2, Ldefpackage/kr2;

    .line 175
    .line 176
    iget-object p2, p2, Ldefpackage/kr2;->a:Landroid/media/session/MediaSession;

    .line 177
    .line 178
    invoke-virtual {p2, p4}, Landroid/media/session/MediaSession;->setMediaButtonReceiver(Landroid/app/PendingIntent;)V

    .line 179
    .line 180
    .line 181
    new-instance p2, Ldefpackage/wo0;

    .line 182
    .line 183
    iget-object p3, p0, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast p3, Ldefpackage/kr2;

    .line 186
    .line 187
    iget-object p3, p3, Ldefpackage/kr2;->c:Ldefpackage/pr2;

    .line 188
    .line 189
    invoke-direct {p2, p1, p3}, Ldefpackage/wo0;-><init>(Landroid/content/Context;Ldefpackage/pr2;)V

    .line 190
    .line 191
    .line 192
    iput-object p2, p0, Ldefpackage/qr2;->p:Ljava/lang/Object;

    .line 193
    .line 194
    return-void

    .line 195
    :cond_8
    const-string p0, "tag must not be null or empty"

    .line 196
    .line 197
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    throw v2
.end method

.method public constructor <init>(Ldefpackage/gp3;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ldefpackage/qr2;->n:I

    .line 223
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 224
    iget-object v0, p1, Ldefpackage/gp3;->o:Ljava/lang/Object;

    check-cast v0, Ldefpackage/ky0;

    .line 225
    iput-object v0, p0, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 226
    iget-object p1, p1, Ldefpackage/gp3;->p:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_0

    .line 227
    iput-object p1, p0, Ldefpackage/qr2;->p:Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 1

    const/16 v0, 0xe

    iput v0, p0, Ldefpackage/qr2;->n:I

    .line 203
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldefpackage/qr2;->p:Ljava/lang/Object;

    new-instance p1, Ljava/util/ArrayList;

    .line 204
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ldefpackage/qr2;->o:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V
    .locals 0

    .line 202
    iput p4, p0, Ldefpackage/qr2;->n:I

    iput-object p1, p0, Ldefpackage/qr2;->o:Ljava/lang/Object;

    iput-object p2, p0, Ldefpackage/qr2;->p:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ldefpackage/na;)V
    .locals 1

    const/4 p1, 0x5

    iput p1, p0, Ldefpackage/qr2;->n:I

    .line 205
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 206
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p1, p0, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 207
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Ldefpackage/qr2;->p:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ldefpackage/nh0;)V
    .locals 1

    const/16 v0, 0x13

    iput v0, p0, Ldefpackage/qr2;->n:I

    .line 228
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 229
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldefpackage/qr2;->p:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ldefpackage/u55;)V
    .locals 1

    const/16 v0, 0x14

    iput v0, p0, Ldefpackage/qr2;->n:I

    .line 230
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 231
    iput-object p1, p0, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 232
    new-instance p1, Ldefpackage/vu;

    .line 233
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 234
    iput v0, p1, Ldefpackage/vu;->a:I

    .line 235
    iput-object p1, p0, Ldefpackage/qr2;->p:Ljava/lang/Object;

    return-void
.end method

.method public static b(Ldefpackage/qr2;Ldefpackage/h40;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    iget-object v1, p0, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Ljava/util/Map$Entry;

    .line 32
    .line 33
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    if-nez v2, :cond_1

    .line 38
    .line 39
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, Ljava/util/List;

    .line 44
    .line 45
    invoke-static {p1, v1}, Ldefpackage/qr2;->f(Ldefpackage/h40;Ljava/util/List;)Ldefpackage/h40;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    iget-object v3, p0, Ldefpackage/qr2;->p:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v3, Ldefpackage/h40;

    .line 52
    .line 53
    invoke-static {v3, v1}, Ldefpackage/qr2;->f(Ldefpackage/h40;Ljava/util/List;)Ldefpackage/h40;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v2, v1}, Ldefpackage/h40;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_0

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    const/4 p0, 0x0

    .line 65
    throw p0

    .line 66
    :cond_1
    invoke-static {}, Ldefpackage/kf2;->k()V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_2
    iput-object p1, p0, Ldefpackage/qr2;->p:Ljava/lang/Object;

    .line 71
    .line 72
    return-void
.end method

.method public static f(Ldefpackage/h40;Ljava/util/List;)Ldefpackage/h40;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    iget-object p0, p0, Ldefpackage/h40;->a:Ljava/util/Map;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Ljava/util/HashSet;

    .line 12
    .line 13
    invoke-direct {v1, p1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v1, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-nez v2, :cond_0

    .line 41
    .line 42
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    new-instance p0, Ldefpackage/h40;

    .line 47
    .line 48
    invoke-direct {p0, v0}, Ldefpackage/h40;-><init>(Ljava/util/HashMap;)V

    .line 49
    .line 50
    .line 51
    return-object p0
.end method


# virtual methods
.method public a(Landroid/net/Uri;Ldefpackage/gi0;)Ldefpackage/dn1;
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/ce3;

    .line 4
    .line 5
    invoke-interface {v0, p1, p2}, Ldefpackage/ce3;->a(Landroid/net/Uri;Ldefpackage/gi0;)Ldefpackage/dn1;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object p0, p0, Ldefpackage/qr2;->p:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Ljava/util/List;

    .line 12
    .line 13
    if-eqz p0, :cond_1

    .line 14
    .line 15
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-eqz p2, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {p1, p0}, Ldefpackage/dn1;->a(Ljava/util/List;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, Ldefpackage/dn1;

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_1
    :goto_0
    return-object p1
.end method

.method public c(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "="

    .line 6
    .line 7
    invoke-static {p2, v0, p1}, Ldefpackage/b11;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object p0, p0, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public d()Z
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Ldefpackage/qr2;->p:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 7
    .line 8
    .line 9
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    monitor-exit p0

    .line 13
    const/4 p0, 0x0

    .line 14
    return p0

    .line 15
    :cond_0
    :try_start_1
    iget-object v0, p0, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    .line 21
    .line 22
    monitor-exit p0

    .line 23
    const/4 p0, 0x1

    .line 24
    return p0

    .line 25
    :catchall_0
    move-exception v0

    .line 26
    monitor-exit p0

    .line 27
    throw v0
.end method

.method public e(Ldefpackage/rc5;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/qr2;->p:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object p0, p0, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, Ldefpackage/nh0;

    .line 7
    .line 8
    iget-object p0, p0, Ldefpackage/nh0;->a:Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    invoke-interface {p0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    monitor-exit v0

    .line 15
    return p0

    .line 16
    :catchall_0
    move-exception p0

    .line 17
    monitor-exit v0

    .line 18
    throw p0
.end method

.method public g(Ljava/lang/String;Ljava/io/PrintWriter;)V
    .locals 10

    .line 1
    iget-object p0, p0, Ldefpackage/qr2;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/nd2;

    .line 4
    .line 5
    iget-object v0, p0, Ldefpackage/nd2;->b:Ldefpackage/mj4;

    .line 6
    .line 7
    invoke-virtual {v0}, Ldefpackage/mj4;->e()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-lez v0, :cond_7

    .line 12
    .line 13
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "Loaders:"

    .line 17
    .line 18
    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "    "

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const/4 v1, 0x0

    .line 28
    move v2, v1

    .line 29
    :goto_0
    iget-object v3, p0, Ldefpackage/nd2;->b:Ldefpackage/mj4;

    .line 30
    .line 31
    invoke-virtual {v3}, Ldefpackage/mj4;->e()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-ge v2, v3, :cond_7

    .line 36
    .line 37
    iget-object v3, p0, Ldefpackage/nd2;->b:Ldefpackage/mj4;

    .line 38
    .line 39
    invoke-virtual {v3, v2}, Ldefpackage/mj4;->f(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    check-cast v3, Ldefpackage/ld2;

    .line 44
    .line 45
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const-string v4, "  #"

    .line 49
    .line 50
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    iget-object v4, p0, Ldefpackage/nd2;->b:Ldefpackage/mj4;

    .line 54
    .line 55
    invoke-virtual {v4, v2}, Ldefpackage/mj4;->c(I)I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(I)V

    .line 60
    .line 61
    .line 62
    const-string v4, ": "

    .line 63
    .line 64
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v3}, Ldefpackage/ld2;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    const-string v4, "mId="

    .line 78
    .line 79
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->print(I)V

    .line 83
    .line 84
    .line 85
    const-string v5, " mArgs="

    .line 86
    .line 87
    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    const/4 v5, 0x0

    .line 91
    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    const-string v5, "mLoader="

    .line 98
    .line 99
    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    iget-object v5, v3, Ldefpackage/ld2;->l:Ldefpackage/og5;

    .line 103
    .line 104
    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    iget-object v5, v3, Ldefpackage/ld2;->l:Ldefpackage/og5;

    .line 108
    .line 109
    const-string v6, "  "

    .line 110
    .line 111
    invoke-virtual {v0, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v7

    .line 115
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    invoke-virtual {p2, v7}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->print(I)V

    .line 125
    .line 126
    .line 127
    const-string v4, " mListener="

    .line 128
    .line 129
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    iget-object v4, v5, Ldefpackage/og5;->a:Ldefpackage/ld2;

    .line 133
    .line 134
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    iget-boolean v4, v5, Ldefpackage/og5;->b:Z

    .line 138
    .line 139
    const-string v8, "mStarted="

    .line 140
    .line 141
    if-nez v4, :cond_0

    .line 142
    .line 143
    iget-boolean v4, v5, Ldefpackage/og5;->e:Z

    .line 144
    .line 145
    if-nez v4, :cond_0

    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_0
    invoke-virtual {p2, v7}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p2, v8}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    iget-boolean v4, v5, Ldefpackage/og5;->b:Z

    .line 155
    .line 156
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Z)V

    .line 157
    .line 158
    .line 159
    const-string v4, " mContentChanged="

    .line 160
    .line 161
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    iget-boolean v4, v5, Ldefpackage/og5;->e:Z

    .line 165
    .line 166
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Z)V

    .line 167
    .line 168
    .line 169
    const-string v4, " mProcessingChange="

    .line 170
    .line 171
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->println(Z)V

    .line 175
    .line 176
    .line 177
    :goto_1
    iget-boolean v4, v5, Ldefpackage/og5;->c:Z

    .line 178
    .line 179
    if-nez v4, :cond_1

    .line 180
    .line 181
    iget-boolean v4, v5, Ldefpackage/og5;->d:Z

    .line 182
    .line 183
    if-eqz v4, :cond_2

    .line 184
    .line 185
    :cond_1
    invoke-virtual {p2, v7}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    const-string v4, "mAbandoned="

    .line 189
    .line 190
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    iget-boolean v4, v5, Ldefpackage/og5;->c:Z

    .line 194
    .line 195
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Z)V

    .line 196
    .line 197
    .line 198
    const-string v4, " mReset="

    .line 199
    .line 200
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    iget-boolean v4, v5, Ldefpackage/og5;->d:Z

    .line 204
    .line 205
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->println(Z)V

    .line 206
    .line 207
    .line 208
    :cond_2
    iget-object v4, v5, Ldefpackage/og5;->g:Ldefpackage/qk;

    .line 209
    .line 210
    const-string v9, " waiting="

    .line 211
    .line 212
    if-eqz v4, :cond_3

    .line 213
    .line 214
    invoke-virtual {p2, v7}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    const-string v4, "mTask="

    .line 218
    .line 219
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    iget-object v4, v5, Ldefpackage/og5;->g:Ldefpackage/qk;

    .line 223
    .line 224
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {p2, v9}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    iget-object v4, v5, Ldefpackage/og5;->g:Ldefpackage/qk;

    .line 231
    .line 232
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->println(Z)V

    .line 236
    .line 237
    .line 238
    :cond_3
    iget-object v4, v5, Ldefpackage/og5;->h:Ldefpackage/qk;

    .line 239
    .line 240
    if-eqz v4, :cond_4

    .line 241
    .line 242
    invoke-virtual {p2, v7}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    const-string v4, "mCancellingTask="

    .line 246
    .line 247
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    iget-object v4, v5, Ldefpackage/og5;->h:Ldefpackage/qk;

    .line 251
    .line 252
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {p2, v9}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    iget-object v4, v5, Ldefpackage/og5;->h:Ldefpackage/qk;

    .line 259
    .line 260
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->println(Z)V

    .line 264
    .line 265
    .line 266
    :cond_4
    iget-object v4, v3, Ldefpackage/ld2;->n:Ldefpackage/md2;

    .line 267
    .line 268
    if-eqz v4, :cond_5

    .line 269
    .line 270
    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    const-string v4, "mCallbacks="

    .line 274
    .line 275
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    iget-object v4, v3, Ldefpackage/ld2;->n:Ldefpackage/md2;

    .line 279
    .line 280
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    iget-object v4, v3, Ldefpackage/ld2;->n:Ldefpackage/md2;

    .line 284
    .line 285
    invoke-virtual {v0, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v5

    .line 289
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    const-string v5, "mDeliveredData="

    .line 296
    .line 297
    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    iget-boolean v4, v4, Ldefpackage/md2;->b:Z

    .line 301
    .line 302
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->println(Z)V

    .line 303
    .line 304
    .line 305
    :cond_5
    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    const-string v4, "mData="

    .line 309
    .line 310
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    iget-object v4, v3, Ldefpackage/ld2;->l:Ldefpackage/og5;

    .line 314
    .line 315
    invoke-virtual {v3}, Ldefpackage/ad2;->d()Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v5

    .line 319
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 320
    .line 321
    .line 322
    new-instance v4, Ljava/lang/StringBuilder;

    .line 323
    .line 324
    const/16 v6, 0x40

    .line 325
    .line 326
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 327
    .line 328
    .line 329
    invoke-static {v5, v4}, Ldefpackage/gh0;->c(Ljava/lang/Object;Ljava/lang/StringBuilder;)V

    .line 330
    .line 331
    .line 332
    const-string v5, "}"

    .line 333
    .line 334
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v4

    .line 341
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {p2, v8}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    iget v3, v3, Ldefpackage/ad2;->c:I

    .line 351
    .line 352
    if-lez v3, :cond_6

    .line 353
    .line 354
    const/4 v3, 0x1

    .line 355
    goto :goto_2

    .line 356
    :cond_6
    move v3, v1

    .line 357
    :goto_2
    invoke-virtual {p2, v3}, Ljava/io/PrintWriter;->println(Z)V

    .line 358
    .line 359
    .line 360
    add-int/lit8 v2, v2, 0x1

    .line 361
    .line 362
    goto/16 :goto_0

    .line 363
    .line 364
    :cond_7
    return-void
.end method

.method public h(IIII)Landroid/view/View;
    .locals 8

    .line 1
    iget-object v0, p0, Ldefpackage/qr2;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/vu;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ldefpackage/u55;

    .line 8
    .line 9
    invoke-interface {p0}, Ldefpackage/u55;->d()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-interface {p0}, Ldefpackage/u55;->k()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-le p2, p1, :cond_0

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v3, -0x1

    .line 22
    :goto_0
    const/4 v4, 0x0

    .line 23
    :goto_1
    if-eq p1, p2, :cond_3

    .line 24
    .line 25
    invoke-interface {p0, p1}, Ldefpackage/u55;->q(I)Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    invoke-interface {p0, v5}, Ldefpackage/u55;->a(Landroid/view/View;)I

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    invoke-interface {p0, v5}, Ldefpackage/u55;->r(Landroid/view/View;)I

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    iput v1, v0, Ldefpackage/vu;->b:I

    .line 38
    .line 39
    iput v2, v0, Ldefpackage/vu;->c:I

    .line 40
    .line 41
    iput v6, v0, Ldefpackage/vu;->d:I

    .line 42
    .line 43
    iput v7, v0, Ldefpackage/vu;->e:I

    .line 44
    .line 45
    if-eqz p3, :cond_1

    .line 46
    .line 47
    iput p3, v0, Ldefpackage/vu;->a:I

    .line 48
    .line 49
    invoke-virtual {v0}, Ldefpackage/vu;->a()Z

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    if-eqz v6, :cond_1

    .line 54
    .line 55
    return-object v5

    .line 56
    :cond_1
    if-eqz p4, :cond_2

    .line 57
    .line 58
    iput p4, v0, Ldefpackage/vu;->a:I

    .line 59
    .line 60
    invoke-virtual {v0}, Ldefpackage/vu;->a()Z

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    if-eqz v6, :cond_2

    .line 65
    .line 66
    move-object v4, v5

    .line 67
    :cond_2
    add-int/2addr p1, v3

    .line 68
    goto :goto_1

    .line 69
    :cond_3
    return-object v4
.end method

.method public i(Ljava/lang/Object;Ljava/io/File;Ldefpackage/db3;)Z
    .locals 2

    .line 1
    check-cast p1, Ldefpackage/q04;

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/qr2;->p:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ldefpackage/ss;

    .line 6
    .line 7
    new-instance v1, Ldefpackage/at;

    .line 8
    .line 9
    invoke-interface {p1}, Ldefpackage/q04;->get()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Landroid/graphics/drawable/BitmapDrawable;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget-object p0, p0, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, Ldefpackage/zs;

    .line 22
    .line 23
    invoke-direct {v1, p0, p1}, Ldefpackage/at;-><init>(Ldefpackage/zs;Landroid/graphics/Bitmap;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1, p2, p3}, Ldefpackage/ss;->i(Ljava/lang/Object;Ljava/io/File;Ldefpackage/db3;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    return p0
.end method

.method public j(Landroidx/preference/Preference;)V
    .locals 1

    .line 1
    iget-object p1, p0, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Landroidx/preference/PreferenceGroup;

    .line 4
    .line 5
    const v0, 0x7fffffff

    .line 6
    .line 7
    .line 8
    iput v0, p1, Landroidx/preference/PreferenceGroup;->h0:I

    .line 9
    .line 10
    iget-object p0, p0, Ldefpackage/qr2;->p:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Ldefpackage/np3;

    .line 13
    .line 14
    iget-object p1, p0, Ldefpackage/np3;->u:Landroid/os/Handler;

    .line 15
    .line 16
    iget-object p0, p0, Ldefpackage/np3;->v:Ldefpackage/g5;

    .line 17
    .line 18
    invoke-virtual {p1, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public k()Landroid/view/autofill/AutofillManager;
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/qr2;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/autofill/AutofillManager;

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Landroid/content/Context;

    .line 10
    .line 11
    invoke-static {}, Ldefpackage/gm0;->l()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, Ldefpackage/gm0;->j(Ljava/lang/Object;)Landroid/view/autofill/AutofillManager;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iput-object v0, p0, Ldefpackage/qr2;->p:Ljava/lang/Object;

    .line 26
    .line 27
    return-object v0

    .line 28
    :cond_0
    const-string p0, "Could not locate AutofillManager from context"

    .line 29
    .line 30
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    return-object p0

    .line 35
    :cond_1
    return-object v0
.end method

.method public l(Ldefpackage/db3;)I
    .locals 0

    .line 1
    const/4 p0, 0x2

    .line 2
    return p0
.end method

.method public m(Ldefpackage/f42;)Ljava/lang/String;
    .locals 8

    .line 1
    iget-object v0, p0, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/sj0;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Ldefpackage/sj0;

    .line 9
    .line 10
    invoke-virtual {v1, p1}, Ldefpackage/sj0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Ljava/lang/String;

    .line 15
    .line 16
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Ldefpackage/qr2;->p:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Ldefpackage/i61;

    .line 22
    .line 23
    invoke-virtual {v0}, Ldefpackage/i61;->b()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Ldefpackage/j44;

    .line 28
    .line 29
    :try_start_1
    iget-object v1, v0, Ldefpackage/j44;->n:Ljava/security/MessageDigest;

    .line 30
    .line 31
    invoke-interface {p1, v1}, Ldefpackage/f42;->b(Ljava/security/MessageDigest;)V

    .line 32
    .line 33
    .line 34
    iget-object v1, v0, Ldefpackage/j44;->n:Ljava/security/MessageDigest;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/security/MessageDigest;->digest()[B

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    sget-object v2, Ldefpackage/e35;->b:[C

    .line 41
    .line 42
    monitor-enter v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 43
    const/4 v3, 0x0

    .line 44
    :goto_0
    :try_start_2
    array-length v4, v1

    .line 45
    if-ge v3, v4, :cond_0

    .line 46
    .line 47
    aget-byte v4, v1, v3

    .line 48
    .line 49
    and-int/lit16 v5, v4, 0xff

    .line 50
    .line 51
    mul-int/lit8 v6, v3, 0x2

    .line 52
    .line 53
    sget-object v7, Ldefpackage/e35;->a:[C

    .line 54
    .line 55
    ushr-int/lit8 v5, v5, 0x4

    .line 56
    .line 57
    aget-char v5, v7, v5

    .line 58
    .line 59
    aput-char v5, v2, v6

    .line 60
    .line 61
    add-int/lit8 v6, v6, 0x1

    .line 62
    .line 63
    and-int/lit8 v4, v4, 0xf

    .line 64
    .line 65
    aget-char v4, v7, v4

    .line 66
    .line 67
    aput-char v4, v2, v6

    .line 68
    .line 69
    add-int/lit8 v3, v3, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    new-instance v1, Ljava/lang/String;

    .line 73
    .line 74
    invoke-direct {v1, v2}, Ljava/lang/String;-><init>([C)V

    .line 75
    .line 76
    .line 77
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 78
    iget-object v2, p0, Ldefpackage/qr2;->p:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v2, Ldefpackage/i61;

    .line 81
    .line 82
    invoke-virtual {v2, v0}, Ldefpackage/i61;->a(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :catchall_0
    move-exception p1

    .line 87
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 88
    :try_start_4
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 89
    :catchall_1
    move-exception p1

    .line 90
    iget-object p0, p0, Ldefpackage/qr2;->p:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast p0, Ldefpackage/i61;

    .line 93
    .line 94
    invoke-virtual {p0, v0}, Ldefpackage/i61;->a(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    throw p1

    .line 98
    :cond_1
    :goto_1
    iget-object v0, p0, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 99
    .line 100
    move-object v2, v0

    .line 101
    check-cast v2, Ldefpackage/sj0;

    .line 102
    .line 103
    monitor-enter v2

    .line 104
    :try_start_5
    iget-object p0, p0, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast p0, Ldefpackage/sj0;

    .line 107
    .line 108
    invoke-virtual {p0, p1, v1}, Ldefpackage/sj0;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    monitor-exit v2

    .line 112
    return-object v1

    .line 113
    :catchall_2
    move-exception p0

    .line 114
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 115
    throw p0

    .line 116
    :catchall_3
    move-exception p0

    .line 117
    :try_start_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 118
    throw p0
.end method

.method public declared-synchronized n()Ljava/util/Map;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Ldefpackage/qr2;->p:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Ljava/util/Map;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Ljava/util/HashMap;

    .line 9
    .line 10
    iget-object v1, p0, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Ldefpackage/qr2;->p:Ljava/lang/Object;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    :goto_0
    iget-object v0, p0, Ldefpackage/qr2;->p:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Ljava/util/Map;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    monitor-exit p0

    .line 31
    return-object v0

    .line 32
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    throw v0
.end method

.method public o(Landroid/view/View;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/qr2;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/vu;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ldefpackage/u55;

    .line 8
    .line 9
    invoke-interface {p0}, Ldefpackage/u55;->d()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-interface {p0}, Ldefpackage/u55;->k()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-interface {p0, p1}, Ldefpackage/u55;->a(Landroid/view/View;)I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    invoke-interface {p0, p1}, Ldefpackage/u55;->r(Landroid/view/View;)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    iput v1, v0, Ldefpackage/vu;->b:I

    .line 26
    .line 27
    iput v2, v0, Ldefpackage/vu;->c:I

    .line 28
    .line 29
    iput v3, v0, Ldefpackage/vu;->d:I

    .line 30
    .line 31
    iput p0, v0, Ldefpackage/vu;->e:I

    .line 32
    .line 33
    const/16 p0, 0x6003

    .line 34
    .line 35
    iput p0, v0, Ldefpackage/vu;->a:I

    .line 36
    .line 37
    invoke-virtual {v0}, Ldefpackage/vu;->a()Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    return p0
.end method

.method public onFailure(Lretrofit2/Call;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget p1, p0, Ldefpackage/qr2;->n:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iget-object v1, p0, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 5
    .line 6
    sparse-switch p1, :sswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast v1, Ldefpackage/k03;

    .line 10
    .line 11
    new-instance p0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, p0}, Ldefpackage/ad2;->i(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :sswitch_0
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 21
    .line 22
    .line 23
    check-cast v1, Ldefpackage/k03;

    .line 24
    .line 25
    iget-object p0, p0, Ldefpackage/qr2;->p:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {p0, v0}, Ldefpackage/kb4;->s(Ljava/lang/String;Lcom/eddyizm/tempus/subsonic/models/Directory;)Lcom/eddyizm/tempus/subsonic/models/Directory;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {v1, p0}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :sswitch_1
    check-cast v1, Ldefpackage/k03;

    .line 38
    .line 39
    new-instance p1, Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-static {v0}, Ldefpackage/kb4;->h(Ljava/util/ArrayList;)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 46
    .line 47
    .line 48
    invoke-static {p1}, Ljava/util/Collections;->shuffle(Ljava/util/List;)V

    .line 49
    .line 50
    .line 51
    iget-object p0, p0, Ldefpackage/qr2;->p:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p0, Ldefpackage/pa;

    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    const/16 v0, 0xa

    .line 60
    .line 61
    div-int/2addr p2, v0

    .line 62
    if-lez p2, :cond_0

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    :goto_0
    const/4 p2, 0x0

    .line 70
    invoke-virtual {p1, p2, v0}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {p0, p1, v1}, Ldefpackage/pa;->x(Ljava/util/List;Ldefpackage/k03;)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    nop

    .line 79
    :sswitch_data_0
    .sparse-switch
        0x3 -> :sswitch_1
        0x7 -> :sswitch_0
    .end sparse-switch
.end method

.method public onResponse(Lretrofit2/Call;Lretrofit2/Response;)V
    .locals 3

    .line 1
    iget v0, p0, Ldefpackage/qr2;->n:I

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 4
    .line 5
    sparse-switch v0, :sswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast v1, Ldefpackage/k03;

    .line 9
    .line 10
    iget-object p0, p0, Ldefpackage/qr2;->p:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Ldefpackage/xi4;

    .line 13
    .line 14
    const-string p1, "similarSongs"

    .line 15
    .line 16
    invoke-static {p0, p2, p1}, Ldefpackage/xi4;->h(Ldefpackage/xi4;Lretrofit2/Response;Ljava/lang/String;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {v1, p0}, Ldefpackage/ad2;->i(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :sswitch_0
    check-cast v1, Ldefpackage/k03;

    .line 25
    .line 26
    iget-object p0, p0, Ldefpackage/qr2;->p:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p0, Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {p2}, Lretrofit2/Response;->isSuccessful()Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_0

    .line 35
    .line 36
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    if-eqz p1, :cond_0

    .line 41
    .line 42
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    check-cast p1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 47
    .line 48
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getDirectory()Lcom/eddyizm/tempus/subsonic/models/Directory;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    goto :goto_0

    .line 57
    :cond_0
    const/4 p1, 0x0

    .line 58
    :goto_0
    invoke-static {p0, p1}, Ldefpackage/kb4;->s(Ljava/lang/String;Lcom/eddyizm/tempus/subsonic/models/Directory;)Lcom/eddyizm/tempus/subsonic/models/Directory;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {v1, p0}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :sswitch_1
    check-cast v1, Ldefpackage/k03;

    .line 67
    .line 68
    invoke-virtual {p2}, Lretrofit2/Response;->isSuccessful()Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_4

    .line 73
    .line 74
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    if-eqz v0, :cond_4

    .line 79
    .line 80
    new-instance p1, Ljava/util/ArrayList;

    .line 81
    .line 82
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    check-cast v0, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 90
    .line 91
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getArtists()Lcom/eddyizm/tempus/subsonic/models/ArtistsID3;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    if-eqz v0, :cond_2

    .line 100
    .line 101
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    check-cast v0, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 106
    .line 107
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getArtists()Lcom/eddyizm/tempus/subsonic/models/ArtistsID3;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/ArtistsID3;->getIndices()Ljava/util/List;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    if-eqz v0, :cond_2

    .line 120
    .line 121
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p2

    .line 125
    check-cast p2, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 126
    .line 127
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 128
    .line 129
    .line 130
    move-result-object p2

    .line 131
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getArtists()Lcom/eddyizm/tempus/subsonic/models/ArtistsID3;

    .line 132
    .line 133
    .line 134
    move-result-object p2

    .line 135
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/ArtistsID3;->getIndices()Ljava/util/List;

    .line 136
    .line 137
    .line 138
    move-result-object p2

    .line 139
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    :cond_1
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    if-eqz v0, :cond_2

    .line 148
    .line 149
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    check-cast v0, Lcom/eddyizm/tempus/subsonic/models/IndexID3;

    .line 154
    .line 155
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/IndexID3;->getArtists()Ljava/util/List;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    if-eqz v2, :cond_1

    .line 160
    .line 161
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/IndexID3;->getArtists()Ljava/util/List;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 166
    .line 167
    .line 168
    goto :goto_1

    .line 169
    :cond_2
    new-instance p2, Ljava/util/ArrayList;

    .line 170
    .line 171
    invoke-static {p1}, Ldefpackage/kb4;->h(Ljava/util/ArrayList;)Ljava/util/List;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    invoke-direct {p2, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 176
    .line 177
    .line 178
    invoke-static {p2}, Ljava/util/Collections;->shuffle(Ljava/util/List;)V

    .line 179
    .line 180
    .line 181
    iget-object p0, p0, Ldefpackage/qr2;->p:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast p0, Ldefpackage/pa;

    .line 184
    .line 185
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 186
    .line 187
    .line 188
    move-result p1

    .line 189
    const/16 v0, 0xa

    .line 190
    .line 191
    div-int/2addr p1, v0

    .line 192
    if-lez p1, :cond_3

    .line 193
    .line 194
    goto :goto_2

    .line 195
    :cond_3
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    :goto_2
    const/4 p1, 0x0

    .line 200
    invoke-virtual {p2, p1, v0}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    invoke-virtual {p0, p1, v1}, Ldefpackage/pa;->x(Ljava/util/List;Ldefpackage/k03;)V

    .line 205
    .line 206
    .line 207
    goto :goto_3

    .line 208
    :cond_4
    new-instance v0, Ljava/lang/Exception;

    .line 209
    .line 210
    new-instance v1, Ljava/lang/StringBuilder;

    .line 211
    .line 212
    const-string v2, "HTTP "

    .line 213
    .line 214
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {p2}, Lretrofit2/Response;->code()I

    .line 218
    .line 219
    .line 220
    move-result p2

    .line 221
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object p2

    .line 228
    invoke-direct {v0, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {p0, p1, v0}, Ldefpackage/qr2;->onFailure(Lretrofit2/Call;Ljava/lang/Throwable;)V

    .line 232
    .line 233
    .line 234
    :goto_3
    return-void

    .line 235
    :sswitch_data_0
    .sparse-switch
        0x3 -> :sswitch_1
        0x7 -> :sswitch_0
    .end sparse-switch
.end method

.method public p(Landroid/view/View;IZ)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1b

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Ldefpackage/qr2;->k()Landroid/view/autofill/AutofillManager;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0, p1, p2, p3}, Ldefpackage/un;->b(Landroid/view/autofill/AutofillManager;Landroid/view/View;IZ)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public q(Ljava/lang/Exception;Z)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Ldefpackage/qr2;->p:Ljava/lang/Object;

    .line 3
    .line 4
    iget-object p0, p0, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, Ljava/util/HashSet;

    .line 7
    .line 8
    invoke-static {p0}, Ldefpackage/yw1;->k(Ljava/util/Collection;)Ldefpackage/yw1;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p0}, Ljava/util/HashSet;->clear()V

    .line 13
    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    invoke-virtual {v0, p0}, Ldefpackage/yw1;->m(I)Ldefpackage/vw1;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    :goto_0
    invoke-virtual {p0}, Ldefpackage/v0;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0}, Ldefpackage/v0;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Ldefpackage/ik0;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    if-eqz p2, :cond_0

    .line 36
    .line 37
    const/4 v1, 0x1

    .line 38
    goto :goto_1

    .line 39
    :cond_0
    const/4 v1, 0x3

    .line 40
    :goto_1
    invoke-virtual {v0, p1, v1}, Ldefpackage/ik0;->k(Ljava/lang/Throwable;I)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    return-void
.end method

.method public r(Ldefpackage/ik0;)V
    .locals 7

    .line 1
    iget-object v0, p0, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashSet;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Ldefpackage/qr2;->p:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ldefpackage/ik0;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iput-object p1, p0, Ldefpackage/qr2;->p:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object p0, p1, Ldefpackage/ik0;->b:Ldefpackage/m31;

    .line 18
    .line 19
    invoke-interface {p0}, Ldefpackage/m31;->p()Ldefpackage/l31;

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    iput-object v6, p1, Ldefpackage/ik0;->z:Ldefpackage/l31;

    .line 24
    .line 25
    iget-object p0, p1, Ldefpackage/ik0;->s:Ldefpackage/gk0;

    .line 26
    .line 27
    sget-object p1, Ldefpackage/f35;->a:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    new-instance v0, Ldefpackage/hk0;

    .line 36
    .line 37
    sget-object p1, Ldefpackage/ed2;->g:Ljava/util/concurrent/atomic/AtomicLong;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    .line 40
    .line 41
    .line 42
    move-result-wide v1

    .line 43
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 44
    .line 45
    .line 46
    move-result-wide v4

    .line 47
    const/4 v3, 0x1

    .line 48
    invoke-direct/range {v0 .. v6}, Ldefpackage/hk0;-><init>(JZJLjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, v3, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {p0}, Landroid/os/Message;->sendToTarget()V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public s(Ldefpackage/rc5;)Ldefpackage/gl4;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ldefpackage/qr2;->p:Ljava/lang/Object;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    iget-object p0, p0, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Ldefpackage/nh0;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Ldefpackage/nh0;->b(Ldefpackage/rc5;)Ldefpackage/gl4;

    .line 12
    .line 13
    .line 14
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    monitor-exit v0

    .line 16
    return-object p0

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    monitor-exit v0

    .line 19
    throw p0
.end method

.method public t(Ljava/lang/String;)Ljava/util/List;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ldefpackage/qr2;->p:Ljava/lang/Object;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    iget-object p0, p0, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Ldefpackage/nh0;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Ldefpackage/nh0;->c(Ljava/lang/String;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    monitor-exit v0

    .line 16
    return-object p0

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    monitor-exit v0

    .line 19
    throw p0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget v0, p0, Ldefpackage/qr2;->n:I

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 4
    .line 5
    sparse-switch v0, :sswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :sswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v2, "Bounds{lower="

    .line 16
    .line 17
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    check-cast v1, Ldefpackage/vz1;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v1, " upper="

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object p0, p0, Ldefpackage/qr2;->p:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p0, Ldefpackage/vz1;

    .line 33
    .line 34
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string p0, "}"

    .line 38
    .line 39
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :sswitch_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    const/16 v2, 0x64

    .line 50
    .line 51
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 52
    .line 53
    .line 54
    iget-object p0, p0, Ldefpackage/qr2;->p:Ljava/lang/Object;

    .line 55
    .line 56
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const/16 p0, 0x7b

    .line 68
    .line 69
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    check-cast v1, Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    const/4 v2, 0x0

    .line 79
    :goto_0
    if-ge v2, p0, :cond_1

    .line 80
    .line 81
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    check-cast v3, Ljava/lang/String;

    .line 86
    .line 87
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    add-int/lit8 v3, p0, -0x1

    .line 91
    .line 92
    if-ge v2, v3, :cond_0

    .line 93
    .line 94
    const-string v3, ", "

    .line 95
    .line 96
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_1
    const/16 p0, 0x7d

    .line 103
    .line 104
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    return-object p0

    .line 112
    :sswitch_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 113
    .line 114
    const/16 v2, 0x80

    .line 115
    .line 116
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 117
    .line 118
    .line 119
    const-string v2, "LoaderManager{"

    .line 120
    .line 121
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 125
    .line 126
    .line 127
    move-result p0

    .line 128
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    const-string p0, " in "

    .line 136
    .line 137
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    check-cast v1, Ldefpackage/ba2;

    .line 141
    .line 142
    invoke-static {v1, v0}, Ldefpackage/gh0;->c(Ljava/lang/Object;Ljava/lang/StringBuilder;)V

    .line 143
    .line 144
    .line 145
    const-string p0, "}}"

    .line 146
    .line 147
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    return-object p0

    .line 155
    :sswitch_data_0
    .sparse-switch
        0xb -> :sswitch_2
        0xe -> :sswitch_1
        0x15 -> :sswitch_0
    .end sparse-switch
.end method

.method public u(Ldefpackage/ir2;Landroid/os/Handler;)V
    .locals 3

    .line 1
    iget-object p0, p0, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/kr2;

    .line 4
    .line 5
    iget-object v0, p0, Ldefpackage/kr2;->d:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iput-object p1, p0, Ldefpackage/kr2;->l:Ldefpackage/ir2;

    .line 9
    .line 10
    iget-object v1, p0, Ldefpackage/kr2;->a:Landroid/media/session/MediaSession;

    .line 11
    .line 12
    iget-object v2, p1, Ldefpackage/ir2;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Ldefpackage/y52;

    .line 15
    .line 16
    invoke-virtual {v1, v2, p2}, Landroid/media/session/MediaSession;->setCallback(Landroid/media/session/MediaSession$Callback;Landroid/os/Handler;)V

    .line 17
    .line 18
    .line 19
    iget-object v1, p1, Ldefpackage/ir2;->b:Ljava/lang/Object;

    .line 20
    .line 21
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 22
    :try_start_1
    new-instance v2, Ljava/lang/ref/WeakReference;

    .line 23
    .line 24
    invoke-direct {v2, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iput-object v2, p1, Ldefpackage/ir2;->d:Ljava/lang/Object;

    .line 28
    .line 29
    iget-object p0, p1, Ldefpackage/ir2;->e:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p0, Ldefpackage/zk;

    .line 32
    .line 33
    if-eqz p0, :cond_0

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    invoke-virtual {p0, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception p0

    .line 41
    goto :goto_1

    .line 42
    :cond_0
    :goto_0
    new-instance p0, Ldefpackage/zk;

    .line 43
    .line 44
    invoke-virtual {p2}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    const/16 v2, 0x9

    .line 49
    .line 50
    invoke-direct {p0, p1, p2, v2}, Ldefpackage/zk;-><init>(Ljava/lang/Object;Landroid/os/Looper;I)V

    .line 51
    .line 52
    .line 53
    iput-object p0, p1, Ldefpackage/ir2;->e:Ljava/lang/Object;

    .line 54
    .line 55
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 56
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 57
    return-void

    .line 58
    :catchall_1
    move-exception p0

    .line 59
    goto :goto_2

    .line 60
    :goto_1
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 61
    :try_start_4
    throw p0

    .line 62
    :goto_2
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 63
    throw p0
.end method

.method public v(Ldefpackage/ei3;)V
    .locals 8

    .line 1
    iget-object p0, p0, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/kr2;

    .line 4
    .line 5
    iput-object p1, p0, Ldefpackage/kr2;->g:Ldefpackage/ei3;

    .line 6
    .line 7
    iget-object v1, p0, Ldefpackage/kr2;->d:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v1

    .line 10
    :try_start_0
    iget-object v0, p0, Ldefpackage/kr2;->f:Landroid/os/RemoteCallbackList;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->beginBroadcast()I

    .line 13
    .line 14
    .line 15
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    add-int/lit8 v0, v0, -0x1

    .line 17
    .line 18
    move v2, v0

    .line 19
    :goto_0
    iget-object v0, p0, Ldefpackage/kr2;->f:Landroid/os/RemoteCallbackList;

    .line 20
    .line 21
    if-ltz v2, :cond_0

    .line 22
    .line 23
    :try_start_1
    invoke-virtual {v0, v2}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Ldefpackage/lu1;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    .line 29
    :try_start_2
    invoke-interface {v0, p1}, Ldefpackage/lu1;->j(Ldefpackage/ei3;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 30
    .line 31
    .line 32
    goto :goto_2

    .line 33
    :catchall_0
    move-exception v0

    .line 34
    move-object p0, v0

    .line 35
    goto/16 :goto_5

    .line 36
    .line 37
    :catch_0
    move-exception v0

    .line 38
    goto :goto_1

    .line 39
    :catch_1
    move-exception v0

    .line 40
    :goto_1
    :try_start_3
    const-string v3, "MediaSessionCompat"

    .line 41
    .line 42
    const-string v4, "Dead object in setPlaybackState."

    .line 43
    .line 44
    invoke-static {v3, v4, v0}, Ldefpackage/l93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    :goto_2
    add-int/lit8 v2, v2, -0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->finishBroadcast()V

    .line 51
    .line 52
    .line 53
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 54
    iget-object p0, p0, Ldefpackage/kr2;->a:Landroid/media/session/MediaSession;

    .line 55
    .line 56
    iget-object v0, p1, Ldefpackage/ei3;->y:Landroid/media/session/PlaybackState;

    .line 57
    .line 58
    if-nez v0, :cond_4

    .line 59
    .line 60
    new-instance v1, Landroid/media/session/PlaybackState$Builder;

    .line 61
    .line 62
    invoke-direct {v1}, Landroid/media/session/PlaybackState$Builder;-><init>()V

    .line 63
    .line 64
    .line 65
    iget v2, p1, Ldefpackage/ei3;->n:I

    .line 66
    .line 67
    iget-wide v3, p1, Ldefpackage/ei3;->o:J

    .line 68
    .line 69
    iget v5, p1, Ldefpackage/ei3;->q:F

    .line 70
    .line 71
    iget-wide v6, p1, Ldefpackage/ei3;->u:J

    .line 72
    .line 73
    invoke-virtual/range {v1 .. v7}, Landroid/media/session/PlaybackState$Builder;->setState(IJFJ)Landroid/media/session/PlaybackState$Builder;

    .line 74
    .line 75
    .line 76
    iget-wide v2, p1, Ldefpackage/ei3;->p:J

    .line 77
    .line 78
    invoke-virtual {v1, v2, v3}, Landroid/media/session/PlaybackState$Builder;->setBufferedPosition(J)Landroid/media/session/PlaybackState$Builder;

    .line 79
    .line 80
    .line 81
    iget-wide v2, p1, Ldefpackage/ei3;->r:J

    .line 82
    .line 83
    invoke-virtual {v1, v2, v3}, Landroid/media/session/PlaybackState$Builder;->setActions(J)Landroid/media/session/PlaybackState$Builder;

    .line 84
    .line 85
    .line 86
    iget-object v0, p1, Ldefpackage/ei3;->t:Ljava/lang/CharSequence;

    .line 87
    .line 88
    invoke-virtual {v1, v0}, Landroid/media/session/PlaybackState$Builder;->setErrorMessage(Ljava/lang/CharSequence;)Landroid/media/session/PlaybackState$Builder;

    .line 89
    .line 90
    .line 91
    iget-object v0, p1, Ldefpackage/ei3;->v:Ljava/util/List;

    .line 92
    .line 93
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    :cond_1
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    if-eqz v2, :cond_3

    .line 102
    .line 103
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    check-cast v2, Ldefpackage/di3;

    .line 108
    .line 109
    iget-object v3, v2, Ldefpackage/di3;->r:Landroid/media/session/PlaybackState$CustomAction;

    .line 110
    .line 111
    if-eqz v3, :cond_2

    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_2
    new-instance v3, Landroid/media/session/PlaybackState$CustomAction$Builder;

    .line 115
    .line 116
    iget-object v4, v2, Ldefpackage/di3;->n:Ljava/lang/String;

    .line 117
    .line 118
    iget-object v5, v2, Ldefpackage/di3;->o:Ljava/lang/CharSequence;

    .line 119
    .line 120
    iget v6, v2, Ldefpackage/di3;->p:I

    .line 121
    .line 122
    invoke-direct {v3, v4, v5, v6}, Landroid/media/session/PlaybackState$CustomAction$Builder;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 123
    .line 124
    .line 125
    iget-object v2, v2, Ldefpackage/di3;->q:Landroid/os/Bundle;

    .line 126
    .line 127
    invoke-virtual {v3, v2}, Landroid/media/session/PlaybackState$CustomAction$Builder;->setExtras(Landroid/os/Bundle;)Landroid/media/session/PlaybackState$CustomAction$Builder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v3}, Landroid/media/session/PlaybackState$CustomAction$Builder;->build()Landroid/media/session/PlaybackState$CustomAction;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    :goto_4
    if-eqz v3, :cond_1

    .line 135
    .line 136
    invoke-virtual {v1, v3}, Landroid/media/session/PlaybackState$Builder;->addCustomAction(Landroid/media/session/PlaybackState$CustomAction;)Landroid/media/session/PlaybackState$Builder;

    .line 137
    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_3
    iget-wide v2, p1, Ldefpackage/ei3;->w:J

    .line 141
    .line 142
    invoke-virtual {v1, v2, v3}, Landroid/media/session/PlaybackState$Builder;->setActiveQueueItemId(J)Landroid/media/session/PlaybackState$Builder;

    .line 143
    .line 144
    .line 145
    iget-object v0, p1, Ldefpackage/ei3;->x:Landroid/os/Bundle;

    .line 146
    .line 147
    invoke-virtual {v1, v0}, Landroid/media/session/PlaybackState$Builder;->setExtras(Landroid/os/Bundle;)Landroid/media/session/PlaybackState$Builder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v1}, Landroid/media/session/PlaybackState$Builder;->build()Landroid/media/session/PlaybackState;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    iput-object v0, p1, Ldefpackage/ei3;->y:Landroid/media/session/PlaybackState;

    .line 155
    .line 156
    :cond_4
    iget-object p1, p1, Ldefpackage/ei3;->y:Landroid/media/session/PlaybackState;

    .line 157
    .line 158
    invoke-virtual {p0, p1}, Landroid/media/session/MediaSession;->setPlaybackState(Landroid/media/session/PlaybackState;)V

    .line 159
    .line 160
    .line 161
    return-void

    .line 162
    :goto_5
    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 163
    throw p0
.end method

.method public w(Ldefpackage/rc5;)Ldefpackage/gl4;
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/qr2;->p:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object p0, p0, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, Ldefpackage/nh0;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Ldefpackage/nh0;->d(Ldefpackage/rc5;)Ldefpackage/gl4;

    .line 9
    .line 10
    .line 11
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    monitor-exit v0

    .line 13
    return-object p0

    .line 14
    :catchall_0
    move-exception p0

    .line 15
    monitor-exit v0

    .line 16
    throw p0
.end method

.method public x()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 14
    .line 15
    .line 16
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    if-ltz v0, :cond_0

    .line 18
    .line 19
    monitor-exit p0

    .line 20
    return-void

    .line 21
    :cond_0
    :try_start_1
    const-string v0, "Unbalanced call to unblock() detected."

    .line 22
    .line 23
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    :catchall_0
    move-exception v0

    .line 30
    monitor-exit p0

    .line 31
    throw v0
.end method
