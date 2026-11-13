.class public final synthetic Ldefpackage/ef0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/q43;
.implements Ldefpackage/rc2;
.implements Ldefpackage/qc2;
.implements Ldefpackage/fz;
.implements Ldefpackage/cp3;
.implements Ldefpackage/gz0;
.implements Ldefpackage/bp3;
.implements Ldefpackage/py;
.implements Ldefpackage/ik2;
.implements Ldefpackage/xl2;
.implements Ldefpackage/lm2;
.implements Ldefpackage/ks2;
.implements Ldefpackage/wc0;
.implements Ldefpackage/it2;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 13
    iput p1, p0, Ldefpackage/ef0;->n:I

    iput-object p2, p0, Ldefpackage/ef0;->o:Ljava/lang/Object;

    iput-object p3, p0, Ldefpackage/ef0;->p:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ZLdefpackage/va4;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    const/16 p1, 0x18

    .line 2
    .line 3
    iput p1, p0, Ldefpackage/ef0;->n:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, Ldefpackage/ef0;->o:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p3, p0, Ldefpackage/ef0;->p:Ljava/lang/Object;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public a(Landroid/view/MenuItem;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/ef0;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/eddyizm/tempus/ui/crash/CrashActivity;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/ef0;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Landroidx/drawerlayout/widget/DrawerLayout;

    .line 8
    .line 9
    sget v1, Lcom/eddyizm/tempus/ui/crash/CrashActivity;->T:I

    .line 10
    .line 11
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    const v1, 0x7f0a018a

    .line 16
    .line 17
    .line 18
    if-ne p1, v1, :cond_0

    .line 19
    .line 20
    new-instance p1, Ldefpackage/if0;

    .line 21
    .line 22
    invoke-direct {p1}, Ldefpackage/if0;-><init>()V

    .line 23
    .line 24
    .line 25
    const v1, 0x7f13009e

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v0, p1, v1}, Lcom/eddyizm/tempus/ui/crash/CrashActivity;->p(Ldefpackage/kc1;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const v1, 0x7f0a018b

    .line 37
    .line 38
    .line 39
    if-ne p1, v1, :cond_1

    .line 40
    .line 41
    new-instance p1, Ldefpackage/jf0;

    .line 42
    .line 43
    invoke-direct {p1}, Ldefpackage/jf0;-><init>()V

    .line 44
    .line 45
    .line 46
    const v1, 0x7f1300a1

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v0, p1, v1}, Lcom/eddyizm/tempus/ui/crash/CrashActivity;->p(Ldefpackage/kc1;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    const v1, 0x7f0a0189

    .line 58
    .line 59
    .line 60
    if-ne p1, v1, :cond_2

    .line 61
    .line 62
    new-instance p1, Ldefpackage/gf0;

    .line 63
    .line 64
    invoke-direct {p1}, Ldefpackage/gf0;-><init>()V

    .line 65
    .line 66
    .line 67
    const v1, 0x7f130097

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {v0, p1, v1}, Lcom/eddyizm/tempus/ui/crash/CrashActivity;->p(Ldefpackage/kc1;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 78
    invoke-virtual {p0, p1}, Landroidx/drawerlayout/widget/DrawerLayout;->e(Z)V

    .line 79
    .line 80
    .line 81
    const/4 p0, 0x1

    .line 82
    return p0
.end method

.method public accept(Ljava/lang/Object;)V
    .locals 6

    .line 1
    iget v0, p0, Ldefpackage/ef0;->n:I

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/ef0;->p:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/ef0;->o:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ldefpackage/kt2;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    :pswitch_0
    check-cast v1, Landroid/view/Surface;

    .line 13
    .line 14
    check-cast p1, Ldefpackage/al3;

    .line 15
    .line 16
    iget-object v0, p0, Ldefpackage/kt2;->e:Ljava/lang/ref/WeakReference;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Ldefpackage/tn2;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    if-nez v1, :cond_0

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    invoke-virtual {p1, v0}, Ldefpackage/al3;->Q(Landroid/view/SurfaceHolder;)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Ldefpackage/kt2;->j:Ldefpackage/jt2;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    new-instance v0, Ldefpackage/jt2;

    .line 37
    .line 38
    invoke-direct {v0, v1}, Ldefpackage/jt2;-><init>(Landroid/view/Surface;)V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, Ldefpackage/kt2;->j:Ldefpackage/jt2;

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Ldefpackage/al3;->Q(Landroid/view/SurfaceHolder;)V

    .line 44
    .line 45
    .line 46
    :goto_0
    return-void

    .line 47
    :pswitch_1
    check-cast v1, Ldefpackage/fr2;

    .line 48
    .line 49
    check-cast p1, Ldefpackage/al3;

    .line 50
    .line 51
    iget-object p0, p0, Ldefpackage/kt2;->e:Ljava/lang/ref/WeakReference;

    .line 52
    .line 53
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    check-cast p0, Ldefpackage/tn2;

    .line 58
    .line 59
    if-eqz p0, :cond_2

    .line 60
    .line 61
    invoke-virtual {p0}, Ldefpackage/tn2;->l()Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-eqz p1, :cond_1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    const/4 p1, 0x0

    .line 69
    invoke-virtual {p0, v1, p1}, Ldefpackage/tn2;->i(Ldefpackage/fr2;Z)V

    .line 70
    .line 71
    .line 72
    :cond_2
    :goto_1
    return-void

    .line 73
    :pswitch_2
    check-cast v1, Ldefpackage/cw4;

    .line 74
    .line 75
    check-cast p1, Ldefpackage/al3;

    .line 76
    .line 77
    iget-object v0, v1, Ldefpackage/cw4;->H:Ldefpackage/bx1;

    .line 78
    .line 79
    invoke-virtual {v0}, Ldefpackage/bx1;->isEmpty()Z

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    if-eqz v2, :cond_3

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_3
    invoke-virtual {v1}, Ldefpackage/cw4;->a()Ldefpackage/bw4;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {v1}, Ldefpackage/bw4;->c()Ldefpackage/bw4;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-virtual {v0}, Ldefpackage/bx1;->f()Ldefpackage/rw1;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {v0}, Ldefpackage/rw1;->h()Ldefpackage/o15;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-eqz v2, :cond_5

    .line 107
    .line 108
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    check-cast v2, Ldefpackage/yv4;

    .line 113
    .line 114
    iget-object v3, v2, Ldefpackage/yv4;->a:Ldefpackage/sv4;

    .line 115
    .line 116
    iget-object v4, p0, Ldefpackage/kt2;->h:Ldefpackage/fy3;

    .line 117
    .line 118
    iget-object v4, v4, Ldefpackage/fy3;->u:Ldefpackage/fy3;

    .line 119
    .line 120
    iget-object v3, v3, Ldefpackage/sv4;->b:Ljava/lang/String;

    .line 121
    .line 122
    invoke-virtual {v4, v3}, Ldefpackage/fy3;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    check-cast v3, Ldefpackage/sv4;

    .line 127
    .line 128
    if-eqz v3, :cond_4

    .line 129
    .line 130
    iget-object v4, v2, Ldefpackage/yv4;->a:Ldefpackage/sv4;

    .line 131
    .line 132
    iget v4, v4, Ldefpackage/sv4;->a:I

    .line 133
    .line 134
    iget v5, v3, Ldefpackage/sv4;->a:I

    .line 135
    .line 136
    if-ne v4, v5, :cond_4

    .line 137
    .line 138
    new-instance v4, Ldefpackage/yv4;

    .line 139
    .line 140
    iget-object v2, v2, Ldefpackage/yv4;->b:Ldefpackage/yw1;

    .line 141
    .line 142
    invoke-direct {v4, v3, v2}, Ldefpackage/yv4;-><init>(Ldefpackage/sv4;Ljava/util/List;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v1, v4}, Ldefpackage/bw4;->a(Ldefpackage/yv4;)V

    .line 146
    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_4
    invoke-virtual {v1, v2}, Ldefpackage/bw4;->a(Ldefpackage/yv4;)V

    .line 150
    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_5
    invoke-virtual {v1}, Ldefpackage/bw4;->b()Ldefpackage/cw4;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    :goto_3
    invoke-virtual {p1, v1}, Ldefpackage/al3;->M(Ldefpackage/cw4;)V

    .line 158
    .line 159
    .line 160
    return-void

    .line 161
    :pswitch_data_0
    .packed-switch 0x17
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public b(Ldefpackage/fr2;)V
    .locals 5

    .line 1
    iget v0, p0, Ldefpackage/ef0;->n:I

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/ef0;->p:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/ef0;->o:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ldefpackage/ls2;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v1, Ldefpackage/pm2;

    .line 13
    .line 14
    iget-object p1, v1, Ldefpackage/pm2;->n:Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const-string v1, "MediaSessionLegacyStub"

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    const-string p0, "onRemoveQueueItem(): Media ID shouldn\'t be null"

    .line 25
    .line 26
    invoke-static {v1, p0}, Ldefpackage/l93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    iget-object p0, p0, Ldefpackage/ls2;->g:Ldefpackage/tn2;

    .line 31
    .line 32
    iget-object p0, p0, Ldefpackage/tn2;->s:Ldefpackage/al3;

    .line 33
    .line 34
    const/16 v0, 0x11

    .line 35
    .line 36
    invoke-virtual {p0, v0}, Ldefpackage/al3;->S0(I)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-nez v0, :cond_1

    .line 41
    .line 42
    const-string p0, "Can\'t remove item by ID without COMMAND_GET_TIMELINE being available"

    .line 43
    .line 44
    invoke-static {v1, p0}, Ldefpackage/l93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    invoke-virtual {p0}, Ldefpackage/al3;->x0()Ldefpackage/cu4;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    new-instance v1, Ldefpackage/bu4;

    .line 53
    .line 54
    invoke-direct {v1}, Ldefpackage/bu4;-><init>()V

    .line 55
    .line 56
    .line 57
    const/4 v2, 0x0

    .line 58
    :goto_0
    invoke-virtual {v0}, Ldefpackage/cu4;->o()I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    if-ge v2, v3, :cond_3

    .line 63
    .line 64
    const-wide/16 v3, 0x0

    .line 65
    .line 66
    invoke-virtual {v0, v2, v1, v3, v4}, Ldefpackage/cu4;->m(ILdefpackage/bu4;J)Ldefpackage/bu4;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    iget-object v3, v3, Ldefpackage/bu4;->b:Ldefpackage/gn2;

    .line 71
    .line 72
    iget-object v3, v3, Ldefpackage/gn2;->a:Ljava/lang/String;

    .line 73
    .line 74
    invoke-static {v3, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    if-eqz v3, :cond_2

    .line 79
    .line 80
    invoke-virtual {p0, v2}, Ldefpackage/al3;->N(I)V

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_3
    :goto_1
    return-void

    .line 88
    :pswitch_0
    check-cast v1, Ldefpackage/j60;

    .line 89
    .line 90
    iget-object p0, p0, Ldefpackage/ls2;->g:Ldefpackage/tn2;

    .line 91
    .line 92
    iget-object p0, p0, Ldefpackage/tn2;->s:Ldefpackage/al3;

    .line 93
    .line 94
    invoke-virtual {v1, p0}, Ldefpackage/j60;->h(Ldefpackage/qi3;)V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :pswitch_1
    check-cast v1, Ldefpackage/lu3;

    .line 99
    .line 100
    iget-object p0, p0, Ldefpackage/ls2;->g:Ldefpackage/tn2;

    .line 101
    .line 102
    iget-object v0, p0, Ldefpackage/tn2;->s:Ldefpackage/al3;

    .line 103
    .line 104
    invoke-virtual {v0}, Ldefpackage/al3;->Y0()Ldefpackage/gn2;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    if-nez v0, :cond_4

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_4
    iget-object v0, v0, Ldefpackage/gn2;->a:Ljava/lang/String;

    .line 112
    .line 113
    iget-object v2, p0, Ldefpackage/tn2;->e:Ldefpackage/pq;

    .line 114
    .line 115
    iget-object v3, p0, Ldefpackage/tn2;->k:Ldefpackage/kn2;

    .line 116
    .line 117
    invoke-virtual {p0, p1}, Ldefpackage/tn2;->B(Ldefpackage/fr2;)Ldefpackage/fr2;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    invoke-virtual {v2, v3, p0, v0, v1}, Ldefpackage/pq;->e(Ldefpackage/kn2;Ldefpackage/fr2;Ljava/lang/String;Ldefpackage/lu3;)Ldefpackage/ic2;

    .line 122
    .line 123
    .line 124
    :goto_2
    return-void

    .line 125
    :pswitch_data_0
    .packed-switch 0x14
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public c(Ldefpackage/bm2;)V
    .locals 10

    .line 1
    iget v0, p0, Ldefpackage/ef0;->n:I

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/ef0;->p:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/ef0;->o:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Ldefpackage/wa4;

    .line 11
    .line 12
    check-cast v1, Ldefpackage/mi3;

    .line 13
    .line 14
    invoke-virtual {p1}, Ldefpackage/bm2;->Y()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    goto/16 :goto_6

    .line 21
    .line 22
    :cond_0
    iget-object v0, p1, Ldefpackage/bm2;->x:Ldefpackage/mi3;

    .line 23
    .line 24
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p1, Ldefpackage/bm2;->w:Ldefpackage/wa4;

    .line 29
    .line 30
    invoke-static {v2, p0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    goto/16 :goto_6

    .line 39
    .line 40
    :cond_1
    iput-object p0, p1, Ldefpackage/bm2;->w:Ldefpackage/wa4;

    .line 41
    .line 42
    const/4 v3, 0x1

    .line 43
    const/4 v4, 0x0

    .line 44
    if-nez v0, :cond_2

    .line 45
    .line 46
    iput-object v1, p1, Ldefpackage/bm2;->x:Ldefpackage/mi3;

    .line 47
    .line 48
    iget-object v0, p1, Ldefpackage/bm2;->z:Ldefpackage/mi3;

    .line 49
    .line 50
    iget-object v5, p1, Ldefpackage/bm2;->y:Ldefpackage/mi3;

    .line 51
    .line 52
    invoke-static {v1, v5}, Ldefpackage/bm2;->Y0(Ldefpackage/mi3;Ldefpackage/mi3;)Ldefpackage/mi3;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    iput-object v1, p1, Ldefpackage/bm2;->z:Ldefpackage/mi3;

    .line 57
    .line 58
    invoke-virtual {v1, v0}, Ldefpackage/mi3;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    xor-int/2addr v0, v3

    .line 63
    goto :goto_0

    .line 64
    :cond_2
    move v0, v4

    .line 65
    :goto_0
    if-eqz v2, :cond_4

    .line 66
    .line 67
    if-eqz v0, :cond_3

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_3
    move p0, v4

    .line 71
    move v1, p0

    .line 72
    goto :goto_2

    .line 73
    :cond_4
    :goto_1
    iget-object v1, p1, Ldefpackage/bm2;->u:Ldefpackage/gy3;

    .line 74
    .line 75
    iget-object v5, p1, Ldefpackage/bm2;->v:Ldefpackage/gy3;

    .line 76
    .line 77
    iget-object v6, p1, Ldefpackage/bm2;->t:Ldefpackage/yw1;

    .line 78
    .line 79
    iget-object v7, p1, Ldefpackage/bm2;->s:Ldefpackage/yw1;

    .line 80
    .line 81
    iget-object v8, p1, Ldefpackage/bm2;->z:Ldefpackage/mi3;

    .line 82
    .line 83
    iget-object v9, p1, Ldefpackage/bm2;->I:Landroid/os/Bundle;

    .line 84
    .line 85
    invoke-static {v6, v7, p0, v8, v9}, Ldefpackage/bm2;->u1(Ljava/util/List;Ljava/util/List;Ldefpackage/wa4;Ldefpackage/mi3;Landroid/os/Bundle;)Ldefpackage/gy3;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    iput-object v6, p1, Ldefpackage/bm2;->u:Ldefpackage/gy3;

    .line 90
    .line 91
    iget-object v7, p1, Ldefpackage/bm2;->s:Ldefpackage/yw1;

    .line 92
    .line 93
    iget-object v8, p1, Ldefpackage/bm2;->I:Landroid/os/Bundle;

    .line 94
    .line 95
    iget-object v9, p1, Ldefpackage/bm2;->z:Ldefpackage/mi3;

    .line 96
    .line 97
    invoke-static {v6, v7, v8, p0, v9}, Ldefpackage/bm2;->t1(Ldefpackage/gy3;Ljava/util/List;Landroid/os/Bundle;Ldefpackage/wa4;Ldefpackage/mi3;)Ldefpackage/gy3;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    iput-object p0, p1, Ldefpackage/bm2;->v:Ldefpackage/gy3;

    .line 102
    .line 103
    iget-object p0, p1, Ldefpackage/bm2;->u:Ldefpackage/gy3;

    .line 104
    .line 105
    invoke-virtual {p0, v1}, Ldefpackage/yw1;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result p0

    .line 109
    xor-int/2addr p0, v3

    .line 110
    iget-object v1, p1, Ldefpackage/bm2;->v:Ldefpackage/gy3;

    .line 111
    .line 112
    invoke-virtual {v1, v5}, Ldefpackage/yw1;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    xor-int/2addr v1, v3

    .line 117
    :goto_2
    if-eqz v0, :cond_5

    .line 118
    .line 119
    iget-object v0, p1, Ldefpackage/bm2;->i:Ldefpackage/tc2;

    .line 120
    .line 121
    new-instance v5, Ldefpackage/cl2;

    .line 122
    .line 123
    invoke-direct {v5, p1, v3}, Ldefpackage/cl2;-><init>(Ldefpackage/bm2;I)V

    .line 124
    .line 125
    .line 126
    const/16 v6, 0xd

    .line 127
    .line 128
    invoke-virtual {v0, v6, v5}, Ldefpackage/tc2;->f(ILdefpackage/qc2;)V

    .line 129
    .line 130
    .line 131
    :cond_5
    if-nez v2, :cond_7

    .line 132
    .line 133
    invoke-virtual {p1}, Ldefpackage/bm2;->f1()Ldefpackage/sk2;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    iget-object v5, v0, Ldefpackage/sk2;->f:Landroid/os/Handler;

    .line 145
    .line 146
    invoke-virtual {v5}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 147
    .line 148
    .line 149
    move-result-object v5

    .line 150
    if-ne v2, v5, :cond_6

    .line 151
    .line 152
    move v2, v3

    .line 153
    goto :goto_3

    .line 154
    :cond_6
    move v2, v4

    .line 155
    :goto_3
    invoke-static {v2}, Ldefpackage/rr2;->w(Z)V

    .line 156
    .line 157
    .line 158
    iget-object v0, v0, Ldefpackage/sk2;->e:Ldefpackage/qk2;

    .line 159
    .line 160
    invoke-interface {v0}, Ldefpackage/qk2;->l()V

    .line 161
    .line 162
    .line 163
    :cond_7
    if-eqz v1, :cond_9

    .line 164
    .line 165
    invoke-virtual {p1}, Ldefpackage/bm2;->f1()Ldefpackage/sk2;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    iget-object v2, v0, Ldefpackage/sk2;->f:Landroid/os/Handler;

    .line 177
    .line 178
    invoke-virtual {v2}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    if-ne v1, v2, :cond_8

    .line 183
    .line 184
    move v1, v3

    .line 185
    goto :goto_4

    .line 186
    :cond_8
    move v1, v4

    .line 187
    :goto_4
    invoke-static {v1}, Ldefpackage/rr2;->w(Z)V

    .line 188
    .line 189
    .line 190
    iget-object v0, v0, Ldefpackage/sk2;->e:Ldefpackage/qk2;

    .line 191
    .line 192
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    :cond_9
    if-eqz p0, :cond_b

    .line 196
    .line 197
    invoke-virtual {p1}, Ldefpackage/bm2;->f1()Ldefpackage/sk2;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    iget-object v0, p0, Ldefpackage/sk2;->f:Landroid/os/Handler;

    .line 209
    .line 210
    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    if-ne p1, v0, :cond_a

    .line 215
    .line 216
    goto :goto_5

    .line 217
    :cond_a
    move v3, v4

    .line 218
    :goto_5
    invoke-static {v3}, Ldefpackage/rr2;->w(Z)V

    .line 219
    .line 220
    .line 221
    iget-object p0, p0, Ldefpackage/sk2;->e:Ldefpackage/qk2;

    .line 222
    .line 223
    invoke-interface {p0}, Ldefpackage/qk2;->u()V

    .line 224
    .line 225
    .line 226
    :cond_b
    :goto_6
    return-void

    .line 227
    :pswitch_0
    check-cast p0, Ldefpackage/lk3;

    .line 228
    .line 229
    check-cast v1, Ldefpackage/jk3;

    .line 230
    .line 231
    invoke-virtual {p1, p0, v1}, Ldefpackage/bm2;->o1(Ldefpackage/lk3;Ldefpackage/jk3;)V

    .line 232
    .line 233
    .line 234
    return-void

    .line 235
    :pswitch_data_0
    .packed-switch 0x12
        :pswitch_0
    .end packed-switch
.end method

.method public d(Ldefpackage/pu1;I)V
    .locals 6

    .line 1
    iget v0, p0, Ldefpackage/ef0;->n:I

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/ef0;->p:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/ef0;->o:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ldefpackage/bm2;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v1, Ldefpackage/cw4;

    .line 13
    .line 14
    iget-object p0, p0, Ldefpackage/bm2;->c:Ldefpackage/mm2;

    .line 15
    .line 16
    invoke-virtual {v1}, Ldefpackage/cw4;->c()Landroid/os/Bundle;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {p1, p0, p2, v0}, Ldefpackage/pu1;->A(Ldefpackage/ju1;ILandroid/os/Bundle;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_0
    check-cast v1, Ldefpackage/qh3;

    .line 25
    .line 26
    iget-object p0, p0, Ldefpackage/bm2;->c:Ldefpackage/mm2;

    .line 27
    .line 28
    new-instance v0, Landroid/os/Bundle;

    .line 29
    .line 30
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 31
    .line 32
    .line 33
    sget-object v2, Ldefpackage/qh3;->e:Ljava/lang/String;

    .line 34
    .line 35
    iget v3, v1, Ldefpackage/qh3;->a:F

    .line 36
    .line 37
    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 38
    .line 39
    .line 40
    sget-object v2, Ldefpackage/qh3;->f:Ljava/lang/String;

    .line 41
    .line 42
    iget v1, v1, Ldefpackage/qh3;->b:F

    .line 43
    .line 44
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 45
    .line 46
    .line 47
    invoke-interface {p1, p0, p2, v0}, Ldefpackage/pu1;->r0(Ldefpackage/ju1;ILandroid/os/Bundle;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :pswitch_1
    check-cast v1, Ldefpackage/do2;

    .line 52
    .line 53
    iget-object p0, p0, Ldefpackage/bm2;->c:Ldefpackage/mm2;

    .line 54
    .line 55
    invoke-virtual {v1}, Ldefpackage/do2;->c()Landroid/os/Bundle;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-interface {p1, p0, p2, v0}, Ldefpackage/pu1;->y0(Ldefpackage/ju1;ILandroid/os/Bundle;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :pswitch_2
    check-cast v1, Landroid/view/Surface;

    .line 64
    .line 65
    iget-object p0, p0, Ldefpackage/bm2;->c:Ldefpackage/mm2;

    .line 66
    .line 67
    invoke-interface {p1, p0, p2, v1}, Ldefpackage/pu1;->m0(Ldefpackage/ju1;ILandroid/view/Surface;)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :pswitch_3
    check-cast v1, Ljava/util/ArrayList;

    .line 72
    .line 73
    iget-object p0, p0, Ldefpackage/bm2;->c:Ldefpackage/mm2;

    .line 74
    .line 75
    new-instance v0, Ldefpackage/iw;

    .line 76
    .line 77
    invoke-static {}, Ldefpackage/yw1;->j()Ldefpackage/uw1;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    const/4 v3, 0x0

    .line 82
    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    if-ge v3, v4, :cond_0

    .line 87
    .line 88
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    check-cast v4, Ldefpackage/gn2;

    .line 93
    .line 94
    const/4 v5, 0x1

    .line 95
    invoke-virtual {v4, v5}, Ldefpackage/gn2;->c(Z)Landroid/os/Bundle;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    invoke-virtual {v2, v4}, Ldefpackage/pw1;->c(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    add-int/lit8 v3, v3, 0x1

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_0
    invoke-virtual {v2}, Ldefpackage/uw1;->f()Ldefpackage/gy3;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-direct {v0, v1}, Ldefpackage/iw;-><init>(Ljava/util/List;)V

    .line 110
    .line 111
    .line 112
    invoke-interface {p1, p0, p2, v0}, Ldefpackage/pu1;->J(Ldefpackage/ju1;ILdefpackage/iw;)V

    .line 113
    .line 114
    .line 115
    return-void

    .line 116
    nop

    .line 117
    :pswitch_data_0
    .packed-switch 0xb
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public e(Ljava/lang/Object;)I
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/ef0;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/Context;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/ef0;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ldefpackage/tb1;

    .line 8
    .line 9
    check-cast p1, Ldefpackage/dk2;

    .line 10
    .line 11
    iget-object v1, p1, Ldefpackage/dk2;->b:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v2, p0, Ldefpackage/tb1;->n:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v3, 0x0

    .line 20
    if-nez v2, :cond_1

    .line 21
    .line 22
    invoke-static {p0}, Ldefpackage/jk2;->c(Ldefpackage/tb1;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    return v3

    .line 34
    :cond_1
    :goto_0
    invoke-virtual {p1, v0, p0, v3}, Ldefpackage/dk2;->c(Landroid/content/Context;Ldefpackage/tb1;Z)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    invoke-virtual {p1, p0}, Ldefpackage/dk2;->d(Ldefpackage/tb1;)Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    if-eqz p0, :cond_2

    .line 45
    .line 46
    const/4 p0, 0x1

    .line 47
    return p0

    .line 48
    :cond_2
    return v3
.end method

.method public f(Ljava/lang/Object;Ldefpackage/w71;)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-object v2, v0, Ldefpackage/ef0;->o:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ldefpackage/nj0;

    .line 8
    .line 9
    iget-object v0, v0, Ldefpackage/ef0;->p:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Ldefpackage/qi3;

    .line 12
    .line 13
    move-object/from16 v3, p1

    .line 14
    .line 15
    check-cast v3, Ldefpackage/ho2;

    .line 16
    .line 17
    iget-object v2, v2, Ldefpackage/nj0;->r:Landroid/util/SparseArray;

    .line 18
    .line 19
    new-instance v9, Landroid/util/SparseArray;

    .line 20
    .line 21
    iget-object v4, v1, Ldefpackage/w71;->a:Landroid/util/SparseBooleanArray;

    .line 22
    .line 23
    invoke-virtual {v4}, Landroid/util/SparseBooleanArray;->size()I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    invoke-direct {v9, v4}, Landroid/util/SparseArray;-><init>(I)V

    .line 28
    .line 29
    .line 30
    const/4 v10, 0x0

    .line 31
    move v4, v10

    .line 32
    :goto_0
    iget-object v5, v1, Ldefpackage/w71;->a:Landroid/util/SparseBooleanArray;

    .line 33
    .line 34
    invoke-virtual {v5}, Landroid/util/SparseBooleanArray;->size()I

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    if-ge v4, v5, :cond_0

    .line 39
    .line 40
    invoke-virtual {v1, v4}, Ldefpackage/w71;->b(I)I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    invoke-virtual {v2, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    check-cast v6, Ldefpackage/q9;

    .line 49
    .line 50
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v9, v5, v6}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    add-int/lit8 v4, v4, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    iget-object v2, v1, Ldefpackage/w71;->a:Landroid/util/SparseBooleanArray;

    .line 63
    .line 64
    invoke-virtual {v2}, Landroid/util/SparseBooleanArray;->size()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-nez v2, :cond_1

    .line 69
    .line 70
    goto/16 :goto_39

    .line 71
    .line 72
    :cond_1
    move v2, v10

    .line 73
    :goto_1
    iget-object v4, v1, Ldefpackage/w71;->a:Landroid/util/SparseBooleanArray;

    .line 74
    .line 75
    invoke-virtual {v4}, Landroid/util/SparseBooleanArray;->size()I

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    const/4 v11, 0x1

    .line 80
    const/16 v12, 0xb

    .line 81
    .line 82
    if-ge v2, v4, :cond_d

    .line 83
    .line 84
    invoke-virtual {v1, v2}, Ldefpackage/w71;->b(I)I

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    invoke-virtual {v9, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    check-cast v5, Ldefpackage/q9;

    .line 93
    .line 94
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    iget-object v6, v3, Ldefpackage/ho2;->c:Ldefpackage/nm0;

    .line 98
    .line 99
    if-nez v4, :cond_6

    .line 100
    .line 101
    monitor-enter v6

    .line 102
    :try_start_0
    iget-object v4, v6, Ldefpackage/nm0;->d:Ldefpackage/ho2;

    .line 103
    .line 104
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    iget-object v4, v6, Ldefpackage/nm0;->e:Ldefpackage/cu4;

    .line 108
    .line 109
    iget-object v7, v5, Ldefpackage/q9;->b:Ldefpackage/cu4;

    .line 110
    .line 111
    iput-object v7, v6, Ldefpackage/nm0;->e:Ldefpackage/cu4;

    .line 112
    .line 113
    iget-object v7, v6, Ldefpackage/nm0;->c:Ljava/util/HashMap;

    .line 114
    .line 115
    invoke-virtual {v7}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    invoke-interface {v7}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 120
    .line 121
    .line 122
    move-result-object v7

    .line 123
    :cond_2
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 124
    .line 125
    .line 126
    move-result v8

    .line 127
    if-eqz v8, :cond_5

    .line 128
    .line 129
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v8

    .line 133
    check-cast v8, Ldefpackage/mm0;

    .line 134
    .line 135
    iget-object v11, v6, Ldefpackage/nm0;->e:Ldefpackage/cu4;

    .line 136
    .line 137
    invoke-virtual {v8, v4, v11}, Ldefpackage/mm0;->b(Ldefpackage/cu4;Ldefpackage/cu4;)Z

    .line 138
    .line 139
    .line 140
    move-result v11

    .line 141
    if-eqz v11, :cond_3

    .line 142
    .line 143
    invoke-virtual {v8, v5}, Ldefpackage/mm0;->a(Ldefpackage/q9;)Z

    .line 144
    .line 145
    .line 146
    move-result v11

    .line 147
    if-eqz v11, :cond_2

    .line 148
    .line 149
    goto :goto_3

    .line 150
    :catchall_0
    move-exception v0

    .line 151
    goto :goto_4

    .line 152
    :cond_3
    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->remove()V

    .line 153
    .line 154
    .line 155
    iget-object v11, v8, Ldefpackage/mm0;->a:Ljava/lang/String;

    .line 156
    .line 157
    iget-object v12, v6, Ldefpackage/nm0;->f:Ljava/lang/String;

    .line 158
    .line 159
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v11

    .line 163
    if-eqz v11, :cond_4

    .line 164
    .line 165
    invoke-virtual {v6, v8}, Ldefpackage/nm0;->a(Ldefpackage/mm0;)V

    .line 166
    .line 167
    .line 168
    :cond_4
    iget-boolean v11, v8, Ldefpackage/mm0;->e:Z

    .line 169
    .line 170
    if-eqz v11, :cond_2

    .line 171
    .line 172
    iget-object v11, v6, Ldefpackage/nm0;->d:Ldefpackage/ho2;

    .line 173
    .line 174
    iget-object v8, v8, Ldefpackage/mm0;->a:Ljava/lang/String;

    .line 175
    .line 176
    invoke-virtual {v11, v5, v8}, Ldefpackage/ho2;->d(Ldefpackage/q9;Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    goto :goto_2

    .line 180
    :cond_5
    invoke-virtual {v6, v5}, Ldefpackage/nm0;->d(Ldefpackage/q9;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 181
    .line 182
    .line 183
    monitor-exit v6

    .line 184
    goto :goto_9

    .line 185
    :goto_4
    :try_start_1
    monitor-exit v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 186
    throw v0

    .line 187
    :cond_6
    if-ne v4, v12, :cond_c

    .line 188
    .line 189
    iget v4, v3, Ldefpackage/ho2;->l:I

    .line 190
    .line 191
    monitor-enter v6

    .line 192
    :try_start_2
    iget-object v7, v6, Ldefpackage/nm0;->d:Ldefpackage/ho2;

    .line 193
    .line 194
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    if-nez v4, :cond_7

    .line 198
    .line 199
    goto :goto_5

    .line 200
    :cond_7
    move v11, v10

    .line 201
    :goto_5
    iget-object v4, v6, Ldefpackage/nm0;->c:Ljava/util/HashMap;

    .line 202
    .line 203
    invoke-virtual {v4}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 204
    .line 205
    .line 206
    move-result-object v4

    .line 207
    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 208
    .line 209
    .line 210
    move-result-object v4

    .line 211
    :cond_8
    :goto_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 212
    .line 213
    .line 214
    move-result v7

    .line 215
    if-eqz v7, :cond_b

    .line 216
    .line 217
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v7

    .line 221
    check-cast v7, Ldefpackage/mm0;

    .line 222
    .line 223
    invoke-virtual {v7, v5}, Ldefpackage/mm0;->a(Ldefpackage/q9;)Z

    .line 224
    .line 225
    .line 226
    move-result v8

    .line 227
    if-eqz v8, :cond_8

    .line 228
    .line 229
    invoke-interface {v4}, Ljava/util/Iterator;->remove()V

    .line 230
    .line 231
    .line 232
    iget-object v8, v7, Ldefpackage/mm0;->a:Ljava/lang/String;

    .line 233
    .line 234
    iget-object v12, v6, Ldefpackage/nm0;->f:Ljava/lang/String;

    .line 235
    .line 236
    invoke-virtual {v8, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    move-result v8

    .line 240
    if-eqz v8, :cond_9

    .line 241
    .line 242
    invoke-virtual {v6, v7}, Ldefpackage/nm0;->a(Ldefpackage/mm0;)V

    .line 243
    .line 244
    .line 245
    goto :goto_7

    .line 246
    :catchall_1
    move-exception v0

    .line 247
    goto :goto_8

    .line 248
    :cond_9
    :goto_7
    iget-boolean v12, v7, Ldefpackage/mm0;->e:Z

    .line 249
    .line 250
    if-eqz v12, :cond_8

    .line 251
    .line 252
    if-eqz v11, :cond_a

    .line 253
    .line 254
    if-eqz v8, :cond_a

    .line 255
    .line 256
    iget-boolean v8, v7, Ldefpackage/mm0;->f:Z

    .line 257
    .line 258
    :cond_a
    iget-object v8, v6, Ldefpackage/nm0;->d:Ldefpackage/ho2;

    .line 259
    .line 260
    iget-object v7, v7, Ldefpackage/mm0;->a:Ljava/lang/String;

    .line 261
    .line 262
    invoke-virtual {v8, v5, v7}, Ldefpackage/ho2;->d(Ldefpackage/q9;Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    goto :goto_6

    .line 266
    :cond_b
    invoke-virtual {v6, v5}, Ldefpackage/nm0;->d(Ldefpackage/q9;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 267
    .line 268
    .line 269
    monitor-exit v6

    .line 270
    goto :goto_9

    .line 271
    :goto_8
    :try_start_3
    monitor-exit v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 272
    throw v0

    .line 273
    :cond_c
    invoke-virtual {v6, v5}, Ldefpackage/nm0;->e(Ldefpackage/q9;)V

    .line 274
    .line 275
    .line 276
    :goto_9
    add-int/lit8 v2, v2, 0x1

    .line 277
    .line 278
    goto/16 :goto_1

    .line 279
    .line 280
    :cond_d
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 281
    .line 282
    .line 283
    move-result-wide v5

    .line 284
    iget-object v2, v1, Ldefpackage/w71;->a:Landroid/util/SparseBooleanArray;

    .line 285
    .line 286
    invoke-virtual {v2, v10}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 287
    .line 288
    .line 289
    move-result v2

    .line 290
    if-eqz v2, :cond_e

    .line 291
    .line 292
    invoke-virtual {v9, v10}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v2

    .line 296
    check-cast v2, Ldefpackage/q9;

    .line 297
    .line 298
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 299
    .line 300
    .line 301
    iget-object v4, v3, Ldefpackage/ho2;->k:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 302
    .line 303
    if-eqz v4, :cond_e

    .line 304
    .line 305
    iget-object v4, v2, Ldefpackage/q9;->b:Ldefpackage/cu4;

    .line 306
    .line 307
    iget-object v2, v2, Ldefpackage/q9;->d:Ldefpackage/mt2;

    .line 308
    .line 309
    invoke-virtual {v3, v4, v2}, Ldefpackage/ho2;->c(Ldefpackage/cu4;Ldefpackage/mt2;)V

    .line 310
    .line 311
    .line 312
    :cond_e
    iget-object v2, v1, Ldefpackage/w71;->a:Landroid/util/SparseBooleanArray;

    .line 313
    .line 314
    const/4 v13, 0x2

    .line 315
    invoke-virtual {v2, v13}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 316
    .line 317
    .line 318
    move-result v2

    .line 319
    if-eqz v2, :cond_16

    .line 320
    .line 321
    iget-object v2, v3, Ldefpackage/ho2;->k:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 322
    .line 323
    if-eqz v2, :cond_16

    .line 324
    .line 325
    invoke-interface {v0}, Ldefpackage/qi3;->e0()Ldefpackage/jw4;

    .line 326
    .line 327
    .line 328
    move-result-object v2

    .line 329
    iget-object v2, v2, Ldefpackage/jw4;->a:Ldefpackage/yw1;

    .line 330
    .line 331
    invoke-virtual {v2, v10}, Ldefpackage/yw1;->m(I)Ldefpackage/vw1;

    .line 332
    .line 333
    .line 334
    move-result-object v2

    .line 335
    :goto_a
    invoke-virtual {v2}, Ldefpackage/v0;->hasNext()Z

    .line 336
    .line 337
    .line 338
    move-result v4

    .line 339
    if-eqz v4, :cond_11

    .line 340
    .line 341
    invoke-virtual {v2}, Ldefpackage/v0;->next()Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object v4

    .line 345
    check-cast v4, Ldefpackage/iw4;

    .line 346
    .line 347
    move v8, v10

    .line 348
    :goto_b
    iget v12, v4, Ldefpackage/iw4;->a:I

    .line 349
    .line 350
    if-ge v8, v12, :cond_10

    .line 351
    .line 352
    iget-object v12, v4, Ldefpackage/iw4;->e:[Z

    .line 353
    .line 354
    aget-boolean v12, v12, v8

    .line 355
    .line 356
    if-eqz v12, :cond_f

    .line 357
    .line 358
    invoke-virtual {v4, v8}, Ldefpackage/iw4;->a(I)Ldefpackage/tb1;

    .line 359
    .line 360
    .line 361
    move-result-object v12

    .line 362
    iget-object v12, v12, Ldefpackage/tb1;->r:Ldefpackage/ow0;

    .line 363
    .line 364
    if-eqz v12, :cond_f

    .line 365
    .line 366
    goto :goto_c

    .line 367
    :cond_f
    add-int/lit8 v8, v8, 0x1

    .line 368
    .line 369
    goto :goto_b

    .line 370
    :cond_10
    const/16 v12, 0xb

    .line 371
    .line 372
    goto :goto_a

    .line 373
    :cond_11
    const/4 v12, 0x0

    .line 374
    :goto_c
    if-eqz v12, :cond_16

    .line 375
    .line 376
    iget-object v2, v3, Ldefpackage/ho2;->k:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 377
    .line 378
    sget-object v4, Ldefpackage/f35;->a:Ljava/lang/String;

    .line 379
    .line 380
    invoke-static {v2}, Ldefpackage/fo2;->h(Ljava/lang/Object;)Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 381
    .line 382
    .line 383
    move-result-object v2

    .line 384
    move v4, v10

    .line 385
    :goto_d
    iget v8, v12, Ldefpackage/ow0;->q:I

    .line 386
    .line 387
    if-ge v4, v8, :cond_15

    .line 388
    .line 389
    iget-object v8, v12, Ldefpackage/ow0;->n:[Ldefpackage/nw0;

    .line 390
    .line 391
    aget-object v8, v8, v4

    .line 392
    .line 393
    iget-object v8, v8, Ldefpackage/nw0;->o:Ljava/util/UUID;

    .line 394
    .line 395
    sget-object v7, Ldefpackage/ax;->d:Ljava/util/UUID;

    .line 396
    .line 397
    invoke-virtual {v8, v7}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 398
    .line 399
    .line 400
    move-result v7

    .line 401
    if-eqz v7, :cond_12

    .line 402
    .line 403
    const/4 v4, 0x3

    .line 404
    goto :goto_e

    .line 405
    :cond_12
    sget-object v7, Ldefpackage/ax;->e:Ljava/util/UUID;

    .line 406
    .line 407
    invoke-virtual {v8, v7}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 408
    .line 409
    .line 410
    move-result v7

    .line 411
    if-eqz v7, :cond_13

    .line 412
    .line 413
    move v4, v13

    .line 414
    goto :goto_e

    .line 415
    :cond_13
    sget-object v7, Ldefpackage/ax;->c:Ljava/util/UUID;

    .line 416
    .line 417
    invoke-virtual {v8, v7}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 418
    .line 419
    .line 420
    move-result v7

    .line 421
    if-eqz v7, :cond_14

    .line 422
    .line 423
    const/4 v4, 0x6

    .line 424
    goto :goto_e

    .line 425
    :cond_14
    add-int/lit8 v4, v4, 0x1

    .line 426
    .line 427
    goto :goto_d

    .line 428
    :cond_15
    move v4, v11

    .line 429
    :goto_e
    invoke-static {v2, v4}, Ldefpackage/fo2;->o(Landroid/media/metrics/PlaybackMetrics$Builder;I)V

    .line 430
    .line 431
    .line 432
    :cond_16
    const/16 v2, 0x3f3

    .line 433
    .line 434
    iget-object v4, v1, Ldefpackage/w71;->a:Landroid/util/SparseBooleanArray;

    .line 435
    .line 436
    invoke-virtual {v4, v2}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 437
    .line 438
    .line 439
    move-result v2

    .line 440
    if-eqz v2, :cond_17

    .line 441
    .line 442
    iget v2, v3, Ldefpackage/ho2;->A:I

    .line 443
    .line 444
    add-int/2addr v2, v11

    .line 445
    iput v2, v3, Ldefpackage/ho2;->A:I

    .line 446
    .line 447
    :cond_17
    iget-object v2, v3, Ldefpackage/ho2;->o:Landroidx/media3/common/PlaybackException;

    .line 448
    .line 449
    const/4 v13, 0x5

    .line 450
    const/4 v14, 0x4

    .line 451
    if-nez v2, :cond_18

    .line 452
    .line 453
    move v14, v11

    .line 454
    const/16 v8, 0x1b

    .line 455
    .line 456
    const/16 v10, 0xd

    .line 457
    .line 458
    const/4 v15, 0x6

    .line 459
    const/16 v17, 0x8

    .line 460
    .line 461
    const/16 v18, 0x7

    .line 462
    .line 463
    const/16 v19, 0x9

    .line 464
    .line 465
    goto/16 :goto_21

    .line 466
    .line 467
    :cond_18
    iget v8, v2, Landroidx/media3/common/PlaybackException;->n:I

    .line 468
    .line 469
    iget-object v15, v3, Ldefpackage/ho2;->a:Landroid/content/Context;

    .line 470
    .line 471
    iget v7, v3, Ldefpackage/ho2;->w:I

    .line 472
    .line 473
    if-ne v7, v14, :cond_19

    .line 474
    .line 475
    move v7, v11

    .line 476
    goto :goto_f

    .line 477
    :cond_19
    move v7, v10

    .line 478
    :goto_f
    const/16 v14, 0x3e9

    .line 479
    .line 480
    if-ne v8, v14, :cond_1a

    .line 481
    .line 482
    new-instance v7, Ldefpackage/n50;

    .line 483
    .line 484
    const/16 v8, 0x14

    .line 485
    .line 486
    invoke-direct {v7, v8, v10}, Ldefpackage/n50;-><init>(II)V

    .line 487
    .line 488
    .line 489
    :goto_10
    const/16 v8, 0x1b

    .line 490
    .line 491
    :goto_11
    const/16 v10, 0xd

    .line 492
    .line 493
    const/4 v15, 0x6

    .line 494
    const/16 v17, 0x8

    .line 495
    .line 496
    const/16 v18, 0x7

    .line 497
    .line 498
    const/16 v19, 0x9

    .line 499
    .line 500
    goto/16 :goto_20

    .line 501
    .line 502
    :cond_1a
    instance-of v14, v2, Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 503
    .line 504
    if-eqz v14, :cond_1c

    .line 505
    .line 506
    move-object v14, v2

    .line 507
    check-cast v14, Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 508
    .line 509
    iget v12, v14, Landroidx/media3/exoplayer/ExoPlaybackException;->w:I

    .line 510
    .line 511
    if-ne v12, v11, :cond_1b

    .line 512
    .line 513
    move v12, v11

    .line 514
    goto :goto_12

    .line 515
    :cond_1b
    move v12, v10

    .line 516
    :goto_12
    iget v14, v14, Landroidx/media3/exoplayer/ExoPlaybackException;->A:I

    .line 517
    .line 518
    goto :goto_13

    .line 519
    :cond_1c
    move v12, v10

    .line 520
    move v14, v12

    .line 521
    :goto_13
    invoke-virtual {v2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 522
    .line 523
    .line 524
    move-result-object v11

    .line 525
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 526
    .line 527
    .line 528
    instance-of v4, v11, Ljava/io/IOException;

    .line 529
    .line 530
    const/16 v21, 0x1a

    .line 531
    .line 532
    const/16 v10, 0x17

    .line 533
    .line 534
    if-eqz v4, :cond_31

    .line 535
    .line 536
    instance-of v4, v11, Landroidx/media3/datasource/HttpDataSource$InvalidResponseCodeException;

    .line 537
    .line 538
    if-eqz v4, :cond_1d

    .line 539
    .line 540
    check-cast v11, Landroidx/media3/datasource/HttpDataSource$InvalidResponseCodeException;

    .line 541
    .line 542
    iget v4, v11, Landroidx/media3/datasource/HttpDataSource$InvalidResponseCodeException;->p:I

    .line 543
    .line 544
    new-instance v7, Ldefpackage/n50;

    .line 545
    .line 546
    invoke-direct {v7, v13, v4}, Ldefpackage/n50;-><init>(II)V

    .line 547
    .line 548
    .line 549
    goto :goto_10

    .line 550
    :cond_1d
    instance-of v4, v11, Landroidx/media3/datasource/HttpDataSource$InvalidContentTypeException;

    .line 551
    .line 552
    if-nez v4, :cond_1e

    .line 553
    .line 554
    instance-of v4, v11, Landroidx/media3/common/ParserException;

    .line 555
    .line 556
    if-eqz v4, :cond_1f

    .line 557
    .line 558
    :cond_1e
    const/16 v4, 0x8

    .line 559
    .line 560
    const/16 v8, 0x1b

    .line 561
    .line 562
    const/4 v10, 0x0

    .line 563
    const/16 v12, 0x9

    .line 564
    .line 565
    const/4 v14, 0x7

    .line 566
    const/4 v15, 0x6

    .line 567
    goto/16 :goto_1b

    .line 568
    .line 569
    :cond_1f
    instance-of v4, v11, Landroidx/media3/datasource/HttpDataSource$HttpDataSourceException;

    .line 570
    .line 571
    if-nez v4, :cond_20

    .line 572
    .line 573
    instance-of v7, v11, Landroidx/media3/datasource/UdpDataSource$UdpDataSourceException;

    .line 574
    .line 575
    if-eqz v7, :cond_21

    .line 576
    .line 577
    :cond_20
    const/16 v8, 0x1b

    .line 578
    .line 579
    const/4 v10, 0x0

    .line 580
    const/16 v12, 0x9

    .line 581
    .line 582
    goto/16 :goto_17

    .line 583
    .line 584
    :cond_21
    const/16 v4, 0x3ea

    .line 585
    .line 586
    if-ne v8, v4, :cond_22

    .line 587
    .line 588
    new-instance v7, Ldefpackage/n50;

    .line 589
    .line 590
    const/16 v4, 0x15

    .line 591
    .line 592
    const/4 v8, 0x0

    .line 593
    invoke-direct {v7, v4, v8}, Ldefpackage/n50;-><init>(II)V

    .line 594
    .line 595
    .line 596
    goto :goto_10

    .line 597
    :cond_22
    instance-of v4, v11, Landroidx/media3/exoplayer/drm/DrmSession$DrmSessionException;

    .line 598
    .line 599
    if-eqz v4, :cond_29

    .line 600
    .line 601
    invoke-virtual {v11}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 602
    .line 603
    .line 604
    move-result-object v4

    .line 605
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 606
    .line 607
    .line 608
    instance-of v7, v4, Landroid/media/MediaDrm$MediaDrmStateException;

    .line 609
    .line 610
    if-eqz v7, :cond_23

    .line 611
    .line 612
    check-cast v4, Landroid/media/MediaDrm$MediaDrmStateException;

    .line 613
    .line 614
    invoke-virtual {v4}, Landroid/media/MediaDrm$MediaDrmStateException;->getDiagnosticInfo()Ljava/lang/String;

    .line 615
    .line 616
    .line 617
    move-result-object v4

    .line 618
    invoke-static {v4}, Ldefpackage/f35;->z(Ljava/lang/String;)I

    .line 619
    .line 620
    .line 621
    move-result v4

    .line 622
    invoke-static {v4}, Ldefpackage/f35;->y(I)I

    .line 623
    .line 624
    .line 625
    move-result v7

    .line 626
    packed-switch v7, :pswitch_data_0

    .line 627
    .line 628
    .line 629
    const/16 v7, 0x1b

    .line 630
    .line 631
    goto :goto_14

    .line 632
    :pswitch_0
    move/from16 v7, v21

    .line 633
    .line 634
    goto :goto_14

    .line 635
    :pswitch_1
    const/16 v7, 0x19

    .line 636
    .line 637
    goto :goto_14

    .line 638
    :pswitch_2
    const/16 v7, 0x1c

    .line 639
    .line 640
    goto :goto_14

    .line 641
    :pswitch_3
    const/16 v7, 0x18

    .line 642
    .line 643
    :goto_14
    new-instance v8, Ldefpackage/n50;

    .line 644
    .line 645
    invoke-direct {v8, v7, v4}, Ldefpackage/n50;-><init>(II)V

    .line 646
    .line 647
    .line 648
    move-object v7, v8

    .line 649
    goto/16 :goto_10

    .line 650
    .line 651
    :cond_23
    instance-of v7, v4, Landroid/media/MediaDrmResetException;

    .line 652
    .line 653
    if-eqz v7, :cond_24

    .line 654
    .line 655
    new-instance v7, Ldefpackage/n50;

    .line 656
    .line 657
    const/16 v8, 0x1b

    .line 658
    .line 659
    const/4 v11, 0x0

    .line 660
    invoke-direct {v7, v8, v11}, Ldefpackage/n50;-><init>(II)V

    .line 661
    .line 662
    .line 663
    goto/16 :goto_11

    .line 664
    .line 665
    :cond_24
    const/16 v8, 0x1b

    .line 666
    .line 667
    const/4 v11, 0x0

    .line 668
    instance-of v7, v4, Landroid/media/NotProvisionedException;

    .line 669
    .line 670
    if-eqz v7, :cond_25

    .line 671
    .line 672
    new-instance v7, Ldefpackage/n50;

    .line 673
    .line 674
    const/16 v4, 0x18

    .line 675
    .line 676
    invoke-direct {v7, v4, v11}, Ldefpackage/n50;-><init>(II)V

    .line 677
    .line 678
    .line 679
    goto/16 :goto_11

    .line 680
    .line 681
    :cond_25
    instance-of v7, v4, Landroid/media/DeniedByServerException;

    .line 682
    .line 683
    if-eqz v7, :cond_26

    .line 684
    .line 685
    new-instance v7, Ldefpackage/n50;

    .line 686
    .line 687
    const/16 v4, 0x1d

    .line 688
    .line 689
    invoke-direct {v7, v4, v11}, Ldefpackage/n50;-><init>(II)V

    .line 690
    .line 691
    .line 692
    goto/16 :goto_11

    .line 693
    .line 694
    :cond_26
    instance-of v7, v4, Landroidx/media3/exoplayer/drm/UnsupportedDrmException;

    .line 695
    .line 696
    if-eqz v7, :cond_27

    .line 697
    .line 698
    new-instance v7, Ldefpackage/n50;

    .line 699
    .line 700
    invoke-direct {v7, v10, v11}, Ldefpackage/n50;-><init>(II)V

    .line 701
    .line 702
    .line 703
    goto/16 :goto_11

    .line 704
    .line 705
    :cond_27
    instance-of v4, v4, Landroidx/media3/exoplayer/drm/DefaultDrmSessionManager$MissingSchemeDataException;

    .line 706
    .line 707
    if-eqz v4, :cond_28

    .line 708
    .line 709
    new-instance v7, Ldefpackage/n50;

    .line 710
    .line 711
    const/16 v4, 0x1c

    .line 712
    .line 713
    invoke-direct {v7, v4, v11}, Ldefpackage/n50;-><init>(II)V

    .line 714
    .line 715
    .line 716
    goto/16 :goto_11

    .line 717
    .line 718
    :cond_28
    new-instance v7, Ldefpackage/n50;

    .line 719
    .line 720
    const/16 v4, 0x1e

    .line 721
    .line 722
    invoke-direct {v7, v4, v11}, Ldefpackage/n50;-><init>(II)V

    .line 723
    .line 724
    .line 725
    goto/16 :goto_11

    .line 726
    .line 727
    :cond_29
    const/16 v8, 0x1b

    .line 728
    .line 729
    instance-of v4, v11, Landroidx/media3/datasource/FileDataSource$FileDataSourceException;

    .line 730
    .line 731
    if-eqz v4, :cond_2b

    .line 732
    .line 733
    invoke-virtual {v11}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 734
    .line 735
    .line 736
    move-result-object v4

    .line 737
    instance-of v4, v4, Ljava/io/FileNotFoundException;

    .line 738
    .line 739
    if-eqz v4, :cond_2b

    .line 740
    .line 741
    invoke-virtual {v11}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 742
    .line 743
    .line 744
    move-result-object v4

    .line 745
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 746
    .line 747
    .line 748
    invoke-virtual {v4}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 749
    .line 750
    .line 751
    move-result-object v4

    .line 752
    instance-of v7, v4, Landroid/system/ErrnoException;

    .line 753
    .line 754
    if-eqz v7, :cond_2a

    .line 755
    .line 756
    check-cast v4, Landroid/system/ErrnoException;

    .line 757
    .line 758
    iget v4, v4, Landroid/system/ErrnoException;->errno:I

    .line 759
    .line 760
    sget v7, Landroid/system/OsConstants;->EACCES:I

    .line 761
    .line 762
    if-ne v4, v7, :cond_2a

    .line 763
    .line 764
    new-instance v7, Ldefpackage/n50;

    .line 765
    .line 766
    const/16 v4, 0x20

    .line 767
    .line 768
    const/4 v10, 0x0

    .line 769
    invoke-direct {v7, v4, v10}, Ldefpackage/n50;-><init>(II)V

    .line 770
    .line 771
    .line 772
    goto/16 :goto_11

    .line 773
    .line 774
    :cond_2a
    const/4 v10, 0x0

    .line 775
    new-instance v7, Ldefpackage/n50;

    .line 776
    .line 777
    const/16 v4, 0x1f

    .line 778
    .line 779
    invoke-direct {v7, v4, v10}, Ldefpackage/n50;-><init>(II)V

    .line 780
    .line 781
    .line 782
    goto/16 :goto_11

    .line 783
    .line 784
    :cond_2b
    const/4 v10, 0x0

    .line 785
    new-instance v7, Ldefpackage/n50;

    .line 786
    .line 787
    const/16 v12, 0x9

    .line 788
    .line 789
    invoke-direct {v7, v12, v10}, Ldefpackage/n50;-><init>(II)V

    .line 790
    .line 791
    .line 792
    :goto_15
    move/from16 v19, v12

    .line 793
    .line 794
    const/16 v10, 0xd

    .line 795
    .line 796
    const/4 v15, 0x6

    .line 797
    :goto_16
    const/16 v17, 0x8

    .line 798
    .line 799
    const/16 v18, 0x7

    .line 800
    .line 801
    goto/16 :goto_20

    .line 802
    .line 803
    :goto_17
    invoke-static {v15}, Ldefpackage/v53;->a(Landroid/content/Context;)Ldefpackage/v53;

    .line 804
    .line 805
    .line 806
    move-result-object v7

    .line 807
    invoke-virtual {v7}, Ldefpackage/v53;->b()I

    .line 808
    .line 809
    .line 810
    move-result v7

    .line 811
    const/4 v14, 0x1

    .line 812
    if-ne v7, v14, :cond_2c

    .line 813
    .line 814
    new-instance v7, Ldefpackage/n50;

    .line 815
    .line 816
    const/4 v4, 0x3

    .line 817
    invoke-direct {v7, v4, v10}, Ldefpackage/n50;-><init>(II)V

    .line 818
    .line 819
    .line 820
    goto :goto_15

    .line 821
    :cond_2c
    invoke-virtual {v11}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 822
    .line 823
    .line 824
    move-result-object v7

    .line 825
    instance-of v14, v7, Ljava/net/UnknownHostException;

    .line 826
    .line 827
    if-eqz v14, :cond_2d

    .line 828
    .line 829
    new-instance v7, Ldefpackage/n50;

    .line 830
    .line 831
    const/4 v15, 0x6

    .line 832
    invoke-direct {v7, v15, v10}, Ldefpackage/n50;-><init>(II)V

    .line 833
    .line 834
    .line 835
    move/from16 v19, v12

    .line 836
    .line 837
    const/16 v10, 0xd

    .line 838
    .line 839
    goto :goto_16

    .line 840
    :cond_2d
    const/4 v15, 0x6

    .line 841
    instance-of v7, v7, Ljava/net/SocketTimeoutException;

    .line 842
    .line 843
    if-eqz v7, :cond_2e

    .line 844
    .line 845
    new-instance v7, Ldefpackage/n50;

    .line 846
    .line 847
    const/4 v14, 0x7

    .line 848
    invoke-direct {v7, v14, v10}, Ldefpackage/n50;-><init>(II)V

    .line 849
    .line 850
    .line 851
    :goto_18
    move/from16 v19, v12

    .line 852
    .line 853
    move/from16 v18, v14

    .line 854
    .line 855
    const/16 v10, 0xd

    .line 856
    .line 857
    const/16 v17, 0x8

    .line 858
    .line 859
    goto/16 :goto_20

    .line 860
    .line 861
    :cond_2e
    const/4 v14, 0x7

    .line 862
    if-eqz v4, :cond_2f

    .line 863
    .line 864
    check-cast v11, Landroidx/media3/datasource/HttpDataSource$HttpDataSourceException;

    .line 865
    .line 866
    iget v4, v11, Landroidx/media3/datasource/HttpDataSource$HttpDataSourceException;->o:I

    .line 867
    .line 868
    const/4 v7, 0x1

    .line 869
    if-ne v4, v7, :cond_2f

    .line 870
    .line 871
    new-instance v7, Ldefpackage/n50;

    .line 872
    .line 873
    const/4 v4, 0x4

    .line 874
    invoke-direct {v7, v4, v10}, Ldefpackage/n50;-><init>(II)V

    .line 875
    .line 876
    .line 877
    goto :goto_18

    .line 878
    :cond_2f
    new-instance v7, Ldefpackage/n50;

    .line 879
    .line 880
    const/16 v4, 0x8

    .line 881
    .line 882
    invoke-direct {v7, v4, v10}, Ldefpackage/n50;-><init>(II)V

    .line 883
    .line 884
    .line 885
    move/from16 v17, v4

    .line 886
    .line 887
    :goto_19
    move/from16 v19, v12

    .line 888
    .line 889
    move/from16 v18, v14

    .line 890
    .line 891
    :goto_1a
    const/16 v10, 0xd

    .line 892
    .line 893
    goto/16 :goto_20

    .line 894
    .line 895
    :goto_1b
    new-instance v11, Ldefpackage/n50;

    .line 896
    .line 897
    if-eqz v7, :cond_30

    .line 898
    .line 899
    const/16 v7, 0xa

    .line 900
    .line 901
    goto :goto_1c

    .line 902
    :cond_30
    const/16 v7, 0xb

    .line 903
    .line 904
    :goto_1c
    invoke-direct {v11, v7, v10}, Ldefpackage/n50;-><init>(II)V

    .line 905
    .line 906
    .line 907
    move/from16 v17, v4

    .line 908
    .line 909
    move-object v7, v11

    .line 910
    goto :goto_19

    .line 911
    :cond_31
    const/16 v4, 0x1c

    .line 912
    .line 913
    const/4 v7, 0x0

    .line 914
    const/16 v8, 0x1b

    .line 915
    .line 916
    const/4 v15, 0x6

    .line 917
    const/16 v17, 0x8

    .line 918
    .line 919
    const/16 v18, 0x7

    .line 920
    .line 921
    const/16 v19, 0x9

    .line 922
    .line 923
    if-eqz v12, :cond_33

    .line 924
    .line 925
    if-eqz v14, :cond_32

    .line 926
    .line 927
    const/4 v4, 0x1

    .line 928
    if-ne v14, v4, :cond_33

    .line 929
    .line 930
    :cond_32
    new-instance v4, Ldefpackage/n50;

    .line 931
    .line 932
    const/16 v10, 0x23

    .line 933
    .line 934
    invoke-direct {v4, v10, v7}, Ldefpackage/n50;-><init>(II)V

    .line 935
    .line 936
    .line 937
    :goto_1d
    move-object v7, v4

    .line 938
    goto :goto_1a

    .line 939
    :cond_33
    if-eqz v12, :cond_34

    .line 940
    .line 941
    const/4 v4, 0x3

    .line 942
    if-ne v14, v4, :cond_34

    .line 943
    .line 944
    new-instance v4, Ldefpackage/n50;

    .line 945
    .line 946
    const/16 v10, 0xf

    .line 947
    .line 948
    invoke-direct {v4, v10, v7}, Ldefpackage/n50;-><init>(II)V

    .line 949
    .line 950
    .line 951
    goto :goto_1d

    .line 952
    :cond_34
    if-eqz v12, :cond_35

    .line 953
    .line 954
    const/4 v4, 0x2

    .line 955
    if-ne v14, v4, :cond_35

    .line 956
    .line 957
    new-instance v4, Ldefpackage/n50;

    .line 958
    .line 959
    invoke-direct {v4, v10, v7}, Ldefpackage/n50;-><init>(II)V

    .line 960
    .line 961
    .line 962
    goto :goto_1d

    .line 963
    :cond_35
    instance-of v4, v11, Landroidx/media3/exoplayer/mediacodec/MediaCodecRenderer$DecoderInitializationException;

    .line 964
    .line 965
    if-eqz v4, :cond_36

    .line 966
    .line 967
    check-cast v11, Landroidx/media3/exoplayer/mediacodec/MediaCodecRenderer$DecoderInitializationException;

    .line 968
    .line 969
    iget-object v4, v11, Landroidx/media3/exoplayer/mediacodec/MediaCodecRenderer$DecoderInitializationException;->q:Ljava/lang/String;

    .line 970
    .line 971
    invoke-static {v4}, Ldefpackage/f35;->z(Ljava/lang/String;)I

    .line 972
    .line 973
    .line 974
    move-result v4

    .line 975
    new-instance v7, Ldefpackage/n50;

    .line 976
    .line 977
    const/16 v10, 0xd

    .line 978
    .line 979
    invoke-direct {v7, v10, v4}, Ldefpackage/n50;-><init>(II)V

    .line 980
    .line 981
    .line 982
    goto/16 :goto_20

    .line 983
    .line 984
    :cond_36
    const/16 v10, 0xd

    .line 985
    .line 986
    instance-of v4, v11, Landroidx/media3/exoplayer/mediacodec/MediaCodecDecoderException;

    .line 987
    .line 988
    const/16 v7, 0xe

    .line 989
    .line 990
    if-eqz v4, :cond_37

    .line 991
    .line 992
    check-cast v11, Landroidx/media3/exoplayer/mediacodec/MediaCodecDecoderException;

    .line 993
    .line 994
    iget v4, v11, Landroidx/media3/exoplayer/mediacodec/MediaCodecDecoderException;->n:I

    .line 995
    .line 996
    new-instance v11, Ldefpackage/n50;

    .line 997
    .line 998
    invoke-direct {v11, v7, v4}, Ldefpackage/n50;-><init>(II)V

    .line 999
    .line 1000
    .line 1001
    :goto_1e
    move-object v7, v11

    .line 1002
    goto :goto_20

    .line 1003
    :cond_37
    instance-of v4, v11, Ljava/lang/OutOfMemoryError;

    .line 1004
    .line 1005
    if-eqz v4, :cond_38

    .line 1006
    .line 1007
    new-instance v4, Ldefpackage/n50;

    .line 1008
    .line 1009
    const/4 v12, 0x0

    .line 1010
    invoke-direct {v4, v7, v12}, Ldefpackage/n50;-><init>(II)V

    .line 1011
    .line 1012
    .line 1013
    move-object v7, v4

    .line 1014
    goto :goto_20

    .line 1015
    :cond_38
    const/4 v12, 0x0

    .line 1016
    instance-of v4, v11, Landroidx/media3/exoplayer/audio/AudioSink$InitializationException;

    .line 1017
    .line 1018
    if-eqz v4, :cond_39

    .line 1019
    .line 1020
    new-instance v7, Ldefpackage/n50;

    .line 1021
    .line 1022
    const/16 v4, 0x11

    .line 1023
    .line 1024
    invoke-direct {v7, v4, v12}, Ldefpackage/n50;-><init>(II)V

    .line 1025
    .line 1026
    .line 1027
    goto :goto_20

    .line 1028
    :cond_39
    instance-of v4, v11, Landroidx/media3/exoplayer/audio/AudioSink$WriteException;

    .line 1029
    .line 1030
    if-eqz v4, :cond_3a

    .line 1031
    .line 1032
    check-cast v11, Landroidx/media3/exoplayer/audio/AudioSink$WriteException;

    .line 1033
    .line 1034
    iget v4, v11, Landroidx/media3/exoplayer/audio/AudioSink$WriteException;->n:I

    .line 1035
    .line 1036
    new-instance v7, Ldefpackage/n50;

    .line 1037
    .line 1038
    const/16 v11, 0x12

    .line 1039
    .line 1040
    invoke-direct {v7, v11, v4}, Ldefpackage/n50;-><init>(II)V

    .line 1041
    .line 1042
    .line 1043
    goto :goto_20

    .line 1044
    :cond_3a
    instance-of v4, v11, Landroid/media/MediaCodec$CryptoException;

    .line 1045
    .line 1046
    if-eqz v4, :cond_3b

    .line 1047
    .line 1048
    check-cast v11, Landroid/media/MediaCodec$CryptoException;

    .line 1049
    .line 1050
    invoke-virtual {v11}, Landroid/media/MediaCodec$CryptoException;->getErrorCode()I

    .line 1051
    .line 1052
    .line 1053
    move-result v4

    .line 1054
    invoke-static {v4}, Ldefpackage/f35;->y(I)I

    .line 1055
    .line 1056
    .line 1057
    move-result v7

    .line 1058
    packed-switch v7, :pswitch_data_1

    .line 1059
    .line 1060
    .line 1061
    move v7, v8

    .line 1062
    goto :goto_1f

    .line 1063
    :pswitch_4
    move/from16 v7, v21

    .line 1064
    .line 1065
    goto :goto_1f

    .line 1066
    :pswitch_5
    const/16 v7, 0x19

    .line 1067
    .line 1068
    goto :goto_1f

    .line 1069
    :pswitch_6
    const/16 v7, 0x1c

    .line 1070
    .line 1071
    goto :goto_1f

    .line 1072
    :pswitch_7
    const/16 v7, 0x18

    .line 1073
    .line 1074
    :goto_1f
    new-instance v11, Ldefpackage/n50;

    .line 1075
    .line 1076
    invoke-direct {v11, v7, v4}, Ldefpackage/n50;-><init>(II)V

    .line 1077
    .line 1078
    .line 1079
    goto :goto_1e

    .line 1080
    :cond_3b
    new-instance v7, Ldefpackage/n50;

    .line 1081
    .line 1082
    const/16 v4, 0x16

    .line 1083
    .line 1084
    const/4 v11, 0x0

    .line 1085
    invoke-direct {v7, v4, v11}, Ldefpackage/n50;-><init>(II)V

    .line 1086
    .line 1087
    .line 1088
    :goto_20
    invoke-static {}, Ldefpackage/go2;->f()Landroid/media/metrics/PlaybackErrorEvent$Builder;

    .line 1089
    .line 1090
    .line 1091
    move-result-object v4

    .line 1092
    iget-wide v11, v3, Ldefpackage/ho2;->e:J

    .line 1093
    .line 1094
    sub-long v11, v5, v11

    .line 1095
    .line 1096
    invoke-static {v4, v11, v12}, Ldefpackage/fo2;->d(Landroid/media/metrics/PlaybackErrorEvent$Builder;J)Landroid/media/metrics/PlaybackErrorEvent$Builder;

    .line 1097
    .line 1098
    .line 1099
    move-result-object v4

    .line 1100
    iget v11, v7, Ldefpackage/n50;->a:I

    .line 1101
    .line 1102
    invoke-static {v4, v11}, Ldefpackage/fo2;->c(Landroid/media/metrics/PlaybackErrorEvent$Builder;I)Landroid/media/metrics/PlaybackErrorEvent$Builder;

    .line 1103
    .line 1104
    .line 1105
    move-result-object v4

    .line 1106
    iget v7, v7, Ldefpackage/n50;->b:I

    .line 1107
    .line 1108
    invoke-static {v4, v7}, Ldefpackage/fo2;->u(Landroid/media/metrics/PlaybackErrorEvent$Builder;I)Landroid/media/metrics/PlaybackErrorEvent$Builder;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v4

    .line 1112
    invoke-static {v4, v2}, Ldefpackage/fo2;->e(Landroid/media/metrics/PlaybackErrorEvent$Builder;Landroidx/media3/common/PlaybackException;)Landroid/media/metrics/PlaybackErrorEvent$Builder;

    .line 1113
    .line 1114
    .line 1115
    move-result-object v2

    .line 1116
    invoke-static {v2}, Ldefpackage/fo2;->f(Landroid/media/metrics/PlaybackErrorEvent$Builder;)Landroid/media/metrics/PlaybackErrorEvent;

    .line 1117
    .line 1118
    .line 1119
    move-result-object v2

    .line 1120
    iget-object v4, v3, Ldefpackage/ho2;->b:Ljava/util/concurrent/Executor;

    .line 1121
    .line 1122
    new-instance v7, Ldefpackage/ws1;

    .line 1123
    .line 1124
    const/16 v11, 0x19

    .line 1125
    .line 1126
    invoke-direct {v7, v11, v3, v2}, Ldefpackage/ws1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1127
    .line 1128
    .line 1129
    invoke-interface {v4, v7}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 1130
    .line 1131
    .line 1132
    const/4 v14, 0x1

    .line 1133
    iput-boolean v14, v3, Ldefpackage/ho2;->B:Z

    .line 1134
    .line 1135
    const/4 v7, 0x0

    .line 1136
    iput-object v7, v3, Ldefpackage/ho2;->o:Landroidx/media3/common/PlaybackException;

    .line 1137
    .line 1138
    :goto_21
    iget-object v2, v1, Ldefpackage/w71;->a:Landroid/util/SparseBooleanArray;

    .line 1139
    .line 1140
    const/4 v4, 0x2

    .line 1141
    invoke-virtual {v2, v4}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 1142
    .line 1143
    .line 1144
    move-result v2

    .line 1145
    if-eqz v2, :cond_3c

    .line 1146
    .line 1147
    invoke-interface {v0}, Ldefpackage/qi3;->e0()Ldefpackage/jw4;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v2

    .line 1151
    invoke-virtual {v2, v4}, Ldefpackage/jw4;->a(I)Z

    .line 1152
    .line 1153
    .line 1154
    move-result v7

    .line 1155
    invoke-virtual {v2, v14}, Ldefpackage/jw4;->a(I)Z

    .line 1156
    .line 1157
    .line 1158
    move-result v11

    .line 1159
    const/4 v4, 0x3

    .line 1160
    invoke-virtual {v2, v4}, Ldefpackage/jw4;->a(I)Z

    .line 1161
    .line 1162
    .line 1163
    move-result v2

    .line 1164
    if-nez v7, :cond_3d

    .line 1165
    .line 1166
    if-nez v11, :cond_3d

    .line 1167
    .line 1168
    if-eqz v2, :cond_3c

    .line 1169
    .line 1170
    goto :goto_22

    .line 1171
    :cond_3c
    move/from16 v16, v10

    .line 1172
    .line 1173
    const/4 v2, 0x0

    .line 1174
    const/16 v12, 0xa

    .line 1175
    .line 1176
    move v10, v8

    .line 1177
    goto/16 :goto_2a

    .line 1178
    .line 1179
    :cond_3d
    :goto_22
    if-nez v7, :cond_40

    .line 1180
    .line 1181
    iget-object v4, v3, Ldefpackage/ho2;->s:Ldefpackage/tb1;

    .line 1182
    .line 1183
    const/4 v7, 0x0

    .line 1184
    invoke-static {v4, v7}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1185
    .line 1186
    .line 1187
    move-result v4

    .line 1188
    if-eqz v4, :cond_3e

    .line 1189
    .line 1190
    move/from16 v16, v10

    .line 1191
    .line 1192
    goto :goto_24

    .line 1193
    :cond_3e
    iget-object v4, v3, Ldefpackage/ho2;->s:Ldefpackage/tb1;

    .line 1194
    .line 1195
    if-nez v4, :cond_3f

    .line 1196
    .line 1197
    move/from16 v20, v8

    .line 1198
    .line 1199
    const/4 v8, 0x1

    .line 1200
    goto :goto_23

    .line 1201
    :cond_3f
    move/from16 v20, v8

    .line 1202
    .line 1203
    const/4 v8, 0x0

    .line 1204
    :goto_23
    iput-object v7, v3, Ldefpackage/ho2;->s:Ldefpackage/tb1;

    .line 1205
    .line 1206
    const/4 v4, 0x1

    .line 1207
    move/from16 v16, v10

    .line 1208
    .line 1209
    move/from16 v10, v20

    .line 1210
    .line 1211
    const/16 v12, 0xa

    .line 1212
    .line 1213
    invoke-virtual/range {v3 .. v8}, Ldefpackage/ho2;->e(IJLdefpackage/tb1;I)V

    .line 1214
    .line 1215
    .line 1216
    goto :goto_25

    .line 1217
    :cond_40
    move/from16 v16, v10

    .line 1218
    .line 1219
    const/4 v7, 0x0

    .line 1220
    :goto_24
    const/16 v12, 0xa

    .line 1221
    .line 1222
    move v10, v8

    .line 1223
    :goto_25
    if-nez v11, :cond_43

    .line 1224
    .line 1225
    iget-object v4, v3, Ldefpackage/ho2;->t:Ldefpackage/tb1;

    .line 1226
    .line 1227
    invoke-static {v4, v7}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1228
    .line 1229
    .line 1230
    move-result v4

    .line 1231
    if-eqz v4, :cond_41

    .line 1232
    .line 1233
    goto :goto_27

    .line 1234
    :cond_41
    iget-object v4, v3, Ldefpackage/ho2;->t:Ldefpackage/tb1;

    .line 1235
    .line 1236
    if-nez v4, :cond_42

    .line 1237
    .line 1238
    const/4 v8, 0x1

    .line 1239
    goto :goto_26

    .line 1240
    :cond_42
    const/4 v8, 0x0

    .line 1241
    :goto_26
    iput-object v7, v3, Ldefpackage/ho2;->t:Ldefpackage/tb1;

    .line 1242
    .line 1243
    const/4 v4, 0x0

    .line 1244
    invoke-virtual/range {v3 .. v8}, Ldefpackage/ho2;->e(IJLdefpackage/tb1;I)V

    .line 1245
    .line 1246
    .line 1247
    :cond_43
    :goto_27
    if-nez v2, :cond_46

    .line 1248
    .line 1249
    iget-object v2, v3, Ldefpackage/ho2;->u:Ldefpackage/tb1;

    .line 1250
    .line 1251
    invoke-static {v2, v7}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1252
    .line 1253
    .line 1254
    move-result v2

    .line 1255
    if-eqz v2, :cond_44

    .line 1256
    .line 1257
    goto :goto_29

    .line 1258
    :cond_44
    iget-object v2, v3, Ldefpackage/ho2;->u:Ldefpackage/tb1;

    .line 1259
    .line 1260
    if-nez v2, :cond_45

    .line 1261
    .line 1262
    const/4 v8, 0x1

    .line 1263
    goto :goto_28

    .line 1264
    :cond_45
    const/4 v8, 0x0

    .line 1265
    :goto_28
    iput-object v7, v3, Ldefpackage/ho2;->u:Ldefpackage/tb1;

    .line 1266
    .line 1267
    const/4 v4, 0x2

    .line 1268
    invoke-virtual/range {v3 .. v8}, Ldefpackage/ho2;->e(IJLdefpackage/tb1;I)V

    .line 1269
    .line 1270
    .line 1271
    :cond_46
    :goto_29
    move-object v2, v7

    .line 1272
    :goto_2a
    iget-object v4, v3, Ldefpackage/ho2;->p:Ldefpackage/ue1;

    .line 1273
    .line 1274
    invoke-virtual {v3, v4}, Ldefpackage/ho2;->a(Ldefpackage/ue1;)Z

    .line 1275
    .line 1276
    .line 1277
    move-result v4

    .line 1278
    if-eqz v4, :cond_49

    .line 1279
    .line 1280
    iget-object v4, v3, Ldefpackage/ho2;->p:Ldefpackage/ue1;

    .line 1281
    .line 1282
    iget-object v7, v4, Ldefpackage/ue1;->p:Ljava/lang/Object;

    .line 1283
    .line 1284
    check-cast v7, Ldefpackage/tb1;

    .line 1285
    .line 1286
    iget v8, v7, Ldefpackage/tb1;->v:I

    .line 1287
    .line 1288
    const/4 v11, -0x1

    .line 1289
    if-eq v8, v11, :cond_49

    .line 1290
    .line 1291
    iget v4, v4, Ldefpackage/ue1;->o:I

    .line 1292
    .line 1293
    iget-object v8, v3, Ldefpackage/ho2;->s:Ldefpackage/tb1;

    .line 1294
    .line 1295
    invoke-static {v8, v7}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1296
    .line 1297
    .line 1298
    move-result v8

    .line 1299
    if-eqz v8, :cond_47

    .line 1300
    .line 1301
    goto :goto_2c

    .line 1302
    :cond_47
    iget-object v8, v3, Ldefpackage/ho2;->s:Ldefpackage/tb1;

    .line 1303
    .line 1304
    if-nez v8, :cond_48

    .line 1305
    .line 1306
    if-nez v4, :cond_48

    .line 1307
    .line 1308
    const/4 v8, 0x1

    .line 1309
    goto :goto_2b

    .line 1310
    :cond_48
    move v8, v4

    .line 1311
    :goto_2b
    iput-object v7, v3, Ldefpackage/ho2;->s:Ldefpackage/tb1;

    .line 1312
    .line 1313
    const/4 v4, 0x1

    .line 1314
    invoke-virtual/range {v3 .. v8}, Ldefpackage/ho2;->e(IJLdefpackage/tb1;I)V

    .line 1315
    .line 1316
    .line 1317
    :goto_2c
    iput-object v2, v3, Ldefpackage/ho2;->p:Ldefpackage/ue1;

    .line 1318
    .line 1319
    :cond_49
    iget-object v4, v3, Ldefpackage/ho2;->q:Ldefpackage/ue1;

    .line 1320
    .line 1321
    invoke-virtual {v3, v4}, Ldefpackage/ho2;->a(Ldefpackage/ue1;)Z

    .line 1322
    .line 1323
    .line 1324
    move-result v4

    .line 1325
    if-eqz v4, :cond_4c

    .line 1326
    .line 1327
    iget-object v4, v3, Ldefpackage/ho2;->q:Ldefpackage/ue1;

    .line 1328
    .line 1329
    iget-object v7, v4, Ldefpackage/ue1;->p:Ljava/lang/Object;

    .line 1330
    .line 1331
    check-cast v7, Ldefpackage/tb1;

    .line 1332
    .line 1333
    iget v4, v4, Ldefpackage/ue1;->o:I

    .line 1334
    .line 1335
    iget-object v8, v3, Ldefpackage/ho2;->t:Ldefpackage/tb1;

    .line 1336
    .line 1337
    invoke-static {v8, v7}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1338
    .line 1339
    .line 1340
    move-result v8

    .line 1341
    if-eqz v8, :cond_4a

    .line 1342
    .line 1343
    goto :goto_2e

    .line 1344
    :cond_4a
    iget-object v8, v3, Ldefpackage/ho2;->t:Ldefpackage/tb1;

    .line 1345
    .line 1346
    if-nez v8, :cond_4b

    .line 1347
    .line 1348
    if-nez v4, :cond_4b

    .line 1349
    .line 1350
    const/4 v8, 0x1

    .line 1351
    goto :goto_2d

    .line 1352
    :cond_4b
    move v8, v4

    .line 1353
    :goto_2d
    iput-object v7, v3, Ldefpackage/ho2;->t:Ldefpackage/tb1;

    .line 1354
    .line 1355
    const/4 v4, 0x0

    .line 1356
    invoke-virtual/range {v3 .. v8}, Ldefpackage/ho2;->e(IJLdefpackage/tb1;I)V

    .line 1357
    .line 1358
    .line 1359
    :goto_2e
    iput-object v2, v3, Ldefpackage/ho2;->q:Ldefpackage/ue1;

    .line 1360
    .line 1361
    :cond_4c
    iget-object v4, v3, Ldefpackage/ho2;->r:Ldefpackage/ue1;

    .line 1362
    .line 1363
    invoke-virtual {v3, v4}, Ldefpackage/ho2;->a(Ldefpackage/ue1;)Z

    .line 1364
    .line 1365
    .line 1366
    move-result v4

    .line 1367
    if-eqz v4, :cond_4f

    .line 1368
    .line 1369
    iget-object v4, v3, Ldefpackage/ho2;->r:Ldefpackage/ue1;

    .line 1370
    .line 1371
    iget-object v7, v4, Ldefpackage/ue1;->p:Ljava/lang/Object;

    .line 1372
    .line 1373
    check-cast v7, Ldefpackage/tb1;

    .line 1374
    .line 1375
    iget v4, v4, Ldefpackage/ue1;->o:I

    .line 1376
    .line 1377
    iget-object v8, v3, Ldefpackage/ho2;->u:Ldefpackage/tb1;

    .line 1378
    .line 1379
    invoke-static {v8, v7}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1380
    .line 1381
    .line 1382
    move-result v8

    .line 1383
    if-eqz v8, :cond_4d

    .line 1384
    .line 1385
    goto :goto_30

    .line 1386
    :cond_4d
    iget-object v8, v3, Ldefpackage/ho2;->u:Ldefpackage/tb1;

    .line 1387
    .line 1388
    if-nez v8, :cond_4e

    .line 1389
    .line 1390
    if-nez v4, :cond_4e

    .line 1391
    .line 1392
    const/4 v8, 0x1

    .line 1393
    goto :goto_2f

    .line 1394
    :cond_4e
    move v8, v4

    .line 1395
    :goto_2f
    iput-object v7, v3, Ldefpackage/ho2;->u:Ldefpackage/tb1;

    .line 1396
    .line 1397
    const/4 v4, 0x2

    .line 1398
    invoke-virtual/range {v3 .. v8}, Ldefpackage/ho2;->e(IJLdefpackage/tb1;I)V

    .line 1399
    .line 1400
    .line 1401
    :goto_30
    iput-object v2, v3, Ldefpackage/ho2;->r:Ldefpackage/ue1;

    .line 1402
    .line 1403
    :cond_4f
    iget-object v2, v3, Ldefpackage/ho2;->a:Landroid/content/Context;

    .line 1404
    .line 1405
    invoke-static {v2}, Ldefpackage/v53;->a(Landroid/content/Context;)Ldefpackage/v53;

    .line 1406
    .line 1407
    .line 1408
    move-result-object v2

    .line 1409
    invoke-virtual {v2}, Ldefpackage/v53;->b()I

    .line 1410
    .line 1411
    .line 1412
    move-result v2

    .line 1413
    packed-switch v2, :pswitch_data_2

    .line 1414
    .line 1415
    .line 1416
    :pswitch_8
    const/4 v7, 0x1

    .line 1417
    goto :goto_31

    .line 1418
    :pswitch_9
    move/from16 v7, v18

    .line 1419
    .line 1420
    goto :goto_31

    .line 1421
    :pswitch_a
    move/from16 v7, v17

    .line 1422
    .line 1423
    goto :goto_31

    .line 1424
    :pswitch_b
    const/4 v7, 0x3

    .line 1425
    goto :goto_31

    .line 1426
    :pswitch_c
    move v7, v15

    .line 1427
    goto :goto_31

    .line 1428
    :pswitch_d
    move v7, v13

    .line 1429
    goto :goto_31

    .line 1430
    :pswitch_e
    const/4 v7, 0x4

    .line 1431
    goto :goto_31

    .line 1432
    :pswitch_f
    const/4 v7, 0x2

    .line 1433
    goto :goto_31

    .line 1434
    :pswitch_10
    move/from16 v7, v19

    .line 1435
    .line 1436
    goto :goto_31

    .line 1437
    :pswitch_11
    const/4 v7, 0x0

    .line 1438
    :goto_31
    iget v2, v3, Ldefpackage/ho2;->n:I

    .line 1439
    .line 1440
    if-eq v7, v2, :cond_50

    .line 1441
    .line 1442
    iput v7, v3, Ldefpackage/ho2;->n:I

    .line 1443
    .line 1444
    invoke-static {}, Ldefpackage/go2;->e()Landroid/media/metrics/NetworkEvent$Builder;

    .line 1445
    .line 1446
    .line 1447
    move-result-object v2

    .line 1448
    invoke-static {v2, v7}, Ldefpackage/hd0;->g(Landroid/media/metrics/NetworkEvent$Builder;I)Landroid/media/metrics/NetworkEvent$Builder;

    .line 1449
    .line 1450
    .line 1451
    move-result-object v2

    .line 1452
    iget-wide v7, v3, Ldefpackage/ho2;->e:J

    .line 1453
    .line 1454
    sub-long v7, v5, v7

    .line 1455
    .line 1456
    invoke-static {v2, v7, v8}, Ldefpackage/hd0;->h(Landroid/media/metrics/NetworkEvent$Builder;J)Landroid/media/metrics/NetworkEvent$Builder;

    .line 1457
    .line 1458
    .line 1459
    move-result-object v2

    .line 1460
    invoke-static {v2}, Ldefpackage/hd0;->i(Landroid/media/metrics/NetworkEvent$Builder;)Landroid/media/metrics/NetworkEvent;

    .line 1461
    .line 1462
    .line 1463
    move-result-object v2

    .line 1464
    iget-object v4, v3, Ldefpackage/ho2;->b:Ljava/util/concurrent/Executor;

    .line 1465
    .line 1466
    new-instance v7, Ldefpackage/ws1;

    .line 1467
    .line 1468
    const/16 v8, 0x18

    .line 1469
    .line 1470
    invoke-direct {v7, v8, v3, v2}, Ldefpackage/ws1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1471
    .line 1472
    .line 1473
    invoke-interface {v4, v7}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 1474
    .line 1475
    .line 1476
    :cond_50
    invoke-interface {v0}, Ldefpackage/qi3;->g()I

    .line 1477
    .line 1478
    .line 1479
    move-result v2

    .line 1480
    const/4 v4, 0x2

    .line 1481
    const/4 v11, 0x0

    .line 1482
    if-eq v2, v4, :cond_51

    .line 1483
    .line 1484
    iput-boolean v11, v3, Ldefpackage/ho2;->v:Z

    .line 1485
    .line 1486
    :cond_51
    invoke-interface {v0}, Ldefpackage/qi3;->U()Landroidx/media3/common/PlaybackException;

    .line 1487
    .line 1488
    .line 1489
    move-result-object v2

    .line 1490
    if-nez v2, :cond_52

    .line 1491
    .line 1492
    iput-boolean v11, v3, Ldefpackage/ho2;->x:Z

    .line 1493
    .line 1494
    goto :goto_32

    .line 1495
    :cond_52
    iget-object v2, v1, Ldefpackage/w71;->a:Landroid/util/SparseBooleanArray;

    .line 1496
    .line 1497
    invoke-virtual {v2, v12}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 1498
    .line 1499
    .line 1500
    move-result v2

    .line 1501
    if-eqz v2, :cond_53

    .line 1502
    .line 1503
    const/4 v14, 0x1

    .line 1504
    iput-boolean v14, v3, Ldefpackage/ho2;->x:Z

    .line 1505
    .line 1506
    :cond_53
    :goto_32
    invoke-interface {v0}, Ldefpackage/qi3;->g()I

    .line 1507
    .line 1508
    .line 1509
    move-result v2

    .line 1510
    iget-boolean v4, v3, Ldefpackage/ho2;->v:Z

    .line 1511
    .line 1512
    if-eqz v4, :cond_54

    .line 1513
    .line 1514
    move v12, v13

    .line 1515
    :goto_33
    const/4 v14, 0x1

    .line 1516
    goto :goto_35

    .line 1517
    :cond_54
    iget-boolean v4, v3, Ldefpackage/ho2;->x:Z

    .line 1518
    .line 1519
    if-eqz v4, :cond_55

    .line 1520
    .line 1521
    move/from16 v12, v16

    .line 1522
    .line 1523
    goto :goto_33

    .line 1524
    :cond_55
    const/4 v4, 0x4

    .line 1525
    if-ne v2, v4, :cond_56

    .line 1526
    .line 1527
    const/16 v12, 0xb

    .line 1528
    .line 1529
    goto :goto_33

    .line 1530
    :cond_56
    const/16 v7, 0xc

    .line 1531
    .line 1532
    const/4 v8, 0x2

    .line 1533
    if-ne v2, v8, :cond_5b

    .line 1534
    .line 1535
    iget v2, v3, Ldefpackage/ho2;->m:I

    .line 1536
    .line 1537
    if-eqz v2, :cond_5a

    .line 1538
    .line 1539
    if-eq v2, v8, :cond_5a

    .line 1540
    .line 1541
    if-ne v2, v7, :cond_57

    .line 1542
    .line 1543
    goto :goto_34

    .line 1544
    :cond_57
    invoke-interface {v0}, Ldefpackage/qi3;->q()Z

    .line 1545
    .line 1546
    .line 1547
    move-result v2

    .line 1548
    if-nez v2, :cond_58

    .line 1549
    .line 1550
    move/from16 v12, v18

    .line 1551
    .line 1552
    goto :goto_33

    .line 1553
    :cond_58
    invoke-interface {v0}, Ldefpackage/qi3;->v0()I

    .line 1554
    .line 1555
    .line 1556
    move-result v0

    .line 1557
    if-eqz v0, :cond_59

    .line 1558
    .line 1559
    goto :goto_33

    .line 1560
    :cond_59
    move v12, v15

    .line 1561
    goto :goto_33

    .line 1562
    :cond_5a
    :goto_34
    move v12, v8

    .line 1563
    goto :goto_33

    .line 1564
    :cond_5b
    const/4 v8, 0x3

    .line 1565
    if-ne v2, v8, :cond_5d

    .line 1566
    .line 1567
    invoke-interface {v0}, Ldefpackage/qi3;->q()Z

    .line 1568
    .line 1569
    .line 1570
    move-result v2

    .line 1571
    if-nez v2, :cond_5c

    .line 1572
    .line 1573
    move v12, v4

    .line 1574
    goto :goto_33

    .line 1575
    :cond_5c
    invoke-interface {v0}, Ldefpackage/qi3;->v0()I

    .line 1576
    .line 1577
    .line 1578
    move-result v0

    .line 1579
    if-eqz v0, :cond_5a

    .line 1580
    .line 1581
    move/from16 v12, v19

    .line 1582
    .line 1583
    goto :goto_33

    .line 1584
    :cond_5d
    const/4 v14, 0x1

    .line 1585
    if-ne v2, v14, :cond_5e

    .line 1586
    .line 1587
    iget v0, v3, Ldefpackage/ho2;->m:I

    .line 1588
    .line 1589
    if-eqz v0, :cond_5e

    .line 1590
    .line 1591
    move v12, v7

    .line 1592
    goto :goto_35

    .line 1593
    :cond_5e
    iget v12, v3, Ldefpackage/ho2;->m:I

    .line 1594
    .line 1595
    :goto_35
    iget v0, v3, Ldefpackage/ho2;->m:I

    .line 1596
    .line 1597
    if-eq v0, v12, :cond_5f

    .line 1598
    .line 1599
    iput v12, v3, Ldefpackage/ho2;->m:I

    .line 1600
    .line 1601
    iput-boolean v14, v3, Ldefpackage/ho2;->B:Z

    .line 1602
    .line 1603
    invoke-static {}, Ldefpackage/hd0;->k()Landroid/media/metrics/PlaybackStateEvent$Builder;

    .line 1604
    .line 1605
    .line 1606
    move-result-object v0

    .line 1607
    iget v2, v3, Ldefpackage/ho2;->m:I

    .line 1608
    .line 1609
    invoke-static {v0, v2}, Ldefpackage/fo2;->k(Landroid/media/metrics/PlaybackStateEvent$Builder;I)Landroid/media/metrics/PlaybackStateEvent$Builder;

    .line 1610
    .line 1611
    .line 1612
    move-result-object v0

    .line 1613
    iget-wide v7, v3, Ldefpackage/ho2;->e:J

    .line 1614
    .line 1615
    sub-long/2addr v5, v7

    .line 1616
    invoke-static {v0, v5, v6}, Ldefpackage/fo2;->l(Landroid/media/metrics/PlaybackStateEvent$Builder;J)Landroid/media/metrics/PlaybackStateEvent$Builder;

    .line 1617
    .line 1618
    .line 1619
    move-result-object v0

    .line 1620
    invoke-static {v0}, Ldefpackage/fo2;->m(Landroid/media/metrics/PlaybackStateEvent$Builder;)Landroid/media/metrics/PlaybackStateEvent;

    .line 1621
    .line 1622
    .line 1623
    move-result-object v0

    .line 1624
    iget-object v2, v3, Ldefpackage/ho2;->b:Ljava/util/concurrent/Executor;

    .line 1625
    .line 1626
    new-instance v4, Ldefpackage/ws1;

    .line 1627
    .line 1628
    invoke-direct {v4, v10, v3, v0}, Ldefpackage/ws1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1629
    .line 1630
    .line 1631
    invoke-interface {v2, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 1632
    .line 1633
    .line 1634
    :cond_5f
    iget-object v0, v1, Ldefpackage/w71;->a:Landroid/util/SparseBooleanArray;

    .line 1635
    .line 1636
    const/16 v1, 0x404

    .line 1637
    .line 1638
    invoke-virtual {v0, v1}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 1639
    .line 1640
    .line 1641
    move-result v0

    .line 1642
    if-eqz v0, :cond_63

    .line 1643
    .line 1644
    iget-object v2, v3, Ldefpackage/ho2;->c:Ldefpackage/nm0;

    .line 1645
    .line 1646
    invoke-virtual {v9, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 1647
    .line 1648
    .line 1649
    move-result-object v0

    .line 1650
    check-cast v0, Ldefpackage/q9;

    .line 1651
    .line 1652
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1653
    .line 1654
    .line 1655
    monitor-enter v2

    .line 1656
    :try_start_4
    iget-object v1, v2, Ldefpackage/nm0;->f:Ljava/lang/String;

    .line 1657
    .line 1658
    if-eqz v1, :cond_60

    .line 1659
    .line 1660
    iget-object v3, v2, Ldefpackage/nm0;->c:Ljava/util/HashMap;

    .line 1661
    .line 1662
    invoke-virtual {v3, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1663
    .line 1664
    .line 1665
    move-result-object v1

    .line 1666
    check-cast v1, Ldefpackage/mm0;

    .line 1667
    .line 1668
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1669
    .line 1670
    .line 1671
    invoke-virtual {v2, v1}, Ldefpackage/nm0;->a(Ldefpackage/mm0;)V

    .line 1672
    .line 1673
    .line 1674
    goto :goto_36

    .line 1675
    :catchall_2
    move-exception v0

    .line 1676
    goto :goto_38

    .line 1677
    :cond_60
    :goto_36
    iget-object v1, v2, Ldefpackage/nm0;->c:Ljava/util/HashMap;

    .line 1678
    .line 1679
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 1680
    .line 1681
    .line 1682
    move-result-object v1

    .line 1683
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 1684
    .line 1685
    .line 1686
    move-result-object v1

    .line 1687
    :cond_61
    :goto_37
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1688
    .line 1689
    .line 1690
    move-result v3

    .line 1691
    if-eqz v3, :cond_62

    .line 1692
    .line 1693
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1694
    .line 1695
    .line 1696
    move-result-object v3

    .line 1697
    check-cast v3, Ldefpackage/mm0;

    .line 1698
    .line 1699
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 1700
    .line 1701
    .line 1702
    iget-boolean v4, v3, Ldefpackage/mm0;->e:Z

    .line 1703
    .line 1704
    if-eqz v4, :cond_61

    .line 1705
    .line 1706
    iget-object v4, v2, Ldefpackage/nm0;->d:Ldefpackage/ho2;

    .line 1707
    .line 1708
    if-eqz v4, :cond_61

    .line 1709
    .line 1710
    iget-object v3, v3, Ldefpackage/mm0;->a:Ljava/lang/String;

    .line 1711
    .line 1712
    invoke-virtual {v4, v0, v3}, Ldefpackage/ho2;->d(Ldefpackage/q9;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 1713
    .line 1714
    .line 1715
    goto :goto_37

    .line 1716
    :cond_62
    monitor-exit v2

    .line 1717
    return-void

    .line 1718
    :goto_38
    :try_start_5
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 1719
    throw v0

    .line 1720
    :cond_63
    :goto_39
    return-void

    .line 1721
    :pswitch_data_0
    .packed-switch 0x1772
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    :pswitch_data_1
    .packed-switch 0x1772
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch

    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_8
        :pswitch_b
        :pswitch_8
        :pswitch_a
        :pswitch_9
    .end packed-switch
.end method

.method public g(Landroidx/preference/Preference;Ljava/lang/Object;)Z
    .locals 5

    .line 1
    iget-object p1, p0, Ldefpackage/ef0;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Ldefpackage/h62;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/ef0;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Landroidx/preference/EditTextPreference;

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-static {p2}, Ldefpackage/qm4;->K0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v1, 0x0

    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    const/16 v2, 0x28

    .line 34
    .line 35
    if-le v0, v2, :cond_1

    .line 36
    .line 37
    :goto_0
    const p0, 0x7f1302c1

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, p0}, Ldefpackage/h62;->s0(I)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    sget-boolean v0, Lcom/eddyizm/tempus/lan/LanReceiverService;->y:Z

    .line 45
    .line 46
    iget-object v0, p1, Ldefpackage/h62;->t0:Landroid/content/Context;

    .line 47
    .line 48
    const/4 v2, 0x0

    .line 49
    const-string v3, "app"

    .line 50
    .line 51
    if-eqz v0, :cond_4

    .line 52
    .line 53
    const-string v4, "lan-playback"

    .line 54
    .line 55
    invoke-virtual {v0, v4, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    const-string v4, "name"

    .line 64
    .line 65
    invoke-interface {v0, v4, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, p2}, Landroidx/preference/EditTextPreference;->E(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, p2}, Landroidx/preference/Preference;->x(Ljava/lang/CharSequence;)V

    .line 76
    .line 77
    .line 78
    sget-boolean p0, Lcom/eddyizm/tempus/lan/LanReceiverService;->y:Z

    .line 79
    .line 80
    if-eqz p0, :cond_3

    .line 81
    .line 82
    iget-object p0, p1, Ldefpackage/h62;->t0:Landroid/content/Context;

    .line 83
    .line 84
    if-eqz p0, :cond_2

    .line 85
    .line 86
    const p1, 0x7f1302c2

    .line 87
    .line 88
    .line 89
    const/4 p2, 0x1

    .line 90
    invoke-static {p0, p1, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_2
    invoke-static {v3}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    throw v2

    .line 102
    :cond_3
    :goto_1
    return v1

    .line 103
    :cond_4
    invoke-static {v3}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    throw v2
.end method

.method public h(Ldefpackage/tn2;Ldefpackage/fr2;I)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Ldefpackage/ef0;->n:I

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/ef0;->p:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/ef0;->o:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    :pswitch_0
    check-cast p0, Ldefpackage/it2;

    .line 11
    .line 12
    check-cast v1, Ldefpackage/zr2;

    .line 13
    .line 14
    invoke-virtual {p1}, Ldefpackage/tn2;->l()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    new-instance p0, Ldefpackage/ab4;

    .line 21
    .line 22
    const/16 p1, -0x64

    .line 23
    .line 24
    invoke-direct {p0, p1}, Ldefpackage/ab4;-><init>(I)V

    .line 25
    .line 26
    .line 27
    new-instance p1, Ldefpackage/mw1;

    .line 28
    .line 29
    invoke-direct {p1, p0}, Ldefpackage/mw1;-><init>(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-interface {p0, p1, p2, p3}, Ldefpackage/it2;->h(Ldefpackage/tn2;Ldefpackage/fr2;I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    check-cast p0, Ldefpackage/ic2;

    .line 38
    .line 39
    new-instance p3, Ldefpackage/eg0;

    .line 40
    .line 41
    const/16 v0, 0x8

    .line 42
    .line 43
    invoke-direct {p3, p1, p2, v1, v0}, Ldefpackage/eg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 44
    .line 45
    .line 46
    invoke-static {p0, p3}, Ldefpackage/f35;->h0(Ldefpackage/ic2;Ldefpackage/mk;)Ldefpackage/lb4;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    :goto_0
    return-object p1

    .line 51
    :pswitch_1
    check-cast p0, Ljava/lang/String;

    .line 52
    .line 53
    check-cast v1, Ldefpackage/jn2;

    .line 54
    .line 55
    invoke-virtual {p1, p2, p0, v1}, Ldefpackage/tn2;->y(Ldefpackage/fr2;Ljava/lang/String;Ldefpackage/jn2;)Ldefpackage/lb4;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :pswitch_2
    check-cast p0, Ljava/lang/String;

    .line 61
    .line 62
    check-cast v1, Ldefpackage/lu3;

    .line 63
    .line 64
    iget-object p3, p1, Ldefpackage/tn2;->e:Ldefpackage/pq;

    .line 65
    .line 66
    iget-object v0, p1, Ldefpackage/tn2;->k:Ldefpackage/kn2;

    .line 67
    .line 68
    invoke-virtual {p1, p2}, Ldefpackage/tn2;->B(Ldefpackage/fr2;)Ldefpackage/fr2;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {p3, v0, p1, p0, v1}, Ldefpackage/pq;->e(Ldefpackage/kn2;Ldefpackage/fr2;Ljava/lang/String;Ldefpackage/lu3;)Ldefpackage/ic2;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0

    .line 77
    :pswitch_3
    check-cast p0, Ldefpackage/va4;

    .line 78
    .line 79
    check-cast v1, Landroid/os/Bundle;

    .line 80
    .line 81
    invoke-virtual {p1, p2, p0, v1}, Ldefpackage/tn2;->q(Ldefpackage/fr2;Ldefpackage/va4;Landroid/os/Bundle;)Ldefpackage/ic2;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0

    .line 86
    nop

    .line 87
    :pswitch_data_0
    .packed-switch 0x18
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public i(Landroid/widget/EditText;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/ef0;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/preference/EditTextPreference;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/ef0;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const/16 v1, 0x11

    .line 13
    .line 14
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setInputType(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/widget/TextView;->setSingleLine()V

    .line 18
    .line 19
    .line 20
    iget-object v0, v0, Landroidx/preference/EditTextPreference;->h0:Ljava/lang/String;

    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    invoke-virtual {p1, p0}, Landroid/widget/EditText;->setSelection(I)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 6

    .line 1
    iget v0, p0, Ldefpackage/ef0;->n:I

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/ef0;->p:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/ef0;->o:Ljava/lang/Object;

    .line 6
    .line 7
    sparse-switch v0, :sswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Ldefpackage/ml3;

    .line 11
    .line 12
    check-cast v1, Ljava/lang/Integer;

    .line 13
    .line 14
    check-cast p1, Ldefpackage/oi3;

    .line 15
    .line 16
    iget-object p0, p0, Ldefpackage/ml3;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Ldefpackage/lk3;

    .line 19
    .line 20
    invoke-virtual {p0}, Ldefpackage/lk3;->s()Ldefpackage/gn2;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    invoke-interface {p1, v0, p0}, Ldefpackage/oi3;->t(ILdefpackage/gn2;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :sswitch_0
    check-cast p0, Ldefpackage/gn2;

    .line 33
    .line 34
    check-cast v1, Ljava/lang/Integer;

    .line 35
    .line 36
    check-cast p1, Ldefpackage/oi3;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    invoke-interface {p1, v0, p0}, Ldefpackage/oi3;->t(ILdefpackage/gn2;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :sswitch_1
    check-cast p0, Ldefpackage/q9;

    .line 47
    .line 48
    check-cast v1, Ldefpackage/un2;

    .line 49
    .line 50
    check-cast p1, Ldefpackage/ho2;

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Ldefpackage/q9;->d:Ldefpackage/mt2;

    .line 56
    .line 57
    if-nez v0, :cond_0

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    new-instance v2, Ldefpackage/ue1;

    .line 61
    .line 62
    iget-object v3, v1, Ldefpackage/un2;->c:Ldefpackage/tb1;

    .line 63
    .line 64
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    iget v4, v1, Ldefpackage/un2;->d:I

    .line 68
    .line 69
    iget-object v5, p1, Ldefpackage/ho2;->c:Ldefpackage/nm0;

    .line 70
    .line 71
    iget-object p0, p0, Ldefpackage/q9;->b:Ldefpackage/cu4;

    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v5, p0, v0}, Ldefpackage/nm0;->c(Ldefpackage/cu4;Ldefpackage/mt2;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    const/4 v0, 0x6

    .line 81
    invoke-direct {v2, v4, v0, v3, p0}, Ldefpackage/ue1;-><init>(IILjava/lang/Object;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    iget p0, v1, Ldefpackage/un2;->b:I

    .line 85
    .line 86
    if-eqz p0, :cond_3

    .line 87
    .line 88
    const/4 v0, 0x1

    .line 89
    if-eq p0, v0, :cond_2

    .line 90
    .line 91
    const/4 v0, 0x2

    .line 92
    if-eq p0, v0, :cond_3

    .line 93
    .line 94
    const/4 v0, 0x3

    .line 95
    if-eq p0, v0, :cond_1

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_1
    iput-object v2, p1, Ldefpackage/ho2;->r:Ldefpackage/ue1;

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_2
    iput-object v2, p1, Ldefpackage/ho2;->q:Ldefpackage/ue1;

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_3
    iput-object v2, p1, Ldefpackage/ho2;->p:Ldefpackage/ue1;

    .line 105
    .line 106
    :goto_0
    return-void

    .line 107
    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_1
        0xf -> :sswitch_0
    .end sparse-switch
.end method

.method public j(Landroidx/preference/Preference;)V
    .locals 4

    .line 1
    iget p1, p0, Ldefpackage/ef0;->n:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    iget-object v1, p0, Ldefpackage/ef0;->p:Ljava/lang/Object;

    .line 5
    .line 6
    iget-object p0, p0, Ldefpackage/ef0;->o:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch p1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    :pswitch_0
    check-cast p0, Ldefpackage/h62;

    .line 12
    .line 13
    check-cast v1, Ldefpackage/c62;

    .line 14
    .line 15
    iget-object p1, v1, Ldefpackage/c62;->a:Landroid/net/nsd/NsdServiceInfo;

    .line 16
    .line 17
    iget-boolean v1, p0, Ldefpackage/h62;->N0:Z

    .line 18
    .line 19
    if-nez v1, :cond_2

    .line 20
    .line 21
    iget-boolean v1, p0, Ldefpackage/h62;->O0:Z

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iput-boolean v0, p0, Ldefpackage/h62;->N0:Z

    .line 27
    .line 28
    const v0, 0x7f1302b0

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v0}, Ldefpackage/h62;->s0(I)V

    .line 32
    .line 33
    .line 34
    iget-wide v0, p0, Ldefpackage/h62;->M0:J

    .line 35
    .line 36
    :try_start_0
    iget-object v2, p0, Ldefpackage/h62;->u0:Landroid/net/nsd/NsdManager;

    .line 37
    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    new-instance v3, Ldefpackage/f62;

    .line 41
    .line 42
    invoke-direct {v3, p0, v0, v1, p1}, Ldefpackage/f62;-><init>(Ldefpackage/h62;JLandroid/net/nsd/NsdServiceInfo;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2, p1, v3}, Landroid/net/nsd/NsdManager;->resolveService(Landroid/net/nsd/NsdServiceInfo;Landroid/net/nsd/NsdManager$ResolveListener;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    const-string p1, "nsd"

    .line 50
    .line 51
    invoke-static {p1}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const/4 p1, 0x0

    .line 55
    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    :catch_0
    const/4 p1, 0x0

    .line 57
    iput-boolean p1, p0, Ldefpackage/h62;->N0:Z

    .line 58
    .line 59
    const p1, 0x7f1302b1

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, p1}, Ldefpackage/h62;->s0(I)V

    .line 63
    .line 64
    .line 65
    :cond_2
    :goto_0
    return-void

    .line 66
    :pswitch_1
    check-cast p0, Ldefpackage/h62;

    .line 67
    .line 68
    check-cast v1, Ldefpackage/h52;

    .line 69
    .line 70
    invoke-virtual {p0, v1}, Ldefpackage/h62;->r0(Ldefpackage/h52;)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :pswitch_2
    check-cast p0, Landroidx/preference/Preference;

    .line 75
    .line 76
    check-cast v1, Ldefpackage/vb4;

    .line 77
    .line 78
    const p1, 0x7f130223

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1, p1}, Ldefpackage/kc1;->s(I)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-virtual {p0, p1}, Landroidx/preference/Preference;->x(Ljava/lang/CharSequence;)V

    .line 86
    .line 87
    .line 88
    sget-object p1, Ldefpackage/io1;->a:Ljava/util/concurrent/ExecutorService;

    .line 89
    .line 90
    new-instance v2, Ldefpackage/ts1;

    .line 91
    .line 92
    invoke-direct {v2, v1, p0, v0}, Ldefpackage/ts1;-><init>(Ldefpackage/vb4;Landroidx/preference/Preference;I)V

    .line 93
    .line 94
    .line 95
    invoke-interface {p1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public k(Ldefpackage/oy;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Ldefpackage/ef0;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/ef0;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ldefpackage/uy1;

    .line 8
    .line 9
    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-direct {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 13
    .line 14
    .line 15
    new-instance v3, Ldefpackage/jc2;

    .line 16
    .line 17
    invoke-direct {v3, v1, v2}, Ldefpackage/jc2;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;I)V

    .line 18
    .line 19
    .line 20
    iget-object v2, p1, Ldefpackage/oy;->c:Ldefpackage/n04;

    .line 21
    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    sget-object v4, Ldefpackage/fq0;->n:Ldefpackage/fq0;

    .line 25
    .line 26
    invoke-virtual {v2, v3, v4}, Ldefpackage/g2;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    new-instance v2, Ldefpackage/v6;

    .line 30
    .line 31
    const/16 v3, 0x18

    .line 32
    .line 33
    invoke-direct {v2, v1, p1, p0, v3}, Ldefpackage/v6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 34
    .line 35
    .line 36
    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 37
    .line 38
    .line 39
    const-string p0, "setForegroundAsync"

    .line 40
    .line 41
    return-object p0
.end method

.method public onCancel()V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/ef0;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/animation/Animator;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/ef0;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ldefpackage/pj4;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/animation/Animator;->end()V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x2

    .line 13
    invoke-static {v0}, Ldefpackage/ld1;->I(I)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    new-instance v0, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v1, "Animator from operation "

    .line 22
    .line 23
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string p0, " has been canceled."

    .line 30
    .line 31
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    const-string v0, "FragmentManager"

    .line 39
    .line 40
    invoke-static {v0, p0}, Landroid/util/Ldefpackage/og;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    :cond_0
    return-void
.end method
