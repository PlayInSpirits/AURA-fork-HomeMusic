.class public final Lr15;
.super Ln14;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lej4;


# instance fields
.field public final n:Lhu2;

.field public final o:J


# direct methods
.method public constructor <init>(Lhu2;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr15;->n:Lhu2;

    .line 5
    .line 6
    iput-wide p2, p0, Lr15;->o:J

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 0

    .line 1
    return-void
.end method

.method public final contentLength()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lr15;->o:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final contentType()Lhu2;
    .locals 0

    .line 1
    iget-object p0, p0, Lr15;->n:Lhu2;

    .line 2
    .line 3
    return-object p0
.end method

.method public final read(Ltv;J)J
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 5
    .line 6
    const-string p1, "Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)"

    .line 7
    .line 8
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    throw p0
.end method

.method public final source()Lfw;
    .locals 1

    .line 1
    new-instance v0, Lxu3;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lxu3;-><init>(Lej4;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final timeout()Lfu4;
    .locals 0

    .line 1
    sget-object p0, Lfu4;->d:Leu4;

    .line 2
    .line 3
    return-object p0
.end method
