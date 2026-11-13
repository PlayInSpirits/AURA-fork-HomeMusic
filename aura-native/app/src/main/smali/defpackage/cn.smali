.class public final synthetic Ldefpackage/cn;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/st;
.implements Ldefpackage/qc2;
.implements Ldefpackage/mn0;
.implements Ldefpackage/g3;
.implements Ldefpackage/ns;
.implements Ldefpackage/gz3;
.implements Ldefpackage/p5;
.implements Ldefpackage/ep3;
.implements Ldefpackage/ne4;
.implements Ldefpackage/np4;
.implements Ldefpackage/zd1;
.implements Ldefpackage/r83;
.implements Ldefpackage/lm2;
.implements Ldefpackage/yr2;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILandroid/app/PendingIntent;)V
    .locals 0

    .line 17
    const/16 p1, 0x1b

    iput p1, p0, Ldefpackage/cn;->n:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ldefpackage/cn;->o:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 13
    iput p1, p0, Ldefpackage/cn;->n:I

    iput-object p2, p0, Ldefpackage/cn;->o:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ldefpackage/q9;Ldefpackage/bj0;)V
    .locals 0

    .line 14
    const/4 p1, 0x3

    iput p1, p0, Ldefpackage/cn;->n:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ldefpackage/cn;->o:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ldefpackage/q9;Ldefpackage/ed2;Ldefpackage/un2;Ljava/io/IOException;Z)V
    .locals 0

    .line 15
    const/4 p1, 0x4

    iput p1, p0, Ldefpackage/cn;->n:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Ldefpackage/cn;->o:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ldefpackage/q9;Ljava/lang/Object;J)V
    .locals 0

    .line 16
    const/4 p1, 0x5

    iput p1, p0, Ldefpackage/cn;->n:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ldefpackage/cn;->o:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ldefpackage/va4;)V
    .locals 1

    .line 1
    const/16 v0, 0x1d

    .line 2
    .line 3
    iput v0, p0, Ldefpackage/cn;->n:I

    .line 4
    .line 5
    sget-object v0, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Ldefpackage/cn;->o:Ljava/lang/Object;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public a(Landroid/view/MenuItem;)Z
    .locals 3

    .line 1
    iget-object p0, p0, Ldefpackage/cn;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lcom/eddyizm/tempus/ui/crash/CrashActivity;

    .line 4
    .line 5
    sget v0, Lcom/eddyizm/tempus/ui/crash/CrashActivity;->T:I

    .line 6
    .line 7
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    const v0, 0x7f0a018a

    .line 12
    .line 13
    .line 14
    const-string v1, "Crash Landing"

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    if-ne p1, v0, :cond_0

    .line 18
    .line 19
    new-instance p1, Ldefpackage/if0;

    .line 20
    .line 21
    invoke-direct {p1}, Ldefpackage/if0;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p1, v1}, Lcom/eddyizm/tempus/ui/crash/CrashActivity;->p(Ldefpackage/kc1;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return v2

    .line 28
    :cond_0
    const v0, 0x7f0a018b

    .line 29
    .line 30
    .line 31
    if-ne p1, v0, :cond_1

    .line 32
    .line 33
    new-instance p1, Ldefpackage/jf0;

    .line 34
    .line 35
    invoke-direct {p1}, Ldefpackage/jf0;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, p1, v1}, Lcom/eddyizm/tempus/ui/crash/CrashActivity;->p(Ldefpackage/kc1;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return v2

    .line 42
    :cond_1
    const v0, 0x7f0a0189

    .line 43
    .line 44
    .line 45
    if-ne p1, v0, :cond_2

    .line 46
    .line 47
    new-instance p1, Ldefpackage/gf0;

    .line 48
    .line 49
    invoke-direct {p1}, Ldefpackage/gf0;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, p1, v1}, Lcom/eddyizm/tempus/ui/crash/CrashActivity;->p(Ldefpackage/kc1;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return v2

    .line 56
    :cond_2
    const/4 p0, 0x0

    .line 57
    return p0
.end method

.method public b(Ldefpackage/om1;ILandroid/os/Bundle;)Z
    .locals 6

    .line 1
    iget-object p0, p0, Ldefpackage/cn;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/hg;

    .line 4
    .line 5
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    .line 7
    const/16 v1, 0x19

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x1

    .line 11
    if-lt v0, v1, :cond_1

    .line 12
    .line 13
    and-int/2addr p2, v3

    .line 14
    if-eqz p2, :cond_1

    .line 15
    .line 16
    :try_start_0
    iget-object p2, p1, Ldefpackage/om1;->o:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p2, Ldefpackage/nz1;

    .line 19
    .line 20
    invoke-interface {p2}, Ldefpackage/nz1;->b()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    .line 23
    iget-object p2, p1, Ldefpackage/om1;->o:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p2, Ldefpackage/nz1;

    .line 26
    .line 27
    invoke-interface {p2}, Ldefpackage/nz1;->d()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    check-cast p2, Landroid/os/Parcelable;

    .line 32
    .line 33
    if-nez p3, :cond_0

    .line 34
    .line 35
    new-instance p3, Landroid/os/Bundle;

    .line 36
    .line 37
    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    new-instance v1, Landroid/os/Bundle;

    .line 42
    .line 43
    invoke-direct {v1, p3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 44
    .line 45
    .line 46
    move-object p3, v1

    .line 47
    :goto_0
    const-string v1, "androidx.core.view.extra.INPUT_CONTENT_INFO"

    .line 48
    .line 49
    invoke-virtual {p3, v1, p2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :catch_0
    move-exception p0

    .line 54
    const-string p1, "InputConnectionCompat"

    .line 55
    .line 56
    const-string p2, "Can\'t insert content from IME; requestPermission() failed"

    .line 57
    .line 58
    invoke-static {p1, p2, p0}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 59
    .line 60
    .line 61
    return v2

    .line 62
    :cond_1
    :goto_1
    new-instance p2, Landroid/content/ClipData;

    .line 63
    .line 64
    iget-object p1, p1, Ldefpackage/om1;->o:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p1, Ldefpackage/nz1;

    .line 67
    .line 68
    invoke-interface {p1}, Ldefpackage/nz1;->getDescription()Landroid/content/ClipDescription;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    new-instance v4, Landroid/content/ClipData$Item;

    .line 73
    .line 74
    invoke-interface {p1}, Ldefpackage/nz1;->a()Landroid/net/Uri;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    invoke-direct {v4, v5}, Landroid/content/ClipData$Item;-><init>(Landroid/net/Uri;)V

    .line 79
    .line 80
    .line 81
    invoke-direct {p2, v1, v4}, Landroid/content/ClipData;-><init>(Landroid/content/ClipDescription;Landroid/content/ClipData$Item;)V

    .line 82
    .line 83
    .line 84
    const/16 v1, 0x1f

    .line 85
    .line 86
    const/4 v4, 0x2

    .line 87
    if-lt v0, v1, :cond_2

    .line 88
    .line 89
    new-instance v0, Ldefpackage/d34;

    .line 90
    .line 91
    invoke-direct {v0, p2, v4}, Ldefpackage/d34;-><init>(Landroid/content/ClipData;I)V

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_2
    new-instance v0, Ldefpackage/jd0;

    .line 96
    .line 97
    invoke-direct {v0}, Ldefpackage/jd0;-><init>()V

    .line 98
    .line 99
    .line 100
    iput-object p2, v0, Ldefpackage/jd0;->o:Landroid/content/ClipData;

    .line 101
    .line 102
    iput v4, v0, Ldefpackage/jd0;->p:I

    .line 103
    .line 104
    :goto_2
    invoke-interface {p1}, Ldefpackage/nz1;->c()Landroid/net/Uri;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-interface {v0, p1}, Ldefpackage/id0;->c(Landroid/net/Uri;)V

    .line 109
    .line 110
    .line 111
    invoke-interface {v0, p3}, Ldefpackage/id0;->setExtras(Landroid/os/Bundle;)V

    .line 112
    .line 113
    .line 114
    invoke-interface {v0}, Ldefpackage/id0;->build()Ldefpackage/ld0;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-static {p0, p1}, Ldefpackage/j65;->j(Landroid/view/View;Ldefpackage/ld0;)Ldefpackage/ld0;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    if-nez p0, :cond_3

    .line 123
    .line 124
    return v3

    .line 125
    :cond_3
    return v2
.end method

.method public c(Ldefpackage/bm2;)V
    .locals 14

    .line 1
    iget v0, p0, Ldefpackage/cn;->n:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object p0, p0, Ldefpackage/cn;->o:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Landroid/os/Bundle;

    .line 11
    .line 12
    invoke-virtual {p1}, Ldefpackage/bm2;->Y()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v0, p1, Ldefpackage/bm2;->u:Ldefpackage/gy3;

    .line 20
    .line 21
    iget-object v3, p1, Ldefpackage/bm2;->v:Ldefpackage/gy3;

    .line 22
    .line 23
    iput-object p0, p1, Ldefpackage/bm2;->I:Landroid/os/Bundle;

    .line 24
    .line 25
    iget-object v4, p1, Ldefpackage/bm2;->t:Ldefpackage/yw1;

    .line 26
    .line 27
    iget-object v5, p1, Ldefpackage/bm2;->s:Ldefpackage/yw1;

    .line 28
    .line 29
    iget-object v6, p1, Ldefpackage/bm2;->w:Ldefpackage/wa4;

    .line 30
    .line 31
    iget-object v7, p1, Ldefpackage/bm2;->z:Ldefpackage/mi3;

    .line 32
    .line 33
    invoke-static {v4, v5, v6, v7, p0}, Ldefpackage/bm2;->u1(Ljava/util/List;Ljava/util/List;Ldefpackage/wa4;Ldefpackage/mi3;Landroid/os/Bundle;)Ldefpackage/gy3;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    iput-object p0, p1, Ldefpackage/bm2;->u:Ldefpackage/gy3;

    .line 38
    .line 39
    iget-object v4, p1, Ldefpackage/bm2;->s:Ldefpackage/yw1;

    .line 40
    .line 41
    iget-object v5, p1, Ldefpackage/bm2;->I:Landroid/os/Bundle;

    .line 42
    .line 43
    iget-object v6, p1, Ldefpackage/bm2;->w:Ldefpackage/wa4;

    .line 44
    .line 45
    iget-object v7, p1, Ldefpackage/bm2;->z:Ldefpackage/mi3;

    .line 46
    .line 47
    invoke-static {p0, v4, v5, v6, v7}, Ldefpackage/bm2;->t1(Ldefpackage/gy3;Ljava/util/List;Landroid/os/Bundle;Ldefpackage/wa4;Ldefpackage/mi3;)Ldefpackage/gy3;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    iput-object p0, p1, Ldefpackage/bm2;->v:Ldefpackage/gy3;

    .line 52
    .line 53
    iget-object p0, p1, Ldefpackage/bm2;->u:Ldefpackage/gy3;

    .line 54
    .line 55
    invoke-virtual {p0, v0}, Ldefpackage/yw1;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    iget-object v0, p1, Ldefpackage/bm2;->v:Ldefpackage/gy3;

    .line 60
    .line 61
    invoke-virtual {v0, v3}, Ldefpackage/yw1;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1}, Ldefpackage/bm2;->f1()Ldefpackage/sk2;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iget-object v3, p1, Ldefpackage/sk2;->f:Landroid/os/Handler;

    .line 76
    .line 77
    invoke-virtual {v3}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    if-ne v0, v3, :cond_1

    .line 82
    .line 83
    move v1, v2

    .line 84
    :cond_1
    invoke-static {v1}, Ldefpackage/rr2;->w(Z)V

    .line 85
    .line 86
    .line 87
    iget-object p1, p1, Ldefpackage/sk2;->e:Ldefpackage/qk2;

    .line 88
    .line 89
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    if-nez p0, :cond_2

    .line 93
    .line 94
    invoke-interface {p1}, Ldefpackage/qk2;->u()V

    .line 95
    .line 96
    .line 97
    :cond_2
    :goto_0
    return-void

    .line 98
    :pswitch_0
    check-cast p0, Landroid/app/PendingIntent;

    .line 99
    .line 100
    invoke-virtual {p1}, Ldefpackage/bm2;->Y()Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-eqz v0, :cond_5

    .line 105
    .line 106
    iget-object v0, p1, Ldefpackage/bm2;->r:Landroid/app/PendingIntent;

    .line 107
    .line 108
    invoke-static {v0, p0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-eqz v0, :cond_3

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_3
    iput-object p0, p1, Ldefpackage/bm2;->r:Landroid/app/PendingIntent;

    .line 116
    .line 117
    invoke-virtual {p1}, Ldefpackage/bm2;->f1()Ldefpackage/sk2;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    iget-object v0, p0, Ldefpackage/sk2;->f:Landroid/os/Handler;

    .line 129
    .line 130
    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    if-ne p1, v0, :cond_4

    .line 135
    .line 136
    move v1, v2

    .line 137
    :cond_4
    invoke-static {v1}, Ldefpackage/rr2;->w(Z)V

    .line 138
    .line 139
    .line 140
    iget-object p0, p0, Ldefpackage/sk2;->e:Ldefpackage/qk2;

    .line 141
    .line 142
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    :cond_5
    :goto_1
    return-void

    .line 146
    :pswitch_1
    check-cast p0, Ldefpackage/za4;

    .line 147
    .line 148
    invoke-virtual {p1}, Ldefpackage/bm2;->Y()Z

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    if-nez v0, :cond_6

    .line 153
    .line 154
    goto :goto_2

    .line 155
    :cond_6
    iget-object v0, p1, Ldefpackage/bm2;->k:Ldefpackage/qi;

    .line 156
    .line 157
    invoke-virtual {v0}, Ldefpackage/qi;->isEmpty()Z

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    if-eqz v0, :cond_8

    .line 162
    .line 163
    iget-object v0, p1, Ldefpackage/bm2;->q:Ldefpackage/lk3;

    .line 164
    .line 165
    iget-object v0, v0, Ldefpackage/lk3;->c:Ldefpackage/za4;

    .line 166
    .line 167
    iget-wide v1, v0, Ldefpackage/za4;->c:J

    .line 168
    .line 169
    iget-wide v3, p0, Ldefpackage/za4;->c:J

    .line 170
    .line 171
    cmp-long v1, v1, v3

    .line 172
    .line 173
    if-gez v1, :cond_8

    .line 174
    .line 175
    invoke-static {p0, v0}, Ldefpackage/ju2;->a(Ldefpackage/za4;Ldefpackage/za4;)Z

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    if-nez v0, :cond_7

    .line 180
    .line 181
    goto :goto_2

    .line 182
    :cond_7
    iget-object v0, p1, Ldefpackage/bm2;->q:Ldefpackage/lk3;

    .line 183
    .line 184
    invoke-virtual {v0, p0}, Ldefpackage/lk3;->j(Ldefpackage/za4;)Ldefpackage/lk3;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    iput-object p0, p1, Ldefpackage/bm2;->q:Ldefpackage/lk3;

    .line 189
    .line 190
    :cond_8
    :goto_2
    return-void

    .line 191
    :pswitch_2
    check-cast p0, Ldefpackage/oa0;

    .line 192
    .line 193
    iget-object v0, p1, Ldefpackage/bm2;->e:Ldefpackage/cb4;

    .line 194
    .line 195
    iget-object v3, p1, Ldefpackage/bm2;->D:Ldefpackage/pu1;

    .line 196
    .line 197
    if-eqz v3, :cond_9

    .line 198
    .line 199
    const-string p0, "MCImplBase"

    .line 200
    .line 201
    const-string v0, "Cannot be notified about the connection result many times. Probably a bug or malicious app."

    .line 202
    .line 203
    invoke-static {p0, v0}, Ldefpackage/l93;->F(Ljava/lang/String;Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {p1}, Ldefpackage/bm2;->f1()Ldefpackage/sk2;

    .line 207
    .line 208
    .line 209
    move-result-object p0

    .line 210
    invoke-virtual {p0}, Ldefpackage/sk2;->Y0()V

    .line 211
    .line 212
    .line 213
    goto/16 :goto_4

    .line 214
    .line 215
    :cond_9
    iget-object v3, p0, Ldefpackage/oa0;->c:Ldefpackage/pu1;

    .line 216
    .line 217
    iget-object v4, p0, Ldefpackage/oa0;->n:Ldefpackage/yw1;

    .line 218
    .line 219
    iget-object v5, p0, Ldefpackage/oa0;->i:Landroid/os/Bundle;

    .line 220
    .line 221
    iput-object v3, p1, Ldefpackage/bm2;->D:Ldefpackage/pu1;

    .line 222
    .line 223
    iget-object v3, p0, Ldefpackage/oa0;->d:Landroid/app/PendingIntent;

    .line 224
    .line 225
    iput-object v3, p1, Ldefpackage/bm2;->r:Landroid/app/PendingIntent;

    .line 226
    .line 227
    iget-object v3, p0, Ldefpackage/oa0;->e:Ldefpackage/wa4;

    .line 228
    .line 229
    iput-object v3, p1, Ldefpackage/bm2;->w:Ldefpackage/wa4;

    .line 230
    .line 231
    iget-object v3, p0, Ldefpackage/oa0;->f:Ldefpackage/mi3;

    .line 232
    .line 233
    iput-object v3, p1, Ldefpackage/bm2;->x:Ldefpackage/mi3;

    .line 234
    .line 235
    iget-object v6, p0, Ldefpackage/oa0;->g:Ldefpackage/mi3;

    .line 236
    .line 237
    iput-object v6, p1, Ldefpackage/bm2;->y:Ldefpackage/mi3;

    .line 238
    .line 239
    invoke-static {v3, v6}, Ldefpackage/bm2;->Y0(Ldefpackage/mi3;Ldefpackage/mi3;)Ldefpackage/mi3;

    .line 240
    .line 241
    .line 242
    move-result-object v3

    .line 243
    iput-object v3, p1, Ldefpackage/bm2;->z:Ldefpackage/mi3;

    .line 244
    .line 245
    iget-object v6, p0, Ldefpackage/oa0;->k:Ldefpackage/yw1;

    .line 246
    .line 247
    iput-object v6, p1, Ldefpackage/bm2;->s:Ldefpackage/yw1;

    .line 248
    .line 249
    iget-object v7, p0, Ldefpackage/oa0;->l:Ldefpackage/yw1;

    .line 250
    .line 251
    iput-object v7, p1, Ldefpackage/bm2;->t:Ldefpackage/yw1;

    .line 252
    .line 253
    iget-object v8, p1, Ldefpackage/bm2;->w:Ldefpackage/wa4;

    .line 254
    .line 255
    invoke-static {v7, v6, v8, v3, v5}, Ldefpackage/bm2;->u1(Ljava/util/List;Ljava/util/List;Ldefpackage/wa4;Ldefpackage/mi3;Landroid/os/Bundle;)Ldefpackage/gy3;

    .line 256
    .line 257
    .line 258
    move-result-object v3

    .line 259
    iput-object v3, p1, Ldefpackage/bm2;->u:Ldefpackage/gy3;

    .line 260
    .line 261
    iget-object v6, p1, Ldefpackage/bm2;->s:Ldefpackage/yw1;

    .line 262
    .line 263
    iget-object v7, p1, Ldefpackage/bm2;->w:Ldefpackage/wa4;

    .line 264
    .line 265
    iget-object v8, p1, Ldefpackage/bm2;->z:Ldefpackage/mi3;

    .line 266
    .line 267
    invoke-static {v3, v6, v5, v7, v8}, Ldefpackage/bm2;->t1(Ldefpackage/gy3;Ljava/util/List;Landroid/os/Bundle;Ldefpackage/wa4;Ldefpackage/mi3;)Ldefpackage/gy3;

    .line 268
    .line 269
    .line 270
    move-result-object v3

    .line 271
    iput-object v3, p1, Ldefpackage/bm2;->v:Ldefpackage/gy3;

    .line 272
    .line 273
    new-instance v3, Ldefpackage/ue1;

    .line 274
    .line 275
    const/4 v6, 0x4

    .line 276
    invoke-direct {v3, v6}, Ldefpackage/ue1;-><init>(I)V

    .line 277
    .line 278
    .line 279
    move v6, v1

    .line 280
    :goto_3
    invoke-virtual {v4}, Ljava/util/AbstractCollection;->size()I

    .line 281
    .line 282
    .line 283
    move-result v7

    .line 284
    if-ge v6, v7, :cond_b

    .line 285
    .line 286
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v7

    .line 290
    check-cast v7, Ldefpackage/j60;

    .line 291
    .line 292
    iget-object v8, v7, Ldefpackage/j60;->a:Ldefpackage/va4;

    .line 293
    .line 294
    if-eqz v8, :cond_a

    .line 295
    .line 296
    iget v9, v8, Ldefpackage/va4;->a:I

    .line 297
    .line 298
    if-nez v9, :cond_a

    .line 299
    .line 300
    iget-object v8, v8, Ldefpackage/va4;->b:Ljava/lang/String;

    .line 301
    .line 302
    invoke-virtual {v3, v8, v7}, Ldefpackage/ue1;->x(Ljava/lang/Object;Ljava/lang/Object;)Ldefpackage/ue1;

    .line 303
    .line 304
    .line 305
    :cond_a
    add-int/lit8 v6, v6, 0x1

    .line 306
    .line 307
    goto :goto_3

    .line 308
    :cond_b
    invoke-virtual {v3, v2}, Ldefpackage/ue1;->d(Z)Ldefpackage/ly3;

    .line 309
    .line 310
    .line 311
    iget-object v2, p0, Ldefpackage/oa0;->j:Ldefpackage/lk3;

    .line 312
    .line 313
    iput-object v2, p1, Ldefpackage/bm2;->q:Ldefpackage/lk3;

    .line 314
    .line 315
    iget-object v2, p0, Ldefpackage/oa0;->m:Landroid/media/session/MediaSession$Token;

    .line 316
    .line 317
    if-nez v2, :cond_c

    .line 318
    .line 319
    iget-object v2, v0, Ldefpackage/cb4;->a:Ldefpackage/bb4;

    .line 320
    .line 321
    invoke-interface {v2}, Ldefpackage/bb4;->i()Landroid/media/session/MediaSession$Token;

    .line 322
    .line 323
    .line 324
    move-result-object v2

    .line 325
    :cond_c
    move-object v13, v2

    .line 326
    if-eqz v13, :cond_d

    .line 327
    .line 328
    new-instance v2, Landroid/media/session/MediaController;

    .line 329
    .line 330
    iget-object v3, p1, Ldefpackage/bm2;->d:Landroid/content/Context;

    .line 331
    .line 332
    invoke-direct {v2, v3, v13}, Landroid/media/session/MediaController;-><init>(Landroid/content/Context;Landroid/media/session/MediaSession$Token;)V

    .line 333
    .line 334
    .line 335
    iput-object v2, p1, Ldefpackage/bm2;->E:Landroid/media/session/MediaController;

    .line 336
    .line 337
    :cond_d
    :try_start_0
    iget-object v2, p0, Ldefpackage/oa0;->c:Ldefpackage/pu1;

    .line 338
    .line 339
    invoke-interface {v2}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 340
    .line 341
    .line 342
    move-result-object v2

    .line 343
    iget-object v3, p1, Ldefpackage/bm2;->g:Ldefpackage/il2;

    .line 344
    .line 345
    invoke-interface {v2, v3, v1}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 346
    .line 347
    .line 348
    new-instance v6, Ldefpackage/cb4;

    .line 349
    .line 350
    iget-object v1, v0, Ldefpackage/cb4;->a:Ldefpackage/bb4;

    .line 351
    .line 352
    invoke-interface {v1}, Ldefpackage/bb4;->a()I

    .line 353
    .line 354
    .line 355
    move-result v7

    .line 356
    iget v8, p0, Ldefpackage/oa0;->a:I

    .line 357
    .line 358
    iget v9, p0, Ldefpackage/oa0;->b:I

    .line 359
    .line 360
    iget-object v0, v0, Ldefpackage/cb4;->a:Ldefpackage/bb4;

    .line 361
    .line 362
    invoke-interface {v0}, Ldefpackage/bb4;->g()Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v10

    .line 366
    iget-object v11, p0, Ldefpackage/oa0;->c:Ldefpackage/pu1;

    .line 367
    .line 368
    iget-object v12, p0, Ldefpackage/oa0;->h:Landroid/os/Bundle;

    .line 369
    .line 370
    invoke-direct/range {v6 .. v13}, Ldefpackage/cb4;-><init>(IIILjava/lang/String;Ldefpackage/pu1;Landroid/os/Bundle;Landroid/media/session/MediaSession$Token;)V

    .line 371
    .line 372
    .line 373
    iput-object v6, p1, Ldefpackage/bm2;->n:Ldefpackage/cb4;

    .line 374
    .line 375
    iput-object v5, p1, Ldefpackage/bm2;->I:Landroid/os/Bundle;

    .line 376
    .line 377
    invoke-virtual {p1}, Ldefpackage/bm2;->f1()Ldefpackage/sk2;

    .line 378
    .line 379
    .line 380
    move-result-object p0

    .line 381
    invoke-virtual {p0}, Ldefpackage/sk2;->X0()V

    .line 382
    .line 383
    .line 384
    goto :goto_4

    .line 385
    :catch_0
    invoke-virtual {p1}, Ldefpackage/bm2;->f1()Ldefpackage/sk2;

    .line 386
    .line 387
    .line 388
    move-result-object p0

    .line 389
    invoke-virtual {p0}, Ldefpackage/sk2;->Y0()V

    .line 390
    .line 391
    .line 392
    :goto_4
    return-void

    .line 393
    :pswitch_data_0
    .packed-switch 0x19
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public d(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/cn;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/re2;

    .line 4
    .line 5
    const-string p1, "color_key"

    .line 6
    .line 7
    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Ldefpackage/re2;->h0(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object p0, p0, Ldefpackage/re2;->l0:Ldefpackage/zc1;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-object p0, p0, Ldefpackage/zc1;->f:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p0, Lcom/google/android/material/card/MaterialCardView;

    .line 24
    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    const-string p2, "HEX:"

    .line 28
    .line 29
    invoke-static {p1, p2}, Ldefpackage/qm4;->z0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const-string p1, "#B5076B"

    .line 39
    .line 40
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    :goto_0
    invoke-virtual {p0, p1}, Lcom/google/android/material/card/MaterialCardView;->setCardBackgroundColor(I)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public e(J)J
    .locals 8

    .line 1
    iget-object p0, p0, Ldefpackage/cn;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/v71;

    .line 4
    .line 5
    iget v0, p0, Ldefpackage/v71;->e:I

    .line 6
    .line 7
    int-to-long v0, v0

    .line 8
    mul-long/2addr p1, v0

    .line 9
    const-wide/32 v0, 0xf4240

    .line 10
    .line 11
    .line 12
    div-long v2, p1, v0

    .line 13
    .line 14
    iget-wide p0, p0, Ldefpackage/v71;->j:J

    .line 15
    .line 16
    const-wide/16 v0, 0x1

    .line 17
    .line 18
    sub-long v6, p0, v0

    .line 19
    .line 20
    const-wide/16 v4, 0x0

    .line 21
    .line 22
    invoke-static/range {v2 .. v7}, Ldefpackage/f35;->k(JJJ)J

    .line 23
    .line 24
    .line 25
    move-result-wide p0

    .line 26
    return-wide p0
.end method

.method public f(Ldefpackage/er2;I)V
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/cn;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/va4;

    .line 4
    .line 5
    sget-object v0, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 6
    .line 7
    invoke-interface {p1, p2, p0}, Ldefpackage/er2;->l(ILdefpackage/va4;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public g(ILdefpackage/sv4;[I)Ldefpackage/gy3;
    .locals 6

    .line 1
    iget-object p0, p0, Ldefpackage/cn;->o:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v4, p0

    .line 4
    check-cast v4, Ldefpackage/jn0;

    .line 5
    .line 6
    invoke-static {}, Ldefpackage/yw1;->j()Ldefpackage/uw1;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 v0, 0x0

    .line 11
    move v3, v0

    .line 12
    :goto_0
    iget v0, p2, Ldefpackage/sv4;->a:I

    .line 13
    .line 14
    if-ge v3, v0, :cond_0

    .line 15
    .line 16
    new-instance v0, Ldefpackage/gn0;

    .line 17
    .line 18
    aget v5, p3, v3

    .line 19
    .line 20
    move v1, p1

    .line 21
    move-object v2, p2

    .line 22
    invoke-direct/range {v0 .. v5}, Ldefpackage/gn0;-><init>(ILdefpackage/sv4;ILdefpackage/jn0;I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0}, Ldefpackage/pw1;->c(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    add-int/lit8 v3, v3, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {p0}, Ldefpackage/uw1;->f()Ldefpackage/gy3;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0
.end method

.method public get()J
    .locals 2

    .line 1
    iget-object p0, p0, Ldefpackage/cn;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/v52;

    .line 4
    .line 5
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    invoke-virtual {p0, v0, v1}, Ldefpackage/v52;->b(J)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    return-wide v0
.end method

.method public i(Ljava/lang/Object;)V
    .locals 7

    .line 1
    iget v0, p0, Ldefpackage/cn;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/cn;->o:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Ldefpackage/le2;

    .line 9
    .line 10
    check-cast p1, Ljava/lang/Boolean;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Ldefpackage/le2;->h0()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    check-cast p0, Lcom/eddyizm/tempus/homemusic/HubFragment;

    .line 20
    .line 21
    check-cast p1, Ldefpackage/o5;

    .line 22
    .line 23
    sget-object v0, Lcom/eddyizm/tempus/homemusic/HubFragment;->y0:Ljava/util/List;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->r0:Landroid/webkit/ValueCallback;

    .line 29
    .line 30
    if-nez v0, :cond_0

    .line 31
    .line 32
    goto :goto_3

    .line 33
    :cond_0
    const/4 v1, 0x0

    .line 34
    iput-object v1, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->r0:Landroid/webkit/ValueCallback;

    .line 35
    .line 36
    iget-object p0, p1, Ldefpackage/o5;->o:Landroid/content/Intent;

    .line 37
    .line 38
    iget p1, p1, Ldefpackage/o5;->n:I

    .line 39
    .line 40
    const/4 v2, -0x1

    .line 41
    if-ne p1, v2, :cond_5

    .line 42
    .line 43
    if-nez p0, :cond_1

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Landroid/content/Intent;->getClipData()Landroid/content/ClipData;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    const/4 v3, 0x0

    .line 56
    if-eqz v2, :cond_2

    .line 57
    .line 58
    invoke-virtual {v2}, Landroid/content/ClipData;->getItemCount()I

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    move v5, v3

    .line 63
    :goto_0
    if-ge v5, v4, :cond_2

    .line 64
    .line 65
    invoke-virtual {v2, v5}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    invoke-virtual {v6}, Landroid/content/ClipData$Item;->getUri()Landroid/net/Uri;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    add-int/lit8 v5, v5, 0x1

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_2
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-eqz v2, :cond_3

    .line 87
    .line 88
    invoke-virtual {p0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    if-eqz p0, :cond_3

    .line 93
    .line 94
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    :cond_3
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    if-eqz p0, :cond_4

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_4
    new-array p0, v3, [Landroid/net/Uri;

    .line 105
    .line 106
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    move-object v1, p0

    .line 111
    check-cast v1, [Landroid/net/Uri;

    .line 112
    .line 113
    :goto_1
    invoke-interface {v0, v1}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_5
    :goto_2
    invoke-interface {v0, v1}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    :goto_3
    return-void

    .line 121
    :pswitch_data_0
    .packed-switch 0x10
        :pswitch_0
    .end packed-switch
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, Ldefpackage/cn;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/cn;->o:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    :pswitch_0
    check-cast p0, Ldefpackage/qv2;

    .line 9
    .line 10
    check-cast p1, Ldefpackage/oi3;

    .line 11
    .line 12
    invoke-interface {p1, p0}, Ldefpackage/oi3;->h(Ldefpackage/qv2;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_1
    check-cast p0, Ldefpackage/d41;

    .line 17
    .line 18
    check-cast p1, Ldefpackage/oi3;

    .line 19
    .line 20
    iget-object p0, p0, Ldefpackage/d41;->n:Ldefpackage/i41;

    .line 21
    .line 22
    iget-object p0, p0, Ldefpackage/i41;->S:Ldefpackage/do2;

    .line 23
    .line 24
    invoke-interface {p1, p0}, Ldefpackage/oi3;->F(Ldefpackage/do2;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_2
    check-cast p0, Ldefpackage/jg0;

    .line 29
    .line 30
    check-cast p1, Ldefpackage/oi3;

    .line 31
    .line 32
    invoke-interface {p1, p0}, Ldefpackage/oi3;->e(Ldefpackage/jg0;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_3
    check-cast p1, Ldefpackage/ho2;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :pswitch_4
    check-cast p0, Ldefpackage/un2;

    .line 43
    .line 44
    check-cast p1, Ldefpackage/ho2;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    iget p0, p0, Ldefpackage/un2;->a:I

    .line 50
    .line 51
    iput p0, p1, Ldefpackage/ho2;->w:I

    .line 52
    .line 53
    return-void

    .line 54
    :pswitch_5
    check-cast p0, Ldefpackage/bj0;

    .line 55
    .line 56
    check-cast p1, Ldefpackage/ho2;

    .line 57
    .line 58
    iget v0, p1, Ldefpackage/ho2;->y:I

    .line 59
    .line 60
    iget v1, p0, Ldefpackage/bj0;->g:I

    .line 61
    .line 62
    add-int/2addr v0, v1

    .line 63
    iput v0, p1, Ldefpackage/ho2;->y:I

    .line 64
    .line 65
    iget v0, p1, Ldefpackage/ho2;->z:I

    .line 66
    .line 67
    iget p0, p0, Ldefpackage/bj0;->e:I

    .line 68
    .line 69
    add-int/2addr v0, p0

    .line 70
    iput v0, p1, Ldefpackage/ho2;->z:I

    .line 71
    .line 72
    return-void

    .line 73
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public j()V
    .locals 5

    .line 1
    iget-object p0, p0, Ldefpackage/cn;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;

    .line 4
    .line 5
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->o0:Ldefpackage/n92;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Ldefpackage/n92;->d(Ldefpackage/le1;)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->o0:Ldefpackage/n92;

    .line 15
    .line 16
    iget-object v2, v1, Ldefpackage/n92;->f:Ldefpackage/y41;

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    const/16 v2, 0xf

    .line 22
    .line 23
    const/4 v3, 0x1

    .line 24
    invoke-static {v2, v3}, Ldefpackage/y41;->j(IZ)Ldefpackage/k03;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    iget-object v1, v1, Ldefpackage/n92;->l:Ldefpackage/k03;

    .line 29
    .line 30
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    new-instance v3, Ldefpackage/g7;

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    invoke-direct {v3, v1, v4}, Ldefpackage/g7;-><init>(Ldefpackage/k03;I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2, v0, v3}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 40
    .line 41
    .line 42
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->o0:Ldefpackage/n92;

    .line 43
    .line 44
    invoke-virtual {v1, v0}, Ldefpackage/n92;->e(Ldefpackage/le1;)V

    .line 45
    .line 46
    .line 47
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->o0:Ldefpackage/n92;

    .line 48
    .line 49
    invoke-virtual {v1, v0}, Ldefpackage/n92;->f(Ldefpackage/le1;)V

    .line 50
    .line 51
    .line 52
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->l0:Ldefpackage/xc1;

    .line 53
    .line 54
    iget-object p0, p0, Ldefpackage/xc1;->v:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 55
    .line 56
    invoke-virtual {p0, v4}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public k(JLdefpackage/be3;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/cn;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/oe1;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/oe1;->J:[Ldefpackage/wv4;

    .line 6
    .line 7
    invoke-static {p1, p2, p3, p0}, Ldefpackage/ji2;->s(JLdefpackage/be3;[Ldefpackage/wv4;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public onTouchExplorationStateChanged(Z)V
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/cn;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/ix0;

    .line 4
    .line 5
    iget-object v0, p0, Ldefpackage/ix0;->h:Landroid/widget/AutoCompleteTextView;

    .line 6
    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/widget/TextView;->getInputType()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-object p0, p0, Ldefpackage/h11;->d:Lcom/google/android/material/internal/CheckableImageButton;

    .line 17
    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    const/4 p1, 0x2

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const/4 p1, 0x1

    .line 23
    :goto_0
    sget-object v0, Ldefpackage/j65;->a:Ljava/util/WeakHashMap;

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 26
    .line 27
    .line 28
    :cond_2
    return-void
.end method

.method public r(Landroidx/preference/Preference;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/cn;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/gf1;

    .line 4
    .line 5
    check-cast p1, Landroidx/preference/EditTextPreference;

    .line 6
    .line 7
    invoke-interface {p0}, Ldefpackage/gf1;->invoke()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Ljava/lang/CharSequence;

    .line 12
    .line 13
    return-object p0
.end method

.method public x(Landroid/view/View;Ldefpackage/pb5;)Ldefpackage/pb5;
    .locals 7

    .line 1
    iget-object p0, p0, Ldefpackage/cn;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/view/View;

    .line 4
    .line 5
    sget p1, Lcom/eddyizm/tempus/ui/activity/MainActivity;->e0:I

    .line 6
    .line 7
    iget-object p1, p2, Ldefpackage/pb5;->a:Ldefpackage/mb5;

    .line 8
    .line 9
    const/16 v0, 0x207

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ldefpackage/mb5;->h(I)Ldefpackage/vz1;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/16 v2, 0x80

    .line 16
    .line 17
    invoke-virtual {p1, v2}, Ldefpackage/mb5;->h(I)Ldefpackage/vz1;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iget v3, v1, Ldefpackage/vz1;->b:I

    .line 22
    .line 23
    iget v4, p1, Ldefpackage/vz1;->b:I

    .line 24
    .line 25
    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    iget v4, v1, Ldefpackage/vz1;->a:I

    .line 30
    .line 31
    iget v5, v1, Ldefpackage/vz1;->c:I

    .line 32
    .line 33
    const/4 v6, 0x0

    .line 34
    invoke-virtual {p0, v4, v3, v5, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 35
    .line 36
    .line 37
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 38
    .line 39
    const/16 v3, 0x24

    .line 40
    .line 41
    if-lt p0, v3, :cond_0

    .line 42
    .line 43
    new-instance p0, Ldefpackage/ab5;

    .line 44
    .line 45
    invoke-direct {p0, p2}, Ldefpackage/ab5;-><init>(Ldefpackage/pb5;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    const/16 v3, 0x23

    .line 50
    .line 51
    if-lt p0, v3, :cond_1

    .line 52
    .line 53
    new-instance p0, Ldefpackage/za5;

    .line 54
    .line 55
    invoke-direct {p0, p2}, Ldefpackage/za5;-><init>(Ldefpackage/pb5;)V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    const/16 v3, 0x22

    .line 60
    .line 61
    if-lt p0, v3, :cond_2

    .line 62
    .line 63
    new-instance p0, Ldefpackage/ya5;

    .line 64
    .line 65
    invoke-direct {p0, p2}, Ldefpackage/ya5;-><init>(Ldefpackage/pb5;)V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    const/16 v3, 0x1f

    .line 70
    .line 71
    if-lt p0, v3, :cond_3

    .line 72
    .line 73
    new-instance p0, Ldefpackage/xa5;

    .line 74
    .line 75
    invoke-direct {p0, p2}, Ldefpackage/xa5;-><init>(Ldefpackage/pb5;)V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_3
    const/16 v3, 0x1e

    .line 80
    .line 81
    if-lt p0, v3, :cond_4

    .line 82
    .line 83
    new-instance p0, Ldefpackage/wa5;

    .line 84
    .line 85
    invoke-direct {p0, p2}, Ldefpackage/wa5;-><init>(Ldefpackage/pb5;)V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_4
    const/16 v3, 0x1d

    .line 90
    .line 91
    if-lt p0, v3, :cond_5

    .line 92
    .line 93
    new-instance p0, Ldefpackage/va5;

    .line 94
    .line 95
    invoke-direct {p0, p2}, Ldefpackage/va5;-><init>(Ldefpackage/pb5;)V

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_5
    new-instance p0, Ldefpackage/ua5;

    .line 100
    .line 101
    invoke-direct {p0, p2}, Ldefpackage/ua5;-><init>(Ldefpackage/pb5;)V

    .line 102
    .line 103
    .line 104
    :goto_0
    iget p2, v1, Ldefpackage/vz1;->d:I

    .line 105
    .line 106
    invoke-static {v4, v6, v5, p2}, Ldefpackage/vz1;->b(IIII)Ldefpackage/vz1;

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    invoke-virtual {p0, v0, p2}, Ldefpackage/bb5;->d(ILdefpackage/vz1;)V

    .line 111
    .line 112
    .line 113
    const/4 p2, 0x1

    .line 114
    sget-object v0, Ldefpackage/vz1;->e:Ldefpackage/vz1;

    .line 115
    .line 116
    invoke-virtual {p0, p2, v0}, Ldefpackage/bb5;->d(ILdefpackage/vz1;)V

    .line 117
    .line 118
    .line 119
    iget p2, p1, Ldefpackage/vz1;->a:I

    .line 120
    .line 121
    iget v0, p1, Ldefpackage/vz1;->c:I

    .line 122
    .line 123
    iget p1, p1, Ldefpackage/vz1;->d:I

    .line 124
    .line 125
    invoke-static {p2, v6, v0, p1}, Ldefpackage/vz1;->b(IIII)Ldefpackage/vz1;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-virtual {p0, v2, p1}, Ldefpackage/bb5;->d(ILdefpackage/vz1;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0}, Ldefpackage/bb5;->b()Ldefpackage/pb5;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    return-object p0
.end method
