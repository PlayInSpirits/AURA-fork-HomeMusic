.class public final synthetic Ldefpackage/ks1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Ljava/util/List;

.field public final synthetic o:I

.field public final synthetic p:I

.field public final synthetic q:Lcom/eddyizm/tempus/ui/activity/MainActivity;

.field public final synthetic r:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;IILcom/eddyizm/tempus/ui/activity/MainActivity;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/ks1;->n:Ljava/util/List;

    .line 5
    .line 6
    iput p2, p0, Ldefpackage/ks1;->o:I

    .line 7
    .line 8
    iput p3, p0, Ldefpackage/ks1;->p:I

    .line 9
    .line 10
    iput-object p4, p0, Ldefpackage/ks1;->q:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 11
    .line 12
    iput-object p5, p0, Ldefpackage/ks1;->r:Ljava/lang/String;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    sget-object v0, Ldefpackage/ms1;->a:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    iget-object v6, p0, Ldefpackage/ks1;->n:Ljava/util/List;

    .line 4
    .line 5
    invoke-static {v6}, Ldefpackage/ms1;->b(Ljava/util/List;)Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v5, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x0

    .line 19
    :cond_0
    :goto_0
    if-ge v2, v1, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    add-int/lit8 v2, v2, 0x1

    .line 26
    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    iget v1, p0, Ldefpackage/ks1;->o:I

    .line 34
    .line 35
    invoke-static {v0, v1}, Ldefpackage/q40;->u0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_3

    .line 48
    .line 49
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    move-object v2, v1

    .line 54
    check-cast v2, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 55
    .line 56
    if-eqz v2, :cond_2

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    const/4 v1, 0x0

    .line 60
    :goto_1
    check-cast v1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 61
    .line 62
    if-nez v1, :cond_4

    .line 63
    .line 64
    invoke-static {v5}, Ldefpackage/q40;->x0(Ljava/util/List;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    move-object v1, v0

    .line 69
    check-cast v1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 70
    .line 71
    :cond_4
    move-object v4, v1

    .line 72
    sget-object v0, Ldefpackage/io1;->b:Landroid/os/Handler;

    .line 73
    .line 74
    new-instance v1, Ldefpackage/ls1;

    .line 75
    .line 76
    iget v2, p0, Ldefpackage/ks1;->p:I

    .line 77
    .line 78
    iget-object v3, p0, Ldefpackage/ks1;->q:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 79
    .line 80
    iget-object v7, p0, Ldefpackage/ks1;->r:Ljava/lang/String;

    .line 81
    .line 82
    invoke-direct/range {v1 .. v7}, Ldefpackage/ls1;-><init>(ILcom/eddyizm/tempus/ui/activity/MainActivity;Lcom/eddyizm/tempus/subsonic/models/Child;Ljava/util/ArrayList;Ljava/util/List;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 86
    .line 87
    .line 88
    return-void
.end method
