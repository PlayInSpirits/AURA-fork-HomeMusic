.class public abstract Lcom/eddyizm/tempus/database/AppDatabase;
.super Ls24;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static k:Lcom/eddyizm/tempus/database/AppDatabase;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ls24;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static declared-synchronized y()Lcom/eddyizm/tempus/database/AppDatabase;
    .locals 4

    .line 1
    const-class v0, Lcom/eddyizm/tempus/database/AppDatabase;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/eddyizm/tempus/database/AppDatabase;->k:Lcom/eddyizm/tempus/database/AppDatabase;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    invoke-static {}, Lcom/eddyizm/tempus/App;->a()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-class v2, Lcom/eddyizm/tempus/database/AppDatabase;

    .line 13
    .line 14
    const-string v3, "tempo_db"

    .line 15
    .line 16
    invoke-static {v1, v2, v3}, Lvr1;->i(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)Lq24;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const/4 v2, 0x0

    .line 21
    iput-boolean v2, v1, Lq24;->p:Z

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    iput-boolean v2, v1, Lq24;->q:Z

    .line 25
    .line 26
    invoke-virtual {v1}, Lq24;->b()Ls24;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Lcom/eddyizm/tempus/database/AppDatabase;

    .line 31
    .line 32
    sput-object v1, Lcom/eddyizm/tempus/database/AppDatabase;->k:Lcom/eddyizm/tempus/database/AppDatabase;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception v1

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    :goto_0
    sget-object v1, Lcom/eddyizm/tempus/database/AppDatabase;->k:Lcom/eddyizm/tempus/database/AppDatabase;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    monitor-exit v0

    .line 40
    return-object v1

    .line 41
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    throw v1
.end method


# virtual methods
.method public abstract A()Lrf2;
.end method

.method public abstract B()Lhg3;
.end method

.method public abstract C()Lml3;
.end method

.method public abstract D()Lrm3;
.end method

.method public abstract E()Lns3;
.end method

.method public abstract F()Ljv3;
.end method

.method public abstract G()Lna4;
.end method

.method public abstract H()Lqp4;
.end method

.method public abstract v()Lr20;
.end method

.method public abstract w()Lss0;
.end method

.method public abstract x()Li61;
.end method

.method public abstract z()Lc12;
.end method
