.class public final Lcr0;
.super Lac1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public n:Z

.field public final synthetic o:Ljr0;

.field public final synthetic p:Ldr0;


# direct methods
.method public constructor <init>(Lej4;Ljr0;Ldr0;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcr0;->o:Ljr0;

    .line 2
    .line 3
    iput-object p3, p0, Lcr0;->p:Ldr0;

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lac1;-><init>(Lej4;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 1
    invoke-super {p0}, Lac1;->close()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcr0;->n:Z

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Lcr0;->n:Z

    .line 10
    .line 11
    iget-object v0, p0, Lcr0;->o:Ljr0;

    .line 12
    .line 13
    iget-object p0, p0, Lcr0;->p:Ldr0;

    .line 14
    .line 15
    monitor-enter v0

    .line 16
    :try_start_0
    iget v1, p0, Ldr0;->h:I

    .line 17
    .line 18
    add-int/lit8 v1, v1, -0x1

    .line 19
    .line 20
    iput v1, p0, Ldr0;->h:I

    .line 21
    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    iget-boolean v1, p0, Ldr0;->f:Z

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-virtual {v0, p0}, Ljr0;->K(Ldr0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception p0

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    :goto_0
    monitor-exit v0

    .line 35
    return-void

    .line 36
    :goto_1
    monitor-exit v0

    .line 37
    throw p0

    .line 38
    :cond_1
    return-void
.end method
