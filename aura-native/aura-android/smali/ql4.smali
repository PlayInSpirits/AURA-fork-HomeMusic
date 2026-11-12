.class public final Lql4;
.super Ltl4;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public c:Ly1;

.field public d:I

.field public e:I


# direct methods
.method public constructor <init>(JLy1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ltl4;-><init>(J)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lql4;->c:Ly1;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Ltl4;)V
    .locals 2

    .line 1
    sget-object v0, Lrr2;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-object v1, p1

    .line 8
    check-cast v1, Lql4;

    .line 9
    .line 10
    iget-object v1, v1, Lql4;->c:Ly1;

    .line 11
    .line 12
    iput-object v1, p0, Lql4;->c:Ly1;

    .line 13
    .line 14
    move-object v1, p1

    .line 15
    check-cast v1, Lql4;

    .line 16
    .line 17
    iget v1, v1, Lql4;->d:I

    .line 18
    .line 19
    iput v1, p0, Lql4;->d:I

    .line 20
    .line 21
    check-cast p1, Lql4;

    .line 22
    .line 23
    iget p1, p1, Lql4;->e:I

    .line 24
    .line 25
    iput p1, p0, Lql4;->e:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    monitor-exit v0

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

.method public final b(J)Ltl4;
    .locals 1

    .line 1
    new-instance v0, Lql4;

    .line 2
    .line 3
    iget-object p0, p0, Lql4;->c:Ly1;

    .line 4
    .line 5
    invoke-direct {v0, p1, p2, p0}, Lql4;-><init>(JLy1;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
