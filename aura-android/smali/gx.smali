.class public final Lgx;
.super Lzb1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic o:Lhx;

.field public final synthetic p:Ljw;


# direct methods
.method public constructor <init>(Lhx;Ljw;Lof4;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lgx;->o:Lhx;

    .line 2
    .line 3
    iput-object p2, p0, Lgx;->p:Ljw;

    .line 4
    .line 5
    invoke-direct {p0, p3}, Lzb1;-><init>(Lof4;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 3

    .line 1
    iget-object v0, p0, Lgx;->o:Lhx;

    .line 2
    .line 3
    iget-object v1, p0, Lgx;->p:Ljw;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-boolean v2, v1, Ljw;->n:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    monitor-exit v0

    .line 11
    return-void

    .line 12
    :cond_0
    const/4 v2, 0x1

    .line 13
    :try_start_1
    iput-boolean v2, v1, Ljw;->n:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 14
    .line 15
    monitor-exit v0

    .line 16
    invoke-super {p0}, Lzb1;->close()V

    .line 17
    .line 18
    .line 19
    iget-object p0, p0, Lgx;->p:Ljw;

    .line 20
    .line 21
    iget-object p0, p0, Ljw;->o:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p0, Lll;

    .line 24
    .line 25
    invoke-virtual {p0}, Lll;->b()V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :catchall_0
    move-exception p0

    .line 30
    monitor-exit v0

    .line 31
    throw p0
.end method
