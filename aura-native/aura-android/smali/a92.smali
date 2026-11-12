.class public final La92;
.super Lsk4;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final s:Lvd0;


# direct methods
.method public constructor <init>(Lne0;Lwf1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Lc0;-><init>(Lne0;Z)V

    .line 3
    .line 4
    .line 5
    invoke-static {p0, p0, p2}, Lya4;->i(Lvd0;Lvd0;Lwf1;)Lvd0;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, La92;->s:Lvd0;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final Y()V
    .locals 2

    .line 1
    iget-object v0, p0, La92;->s:Lvd0;

    .line 2
    .line 3
    :try_start_0
    invoke-static {v0}, Lya4;->x(Lvd0;)Lvd0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lj15;->a:Lj15;

    .line 8
    .line 9
    invoke-static {v0, v1}, Luc5;->T(Lvd0;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    new-instance v1, Ls14;

    .line 15
    .line 16
    invoke-direct {v1, v0}, Ls14;-><init>(Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v1}, Lc0;->resumeWith(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    throw v0
.end method
