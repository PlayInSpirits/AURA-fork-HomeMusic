.class public final Ldefpackage/pn2;
.super Landroid/app/Service;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public n:Ldefpackage/bq4;

.field public final o:Ldefpackage/pz1;

.field public final p:Ldefpackage/oj2;

.field public final q:Ljava/util/ArrayList;

.field public final r:Ldefpackage/oi;

.field public s:Ldefpackage/oj2;

.field public final t:Ldefpackage/zk;

.field public u:Ldefpackage/pr2;

.field public final v:Ldefpackage/hg3;

.field public final w:Ldefpackage/tn2;

.field public final x:Ldefpackage/na4;

.field public final y:Ldefpackage/si1;

.field public final z:Ldefpackage/tn2;


# direct methods
.method public constructor <init>(Ldefpackage/tn2;)V
    .locals 8

    .line 1
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ldefpackage/pz1;

    .line 5
    .line 6
    const/4 v1, 0x5

    .line 7
    invoke-direct {v0, v1, p0}, Ldefpackage/pz1;-><init>(ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Ldefpackage/pn2;->o:Ldefpackage/pz1;

    .line 11
    .line 12
    new-instance v2, Ldefpackage/oj2;

    .line 13
    .line 14
    const/4 v6, -0x1

    .line 15
    const/4 v7, 0x0

    .line 16
    const-string v4, "android.media.session.MediaController"

    .line 17
    .line 18
    const/4 v5, -0x1

    .line 19
    move-object v3, p0

    .line 20
    invoke-direct/range {v2 .. v7}, Ldefpackage/oj2;-><init>(Ldefpackage/pn2;Ljava/lang/String;IILdefpackage/hg3;)V

    .line 21
    .line 22
    .line 23
    iput-object v2, v3, Ldefpackage/pn2;->p:Ldefpackage/oj2;

    .line 24
    .line 25
    new-instance p0, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p0, v3, Ldefpackage/pn2;->q:Ljava/util/ArrayList;

    .line 31
    .line 32
    new-instance p0, Ldefpackage/oi;

    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    invoke-direct {p0, v0}, Ldefpackage/yd4;-><init>(I)V

    .line 36
    .line 37
    .line 38
    iput-object p0, v3, Ldefpackage/pn2;->r:Ldefpackage/oi;

    .line 39
    .line 40
    new-instance p0, Ldefpackage/zk;

    .line 41
    .line 42
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-direct {p0, v0}, Ldefpackage/zk;-><init>(Landroid/os/Looper;)V

    .line 50
    .line 51
    .line 52
    iput-object v3, p0, Ldefpackage/zk;->b:Ljava/lang/Object;

    .line 53
    .line 54
    iput-object p0, v3, Ldefpackage/pn2;->t:Ldefpackage/zk;

    .line 55
    .line 56
    iget-object p0, p1, Ldefpackage/tn2;->f:Lcom/eddyizm/tempus/service/MediaService;

    .line 57
    .line 58
    invoke-static {p0}, Ldefpackage/hg3;->E(Landroid/content/Context;)Ldefpackage/hg3;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    iput-object p0, v3, Ldefpackage/pn2;->v:Ldefpackage/hg3;

    .line 63
    .line 64
    iput-object p1, v3, Ldefpackage/pn2;->w:Ldefpackage/tn2;

    .line 65
    .line 66
    new-instance p0, Ldefpackage/na4;

    .line 67
    .line 68
    invoke-direct {p0, p1}, Ldefpackage/na4;-><init>(Ldefpackage/tn2;)V

    .line 69
    .line 70
    .line 71
    iput-object p0, v3, Ldefpackage/pn2;->x:Ldefpackage/na4;

    .line 72
    .line 73
    iput-object p1, v3, Ldefpackage/pn2;->z:Ldefpackage/tn2;

    .line 74
    .line 75
    new-instance p0, Ldefpackage/si1;

    .line 76
    .line 77
    const/16 p1, 0x9

    .line 78
    .line 79
    invoke-direct {p0, p1, v3}, Ldefpackage/si1;-><init>(ILjava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    iput-object p0, v3, Ldefpackage/pn2;->y:Ldefpackage/si1;

    .line 83
    .line 84
    return-void
.end method

.method public static a(Ldefpackage/pn2;Ldefpackage/m92;)Ldefpackage/lb4;
    .locals 8

    .line 1
    const-string v0, "LibraryResult must not be null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ldefpackage/rr2;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v6, Ldefpackage/lb4;

    .line 7
    .line 8
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iget v0, p1, Ldefpackage/m92;->a:I

    .line 12
    .line 13
    const/4 v7, 0x0

    .line 14
    if-nez v0, :cond_4

    .line 15
    .line 16
    iget-object p1, p1, Ldefpackage/m92;->c:Ljava/lang/Object;

    .line 17
    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    goto :goto_2

    .line 21
    :cond_0
    move-object v4, p1

    .line 22
    check-cast v4, Ldefpackage/yw1;

    .line 23
    .line 24
    invoke-virtual {v4}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    new-instance p0, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v6, p0}, Ldefpackage/u0;->l(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    return-object v6

    .line 39
    :cond_1
    new-instance v5, Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 42
    .line 43
    .line 44
    new-instance p1, Ldefpackage/ws1;

    .line 45
    .line 46
    const/16 v0, 0x10

    .line 47
    .line 48
    invoke-direct {p1, v0, v6, v5}, Ldefpackage/ws1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    sget-object v0, Ldefpackage/gq0;->n:Ldefpackage/gq0;

    .line 52
    .line 53
    invoke-virtual {v6, p1, v0}, Ldefpackage/u0;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 54
    .line 55
    .line 56
    new-instance v3, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 57
    .line 58
    const/4 p1, 0x0

    .line 59
    invoke-direct {v3, p1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 60
    .line 61
    .line 62
    new-instance v1, Ldefpackage/t6;

    .line 63
    .line 64
    move-object v2, p0

    .line 65
    invoke-direct/range {v1 .. v6}, Ldefpackage/t6;-><init>(Ldefpackage/pn2;Ljava/util/concurrent/atomic/AtomicInteger;Ldefpackage/yw1;Ljava/util/ArrayList;Ldefpackage/lb4;)V

    .line 66
    .line 67
    .line 68
    :goto_0
    invoke-virtual {v4}, Ljava/util/AbstractCollection;->size()I

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    if-ge p1, p0, :cond_3

    .line 73
    .line 74
    invoke-interface {v4, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    check-cast p0, Ldefpackage/gn2;

    .line 79
    .line 80
    iget-object p0, p0, Ldefpackage/gn2;->d:Ldefpackage/do2;

    .line 81
    .line 82
    iget-object p0, p0, Ldefpackage/do2;->k:[B

    .line 83
    .line 84
    if-nez p0, :cond_2

    .line 85
    .line 86
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1}, Ldefpackage/t6;->run()V

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_2
    iget-object v3, v2, Ldefpackage/pn2;->z:Ldefpackage/tn2;

    .line 94
    .line 95
    iget-object v3, v3, Ldefpackage/tn2;->m:Ldefpackage/x7;

    .line 96
    .line 97
    invoke-virtual {v3, p0}, Ldefpackage/x7;->j([B)Ldefpackage/ic2;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-virtual {v5, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    check-cast p0, Ldefpackage/k91;

    .line 105
    .line 106
    invoke-virtual {p0, v1, v0}, Ldefpackage/u0;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 107
    .line 108
    .line 109
    :goto_1
    add-int/lit8 p1, p1, 0x1

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_3
    return-object v6

    .line 113
    :cond_4
    :goto_2
    invoke-virtual {v6, v7}, Ldefpackage/u0;->l(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    return-object v6
.end method


# virtual methods
.method public final b()Ldefpackage/fr2;
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/pn2;->n:Ldefpackage/bq4;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ldefpackage/bq4;->j()Ldefpackage/ms2;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object p0, p0, Ldefpackage/pn2;->x:Ldefpackage/na4;

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Ldefpackage/na4;->w(Ljava/lang/Object;)Ldefpackage/fr2;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public final c(Ldefpackage/pr2;)V
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/pn2;->w:Ldefpackage/tn2;

    .line 2
    .line 3
    iget-object v0, v0, Ldefpackage/tn2;->f:Lcom/eddyizm/tempus/service/MediaService;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/content/ContextWrapper;->attachBaseContext(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ldefpackage/pn2;->onCreate()V

    .line 9
    .line 10
    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Ldefpackage/pn2;->u:Ldefpackage/pr2;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iput-object p1, p0, Ldefpackage/pn2;->u:Ldefpackage/pr2;

    .line 18
    .line 19
    iget-object p0, p0, Ldefpackage/pn2;->n:Ldefpackage/bq4;

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Ldefpackage/bq4;->q:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Ldefpackage/pn2;

    .line 27
    .line 28
    iget-object v0, v0, Ldefpackage/pn2;->t:Ldefpackage/zk;

    .line 29
    .line 30
    new-instance v1, Ldefpackage/lg1;

    .line 31
    .line 32
    const/16 v2, 0x13

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    invoke-direct {v1, p0, p1, v3, v2}, Ldefpackage/lg1;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ldefpackage/zk;->b(Ljava/lang/Runnable;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_0
    const-string p0, "The session token has already been set"

    .line 43
    .line 44
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_1
    const-string p0, "Session token may not be null"

    .line 49
    .line 50
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public final d(Ljava/lang/String;Ldefpackage/uj2;Landroid/os/Bundle;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Ldefpackage/pn2;->b()Ldefpackage/fr2;

    .line 2
    .line 3
    .line 4
    move-result-object v2

    .line 5
    const/4 v0, 0x0

    .line 6
    if-nez v2, :cond_0

    .line 7
    .line 8
    invoke-virtual {p2, v0}, Ldefpackage/uj2;->f(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    new-instance p0, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string p1, "onLoadChildren(): Ignoring empty parentId from "

    .line 21
    .line 22
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    const-string p1, "MLSLegacyStub"

    .line 33
    .line 34
    invoke-static {p1, p0}, Ldefpackage/l93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p2, v0}, Ldefpackage/uj2;->f(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    invoke-virtual {p2}, Ldefpackage/uj2;->a()V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Ldefpackage/pn2;->z:Ldefpackage/tn2;

    .line 45
    .line 46
    iget-object v6, v0, Ldefpackage/tn2;->l:Landroid/os/Handler;

    .line 47
    .line 48
    new-instance v0, Ldefpackage/mr;

    .line 49
    .line 50
    move-object v1, p0

    .line 51
    move-object v5, p1

    .line 52
    move-object v3, p2

    .line 53
    move-object v4, p3

    .line 54
    invoke-direct/range {v0 .. v5}, Ldefpackage/mr;-><init>(Ldefpackage/pn2;Ldefpackage/fr2;Ldefpackage/uj2;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-static {v6, v0}, Ldefpackage/f35;->W(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public final dump(Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final e(Ljava/lang/String;Ldefpackage/uj2;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ldefpackage/pn2;->b()Ldefpackage/fr2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p2, v1}, Ldefpackage/uj2;->f(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    new-instance p0, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string p1, "Ignoring empty itemId from "

    .line 21
    .line 22
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    const-string p1, "MLSLegacyStub"

    .line 33
    .line 34
    invoke-static {p1, p0}, Ldefpackage/l93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p2, v1}, Ldefpackage/uj2;->f(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    invoke-virtual {p2}, Ldefpackage/uj2;->a()V

    .line 42
    .line 43
    .line 44
    iget-object v1, p0, Ldefpackage/pn2;->z:Ldefpackage/tn2;

    .line 45
    .line 46
    iget-object v1, v1, Ldefpackage/tn2;->l:Landroid/os/Handler;

    .line 47
    .line 48
    new-instance v2, Ldefpackage/v6;

    .line 49
    .line 50
    invoke-direct {v2, p0, v0, p2, p1}, Ldefpackage/v6;-><init>(Ldefpackage/pn2;Ldefpackage/fr2;Ldefpackage/uj2;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-static {v1, v2}, Ldefpackage/f35;->W(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public final f(Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ldefpackage/pn2;->b()Ldefpackage/fr2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    new-instance p0, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string p1, "onUnsubscribe(): Ignoring empty id from "

    .line 17
    .line 18
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    const-string p1, "MLSLegacyStub"

    .line 29
    .line 30
    invoke-static {p1, p0}, Ldefpackage/l93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_1
    iget-object v1, p0, Ldefpackage/pn2;->z:Ldefpackage/tn2;

    .line 35
    .line 36
    iget-object v1, v1, Ldefpackage/tn2;->l:Landroid/os/Handler;

    .line 37
    .line 38
    new-instance v2, Ldefpackage/v6;

    .line 39
    .line 40
    const/16 v3, 0x1b

    .line 41
    .line 42
    invoke-direct {v2, p0, v0, p1, v3}, Ldefpackage/v6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 43
    .line 44
    .line 45
    invoke-static {v1, v2}, Ldefpackage/f35;->W(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public final g(Ljava/lang/String;Ldefpackage/oj2;Landroid/os/Bundle;Landroid/os/Bundle;)V
    .locals 7

    .line 1
    new-instance v0, Ldefpackage/mj2;

    .line 2
    .line 3
    move-object v4, p1

    .line 4
    move-object v1, p0

    .line 5
    move-object v2, p1

    .line 6
    move-object v3, p2

    .line 7
    move-object v5, p3

    .line 8
    move-object v6, p4

    .line 9
    invoke-direct/range {v0 .. v6}, Ldefpackage/mj2;-><init>(Ldefpackage/pn2;Ljava/lang/String;Ldefpackage/oj2;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;)V

    .line 10
    .line 11
    .line 12
    iput-object v3, v1, Ldefpackage/pn2;->s:Ldefpackage/oj2;

    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    if-nez v5, :cond_0

    .line 16
    .line 17
    invoke-virtual {v1, v2, v0, p0}, Ldefpackage/pn2;->d(Ljava/lang/String;Ldefpackage/uj2;Landroid/os/Bundle;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {v1, v2, v0, v5}, Ldefpackage/pn2;->d(Ljava/lang/String;Ldefpackage/uj2;Landroid/os/Bundle;)V

    .line 22
    .line 23
    .line 24
    :goto_0
    iput-object p0, v1, Ldefpackage/pn2;->s:Ldefpackage/oj2;

    .line 25
    .line 26
    invoke-virtual {v0}, Ldefpackage/uj2;->b()Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-eqz p0, :cond_1

    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    iget-object p0, v3, Ldefpackage/oj2;->a:Ljava/lang/String;

    .line 34
    .line 35
    const-string p1, " id="

    .line 36
    .line 37
    const-string p2, "onLoadChildren must call detach() or sendResult() before returning for package="

    .line 38
    .line 39
    invoke-static {p2, p0, p1, v2}, Ldefpackage/nz2;->y(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/pn2;->n:Ldefpackage/bq4;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Ldefpackage/bq4;->o:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Ldefpackage/qj2;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1}, Landroid/service/media/MediaBrowserService;->onBind(Landroid/content/Intent;)Landroid/os/IBinder;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final onCreate()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 2
    .line 3
    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    .line 6
    const/16 v1, 0x1c

    .line 7
    .line 8
    if-lt v0, v1, :cond_0

    .line 9
    .line 10
    new-instance v0, Ldefpackage/tj2;

    .line 11
    .line 12
    invoke-direct {v0, p0}, Ldefpackage/tj2;-><init>(Ldefpackage/pn2;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Ldefpackage/pn2;->n:Ldefpackage/bq4;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/16 v1, 0x1a

    .line 19
    .line 20
    if-lt v0, v1, :cond_1

    .line 21
    .line 22
    new-instance v0, Ldefpackage/sj2;

    .line 23
    .line 24
    invoke-direct {v0, p0}, Ldefpackage/sj2;-><init>(Ldefpackage/pn2;)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Ldefpackage/pn2;->n:Ldefpackage/bq4;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    new-instance v0, Ldefpackage/bq4;

    .line 31
    .line 32
    invoke-direct {v0, p0}, Ldefpackage/bq4;-><init>(Ldefpackage/pn2;)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Ldefpackage/pn2;->n:Ldefpackage/bq4;

    .line 36
    .line 37
    :goto_0
    iget-object p0, p0, Ldefpackage/pn2;->n:Ldefpackage/bq4;

    .line 38
    .line 39
    invoke-virtual {p0}, Ldefpackage/bq4;->r()V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final onDestroy()V
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/pn2;->t:Ldefpackage/zk;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Ldefpackage/zk;->b:Ljava/lang/Object;

    .line 5
    .line 6
    return-void
.end method
