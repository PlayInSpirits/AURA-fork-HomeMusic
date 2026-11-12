.class public abstract Lur1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final a:Ljava/util/concurrent/ExecutorService;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, Lur1;->a:Ljava/util/concurrent/ExecutorService;

    .line 6
    .line 7
    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/eddyizm/tempus/ui/activity/MainActivity;
    .locals 1

    .line 1
    :goto_0
    instance-of v0, p0, Landroid/content/ContextWrapper;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    instance-of v0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    check-cast p0, Landroid/content/ContextWrapper;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    goto :goto_0

    .line 19
    :cond_1
    const/4 p0, 0x0

    .line 20
    return-object p0
.end method

.method public static final b(Lcom/eddyizm/tempus/subsonic/models/Child;)Z
    .locals 2

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-lez v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getType()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "podcast"

    .line 18
    .line 19
    invoke-static {v0, v1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getType()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    const-string v0, "radio"

    .line 30
    .line 31
    invoke-static {p0, v0}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-nez p0, :cond_0

    .line 36
    .line 37
    const/4 p0, 0x1

    .line 38
    return p0

    .line 39
    :cond_0
    const/4 p0, 0x0

    .line 40
    return p0
.end method

.method public static final c(Lcom/eddyizm/tempus/ui/activity/MainActivity;Lcom/eddyizm/tempus/subsonic/models/Child;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    sget-object v0, Lrs1;->a:Lrs1;

    .line 9
    .line 10
    invoke-static {v1}, Lrs1;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->P:Lbl2;

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance v2, Lk6;

    .line 20
    .line 21
    const/16 v4, 0x1c

    .line 22
    .line 23
    invoke-direct {v2, v4, v1, v0}, Lk6;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    sget-object v4, Lgq0;->n:Lgq0;

    .line 27
    .line 28
    invoke-virtual {v0, v2, v4}, Lu0;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    new-instance v4, Lfx3;

    .line 32
    .line 33
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 34
    .line 35
    .line 36
    new-instance v0, Lt6;

    .line 37
    .line 38
    const/4 v5, 0x6

    .line 39
    move-object v2, p1

    .line 40
    invoke-direct/range {v0 .. v5}, Lt6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 41
    .line 42
    .line 43
    sget-object p1, Lur1;->a:Ljava/util/concurrent/ExecutorService;

    .line 44
    .line 45
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 46
    .line 47
    .line 48
    const p1, 0x1020002

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, p1}, Ldf;->findViewById(I)Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    if-nez p1, :cond_1

    .line 56
    .line 57
    return-void

    .line 58
    :cond_1
    sget-object v0, Lqg4;->E:[I

    .line 59
    .line 60
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    const v2, 0x7f1301a5

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    const/4 v2, 0x0

    .line 72
    invoke-static {p1, v0, v2}, Lqg4;->h(Landroid/view/View;Ljava/lang/CharSequence;I)Lqg4;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->u()Landroid/widget/FrameLayout;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-virtual {p1, p0}, Lfr;->e(Landroid/widget/FrameLayout;)V

    .line 81
    .line 82
    .line 83
    new-instance p0, Lj8;

    .line 84
    .line 85
    const/16 v0, 0xc

    .line 86
    .line 87
    invoke-direct {p0, v0, v4, v1}, Lj8;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    const v0, 0x7f1301a4

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1, v0, p0}, Lqg4;->i(ILandroid/view/View$OnClickListener;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1}, Lqg4;->j()V

    .line 97
    .line 98
    .line 99
    return-void
.end method

.method public static d(Ljava/lang/String;)V
    .locals 8

    .line 1
    sget-object v0, Lcom/eddyizm/tempus/homemusic/PlayEvent;->Companion:Lih3;

    .line 2
    .line 3
    invoke-static {}, Lrs1;->f()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v3

    .line 7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 8
    .line 9
    .line 10
    move-result-wide v4

    .line 11
    const/4 v6, 0x0

    .line 12
    const/16 v7, 0x3ff0

    .line 13
    .line 14
    const-string v1, "undislike"

    .line 15
    .line 16
    move-object v2, p0

    .line 17
    invoke-static/range {v0 .. v7}, Lih3;->c(Lih3;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;I)Lcom/eddyizm/tempus/homemusic/PlayEvent;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-static {p0}, Lrs1;->j(Lcom/eddyizm/tempus/homemusic/PlayEvent;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method
