.class public final synthetic Lds0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lgf1;


# instance fields
.field public final synthetic n:Z

.field public final synthetic o:Lrm3;

.field public final synthetic p:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(ZLrm3;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lds0;->n:Z

    .line 5
    .line 6
    iput-object p2, p0, Lds0;->o:Lrm3;

    .line 7
    .line 8
    iput-object p3, p0, Lds0;->p:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lds0;->n:Z

    .line 2
    .line 3
    iget-object v1, p0, Lds0;->o:Lrm3;

    .line 4
    .line 5
    iget-object p0, p0, Lds0;->p:Ljava/lang/String;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, v1, Lrm3;->n:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lxm2;

    .line 12
    .line 13
    iget-object v1, v0, Lxm2;->f:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Lxi4;

    .line 16
    .line 17
    monitor-enter v1

    .line 18
    :try_start_0
    iget-object v0, v0, Lxm2;->g:Ljava/io/Serializable;

    .line 19
    .line 20
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 21
    .line 22
    invoke-interface {v0, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, Li54;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    monitor-exit v1

    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p0

    .line 31
    monitor-exit v1

    .line 32
    throw p0

    .line 33
    :cond_0
    :goto_0
    sget-object p0, Lj15;->a:Lj15;

    .line 34
    .line 35
    return-object p0
.end method
