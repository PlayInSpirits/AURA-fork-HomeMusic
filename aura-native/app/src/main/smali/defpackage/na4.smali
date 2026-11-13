.class public final Ldefpackage/na4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/jj1;
.implements Ldefpackage/zn4;


# static fields
.field public static final r:Ldefpackage/tv1;

.field public static final s:Ldefpackage/l15;

.field public static t:Ldefpackage/na4;


# instance fields
.field public n:Ljava/lang/Object;

.field public o:Ljava/lang/Object;

.field public p:Ljava/lang/Object;

.field public q:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ldefpackage/tv1;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ldefpackage/na4;->r:Ldefpackage/tv1;

    .line 7
    .line 8
    new-instance v0, Ldefpackage/l15;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, v1}, Ldefpackage/l15;-><init>(I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Ldefpackage/na4;->s:Ldefpackage/l15;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(I)V
    .locals 3

    packed-switch p1, :pswitch_data_0

    .line 212
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 213
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Ldefpackage/na4;->o:Ljava/lang/Object;

    .line 214
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Ldefpackage/na4;->p:Ljava/lang/Object;

    .line 215
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Ldefpackage/na4;->q:Ljava/lang/Object;

    return-void

    .line 216
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 217
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldefpackage/na4;->n:Ljava/lang/Object;

    .line 218
    new-instance p1, Landroid/os/Handler;

    .line 219
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    new-instance v1, Ldefpackage/ai1;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p0}, Ldefpackage/ai1;-><init>(ILjava/lang/Object;)V

    invoke-direct {p1, v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object p1, p0, Ldefpackage/na4;->o:Ljava/lang/Object;

    return-void

    .line 220
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 221
    new-instance p1, Ldefpackage/wc;

    const/16 v0, 0xe

    invoke-direct {p1, v0, p0}, Ldefpackage/wc;-><init>(ILjava/lang/Object;)V

    iput-object p1, p0, Ldefpackage/na4;->p:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Landroid/graphics/Typeface;Ldefpackage/wv2;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/na4;->q:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Ldefpackage/na4;->n:Ljava/lang/Object;

    .line 7
    .line 8
    new-instance p1, Ldefpackage/zv2;

    .line 9
    .line 10
    const/16 v0, 0x400

    .line 11
    .line 12
    invoke-direct {p1, v0}, Ldefpackage/zv2;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Ldefpackage/na4;->p:Ljava/lang/Object;

    .line 16
    .line 17
    const/4 p1, 0x6

    .line 18
    invoke-virtual {p2, p1}, Ldefpackage/zf2;->a(I)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget v2, p2, Ldefpackage/zf2;->n:I

    .line 26
    .line 27
    add-int/2addr v0, v2

    .line 28
    iget-object v2, p2, Ldefpackage/zf2;->q:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v2, Ljava/nio/ByteBuffer;

    .line 31
    .line 32
    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    add-int/2addr v2, v0

    .line 37
    iget-object v0, p2, Ldefpackage/zf2;->q:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 40
    .line 41
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    move v0, v1

    .line 47
    :goto_0
    mul-int/lit8 v0, v0, 0x2

    .line 48
    .line 49
    new-array v0, v0, [C

    .line 50
    .line 51
    iput-object v0, p0, Ldefpackage/na4;->o:Ljava/lang/Object;

    .line 52
    .line 53
    invoke-virtual {p2, p1}, Ldefpackage/zf2;->a(I)I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-eqz p1, :cond_1

    .line 58
    .line 59
    iget v0, p2, Ldefpackage/zf2;->n:I

    .line 60
    .line 61
    add-int/2addr p1, v0

    .line 62
    iget-object v0, p2, Ldefpackage/zf2;->q:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 65
    .line 66
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    add-int/2addr v0, p1

    .line 71
    iget-object p1, p2, Ldefpackage/zf2;->q:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p1, Ljava/nio/ByteBuffer;

    .line 74
    .line 75
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    goto :goto_1

    .line 80
    :cond_1
    move p1, v1

    .line 81
    :goto_1
    move p2, v1

    .line 82
    :goto_2
    if-ge p2, p1, :cond_6

    .line 83
    .line 84
    new-instance v0, Ldefpackage/k05;

    .line 85
    .line 86
    invoke-direct {v0, p0, p2}, Ldefpackage/k05;-><init>(Ldefpackage/na4;I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0}, Ldefpackage/k05;->b()Ldefpackage/vv2;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    const/4 v3, 0x4

    .line 94
    invoke-virtual {v2, v3}, Ldefpackage/zf2;->a(I)I

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    if-eqz v3, :cond_2

    .line 99
    .line 100
    iget-object v4, v2, Ldefpackage/zf2;->q:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v4, Ljava/nio/ByteBuffer;

    .line 103
    .line 104
    iget v2, v2, Ldefpackage/zf2;->n:I

    .line 105
    .line 106
    add-int/2addr v3, v2

    .line 107
    invoke-virtual {v4, v3}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    goto :goto_3

    .line 112
    :cond_2
    move v2, v1

    .line 113
    :goto_3
    iget-object v3, p0, Ldefpackage/na4;->o:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v3, [C

    .line 116
    .line 117
    mul-int/lit8 v4, p2, 0x2

    .line 118
    .line 119
    invoke-static {v2, v3, v4}, Ljava/lang/Character;->toChars(I[CI)I

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0}, Ldefpackage/k05;->b()Ldefpackage/vv2;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    const/16 v3, 0x10

    .line 127
    .line 128
    invoke-virtual {v2, v3}, Ldefpackage/zf2;->a(I)I

    .line 129
    .line 130
    .line 131
    move-result v4

    .line 132
    if-eqz v4, :cond_3

    .line 133
    .line 134
    iget v5, v2, Ldefpackage/zf2;->n:I

    .line 135
    .line 136
    add-int/2addr v4, v5

    .line 137
    iget-object v5, v2, Ldefpackage/zf2;->q:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v5, Ljava/nio/ByteBuffer;

    .line 140
    .line 141
    invoke-virtual {v5, v4}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 142
    .line 143
    .line 144
    move-result v5

    .line 145
    add-int/2addr v5, v4

    .line 146
    iget-object v2, v2, Ldefpackage/zf2;->q:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v2, Ljava/nio/ByteBuffer;

    .line 149
    .line 150
    invoke-virtual {v2, v5}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    goto :goto_4

    .line 155
    :cond_3
    move v2, v1

    .line 156
    :goto_4
    const/4 v4, 0x1

    .line 157
    if-lez v2, :cond_4

    .line 158
    .line 159
    move v2, v4

    .line 160
    goto :goto_5

    .line 161
    :cond_4
    move v2, v1

    .line 162
    :goto_5
    const-string v5, "invalid metadata codepoint length"

    .line 163
    .line 164
    invoke-static {v5, v2}, Ldefpackage/l93;->j(Ljava/lang/String;Z)V

    .line 165
    .line 166
    .line 167
    iget-object v2, p0, Ldefpackage/na4;->p:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v2, Ldefpackage/zv2;

    .line 170
    .line 171
    invoke-virtual {v0}, Ldefpackage/k05;->b()Ldefpackage/vv2;

    .line 172
    .line 173
    .line 174
    move-result-object v5

    .line 175
    invoke-virtual {v5, v3}, Ldefpackage/zf2;->a(I)I

    .line 176
    .line 177
    .line 178
    move-result v3

    .line 179
    if-eqz v3, :cond_5

    .line 180
    .line 181
    iget v6, v5, Ldefpackage/zf2;->n:I

    .line 182
    .line 183
    add-int/2addr v3, v6

    .line 184
    iget-object v6, v5, Ldefpackage/zf2;->q:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v6, Ljava/nio/ByteBuffer;

    .line 187
    .line 188
    invoke-virtual {v6, v3}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 189
    .line 190
    .line 191
    move-result v6

    .line 192
    add-int/2addr v6, v3

    .line 193
    iget-object v3, v5, Ldefpackage/zf2;->q:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast v3, Ljava/nio/ByteBuffer;

    .line 196
    .line 197
    invoke-virtual {v3, v6}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 198
    .line 199
    .line 200
    move-result v3

    .line 201
    goto :goto_6

    .line 202
    :cond_5
    move v3, v1

    .line 203
    :goto_6
    sub-int/2addr v3, v4

    .line 204
    invoke-virtual {v2, v0, v1, v3}, Ldefpackage/zv2;->a(Ldefpackage/k05;II)V

    .line 205
    .line 206
    .line 207
    add-int/lit8 p2, p2, 0x1

    .line 208
    .line 209
    goto :goto_2

    .line 210
    :cond_6
    return-void
.end method

.method public synthetic constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;)V
    .locals 0

    .line 248
    iput-object p2, p0, Ldefpackage/na4;->n:Ljava/lang/Object;

    iput-object p3, p0, Ldefpackage/na4;->o:Ljava/lang/Object;

    iput-object p4, p0, Ldefpackage/na4;->p:Ljava/lang/Object;

    iput-object p5, p0, Ldefpackage/na4;->q:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 211
    iput-object p1, p0, Ldefpackage/na4;->n:Ljava/lang/Object;

    iput-object p2, p0, Ldefpackage/na4;->o:Ljava/lang/Object;

    iput-object p3, p0, Ldefpackage/na4;->p:Ljava/lang/Object;

    iput-object p4, p0, Ldefpackage/na4;->q:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ldefpackage/rm2;)V
    .locals 0

    .line 249
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 250
    iput-object p1, p0, Ldefpackage/na4;->n:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ldefpackage/tn2;)V
    .locals 2

    .line 222
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 223
    new-instance v0, Ldefpackage/oi;

    const/4 v1, 0x0

    .line 224
    invoke-direct {v0, v1}, Ldefpackage/yd4;-><init>(I)V

    .line 225
    iput-object v0, p0, Ldefpackage/na4;->o:Ljava/lang/Object;

    .line 226
    new-instance v0, Ldefpackage/oi;

    .line 227
    invoke-direct {v0, v1}, Ldefpackage/yd4;-><init>(I)V

    .line 228
    iput-object v0, p0, Ldefpackage/na4;->p:Ljava/lang/Object;

    .line 229
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ldefpackage/na4;->n:Ljava/lang/Object;

    .line 230
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ldefpackage/na4;->q:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ldefpackage/v23;)V
    .locals 5

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 231
    iget-object v0, p1, Ldefpackage/v23;->a:Landroid/content/Context;

    .line 232
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ldefpackage/na4;->n:Ljava/lang/Object;

    .line 233
    sget-object v1, Ldefpackage/k5;->w:Ldefpackage/k5;

    invoke-static {v1, v0}, Ldefpackage/fa4;->c0(Ldefpackage/if1;Ljava/lang/Object;)Ldefpackage/aa4;

    move-result-object v1

    .line 234
    sget-object v2, Ldefpackage/k5;->x:Ldefpackage/k5;

    .line 235
    new-instance v3, Ldefpackage/tq4;

    const/4 v4, 0x1

    invoke-direct {v3, v1, v2, v4}, Ldefpackage/tq4;-><init>(Ljava/lang/Object;Ldefpackage/if1;I)V

    .line 236
    new-instance v1, Ldefpackage/o54;

    const/16 v2, 0xd

    invoke-direct {v1, v2}, Ldefpackage/o54;-><init>(I)V

    .line 237
    new-instance v2, Ldefpackage/h71;

    const/4 v4, 0x0

    invoke-direct {v2, v3, v4, v1}, Ldefpackage/h71;-><init>(Ldefpackage/aa4;ZLdefpackage/if1;)V

    .line 238
    new-instance v1, Ldefpackage/g71;

    invoke-direct {v1, v2}, Ldefpackage/g71;-><init>(Ldefpackage/h71;)V

    .line 239
    invoke-virtual {v1}, Ldefpackage/g71;->hasNext()Z

    move-result v2

    if-nez v2, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    .line 240
    :cond_0
    invoke-virtual {v1}, Ldefpackage/g71;->next()Ljava/lang/Object;

    move-result-object v1

    .line 241
    :goto_0
    check-cast v1, Landroid/app/Activity;

    if-eqz v1, :cond_1

    .line 242
    new-instance v2, Landroid/content/Intent;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto :goto_1

    .line 243
    :cond_1
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v2

    if-nez v2, :cond_2

    .line 244
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    :cond_2
    :goto_1
    const v0, 0x10008000

    .line 245
    invoke-virtual {v2, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    iput-object v2, p0, Ldefpackage/na4;->o:Ljava/lang/Object;

    .line 246
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ldefpackage/na4;->q:Ljava/lang/Object;

    .line 247
    invoke-virtual {p1}, Ldefpackage/v23;->i()Ldefpackage/t23;

    move-result-object p1

    iput-object p1, p0, Ldefpackage/na4;->p:Ljava/lang/Object;

    return-void
.end method

.method public static z()Ldefpackage/na4;
    .locals 2

    .line 1
    sget-object v0, Ldefpackage/na4;->t:Ldefpackage/na4;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ldefpackage/na4;

    .line 6
    .line 7
    const/16 v1, 0xb

    .line 8
    .line 9
    invoke-direct {v0, v1}, Ldefpackage/na4;-><init>(I)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Ldefpackage/na4;->t:Ldefpackage/na4;

    .line 13
    .line 14
    :cond_0
    sget-object v0, Ldefpackage/na4;->t:Ldefpackage/na4;

    .line 15
    .line 16
    return-object v0
.end method


# virtual methods
.method public A(Ldefpackage/fr2;)Landroidx/media3/common/PlaybackException;
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/na4;->n:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object p0, p0, Ldefpackage/na4;->p:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, Ldefpackage/oi;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Ldefpackage/yd4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Ldefpackage/ba0;

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    monitor-exit v0

    .line 18
    return-object p1

    .line 19
    :catchall_0
    move-exception p0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    monitor-exit v0

    .line 22
    return-object p1

    .line 23
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    throw p0
.end method

.method public B(Ldefpackage/fr2;)Ldefpackage/lk3;
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/na4;->n:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object p0, p0, Ldefpackage/na4;->p:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, Ldefpackage/oi;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Ldefpackage/yd4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Ldefpackage/ba0;

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    monitor-exit v0

    .line 18
    return-object p1

    .line 19
    :catchall_0
    move-exception p0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    monitor-exit v0

    .line 22
    return-object p1

    .line 23
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    throw p0
.end method

.method public C(Ldefpackage/fr2;)Ldefpackage/yk;
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/na4;->n:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object p0, p0, Ldefpackage/na4;->p:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, Ldefpackage/oi;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Ldefpackage/yd4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Ldefpackage/ba0;

    .line 13
    .line 14
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    iget-object p0, p0, Ldefpackage/ba0;->b:Ldefpackage/yk;

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    return-object p0

    .line 22
    :catchall_0
    move-exception p0

    .line 23
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    throw p0
.end method

.method public D(Ldefpackage/ce;Ldefpackage/ce;)Ldefpackage/ce;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Ldefpackage/na4;->q:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ldefpackage/ce;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-virtual/range {p1 .. p1}, Ldefpackage/ce;->c()Ldefpackage/ce;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iput-object v1, v0, Ldefpackage/na4;->q:Ljava/lang/Object;

    .line 14
    .line 15
    :cond_0
    iget-object v1, v0, Ldefpackage/na4;->q:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Ldefpackage/ce;

    .line 18
    .line 19
    const-string v3, "targetVector"

    .line 20
    .line 21
    if-eqz v1, :cond_4

    .line 22
    .line 23
    invoke-virtual {v1}, Ldefpackage/ce;->b()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    const/4 v4, 0x0

    .line 28
    :goto_0
    iget-object v5, v0, Ldefpackage/na4;->q:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v5, Ldefpackage/ce;

    .line 31
    .line 32
    if-ge v4, v1, :cond_2

    .line 33
    .line 34
    if-eqz v5, :cond_1

    .line 35
    .line 36
    iget-object v6, v0, Ldefpackage/na4;->n:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v6, Ldefpackage/rm2;

    .line 39
    .line 40
    move-object/from16 v7, p1

    .line 41
    .line 42
    invoke-virtual {v7, v4}, Ldefpackage/ce;->a(I)F

    .line 43
    .line 44
    .line 45
    move-result v8

    .line 46
    move-object/from16 v9, p2

    .line 47
    .line 48
    invoke-virtual {v9, v4}, Ldefpackage/ce;->a(I)F

    .line 49
    .line 50
    .line 51
    move-result v10

    .line 52
    iget-object v6, v6, Ldefpackage/rm2;->o:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v6, Ldefpackage/yx0;

    .line 55
    .line 56
    invoke-virtual {v6, v10}, Ldefpackage/yx0;->b(F)D

    .line 57
    .line 58
    .line 59
    move-result-wide v11

    .line 60
    sget v13, Ldefpackage/a81;->a:F

    .line 61
    .line 62
    float-to-double v13, v13

    .line 63
    const-wide/high16 v15, 0x3ff0000000000000L    # 1.0

    .line 64
    .line 65
    sub-double v15, v13, v15

    .line 66
    .line 67
    const/16 v17, 0x0

    .line 68
    .line 69
    iget v2, v6, Ldefpackage/yx0;->a:F

    .line 70
    .line 71
    iget v6, v6, Ldefpackage/yx0;->b:F

    .line 72
    .line 73
    mul-float/2addr v2, v6

    .line 74
    move v6, v1

    .line 75
    float-to-double v0, v2

    .line 76
    div-double/2addr v13, v15

    .line 77
    mul-double/2addr v13, v11

    .line 78
    invoke-static {v13, v14}, Ljava/lang/Math;->exp(D)D

    .line 79
    .line 80
    .line 81
    move-result-wide v11

    .line 82
    mul-double/2addr v11, v0

    .line 83
    double-to-float v0, v11

    .line 84
    invoke-static {v10}, Ljava/lang/Math;->signum(F)F

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    mul-float/2addr v1, v0

    .line 89
    add-float/2addr v1, v8

    .line 90
    invoke-virtual {v5, v4, v1}, Ldefpackage/ce;->d(IF)V

    .line 91
    .line 92
    .line 93
    add-int/lit8 v4, v4, 0x1

    .line 94
    .line 95
    move-object/from16 v0, p0

    .line 96
    .line 97
    move v1, v6

    .line 98
    goto :goto_0

    .line 99
    :cond_1
    const/16 v17, 0x0

    .line 100
    .line 101
    invoke-static {v3}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    throw v17

    .line 105
    :cond_2
    const/16 v17, 0x0

    .line 106
    .line 107
    if-eqz v5, :cond_3

    .line 108
    .line 109
    return-object v5

    .line 110
    :cond_3
    invoke-static {v3}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    throw v17

    .line 114
    :cond_4
    const/16 v17, 0x0

    .line 115
    .line 116
    invoke-static {v3}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    throw v17
.end method

.method public E(JLdefpackage/ce;Ldefpackage/ce;)Ldefpackage/ce;
    .locals 14

    .line 1
    iget-object v0, p0, Ldefpackage/na4;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/ce;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual/range {p3 .. p3}, Ldefpackage/ce;->c()Ldefpackage/ce;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Ldefpackage/na4;->p:Ljava/lang/Object;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Ldefpackage/na4;->p:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Ldefpackage/ce;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    const-string v2, "velocityVector"

    .line 19
    .line 20
    if-eqz v0, :cond_5

    .line 21
    .line 22
    invoke-virtual {v0}, Ldefpackage/ce;->b()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v3, 0x0

    .line 27
    :goto_0
    iget-object v4, p0, Ldefpackage/na4;->p:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v4, Ldefpackage/ce;

    .line 30
    .line 31
    if-ge v3, v0, :cond_3

    .line 32
    .line 33
    if-eqz v4, :cond_2

    .line 34
    .line 35
    iget-object v5, p0, Ldefpackage/na4;->n:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v5, Ldefpackage/rm2;

    .line 38
    .line 39
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-object/from16 v6, p4

    .line 43
    .line 44
    invoke-virtual {v6, v3}, Ldefpackage/ce;->a(I)F

    .line 45
    .line 46
    .line 47
    move-result v7

    .line 48
    const-wide/32 v8, 0xf4240

    .line 49
    .line 50
    .line 51
    div-long v8, p1, v8

    .line 52
    .line 53
    iget-object v5, v5, Ldefpackage/rm2;->o:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v5, Ldefpackage/yx0;

    .line 56
    .line 57
    invoke-virtual {v5, v7}, Ldefpackage/yx0;->a(F)Ldefpackage/z71;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    iget-wide v10, v5, Ldefpackage/z71;->c:J

    .line 62
    .line 63
    const-wide/16 v12, 0x0

    .line 64
    .line 65
    cmp-long v7, v10, v12

    .line 66
    .line 67
    if-lez v7, :cond_1

    .line 68
    .line 69
    long-to-float v7, v8

    .line 70
    long-to-float v8, v10

    .line 71
    div-float/2addr v7, v8

    .line 72
    goto :goto_1

    .line 73
    :cond_1
    const/high16 v7, 0x3f800000    # 1.0f

    .line 74
    .line 75
    :goto_1
    invoke-static {v7}, Ldefpackage/yb;->a(F)Ldefpackage/xb;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    iget v7, v7, Ldefpackage/xb;->b:F

    .line 80
    .line 81
    iget v8, v5, Ldefpackage/z71;->a:F

    .line 82
    .line 83
    invoke-static {v8}, Ljava/lang/Math;->signum(F)F

    .line 84
    .line 85
    .line 86
    move-result v8

    .line 87
    mul-float/2addr v8, v7

    .line 88
    iget v5, v5, Ldefpackage/z71;->b:F

    .line 89
    .line 90
    mul-float/2addr v8, v5

    .line 91
    long-to-float v5, v10

    .line 92
    div-float/2addr v8, v5

    .line 93
    const/high16 v5, 0x447a0000    # 1000.0f

    .line 94
    .line 95
    mul-float/2addr v8, v5

    .line 96
    invoke-virtual {v4, v3, v8}, Ldefpackage/ce;->d(IF)V

    .line 97
    .line 98
    .line 99
    add-int/lit8 v3, v3, 0x1

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_2
    invoke-static {v2}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    throw v1

    .line 106
    :cond_3
    if-eqz v4, :cond_4

    .line 107
    .line 108
    return-object v4

    .line 109
    :cond_4
    invoke-static {v2}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    throw v1

    .line 113
    :cond_5
    invoke-static {v2}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    throw v1
.end method

.method public F(Ldefpackage/fr2;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/na4;->n:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object p0, p0, Ldefpackage/na4;->p:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, Ldefpackage/oi;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Ldefpackage/yd4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    const/4 p0, 0x1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    :goto_0
    monitor-exit v0

    .line 18
    return p0

    .line 19
    :catchall_0
    move-exception p0

    .line 20
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    throw p0
.end method

.method public G(Ldefpackage/br;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/na4;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/rg4;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Ldefpackage/rg4;->a:Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    if-ne p0, p1, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
.end method

.method public H(Ldefpackage/fr2;I)Z
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/na4;->n:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Ldefpackage/na4;->p:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, Ldefpackage/oi;

    .line 7
    .line 8
    invoke-virtual {v1, p1}, Ldefpackage/yd4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Ldefpackage/ba0;

    .line 13
    .line 14
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    iget-object p0, p0, Ldefpackage/na4;->q:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Ljava/lang/ref/WeakReference;

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, Ldefpackage/tn2;

    .line 24
    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    iget-object p1, p1, Ldefpackage/ba0;->e:Ldefpackage/mi3;

    .line 28
    .line 29
    invoke-virtual {p1, p2}, Ldefpackage/mi3;->a(I)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    if-eqz p0, :cond_0

    .line 36
    .line 37
    iget-object p0, p0, Ldefpackage/tn2;->s:Ldefpackage/al3;

    .line 38
    .line 39
    invoke-virtual {p0}, Ldefpackage/al3;->o()Ldefpackage/mi3;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p0, p2}, Ldefpackage/mi3;->a(I)Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    if-eqz p0, :cond_0

    .line 48
    .line 49
    const/4 p0, 0x1

    .line 50
    return p0

    .line 51
    :cond_0
    const/4 p0, 0x0

    .line 52
    return p0

    .line 53
    :catchall_0
    move-exception p0

    .line 54
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    throw p0
.end method

.method public I(Ldefpackage/fr2;I)Z
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/na4;->n:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object p0, p0, Ldefpackage/na4;->p:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, Ldefpackage/oi;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Ldefpackage/yd4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Ldefpackage/ba0;

    .line 13
    .line 14
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    const/4 p1, 0x0

    .line 16
    if-eqz p0, :cond_3

    .line 17
    .line 18
    iget-object p0, p0, Ldefpackage/ba0;->d:Ldefpackage/wa4;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    if-eqz p2, :cond_0

    .line 25
    .line 26
    move v1, v0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move v1, p1

    .line 29
    :goto_0
    const-string v2, "Use contains(Command) for custom command"

    .line 30
    .line 31
    invoke-static {v2, v1}, Ldefpackage/rr2;->k(Ljava/lang/String;Z)V

    .line 32
    .line 33
    .line 34
    iget-object p0, p0, Ldefpackage/wa4;->a:Ldefpackage/jx1;

    .line 35
    .line 36
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    check-cast v1, Ldefpackage/va4;

    .line 51
    .line 52
    iget v1, v1, Ldefpackage/va4;->a:I

    .line 53
    .line 54
    if-ne v1, p2, :cond_1

    .line 55
    .line 56
    move p0, v0

    .line 57
    goto :goto_1

    .line 58
    :cond_2
    move p0, p1

    .line 59
    :goto_1
    if-eqz p0, :cond_3

    .line 60
    .line 61
    return v0

    .line 62
    :cond_3
    return p1

    .line 63
    :catchall_0
    move-exception p0

    .line 64
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 65
    throw p0
.end method

.method public J(Ldefpackage/fr2;Ldefpackage/va4;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/na4;->n:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object p0, p0, Ldefpackage/na4;->p:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, Ldefpackage/oi;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Ldefpackage/yd4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Ldefpackage/ba0;

    .line 13
    .line 14
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    if-eqz p0, :cond_1

    .line 16
    .line 17
    iget-object p0, p0, Ldefpackage/ba0;->d:Ldefpackage/wa4;

    .line 18
    .line 19
    iget-object p0, p0, Ldefpackage/wa4;->a:Ldefpackage/jx1;

    .line 20
    .line 21
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p2}, Ldefpackage/rw1;->contains(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-nez p0, :cond_0

    .line 29
    .line 30
    iget-object p0, p2, Ldefpackage/va4;->b:Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {p0}, Ldefpackage/j60;->n(Ljava/lang/String;)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-eqz p0, :cond_1

    .line 37
    .line 38
    :cond_0
    const/4 p0, 0x1

    .line 39
    return p0

    .line 40
    :cond_1
    const/4 p0, 0x0

    .line 41
    return p0

    .line 42
    :catchall_0
    move-exception p0

    .line 43
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44
    throw p0
.end method

.method public K(Ldefpackage/br;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/na4;->n:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0, p1}, Ldefpackage/na4;->G(Ldefpackage/br;)Z

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iget-object p1, p0, Ldefpackage/na4;->p:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, Ldefpackage/rg4;

    .line 13
    .line 14
    iget-boolean v1, p1, Ldefpackage/rg4;->c:Z

    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    iput-boolean v1, p1, Ldefpackage/rg4;->c:Z

    .line 20
    .line 21
    iget-object p0, p0, Ldefpackage/na4;->o:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p0, Landroid/os/Handler;

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception p0

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    :goto_0
    monitor-exit v0

    .line 32
    return-void

    .line 33
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    throw p0
.end method

.method public L()V
    .locals 8

    .line 1
    sget-object v0, Ldefpackage/ze5;->a:Ldefpackage/tl1;

    .line 2
    .line 3
    new-instance v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    monitor-enter p0

    .line 9
    :try_start_0
    iget-object v1, p0, Ldefpackage/na4;->o:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Ljava/util/ArrayDeque;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Ldefpackage/yu3;

    .line 31
    .line 32
    iget-object v3, p0, Ldefpackage/na4;->p:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v3, Ljava/util/ArrayDeque;

    .line 35
    .line 36
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->size()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    const/16 v4, 0x40

    .line 41
    .line 42
    if-ge v3, v4, :cond_1

    .line 43
    .line 44
    iget-object v3, v2, Ldefpackage/yu3;->o:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 45
    .line 46
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    const/4 v4, 0x5

    .line 51
    if-ge v3, v4, :cond_0

    .line 52
    .line 53
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 54
    .line 55
    .line 56
    iget-object v3, v2, Ldefpackage/yu3;->o:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 57
    .line 58
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    iget-object v3, p0, Ldefpackage/na4;->p:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v3, Ljava/util/ArrayDeque;

    .line 67
    .line 68
    invoke-virtual {v3, v2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :catchall_0
    move-exception v0

    .line 73
    goto/16 :goto_5

    .line 74
    .line 75
    :cond_1
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    :try_start_1
    iget-object v1, p0, Ldefpackage/na4;->p:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v1, Ljava/util/ArrayDeque;

    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->size()I

    .line 81
    .line 82
    .line 83
    iget-object v1, p0, Ldefpackage/na4;->q:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v1, Ljava/util/ArrayDeque;

    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->size()I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 88
    .line 89
    .line 90
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 91
    monitor-exit p0

    .line 92
    invoke-virtual {p0}, Ldefpackage/na4;->n()Ljava/util/concurrent/ExecutorService;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    check-cast v1, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 97
    .line 98
    invoke-virtual {v1}, Ljava/util/concurrent/ThreadPoolExecutor;->isShutdown()Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    const/4 v2, 0x0

    .line 103
    if-eqz v1, :cond_2

    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    :goto_1
    if-ge v2, v1, :cond_3

    .line 110
    .line 111
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    check-cast v3, Ldefpackage/yu3;

    .line 116
    .line 117
    iget-object v4, v3, Ldefpackage/yu3;->o:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 118
    .line 119
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 120
    .line 121
    .line 122
    monitor-enter p0

    .line 123
    :try_start_3
    iget-object v4, p0, Ldefpackage/na4;->p:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v4, Ljava/util/ArrayDeque;

    .line 126
    .line 127
    invoke-virtual {v4, v3}, Ljava/util/ArrayDeque;->remove(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 128
    .line 129
    .line 130
    monitor-exit p0

    .line 131
    new-instance v4, Ljava/io/InterruptedIOException;

    .line 132
    .line 133
    const-string v5, "executor rejected"

    .line 134
    .line 135
    invoke-direct {v4, v5}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    const/4 v5, 0x0

    .line 139
    invoke-virtual {v4, v5}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 140
    .line 141
    .line 142
    iget-object v5, v3, Ldefpackage/yu3;->p:Ldefpackage/bv3;

    .line 143
    .line 144
    invoke-virtual {v5, v4}, Ldefpackage/bv3;->g(Ljava/io/IOException;)Ljava/io/IOException;

    .line 145
    .line 146
    .line 147
    iget-object v3, v3, Ldefpackage/yu3;->n:Ldefpackage/ky;

    .line 148
    .line 149
    invoke-interface {v3, v5, v4}, Ldefpackage/ky;->onFailure(Ldefpackage/gy;Ljava/io/IOException;)V

    .line 150
    .line 151
    .line 152
    add-int/lit8 v2, v2, 0x1

    .line 153
    .line 154
    goto :goto_1

    .line 155
    :catchall_1
    move-exception v0

    .line 156
    monitor-exit p0

    .line 157
    throw v0

    .line 158
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    :goto_2
    if-ge v2, v1, :cond_3

    .line 163
    .line 164
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    check-cast v3, Ldefpackage/yu3;

    .line 169
    .line 170
    invoke-virtual {p0}, Ldefpackage/na4;->n()Ljava/util/concurrent/ExecutorService;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    iget-object v5, v3, Ldefpackage/yu3;->p:Ldefpackage/bv3;

    .line 178
    .line 179
    iget-object v6, v5, Ldefpackage/bv3;->n:Ldefpackage/o83;

    .line 180
    .line 181
    iget-object v6, v6, Ldefpackage/o83;->a:Ldefpackage/na4;

    .line 182
    .line 183
    sget-object v6, Ldefpackage/ze5;->a:Ldefpackage/tl1;

    .line 184
    .line 185
    :try_start_4
    check-cast v4, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 186
    .line 187
    invoke-virtual {v4, v3}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_4
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 188
    .line 189
    .line 190
    goto :goto_3

    .line 191
    :catchall_2
    move-exception p0

    .line 192
    goto :goto_4

    .line 193
    :catch_0
    move-exception v4

    .line 194
    :try_start_5
    new-instance v6, Ljava/io/InterruptedIOException;

    .line 195
    .line 196
    const-string v7, "executor rejected"

    .line 197
    .line 198
    invoke-direct {v6, v7}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v6, v4}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 202
    .line 203
    .line 204
    iget-object v4, v3, Ldefpackage/yu3;->p:Ldefpackage/bv3;

    .line 205
    .line 206
    invoke-virtual {v4, v6}, Ldefpackage/bv3;->g(Ljava/io/IOException;)Ljava/io/IOException;

    .line 207
    .line 208
    .line 209
    iget-object v7, v3, Ldefpackage/yu3;->n:Ldefpackage/ky;

    .line 210
    .line 211
    invoke-interface {v7, v4, v6}, Ldefpackage/ky;->onFailure(Ldefpackage/gy;Ljava/io/IOException;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 212
    .line 213
    .line 214
    iget-object v4, v5, Ldefpackage/bv3;->n:Ldefpackage/o83;

    .line 215
    .line 216
    iget-object v4, v4, Ldefpackage/o83;->a:Ldefpackage/na4;

    .line 217
    .line 218
    invoke-virtual {v4, v3}, Ldefpackage/na4;->q(Ldefpackage/yu3;)V

    .line 219
    .line 220
    .line 221
    :goto_3
    add-int/lit8 v2, v2, 0x1

    .line 222
    .line 223
    goto :goto_2

    .line 224
    :goto_4
    iget-object v0, v5, Ldefpackage/bv3;->n:Ldefpackage/o83;

    .line 225
    .line 226
    iget-object v0, v0, Ldefpackage/o83;->a:Ldefpackage/na4;

    .line 227
    .line 228
    invoke-virtual {v0, v3}, Ldefpackage/na4;->q(Ldefpackage/yu3;)V

    .line 229
    .line 230
    .line 231
    throw p0

    .line 232
    :cond_3
    return-void

    .line 233
    :catchall_3
    move-exception v0

    .line 234
    :try_start_6
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 235
    :try_start_7
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 236
    :goto_5
    monitor-exit p0

    .line 237
    throw v0
.end method

.method public declared-synchronized M()Ljava/util/ArrayList;
    .locals 6

    .line 1
    const-class v0, Ljava/lang/String;

    .line 2
    .line 3
    const-class v1, Ljava/io/InputStream;

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    new-instance v2, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v3, p0, Ldefpackage/na4;->n:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v3, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-eqz v4, :cond_2

    .line 24
    .line 25
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    check-cast v4, Ldefpackage/cz2;

    .line 30
    .line 31
    iget-object v5, v4, Ldefpackage/cz2;->a:Ljava/lang/Class;

    .line 32
    .line 33
    invoke-virtual {v5, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-eqz v5, :cond_1

    .line 38
    .line 39
    iget-object v5, v4, Ldefpackage/cz2;->b:Ljava/lang/Class;

    .line 40
    .line 41
    invoke-virtual {v5, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    if-eqz v5, :cond_1

    .line 46
    .line 47
    const/4 v5, 0x1

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    const/4 v5, 0x0

    .line 50
    :goto_1
    if-eqz v5, :cond_0

    .line 51
    .line 52
    invoke-interface {v3}, Ljava/util/Iterator;->remove()V

    .line 53
    .line 54
    .line 55
    iget-object v4, v4, Ldefpackage/cz2;->c:Ldefpackage/vw2;

    .line 56
    .line 57
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :catchall_0
    move-exception v0

    .line 62
    goto :goto_2

    .line 63
    :cond_2
    monitor-exit p0

    .line 64
    return-object v2

    .line 65
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 66
    throw v0
.end method

.method public N(Ldefpackage/fr2;)V
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/na4;->n:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Ldefpackage/na4;->p:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, Ldefpackage/oi;

    .line 7
    .line 8
    invoke-virtual {v1, p1}, Ldefpackage/yd4;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Ldefpackage/ba0;

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    monitor-exit v0

    .line 17
    return-void

    .line 18
    :catchall_0
    move-exception p0

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    iget-object v2, p0, Ldefpackage/na4;->o:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v2, Ldefpackage/oi;

    .line 23
    .line 24
    iget-object v3, v1, Ldefpackage/ba0;->a:Ljava/lang/Object;

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Ldefpackage/yd4;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    iget-object v0, v1, Ldefpackage/ba0;->b:Ldefpackage/yk;

    .line 31
    .line 32
    invoke-virtual {v0}, Ldefpackage/yk;->a()V

    .line 33
    .line 34
    .line 35
    iget-object p0, p0, Ldefpackage/na4;->q:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p0, Ljava/lang/ref/WeakReference;

    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    check-cast p0, Ldefpackage/tn2;

    .line 44
    .line 45
    if-eqz p0, :cond_2

    .line 46
    .line 47
    invoke-virtual {p0}, Ldefpackage/tn2;->l()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    iget-object v0, p0, Ldefpackage/tn2;->l:Landroid/os/Handler;

    .line 55
    .line 56
    new-instance v1, Ldefpackage/y90;

    .line 57
    .line 58
    const/4 v2, 0x0

    .line 59
    invoke-direct {v1, p0, p1, v2}, Ldefpackage/y90;-><init>(Ldefpackage/tn2;Ldefpackage/fr2;I)V

    .line 60
    .line 61
    .line 62
    invoke-static {v0, v1}, Ldefpackage/f35;->W(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 63
    .line 64
    .line 65
    :cond_2
    :goto_0
    return-void

    .line 66
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 67
    throw p0
.end method

.method public O(Ldefpackage/br;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/na4;->n:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0, p1}, Ldefpackage/na4;->G(Ldefpackage/br;)Z

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iget-object p1, p0, Ldefpackage/na4;->p:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, Ldefpackage/rg4;

    .line 13
    .line 14
    iget-boolean v1, p1, Ldefpackage/rg4;->c:Z

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    iput-boolean v1, p1, Ldefpackage/rg4;->c:Z

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Ldefpackage/na4;->P(Ldefpackage/rg4;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception p0

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    :goto_0
    monitor-exit v0

    .line 28
    return-void

    .line 29
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    throw p0
.end method

.method public P(Ldefpackage/rg4;)V
    .locals 2

    .line 1
    iget-object p0, p0, Ldefpackage/na4;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/os/Handler;

    .line 4
    .line 5
    iget v0, p1, Ldefpackage/rg4;->b:I

    .line 6
    .line 7
    const/4 v1, -0x2

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    if-lez v0, :cond_1

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_1
    const/4 v1, -0x1

    .line 15
    if-ne v0, v1, :cond_2

    .line 16
    .line 17
    const/16 v0, 0x5dc

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_2
    const/16 v0, 0xabe

    .line 21
    .line 22
    :goto_0
    invoke-virtual {p0, p1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-static {p0, v1, p1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    int-to-long v0, v0

    .line 31
    invoke-virtual {p0, p1, v0, v1}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public Q()V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/na4;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/rg4;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iput-object v0, p0, Ldefpackage/na4;->p:Ljava/lang/Object;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    iput-object v1, p0, Ldefpackage/na4;->q:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object v0, v0, Ldefpackage/rg4;->a:Ljava/lang/ref/WeakReference;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Ldefpackage/br;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    sget-object p0, Ldefpackage/fr;->z:Landroid/os/Handler;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    iget-object v0, v0, Ldefpackage/br;->a:Ldefpackage/fr;

    .line 26
    .line 27
    invoke-virtual {p0, v1, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p0, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    iput-object v1, p0, Ldefpackage/na4;->p:Ljava/lang/Object;

    .line 36
    .line 37
    :cond_1
    return-void
.end method

.method public R(Ldefpackage/gl4;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ldefpackage/ur2;

    .line 5
    .line 6
    const/16 v1, 0x18

    .line 7
    .line 8
    invoke-direct {v0, v1, p0, p1}, Ldefpackage/ur2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Ldefpackage/na4;->p:Ljava/lang/Object;

    .line 12
    .line 13
    monitor-enter v1

    .line 14
    :try_start_0
    iget-object v2, p0, Ldefpackage/na4;->q:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Ljava/util/LinkedHashMap;

    .line 17
    .line 18
    invoke-interface {v2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Ljava/lang/Runnable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    monitor-exit v1

    .line 25
    iget-object p0, p0, Ldefpackage/na4;->n:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, Ldefpackage/hg3;

    .line 28
    .line 29
    iget-object p0, p0, Ldefpackage/hg3;->o:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p0, Landroid/os/Handler;

    .line 32
    .line 33
    const-wide/32 v1, 0x5265c0

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :catchall_0
    move-exception p0

    .line 41
    monitor-exit v1

    .line 42
    throw p0
.end method

.method public S()V
    .locals 5

    .line 1
    iget-object v0, p0, Ldefpackage/na4;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v2, v1, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    check-cast v3, Ldefpackage/o23;

    .line 19
    .line 20
    iget v3, v3, Ldefpackage/o23;->a:I

    .line 21
    .line 22
    invoke-virtual {p0, v3}, Ldefpackage/na4;->o(I)Ldefpackage/r23;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    if-eqz v4, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    sget v0, Ldefpackage/r23;->w:I

    .line 30
    .line 31
    iget-object v0, p0, Ldefpackage/na4;->n:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Landroid/content/Context;

    .line 34
    .line 35
    invoke-static {v0, v3}, Ldefpackage/ya4;->v(Landroid/content/Context;I)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const-string v1, "Navigation destination "

    .line 40
    .line 41
    const-string v2, " cannot be found in the navigation graph "

    .line 42
    .line 43
    invoke-static {v1, v0, v2}, Ldefpackage/xa3;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iget-object p0, p0, Ldefpackage/na4;->p:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p0, Ldefpackage/t23;

    .line 50
    .line 51
    invoke-static {p0, v0}, Ldefpackage/kf2;->g(Ljava/lang/Object;Ljava/lang/StringBuilder;)V

    .line 52
    .line 53
    .line 54
    :cond_1
    return-void
.end method

.method public a(Ljava/lang/Object;Ldefpackage/fr2;Ldefpackage/wa4;Ldefpackage/mi3;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/na4;->n:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0, p1}, Ldefpackage/na4;->w(Ljava/lang/Object;)Ldefpackage/fr2;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Ldefpackage/na4;->o:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ldefpackage/oi;

    .line 13
    .line 14
    invoke-virtual {v1, p1, p2}, Ldefpackage/yd4;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Ldefpackage/na4;->p:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, Ldefpackage/oi;

    .line 20
    .line 21
    new-instance v1, Ldefpackage/ba0;

    .line 22
    .line 23
    new-instance v2, Ldefpackage/yk;

    .line 24
    .line 25
    invoke-direct {v2}, Ldefpackage/yk;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-direct {v1, p1, v2, p3, p4}, Ldefpackage/ba0;-><init>(Ljava/lang/Object;Ldefpackage/yk;Ldefpackage/wa4;Ldefpackage/mi3;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, p2, v1}, Ldefpackage/yd4;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception p0

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    iget-object p0, p0, Ldefpackage/na4;->p:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p0, Ldefpackage/oi;

    .line 40
    .line 41
    invoke-virtual {p0, v1}, Ldefpackage/yd4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    check-cast p0, Ldefpackage/ba0;

    .line 46
    .line 47
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    iput-object p3, p0, Ldefpackage/ba0;->d:Ldefpackage/wa4;

    .line 51
    .line 52
    iput-object p4, p0, Ldefpackage/ba0;->e:Ldefpackage/mi3;

    .line 53
    .line 54
    :goto_0
    monitor-exit v0

    .line 55
    return-void

    .line 56
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    throw p0
.end method

.method public c([BIILdefpackage/yn4;Ldefpackage/wc0;)V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    iget-object v2, v0, Ldefpackage/na4;->n:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ldefpackage/be3;

    .line 8
    .line 9
    add-int v3, v1, p3

    .line 10
    .line 11
    move-object/from16 v4, p1

    .line 12
    .line 13
    invoke-virtual {v2, v3, v4}, Ldefpackage/be3;->L(I[B)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v2, v1}, Ldefpackage/be3;->N(I)V

    .line 17
    .line 18
    .line 19
    iget-object v1, v0, Ldefpackage/na4;->o:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Ldefpackage/be3;

    .line 22
    .line 23
    iget-object v3, v0, Ldefpackage/na4;->p:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v3, Ldefpackage/o85;

    .line 26
    .line 27
    iget-object v4, v0, Ldefpackage/na4;->q:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v4, Ljava/util/zip/Inflater;

    .line 30
    .line 31
    if-nez v4, :cond_0

    .line 32
    .line 33
    new-instance v4, Ljava/util/zip/Inflater;

    .line 34
    .line 35
    invoke-direct {v4}, Ljava/util/zip/Inflater;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object v4, v0, Ldefpackage/na4;->q:Ljava/lang/Object;

    .line 39
    .line 40
    :cond_0
    iget-object v0, v0, Ldefpackage/na4;->q:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Ljava/util/zip/Inflater;

    .line 43
    .line 44
    sget-object v4, Ldefpackage/f35;->a:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {v2}, Ldefpackage/be3;->a()I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-lez v4, :cond_1

    .line 51
    .line 52
    invoke-virtual {v2}, Ldefpackage/be3;->j()I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    const/16 v5, 0x78

    .line 57
    .line 58
    if-ne v4, v5, :cond_1

    .line 59
    .line 60
    invoke-static {v2, v1, v0}, Ldefpackage/f35;->K(Ldefpackage/be3;Ldefpackage/be3;Ljava/util/zip/Inflater;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_1

    .line 65
    .line 66
    iget-object v0, v1, Ldefpackage/be3;->a:[B

    .line 67
    .line 68
    iget v1, v1, Ldefpackage/be3;->c:I

    .line 69
    .line 70
    invoke-virtual {v2, v1, v0}, Ldefpackage/be3;->L(I[B)V

    .line 71
    .line 72
    .line 73
    :cond_1
    const/4 v0, 0x0

    .line 74
    iput-boolean v0, v3, Ldefpackage/o85;->c:Z

    .line 75
    .line 76
    const/4 v1, 0x0

    .line 77
    iput-object v1, v3, Ldefpackage/o85;->g:Landroid/graphics/Rect;

    .line 78
    .line 79
    const/4 v4, -0x1

    .line 80
    iput v4, v3, Ldefpackage/o85;->h:I

    .line 81
    .line 82
    iput v4, v3, Ldefpackage/o85;->i:I

    .line 83
    .line 84
    invoke-virtual {v2}, Ldefpackage/be3;->a()I

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    const/4 v6, 0x2

    .line 89
    if-lt v5, v6, :cond_11

    .line 90
    .line 91
    invoke-virtual {v2}, Ldefpackage/be3;->H()I

    .line 92
    .line 93
    .line 94
    move-result v7

    .line 95
    if-eq v7, v5, :cond_2

    .line 96
    .line 97
    goto/16 :goto_9

    .line 98
    .line 99
    :cond_2
    iget-object v5, v3, Ldefpackage/o85;->d:[I

    .line 100
    .line 101
    const/4 v7, 0x1

    .line 102
    const-string v8, "VobsubParser"

    .line 103
    .line 104
    if-nez v5, :cond_3

    .line 105
    .line 106
    const-string v5, "Skipping SPU (no palette)"

    .line 107
    .line 108
    invoke-static {v8, v5}, Ldefpackage/l93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    goto/16 :goto_8

    .line 112
    .line 113
    :cond_3
    iget-boolean v5, v3, Ldefpackage/o85;->b:Z

    .line 114
    .line 115
    if-nez v5, :cond_4

    .line 116
    .line 117
    const-string v5, "Skipping SPU (no plane)"

    .line 118
    .line 119
    invoke-static {v8, v5}, Ldefpackage/l93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    goto/16 :goto_8

    .line 123
    .line 124
    :cond_4
    iget v5, v2, Ldefpackage/be3;->b:I

    .line 125
    .line 126
    sub-int/2addr v5, v6

    .line 127
    invoke-virtual {v2}, Ldefpackage/be3;->H()I

    .line 128
    .line 129
    .line 130
    move-result v9

    .line 131
    add-int/2addr v9, v5

    .line 132
    invoke-virtual {v2, v9}, Ldefpackage/be3;->N(I)V

    .line 133
    .line 134
    .line 135
    :goto_0
    invoke-virtual {v2}, Ldefpackage/be3;->a()I

    .line 136
    .line 137
    .line 138
    move-result v9

    .line 139
    const/4 v10, 0x4

    .line 140
    if-ge v9, v10, :cond_5

    .line 141
    .line 142
    move v9, v0

    .line 143
    goto/16 :goto_7

    .line 144
    .line 145
    :cond_5
    iget v9, v2, Ldefpackage/be3;->b:I

    .line 146
    .line 147
    invoke-virtual {v2, v6}, Ldefpackage/be3;->O(I)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v2}, Ldefpackage/be3;->H()I

    .line 151
    .line 152
    .line 153
    move-result v11

    .line 154
    add-int/2addr v11, v5

    .line 155
    if-eq v11, v9, :cond_6

    .line 156
    .line 157
    iget v9, v2, Ldefpackage/be3;->c:I

    .line 158
    .line 159
    if-ge v11, v9, :cond_6

    .line 160
    .line 161
    move v9, v7

    .line 162
    goto :goto_1

    .line 163
    :cond_6
    move v9, v0

    .line 164
    :goto_1
    if-eqz v9, :cond_7

    .line 165
    .line 166
    move v12, v11

    .line 167
    goto :goto_2

    .line 168
    :cond_7
    iget v12, v2, Ldefpackage/be3;->c:I

    .line 169
    .line 170
    :goto_2
    move v13, v7

    .line 171
    :goto_3
    iget v14, v2, Ldefpackage/be3;->b:I

    .line 172
    .line 173
    if-ge v14, v12, :cond_e

    .line 174
    .line 175
    if-eqz v13, :cond_e

    .line 176
    .line 177
    iget-object v13, v3, Ldefpackage/o85;->a:[I

    .line 178
    .line 179
    invoke-virtual {v2}, Ldefpackage/be3;->A()I

    .line 180
    .line 181
    .line 182
    move-result v14

    .line 183
    const/16 v15, 0xff

    .line 184
    .line 185
    if-eq v14, v15, :cond_8

    .line 186
    .line 187
    const/4 v15, 0x3

    .line 188
    packed-switch v14, :pswitch_data_0

    .line 189
    .line 190
    .line 191
    const-string v13, "Unrecognized command: "

    .line 192
    .line 193
    invoke-static {v14, v13, v8}, Ldefpackage/xa3;->m(ILjava/lang/String;Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    :cond_8
    :goto_4
    move v13, v0

    .line 197
    goto/16 :goto_6

    .line 198
    .line 199
    :pswitch_0
    invoke-virtual {v2}, Ldefpackage/be3;->a()I

    .line 200
    .line 201
    .line 202
    move-result v13

    .line 203
    if-ge v13, v10, :cond_9

    .line 204
    .line 205
    const-string v13, "Incomplete offsets command"

    .line 206
    .line 207
    invoke-static {v8, v13}, Ldefpackage/l93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    goto :goto_4

    .line 211
    :cond_9
    invoke-virtual {v2}, Ldefpackage/be3;->H()I

    .line 212
    .line 213
    .line 214
    move-result v13

    .line 215
    iput v13, v3, Ldefpackage/o85;->h:I

    .line 216
    .line 217
    invoke-virtual {v2}, Ldefpackage/be3;->H()I

    .line 218
    .line 219
    .line 220
    move-result v13

    .line 221
    iput v13, v3, Ldefpackage/o85;->i:I

    .line 222
    .line 223
    :goto_5
    :pswitch_1
    move v13, v7

    .line 224
    goto/16 :goto_6

    .line 225
    .line 226
    :pswitch_2
    invoke-virtual {v2}, Ldefpackage/be3;->a()I

    .line 227
    .line 228
    .line 229
    move-result v13

    .line 230
    const/4 v14, 0x6

    .line 231
    if-ge v13, v14, :cond_a

    .line 232
    .line 233
    const-string v13, "Incomplete area command"

    .line 234
    .line 235
    invoke-static {v8, v13}, Ldefpackage/l93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    goto :goto_4

    .line 239
    :cond_a
    invoke-virtual {v2}, Ldefpackage/be3;->A()I

    .line 240
    .line 241
    .line 242
    move-result v13

    .line 243
    invoke-virtual {v2}, Ldefpackage/be3;->A()I

    .line 244
    .line 245
    .line 246
    move-result v14

    .line 247
    invoke-virtual {v2}, Ldefpackage/be3;->A()I

    .line 248
    .line 249
    .line 250
    move-result v15

    .line 251
    shl-int/2addr v13, v10

    .line 252
    shr-int/lit8 v16, v14, 0x4

    .line 253
    .line 254
    or-int v13, v13, v16

    .line 255
    .line 256
    and-int/lit8 v14, v14, 0xf

    .line 257
    .line 258
    shl-int/lit8 v14, v14, 0x8

    .line 259
    .line 260
    or-int/2addr v14, v15

    .line 261
    invoke-virtual {v2}, Ldefpackage/be3;->A()I

    .line 262
    .line 263
    .line 264
    move-result v15

    .line 265
    invoke-virtual {v2}, Ldefpackage/be3;->A()I

    .line 266
    .line 267
    .line 268
    move-result v16

    .line 269
    invoke-virtual {v2}, Ldefpackage/be3;->A()I

    .line 270
    .line 271
    .line 272
    move-result v17

    .line 273
    shl-int/2addr v15, v10

    .line 274
    shr-int/lit8 v18, v16, 0x4

    .line 275
    .line 276
    or-int v15, v15, v18

    .line 277
    .line 278
    and-int/lit8 v16, v16, 0xf

    .line 279
    .line 280
    shl-int/lit8 v16, v16, 0x8

    .line 281
    .line 282
    or-int v16, v16, v17

    .line 283
    .line 284
    new-instance v1, Landroid/graphics/Rect;

    .line 285
    .line 286
    add-int/2addr v14, v7

    .line 287
    add-int/lit8 v10, v16, 0x1

    .line 288
    .line 289
    invoke-direct {v1, v13, v15, v14, v10}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 290
    .line 291
    .line 292
    iput-object v1, v3, Ldefpackage/o85;->g:Landroid/graphics/Rect;

    .line 293
    .line 294
    goto :goto_5

    .line 295
    :pswitch_3
    invoke-virtual {v2}, Ldefpackage/be3;->a()I

    .line 296
    .line 297
    .line 298
    move-result v1

    .line 299
    if-ge v1, v6, :cond_b

    .line 300
    .line 301
    const-string v1, "Incomplete alpha command"

    .line 302
    .line 303
    invoke-static {v8, v1}, Ldefpackage/l93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    goto :goto_4

    .line 307
    :cond_b
    iget-boolean v1, v3, Ldefpackage/o85;->c:Z

    .line 308
    .line 309
    if-nez v1, :cond_c

    .line 310
    .line 311
    const-string v1, "Ignoring alpha command before color command"

    .line 312
    .line 313
    invoke-static {v8, v1}, Ldefpackage/l93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    goto :goto_4

    .line 317
    :cond_c
    invoke-virtual {v2}, Ldefpackage/be3;->A()I

    .line 318
    .line 319
    .line 320
    move-result v1

    .line 321
    invoke-virtual {v2}, Ldefpackage/be3;->A()I

    .line 322
    .line 323
    .line 324
    move-result v10

    .line 325
    aget v14, v13, v15

    .line 326
    .line 327
    move/from16 p2, v15

    .line 328
    .line 329
    shr-int/lit8 v15, v1, 0x4

    .line 330
    .line 331
    invoke-static {v14, v15}, Ldefpackage/o85;->c(II)I

    .line 332
    .line 333
    .line 334
    move-result v14

    .line 335
    aput v14, v13, p2

    .line 336
    .line 337
    aget v14, v13, v6

    .line 338
    .line 339
    and-int/lit8 v1, v1, 0xf

    .line 340
    .line 341
    invoke-static {v14, v1}, Ldefpackage/o85;->c(II)I

    .line 342
    .line 343
    .line 344
    move-result v1

    .line 345
    aput v1, v13, v6

    .line 346
    .line 347
    aget v1, v13, v7

    .line 348
    .line 349
    shr-int/lit8 v14, v10, 0x4

    .line 350
    .line 351
    invoke-static {v1, v14}, Ldefpackage/o85;->c(II)I

    .line 352
    .line 353
    .line 354
    move-result v1

    .line 355
    aput v1, v13, v7

    .line 356
    .line 357
    aget v1, v13, v0

    .line 358
    .line 359
    and-int/lit8 v10, v10, 0xf

    .line 360
    .line 361
    invoke-static {v1, v10}, Ldefpackage/o85;->c(II)I

    .line 362
    .line 363
    .line 364
    move-result v1

    .line 365
    aput v1, v13, v0

    .line 366
    .line 367
    goto/16 :goto_5

    .line 368
    .line 369
    :pswitch_4
    move/from16 p2, v15

    .line 370
    .line 371
    invoke-virtual {v2}, Ldefpackage/be3;->a()I

    .line 372
    .line 373
    .line 374
    move-result v1

    .line 375
    if-ge v1, v6, :cond_d

    .line 376
    .line 377
    const-string v1, "Incomplete color command"

    .line 378
    .line 379
    invoke-static {v8, v1}, Ldefpackage/l93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 380
    .line 381
    .line 382
    goto/16 :goto_4

    .line 383
    .line 384
    :cond_d
    invoke-virtual {v2}, Ldefpackage/be3;->A()I

    .line 385
    .line 386
    .line 387
    move-result v1

    .line 388
    invoke-virtual {v2}, Ldefpackage/be3;->A()I

    .line 389
    .line 390
    .line 391
    move-result v10

    .line 392
    iget-object v14, v3, Ldefpackage/o85;->d:[I

    .line 393
    .line 394
    shr-int/lit8 v15, v1, 0x4

    .line 395
    .line 396
    invoke-static {v14, v15}, Ldefpackage/o85;->a([II)I

    .line 397
    .line 398
    .line 399
    move-result v14

    .line 400
    aput v14, v13, p2

    .line 401
    .line 402
    iget-object v14, v3, Ldefpackage/o85;->d:[I

    .line 403
    .line 404
    and-int/lit8 v1, v1, 0xf

    .line 405
    .line 406
    invoke-static {v14, v1}, Ldefpackage/o85;->a([II)I

    .line 407
    .line 408
    .line 409
    move-result v1

    .line 410
    aput v1, v13, v6

    .line 411
    .line 412
    iget-object v1, v3, Ldefpackage/o85;->d:[I

    .line 413
    .line 414
    shr-int/lit8 v14, v10, 0x4

    .line 415
    .line 416
    invoke-static {v1, v14}, Ldefpackage/o85;->a([II)I

    .line 417
    .line 418
    .line 419
    move-result v1

    .line 420
    aput v1, v13, v7

    .line 421
    .line 422
    iget-object v1, v3, Ldefpackage/o85;->d:[I

    .line 423
    .line 424
    and-int/lit8 v10, v10, 0xf

    .line 425
    .line 426
    invoke-static {v1, v10}, Ldefpackage/o85;->a([II)I

    .line 427
    .line 428
    .line 429
    move-result v1

    .line 430
    aput v1, v13, v0

    .line 431
    .line 432
    iput-boolean v7, v3, Ldefpackage/o85;->c:Z

    .line 433
    .line 434
    goto/16 :goto_5

    .line 435
    .line 436
    :goto_6
    const/4 v1, 0x0

    .line 437
    const/4 v10, 0x4

    .line 438
    goto/16 :goto_3

    .line 439
    .line 440
    :cond_e
    if-eqz v9, :cond_f

    .line 441
    .line 442
    invoke-virtual {v2, v11}, Ldefpackage/be3;->N(I)V

    .line 443
    .line 444
    .line 445
    :cond_f
    :goto_7
    if-nez v9, :cond_12

    .line 446
    .line 447
    :goto_8
    iget-object v1, v3, Ldefpackage/o85;->d:[I

    .line 448
    .line 449
    if-eqz v1, :cond_11

    .line 450
    .line 451
    iget-boolean v1, v3, Ldefpackage/o85;->b:Z

    .line 452
    .line 453
    if-eqz v1, :cond_11

    .line 454
    .line 455
    iget-boolean v1, v3, Ldefpackage/o85;->c:Z

    .line 456
    .line 457
    if-eqz v1, :cond_11

    .line 458
    .line 459
    iget-object v1, v3, Ldefpackage/o85;->g:Landroid/graphics/Rect;

    .line 460
    .line 461
    if-eqz v1, :cond_11

    .line 462
    .line 463
    iget v5, v3, Ldefpackage/o85;->h:I

    .line 464
    .line 465
    if-eq v5, v4, :cond_11

    .line 466
    .line 467
    iget v5, v3, Ldefpackage/o85;->i:I

    .line 468
    .line 469
    if-eq v5, v4, :cond_11

    .line 470
    .line 471
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 472
    .line 473
    .line 474
    move-result v1

    .line 475
    if-lt v1, v6, :cond_11

    .line 476
    .line 477
    iget-object v1, v3, Ldefpackage/o85;->g:Landroid/graphics/Rect;

    .line 478
    .line 479
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    .line 480
    .line 481
    .line 482
    move-result v1

    .line 483
    if-ge v1, v6, :cond_10

    .line 484
    .line 485
    goto/16 :goto_9

    .line 486
    .line 487
    :cond_10
    iget-object v1, v3, Ldefpackage/o85;->g:Landroid/graphics/Rect;

    .line 488
    .line 489
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 490
    .line 491
    .line 492
    move-result v4

    .line 493
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    .line 494
    .line 495
    .line 496
    move-result v5

    .line 497
    mul-int/2addr v5, v4

    .line 498
    new-array v4, v5, [I

    .line 499
    .line 500
    new-instance v5, Ldefpackage/h00;

    .line 501
    .line 502
    invoke-direct {v5}, Ldefpackage/h00;-><init>()V

    .line 503
    .line 504
    .line 505
    iget v6, v3, Ldefpackage/o85;->h:I

    .line 506
    .line 507
    invoke-virtual {v2, v6}, Ldefpackage/be3;->N(I)V

    .line 508
    .line 509
    .line 510
    invoke-virtual {v5, v2}, Ldefpackage/h00;->p(Ldefpackage/be3;)V

    .line 511
    .line 512
    .line 513
    invoke-virtual {v3, v5, v7, v1, v4}, Ldefpackage/o85;->b(Ldefpackage/h00;ZLandroid/graphics/Rect;[I)V

    .line 514
    .line 515
    .line 516
    iget v6, v3, Ldefpackage/o85;->i:I

    .line 517
    .line 518
    invoke-virtual {v2, v6}, Ldefpackage/be3;->N(I)V

    .line 519
    .line 520
    .line 521
    invoke-virtual {v5, v2}, Ldefpackage/h00;->p(Ldefpackage/be3;)V

    .line 522
    .line 523
    .line 524
    invoke-virtual {v3, v5, v0, v1, v4}, Ldefpackage/o85;->b(Ldefpackage/h00;ZLandroid/graphics/Rect;[I)V

    .line 525
    .line 526
    .line 527
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 528
    .line 529
    .line 530
    move-result v0

    .line 531
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    .line 532
    .line 533
    .line 534
    move-result v2

    .line 535
    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 536
    .line 537
    invoke-static {v4, v0, v2, v5}, Landroid/graphics/Bitmap;->createBitmap([IIILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 538
    .line 539
    .line 540
    move-result-object v10

    .line 541
    iget v0, v1, Landroid/graphics/Rect;->left:I

    .line 542
    .line 543
    int-to-float v0, v0

    .line 544
    iget v2, v3, Ldefpackage/o85;->e:I

    .line 545
    .line 546
    int-to-float v2, v2

    .line 547
    div-float v14, v0, v2

    .line 548
    .line 549
    iget v0, v1, Landroid/graphics/Rect;->top:I

    .line 550
    .line 551
    int-to-float v0, v0

    .line 552
    iget v2, v3, Ldefpackage/o85;->f:I

    .line 553
    .line 554
    int-to-float v2, v2

    .line 555
    div-float v11, v0, v2

    .line 556
    .line 557
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 558
    .line 559
    .line 560
    move-result v0

    .line 561
    int-to-float v0, v0

    .line 562
    iget v2, v3, Ldefpackage/o85;->e:I

    .line 563
    .line 564
    int-to-float v2, v2

    .line 565
    div-float v18, v0, v2

    .line 566
    .line 567
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    .line 568
    .line 569
    .line 570
    move-result v0

    .line 571
    int-to-float v0, v0

    .line 572
    iget v1, v3, Ldefpackage/o85;->f:I

    .line 573
    .line 574
    int-to-float v1, v1

    .line 575
    div-float v19, v0, v1

    .line 576
    .line 577
    new-instance v6, Ldefpackage/ig0;

    .line 578
    .line 579
    const/4 v7, 0x0

    .line 580
    const/4 v8, 0x0

    .line 581
    const/4 v12, 0x0

    .line 582
    const/4 v13, 0x0

    .line 583
    const/4 v15, 0x0

    .line 584
    const/high16 v16, -0x80000000

    .line 585
    .line 586
    const v17, -0x800001

    .line 587
    .line 588
    .line 589
    const/16 v20, 0x0

    .line 590
    .line 591
    const/high16 v21, -0x1000000

    .line 592
    .line 593
    const/16 v23, 0x0

    .line 594
    .line 595
    const/16 v24, 0x0

    .line 596
    .line 597
    move-object v9, v8

    .line 598
    move/from16 v22, v16

    .line 599
    .line 600
    invoke-direct/range {v6 .. v24}, Ldefpackage/ig0;-><init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;Landroid/text/Layout$Alignment;Landroid/graphics/Bitmap;FIIFIIFFFZIIFI)V

    .line 601
    .line 602
    .line 603
    move-object v1, v6

    .line 604
    goto :goto_a

    .line 605
    :cond_11
    :goto_9
    const/4 v1, 0x0

    .line 606
    goto :goto_a

    .line 607
    :cond_12
    const/4 v1, 0x0

    .line 608
    goto/16 :goto_0

    .line 609
    .line 610
    :goto_a
    new-instance v2, Ldefpackage/lg0;

    .line 611
    .line 612
    if-eqz v1, :cond_13

    .line 613
    .line 614
    invoke-static {v1}, Ldefpackage/yw1;->o(Ljava/lang/Object;)Ldefpackage/gy3;

    .line 615
    .line 616
    .line 617
    move-result-object v0

    .line 618
    :goto_b
    move-object v7, v0

    .line 619
    goto :goto_c

    .line 620
    :cond_13
    sget-object v0, Ldefpackage/yw1;->o:Ldefpackage/vw1;

    .line 621
    .line 622
    sget-object v0, Ldefpackage/gy3;->r:Ldefpackage/gy3;

    .line 623
    .line 624
    goto :goto_b

    .line 625
    :goto_c
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    const-wide/32 v5, 0x4c4b40

    .line 631
    .line 632
    .line 633
    invoke-direct/range {v2 .. v7}, Ldefpackage/lg0;-><init>(JJLjava/util/List;)V

    .line 634
    .line 635
    .line 636
    move-object/from16 v0, p5

    .line 637
    .line 638
    invoke-interface {v0, v2}, Ldefpackage/wc0;->accept(Ljava/lang/Object;)V

    .line 639
    .line 640
    .line 641
    return-void

    .line 642
    nop

    .line 643
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method

.method public d(Ldefpackage/fr2;ILdefpackage/aa0;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/na4;->n:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object p0, p0, Ldefpackage/na4;->p:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, Ldefpackage/oi;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Ldefpackage/yd4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Ldefpackage/ba0;

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    iget-object p1, p0, Ldefpackage/ba0;->g:Ldefpackage/mi3;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    new-instance v1, Ldefpackage/xk0;

    .line 22
    .line 23
    const/4 v2, 0x2

    .line 24
    invoke-direct {v1, v2}, Ldefpackage/xk0;-><init>(I)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p1, Ldefpackage/mi3;->a:Ldefpackage/w71;

    .line 28
    .line 29
    invoke-virtual {v1, p1}, Ldefpackage/xk0;->c(Ldefpackage/w71;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, p2}, Ldefpackage/xk0;->b(I)V

    .line 33
    .line 34
    .line 35
    new-instance p1, Ldefpackage/mi3;

    .line 36
    .line 37
    invoke-virtual {v1}, Ldefpackage/xk0;->f()Ldefpackage/w71;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-direct {p1, p2}, Ldefpackage/mi3;-><init>(Ldefpackage/w71;)V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Ldefpackage/ba0;->g:Ldefpackage/mi3;

    .line 45
    .line 46
    iget-object p0, p0, Ldefpackage/ba0;->c:Ljava/util/ArrayDeque;

    .line 47
    .line 48
    invoke-virtual {p0, p3}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :catchall_0
    move-exception p0

    .line 53
    goto :goto_1

    .line 54
    :cond_0
    :goto_0
    monitor-exit v0

    .line 55
    return-void

    .line 56
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    throw p0
.end method

.method public declared-synchronized e(Ljava/lang/Class;Ljava/lang/Class;Ldefpackage/vw2;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    new-instance v0, Ldefpackage/cz2;

    .line 3
    .line 4
    invoke-direct {v0, p1, p2, p3}, Ldefpackage/cz2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ldefpackage/vw2;)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Ldefpackage/na4;->n:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    invoke-virtual {p1, p2, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    monitor-exit p0

    .line 19
    return-void

    .line 20
    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    throw p1

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    goto :goto_0
.end method

.method public declared-synchronized f(Ljava/lang/Class;Ljava/lang/Class;)Ldefpackage/uw2;
    .locals 9

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Ldefpackage/na4;->n:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x0

    .line 16
    move v4, v3

    .line 17
    move v5, v4

    .line 18
    :cond_0
    :goto_0
    const/4 v6, 0x1

    .line 19
    if-ge v5, v2, :cond_3

    .line 20
    .line 21
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v7

    .line 25
    add-int/lit8 v5, v5, 0x1

    .line 26
    .line 27
    check-cast v7, Ldefpackage/cz2;

    .line 28
    .line 29
    iget-object v8, p0, Ldefpackage/na4;->p:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v8, Ljava/util/HashSet;

    .line 32
    .line 33
    invoke-virtual {v8, v7}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v8

    .line 37
    if-eqz v8, :cond_1

    .line 38
    .line 39
    move v4, v6

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    iget-object v8, v7, Ldefpackage/cz2;->a:Ljava/lang/Class;

    .line 42
    .line 43
    invoke-virtual {v8, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 44
    .line 45
    .line 46
    move-result v8

    .line 47
    if-eqz v8, :cond_2

    .line 48
    .line 49
    iget-object v8, v7, Ldefpackage/cz2;->b:Ljava/lang/Class;

    .line 50
    .line 51
    invoke-virtual {v8, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 52
    .line 53
    .line 54
    move-result v8

    .line 55
    if-eqz v8, :cond_2

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    move v6, v3

    .line 59
    :goto_1
    if-eqz v6, :cond_0

    .line 60
    .line 61
    iget-object v6, p0, Ldefpackage/na4;->p:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v6, Ljava/util/HashSet;

    .line 64
    .line 65
    invoke-virtual {v6, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    iget-object v6, v7, Ldefpackage/cz2;->c:Ldefpackage/vw2;

    .line 69
    .line 70
    invoke-interface {v6, p0}, Ldefpackage/vw2;->a(Ldefpackage/na4;)Ldefpackage/uw2;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    iget-object v6, p0, Ldefpackage/na4;->p:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v6, Ljava/util/HashSet;

    .line 80
    .line 81
    invoke-virtual {v6, v7}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :catchall_0
    move-exception p1

    .line 86
    goto :goto_2

    .line 87
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-le v1, v6, :cond_4

    .line 92
    .line 93
    iget-object p1, p0, Ldefpackage/na4;->o:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast p1, Ldefpackage/tv1;

    .line 96
    .line 97
    iget-object p2, p0, Ldefpackage/na4;->q:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast p2, Ldefpackage/i61;

    .line 100
    .line 101
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    new-instance p1, Ldefpackage/lk;

    .line 105
    .line 106
    const/4 v1, 0x2

    .line 107
    invoke-direct {p1, v1, v0, p2}, Ldefpackage/lk;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 108
    .line 109
    .line 110
    monitor-exit p0

    .line 111
    return-object p1

    .line 112
    :cond_4
    :try_start_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    if-ne v1, v6, :cond_5

    .line 117
    .line 118
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    check-cast p1, Ldefpackage/uw2;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 123
    .line 124
    monitor-exit p0

    .line 125
    return-object p1

    .line 126
    :cond_5
    if-eqz v4, :cond_6

    .line 127
    .line 128
    :try_start_2
    sget-object p1, Ldefpackage/na4;->s:Ldefpackage/l15;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 129
    .line 130
    monitor-exit p0

    .line 131
    return-object p1

    .line 132
    :cond_6
    :try_start_3
    new-instance v0, Lcom/bumptech/glide/Registry$NoModelLoaderAvailableException;

    .line 133
    .line 134
    new-instance v1, Ljava/lang/StringBuilder;

    .line 135
    .line 136
    const-string v2, "Failed to find any ModelLoaders for model: "

    .line 137
    .line 138
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    const-string p1, " and data: "

    .line 145
    .line 146
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 160
    :goto_2
    :try_start_4
    iget-object p2, p0, Ldefpackage/na4;->p:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast p2, Ljava/util/HashSet;

    .line 163
    .line 164
    invoke-virtual {p2}, Ljava/util/HashSet;->clear()V

    .line 165
    .line 166
    .line 167
    throw p1

    .line 168
    :catchall_1
    move-exception p1

    .line 169
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 170
    throw p1
.end method

.method public g(Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p2, p0, Ldefpackage/na4;->o:Ljava/lang/Object;

    .line 5
    .line 6
    move-object v2, p2

    .line 7
    check-cast v2, Ldefpackage/jx3;

    .line 8
    .line 9
    iget-object p2, p0, Ldefpackage/na4;->p:Ljava/lang/Object;

    .line 10
    .line 11
    move-object v4, p2

    .line 12
    check-cast v4, Ldefpackage/jx3;

    .line 13
    .line 14
    iget-object p2, p0, Ldefpackage/na4;->n:Ljava/lang/Object;

    .line 15
    .line 16
    move-object v5, p2

    .line 17
    check-cast v5, Ldefpackage/vb4;

    .line 18
    .line 19
    iget-object p0, p0, Ldefpackage/na4;->q:Ljava/lang/Object;

    .line 20
    .line 21
    move-object v6, p0

    .line 22
    check-cast v6, Landroidx/preference/Preference;

    .line 23
    .line 24
    new-instance v1, Ldefpackage/do1;

    .line 25
    .line 26
    const/4 p0, 0x1

    .line 27
    invoke-direct {v1, p0, p1}, Ldefpackage/do1;-><init>(ILjava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const p0, 0x7f130210

    .line 31
    .line 32
    .line 33
    invoke-virtual {v5, p0}, Ldefpackage/kc1;->s(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    sget-object p0, Ldefpackage/io1;->a:Ljava/util/concurrent/ExecutorService;

    .line 41
    .line 42
    new-instance v0, Ldefpackage/up;

    .line 43
    .line 44
    const/4 v7, 0x2

    .line 45
    invoke-direct/range {v0 .. v7}, Ldefpackage/up;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 46
    .line 47
    .line 48
    invoke-interface {p0, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public declared-synchronized h(Ljava/lang/Class;)Ljava/util/ArrayList;
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Ldefpackage/na4;->n:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x0

    .line 16
    :cond_0
    :goto_0
    if-ge v3, v2, :cond_2

    .line 17
    .line 18
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    add-int/lit8 v3, v3, 0x1

    .line 23
    .line 24
    check-cast v4, Ldefpackage/cz2;

    .line 25
    .line 26
    iget-object v5, p0, Ldefpackage/na4;->p:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v5, Ljava/util/HashSet;

    .line 29
    .line 30
    invoke-virtual {v5, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-eqz v5, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    iget-object v5, v4, Ldefpackage/cz2;->a:Ljava/lang/Class;

    .line 38
    .line 39
    invoke-virtual {v5, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    if-eqz v5, :cond_0

    .line 44
    .line 45
    iget-object v5, p0, Ldefpackage/na4;->p:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v5, Ljava/util/HashSet;

    .line 48
    .line 49
    invoke-virtual {v5, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    iget-object v5, v4, Ldefpackage/cz2;->c:Ldefpackage/vw2;

    .line 53
    .line 54
    invoke-interface {v5, p0}, Ldefpackage/vw2;->a(Ldefpackage/na4;)Ldefpackage/uw2;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    iget-object v5, p0, Ldefpackage/na4;->p:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v5, Ljava/util/HashSet;

    .line 64
    .line 65
    invoke-virtual {v5, v4}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :catchall_0
    move-exception p1

    .line 70
    goto :goto_1

    .line 71
    :cond_2
    monitor-exit p0

    .line 72
    return-object v0

    .line 73
    :goto_1
    :try_start_1
    iget-object v0, p0, Ldefpackage/na4;->p:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v0, Ljava/util/HashSet;

    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 78
    .line 79
    .line 80
    throw p1

    .line 81
    :catchall_1
    move-exception p1

    .line 82
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 83
    throw p1
.end method

.method public i(Ldefpackage/gl4;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ldefpackage/na4;->p:Ljava/lang/Object;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    iget-object v1, p0, Ldefpackage/na4;->q:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Ljava/lang/Runnable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    monitor-exit v0

    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    iget-object p0, p0, Ldefpackage/na4;->n:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p0, Ldefpackage/hg3;

    .line 23
    .line 24
    iget-object p0, p0, Ldefpackage/hg3;->o:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, Landroid/os/Handler;

    .line 27
    .line 28
    invoke-virtual {p0, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void

    .line 32
    :catchall_0
    move-exception p0

    .line 33
    monitor-exit v0

    .line 34
    throw p0
.end method

.method public j(Ldefpackage/rg4;I)Z
    .locals 2

    .line 1
    iget-object v0, p1, Ldefpackage/rg4;->a:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ldefpackage/br;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, Ldefpackage/na4;->o:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Landroid/os/Handler;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    sget-object p0, Ldefpackage/fr;->z:Landroid/os/Handler;

    .line 20
    .line 21
    iget-object p1, v0, Ldefpackage/br;->a:Ldefpackage/fr;

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    invoke-virtual {p0, v0, p2, v1, p1}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 29
    .line 30
    .line 31
    return v0

    .line 32
    :cond_0
    return v1
.end method

.method public k()Ldefpackage/hr4;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Ldefpackage/na4;->n:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Landroid/content/Context;

    .line 6
    .line 7
    iget-object v2, v0, Ldefpackage/na4;->q:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Ljava/util/ArrayList;

    .line 10
    .line 11
    iget-object v3, v0, Ldefpackage/na4;->o:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v3, Landroid/content/Intent;

    .line 14
    .line 15
    iget-object v4, v0, Ldefpackage/na4;->p:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v4, Ldefpackage/t23;

    .line 18
    .line 19
    if-eqz v4, :cond_8

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    if-nez v6, :cond_7

    .line 26
    .line 27
    new-instance v6, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    new-instance v7, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 38
    .line 39
    .line 40
    move-result v8

    .line 41
    const/4 v9, 0x0

    .line 42
    move v11, v9

    .line 43
    const/4 v10, 0x0

    .line 44
    :goto_0
    if-ge v11, v8, :cond_2

    .line 45
    .line 46
    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v12

    .line 50
    add-int/lit8 v11, v11, 0x1

    .line 51
    .line 52
    check-cast v12, Ldefpackage/o23;

    .line 53
    .line 54
    iget v13, v12, Ldefpackage/o23;->a:I

    .line 55
    .line 56
    iget-object v12, v12, Ldefpackage/o23;->b:Landroid/os/Bundle;

    .line 57
    .line 58
    invoke-virtual {v0, v13}, Ldefpackage/na4;->o(I)Ldefpackage/r23;

    .line 59
    .line 60
    .line 61
    move-result-object v14

    .line 62
    if-eqz v14, :cond_1

    .line 63
    .line 64
    invoke-virtual {v14, v10}, Ldefpackage/r23;->b(Ldefpackage/r23;)[I

    .line 65
    .line 66
    .line 67
    move-result-object v10

    .line 68
    array-length v13, v10

    .line 69
    move v15, v9

    .line 70
    :goto_1
    if-ge v15, v13, :cond_0

    .line 71
    .line 72
    aget v16, v10, v15

    .line 73
    .line 74
    const/16 v17, 0x0

    .line 75
    .line 76
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    invoke-virtual {v7, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    add-int/lit8 v15, v15, 0x1

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_0
    move-object v10, v14

    .line 90
    goto :goto_0

    .line 91
    :cond_1
    const/16 v17, 0x0

    .line 92
    .line 93
    sget v0, Ldefpackage/r23;->w:I

    .line 94
    .line 95
    invoke-static {v1, v13}, Ldefpackage/ya4;->v(Landroid/content/Context;I)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    const-string v1, "Navigation destination "

    .line 100
    .line 101
    const-string v2, " cannot be found in the navigation graph "

    .line 102
    .line 103
    invoke-static {v1, v0, v2, v4}, Ldefpackage/tb4;->h(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    return-object v17

    .line 107
    :cond_2
    invoke-static {v6}, Ldefpackage/q40;->P0(Ljava/util/List;)[I

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    const-string v2, "android-support-nav:controller:deepLinkIds"

    .line 112
    .line 113
    invoke-virtual {v3, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[I)Landroid/content/Intent;

    .line 114
    .line 115
    .line 116
    const-string v0, "android-support-nav:controller:deepLinkArgs"

    .line 117
    .line 118
    invoke-virtual {v3, v0, v7}, Landroid/content/Intent;->putParcelableArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 119
    .line 120
    .line 121
    new-instance v0, Ldefpackage/hr4;

    .line 122
    .line 123
    invoke-direct {v0, v1}, Ldefpackage/hr4;-><init>(Landroid/content/Context;)V

    .line 124
    .line 125
    .line 126
    new-instance v1, Landroid/content/Intent;

    .line 127
    .line 128
    invoke-direct {v1, v3}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    if-nez v2, :cond_3

    .line 136
    .line 137
    iget-object v2, v0, Ldefpackage/hr4;->o:Landroid/content/Context;

    .line 138
    .line 139
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    invoke-virtual {v1, v2}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    :cond_3
    if-eqz v2, :cond_4

    .line 148
    .line 149
    invoke-virtual {v0, v2}, Ldefpackage/hr4;->a(Landroid/content/ComponentName;)V

    .line 150
    .line 151
    .line 152
    :cond_4
    iget-object v2, v0, Ldefpackage/hr4;->n:Ljava/util/ArrayList;

    .line 153
    .line 154
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    :goto_2
    if-ge v9, v1, :cond_6

    .line 162
    .line 163
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    check-cast v4, Landroid/content/Intent;

    .line 168
    .line 169
    if-eqz v4, :cond_5

    .line 170
    .line 171
    const-string v5, "android-support-nav:controller:deepLinkIntent"

    .line 172
    .line 173
    invoke-virtual {v4, v5, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 174
    .line 175
    .line 176
    :cond_5
    add-int/lit8 v9, v9, 0x1

    .line 177
    .line 178
    goto :goto_2

    .line 179
    :cond_6
    return-object v0

    .line 180
    :cond_7
    const/16 v17, 0x0

    .line 181
    .line 182
    const-string v0, "You must call setDestination() or addDestination() before constructing the deep link"

    .line 183
    .line 184
    invoke-static {v0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    return-object v17

    .line 188
    :cond_8
    const/16 v17, 0x0

    .line 189
    .line 190
    const-string v0, "You must call setGraph() before constructing the deep link"

    .line 191
    .line 192
    invoke-static {v0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    return-object v17
.end method

.method public l(JJLdefpackage/wd0;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p5, Ldefpackage/z43;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, Ldefpackage/z43;

    .line 7
    .line 8
    iget v1, v0, Ldefpackage/z43;->p:I

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
    iput v1, v0, Ldefpackage/z43;->p:I

    .line 18
    .line 19
    :goto_0
    move-object p5, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, Ldefpackage/z43;

    .line 22
    .line 23
    invoke-direct {v0, p0, p5}, Ldefpackage/z43;-><init>(Ldefpackage/na4;Ldefpackage/wd0;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object v0, p5, Ldefpackage/z43;->n:Ljava/lang/Object;

    .line 28
    .line 29
    iget v1, p5, Ldefpackage/z43;->p:I

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    const/4 v3, 0x2

    .line 33
    const/4 v4, 0x1

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
    invoke-static {v0}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_5

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-object v2

    .line 50
    :cond_2
    invoke-static {v0}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto :goto_3

    .line 54
    :cond_3
    invoke-static {v0}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object v0, p0, Ldefpackage/na4;->n:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v0, Ldefpackage/e53;

    .line 60
    .line 61
    if-eqz v0, :cond_4

    .line 62
    .line 63
    invoke-virtual {v0}, Ldefpackage/e53;->r0()Ldefpackage/e53;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    goto :goto_2

    .line 68
    :cond_4
    move-object v0, v2

    .line 69
    :goto_2
    const-wide/16 v5, 0x0

    .line 70
    .line 71
    sget-object v1, Ldefpackage/xe0;->n:Ldefpackage/xe0;

    .line 72
    .line 73
    if-nez v0, :cond_6

    .line 74
    .line 75
    iget-object p0, p0, Ldefpackage/na4;->o:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast p0, Ldefpackage/e53;

    .line 78
    .line 79
    if-eqz p0, :cond_9

    .line 80
    .line 81
    iput v4, p5, Ldefpackage/z43;->p:I

    .line 82
    .line 83
    invoke-virtual/range {p0 .. p5}, Ldefpackage/e53;->b0(JJLdefpackage/vd0;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    if-ne v0, v1, :cond_5

    .line 88
    .line 89
    goto :goto_4

    .line 90
    :cond_5
    :goto_3
    check-cast v0, Ldefpackage/k45;

    .line 91
    .line 92
    iget-wide v5, v0, Ldefpackage/k45;->a:J

    .line 93
    .line 94
    goto :goto_6

    .line 95
    :cond_6
    iget-object p0, p0, Ldefpackage/na4;->n:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast p0, Ldefpackage/e53;

    .line 98
    .line 99
    if-eqz p0, :cond_7

    .line 100
    .line 101
    invoke-virtual {p0}, Ldefpackage/e53;->r0()Ldefpackage/e53;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    :cond_7
    move-object p0, v2

    .line 106
    if-eqz p0, :cond_9

    .line 107
    .line 108
    iput v3, p5, Ldefpackage/z43;->p:I

    .line 109
    .line 110
    invoke-virtual/range {p0 .. p5}, Ldefpackage/e53;->b0(JJLdefpackage/vd0;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    if-ne v0, v1, :cond_8

    .line 115
    .line 116
    :goto_4
    return-object v1

    .line 117
    :cond_8
    :goto_5
    check-cast v0, Ldefpackage/k45;

    .line 118
    .line 119
    iget-wide v5, v0, Ldefpackage/k45;->a:J

    .line 120
    .line 121
    :cond_9
    :goto_6
    new-instance p0, Ldefpackage/k45;

    .line 122
    .line 123
    invoke-direct {p0, v5, v6}, Ldefpackage/k45;-><init>(J)V

    .line 124
    .line 125
    .line 126
    return-object p0
.end method

.method public m(JLdefpackage/wd0;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p3, Ldefpackage/a53;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Ldefpackage/a53;

    .line 7
    .line 8
    iget v1, v0, Ldefpackage/a53;->p:I

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
    iput v1, v0, Ldefpackage/a53;->p:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ldefpackage/a53;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Ldefpackage/a53;-><init>(Ldefpackage/na4;Ldefpackage/wd0;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Ldefpackage/a53;->n:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Ldefpackage/a53;->p:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v3, :cond_1

    .line 34
    .line 35
    invoke-static {p3}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 40
    .line 41
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-object v2

    .line 45
    :cond_2
    invoke-static {p3}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object p0, p0, Ldefpackage/na4;->n:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p0, Ldefpackage/e53;

    .line 51
    .line 52
    if-eqz p0, :cond_3

    .line 53
    .line 54
    invoke-virtual {p0}, Ldefpackage/e53;->r0()Ldefpackage/e53;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    :cond_3
    if-eqz v2, :cond_5

    .line 59
    .line 60
    iput v3, v0, Ldefpackage/a53;->p:I

    .line 61
    .line 62
    invoke-virtual {v2, p1, p2, v0}, Ldefpackage/e53;->s(JLdefpackage/vd0;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p3

    .line 66
    sget-object p0, Ldefpackage/xe0;->n:Ldefpackage/xe0;

    .line 67
    .line 68
    if-ne p3, p0, :cond_4

    .line 69
    .line 70
    return-object p0

    .line 71
    :cond_4
    :goto_1
    check-cast p3, Ldefpackage/k45;

    .line 72
    .line 73
    iget-wide p0, p3, Ldefpackage/k45;->a:J

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_5
    const-wide/16 p0, 0x0

    .line 77
    .line 78
    :goto_2
    new-instance p2, Ldefpackage/k45;

    .line 79
    .line 80
    invoke-direct {p2, p0, p1}, Ldefpackage/k45;-><init>(J)V

    .line 81
    .line 82
    .line 83
    return-object p2
.end method

.method public declared-synchronized n()Ljava/util/concurrent/ExecutorService;
    .locals 9

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Ldefpackage/na4;->n:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 9
    .line 10
    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 11
    .line 12
    new-instance v7, Ljava/util/concurrent/SynchronousQueue;

    .line 13
    .line 14
    invoke-direct {v7}, Ljava/util/concurrent/SynchronousQueue;-><init>()V

    .line 15
    .line 16
    .line 17
    new-instance v0, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    sget-object v2, Ldefpackage/ze5;->c:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v2, " Dispatcher"

    .line 28
    .line 29
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    new-instance v8, Ldefpackage/ye5;

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    invoke-direct {v8, v0, v2}, Ldefpackage/ye5;-><init>(Ljava/lang/String;Z)V

    .line 40
    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    const v3, 0x7fffffff

    .line 44
    .line 45
    .line 46
    const-wide/16 v4, 0x3c

    .line 47
    .line 48
    invoke-direct/range {v1 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 49
    .line 50
    .line 51
    iput-object v1, p0, Ldefpackage/na4;->n:Ljava/lang/Object;

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :catchall_0
    move-exception v0

    .line 55
    goto :goto_1

    .line 56
    :cond_0
    :goto_0
    iget-object v0, p0, Ldefpackage/na4;->n:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    .line 62
    .line 63
    monitor-exit p0

    .line 64
    return-object v0

    .line 65
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 66
    throw v0
.end method

.method public o(I)Ldefpackage/r23;
    .locals 2

    .line 1
    new-instance v0, Ldefpackage/ii;

    .line 2
    .line 3
    invoke-direct {v0}, Ldefpackage/ii;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Ldefpackage/na4;->p:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Ldefpackage/t23;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ldefpackage/ii;->addLast(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {v0}, Ldefpackage/ii;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-nez p0, :cond_2

    .line 21
    .line 22
    invoke-virtual {v0}, Ldefpackage/ii;->removeFirst()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, Ldefpackage/r23;

    .line 27
    .line 28
    iget v1, p0, Ldefpackage/r23;->u:I

    .line 29
    .line 30
    if-ne v1, p1, :cond_1

    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_1
    instance-of v1, p0, Ldefpackage/t23;

    .line 34
    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    check-cast p0, Ldefpackage/t23;

    .line 38
    .line 39
    new-instance v1, Ldefpackage/s23;

    .line 40
    .line 41
    invoke-direct {v1, p0}, Ldefpackage/s23;-><init>(Ldefpackage/t23;)V

    .line 42
    .line 43
    .line 44
    :goto_0
    invoke-virtual {v1}, Ldefpackage/s23;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-eqz p0, :cond_0

    .line 49
    .line 50
    invoke-virtual {v1}, Ldefpackage/s23;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    check-cast p0, Ldefpackage/r23;

    .line 55
    .line 56
    invoke-virtual {v0, p0}, Ldefpackage/ii;->addLast(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    const/4 p0, 0x0

    .line 61
    return-object p0
.end method

.method public p(Ljava/util/ArrayDeque;Ljava/lang/Object;)V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p1, p2}, Ljava/util/ArrayDeque;->remove(Ljava/lang/Object;)Z

    .line 3
    .line 4
    .line 5
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    monitor-exit p0

    .line 9
    invoke-virtual {p0}, Ldefpackage/na4;->L()V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/AssertionError;

    .line 14
    .line 15
    const-string p2, "Call wasn\'t in-flight!"

    .line 16
    .line 17
    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    monitor-exit p0

    .line 23
    throw p1
.end method

.method public q(Ldefpackage/yu3;)V
    .locals 1

    .line 1
    iget-object v0, p1, Ldefpackage/yu3;->o:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ldefpackage/na4;->p:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/util/ArrayDeque;

    .line 9
    .line 10
    invoke-virtual {p0, v0, p1}, Ldefpackage/na4;->p(Ljava/util/ArrayDeque;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public r(Ldefpackage/ba0;)V
    .locals 12

    .line 1
    iget-object v0, p0, Ldefpackage/na4;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ldefpackage/tn2;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    new-instance v6, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    const/4 v8, 0x1

    .line 17
    invoke-direct {v6, v8}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 18
    .line 19
    .line 20
    :goto_0
    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    const/4 v9, 0x0

    .line 27
    invoke-virtual {v6, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 28
    .line 29
    .line 30
    iget-object v1, p1, Ldefpackage/ba0;->c:Ljava/util/ArrayDeque;

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    move-object v3, v1

    .line 37
    check-cast v3, Ldefpackage/aa0;

    .line 38
    .line 39
    if-nez v3, :cond_1

    .line 40
    .line 41
    iput-boolean v9, p1, Ldefpackage/ba0;->f:Z

    .line 42
    .line 43
    return-void

    .line 44
    :cond_1
    new-instance v4, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 45
    .line 46
    invoke-direct {v4, v8}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 47
    .line 48
    .line 49
    iget-object v10, v0, Ldefpackage/tn2;->l:Landroid/os/Handler;

    .line 50
    .line 51
    iget-object v1, p1, Ldefpackage/ba0;->a:Ljava/lang/Object;

    .line 52
    .line 53
    invoke-virtual {p0, v1}, Ldefpackage/na4;->w(Ljava/lang/Object;)Ldefpackage/fr2;

    .line 54
    .line 55
    .line 56
    move-result-object v11

    .line 57
    new-instance v1, Ldefpackage/mr;

    .line 58
    .line 59
    const/4 v7, 0x1

    .line 60
    move-object v2, p0

    .line 61
    move-object v5, p1

    .line 62
    invoke-direct/range {v1 .. v7}, Ldefpackage/mr;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 63
    .line 64
    .line 65
    new-instance p0, Ldefpackage/ur2;

    .line 66
    .line 67
    invoke-direct {p0, v0, v11, v1}, Ldefpackage/ur2;-><init>(Ldefpackage/tn2;Ldefpackage/fr2;Ljava/lang/Runnable;)V

    .line 68
    .line 69
    .line 70
    invoke-static {v10, p0}, Ldefpackage/f35;->W(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v4, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 74
    .line 75
    .line 76
    move-object p0, v2

    .line 77
    goto :goto_0

    .line 78
    :cond_2
    :goto_1
    return-void
.end method

.method public s(Ldefpackage/fr2;)V
    .locals 5

    .line 1
    iget-object v0, p0, Ldefpackage/na4;->n:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Ldefpackage/na4;->p:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, Ldefpackage/oi;

    .line 7
    .line 8
    invoke-virtual {v1, p1}, Ldefpackage/yd4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Ldefpackage/ba0;

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    monitor-exit v0

    .line 17
    return-void

    .line 18
    :catchall_0
    move-exception p0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget-object v2, v1, Ldefpackage/ba0;->g:Ldefpackage/mi3;

    .line 21
    .line 22
    sget-object v3, Ldefpackage/mi3;->b:Ldefpackage/mi3;

    .line 23
    .line 24
    iput-object v3, v1, Ldefpackage/ba0;->g:Ldefpackage/mi3;

    .line 25
    .line 26
    iget-object v3, v1, Ldefpackage/ba0;->c:Ljava/util/ArrayDeque;

    .line 27
    .line 28
    new-instance v4, Ldefpackage/z90;

    .line 29
    .line 30
    invoke-direct {v4, p0, p1, v2}, Ldefpackage/z90;-><init>(Ldefpackage/na4;Ldefpackage/fr2;Ldefpackage/mi3;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3, v4}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    iget-boolean p1, v1, Ldefpackage/ba0;->f:Z

    .line 37
    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    monitor-exit v0

    .line 41
    return-void

    .line 42
    :cond_1
    const/4 p1, 0x1

    .line 43
    iput-boolean p1, v1, Ldefpackage/ba0;->f:Z

    .line 44
    .line 45
    invoke-virtual {p0, v1}, Ldefpackage/na4;->r(Ldefpackage/ba0;)V

    .line 46
    .line 47
    .line 48
    monitor-exit v0

    .line 49
    return-void

    .line 50
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    throw p0
.end method

.method public t(Ldefpackage/fr2;)Ldefpackage/mi3;
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/na4;->n:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object p0, p0, Ldefpackage/na4;->p:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, Ldefpackage/oi;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Ldefpackage/yd4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Ldefpackage/ba0;

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    iget-object p0, p0, Ldefpackage/ba0;->e:Ldefpackage/mi3;

    .line 17
    .line 18
    monitor-exit v0

    .line 19
    return-object p0

    .line 20
    :catchall_0
    move-exception p0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    monitor-exit v0

    .line 23
    const/4 p0, 0x0

    .line 24
    return-object p0

    .line 25
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    throw p0
.end method

.method public u()Ldefpackage/yw1;
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/na4;->n:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object p0, p0, Ldefpackage/na4;->o:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, Ldefpackage/oi;

    .line 7
    .line 8
    invoke-virtual {p0}, Ldefpackage/oi;->values()Ljava/util/Collection;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-static {p0}, Ldefpackage/yw1;->k(Ljava/util/Collection;)Ldefpackage/yw1;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    monitor-exit v0

    .line 17
    return-object p0

    .line 18
    :catchall_0
    move-exception p0

    .line 19
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    throw p0
.end method

.method public v(Ljava/lang/String;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/na4;->n:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Ldefpackage/vb4;

    .line 6
    .line 7
    invoke-static {p0, p1}, Ldefpackage/bu;->f(Ldefpackage/vb4;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public w(Ljava/lang/Object;)Ldefpackage/fr2;
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/na4;->n:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object p0, p0, Ldefpackage/na4;->o:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, Ldefpackage/oi;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Ldefpackage/yd4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Ldefpackage/fr2;

    .line 13
    .line 14
    monitor-exit v0

    .line 15
    return-object p0

    .line 16
    :catchall_0
    move-exception p0

    .line 17
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    throw p0
.end method

.method public x()Ldefpackage/we0;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/na4;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/gf1;

    .line 4
    .line 5
    invoke-interface {p0}, Ldefpackage/gf1;->invoke()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ldefpackage/we0;

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    const-string p0, "in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first."

    .line 15
    .line 16
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0
.end method

.method public declared-synchronized y(Ljava/lang/Class;)Ljava/util/ArrayList;
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Ldefpackage/na4;->n:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x0

    .line 16
    :cond_0
    :goto_0
    if-ge v3, v2, :cond_1

    .line 17
    .line 18
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    add-int/lit8 v3, v3, 0x1

    .line 23
    .line 24
    check-cast v4, Ldefpackage/cz2;

    .line 25
    .line 26
    iget-object v5, v4, Ldefpackage/cz2;->b:Ljava/lang/Class;

    .line 27
    .line 28
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    if-nez v5, :cond_0

    .line 33
    .line 34
    iget-object v5, v4, Ldefpackage/cz2;->a:Ljava/lang/Class;

    .line 35
    .line 36
    invoke-virtual {v5, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-eqz v5, :cond_0

    .line 41
    .line 42
    iget-object v4, v4, Ldefpackage/cz2;->b:Ljava/lang/Class;

    .line 43
    .line 44
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :catchall_0
    move-exception p1

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    monitor-exit p0

    .line 51
    return-object v0

    .line 52
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 53
    throw p1
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
