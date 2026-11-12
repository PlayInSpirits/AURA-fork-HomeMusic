.class public final Lht;
.super Lc0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final s:Ljava/lang/Thread;

.field public final t:Lg21;


# direct methods
.method public constructor <init>(Lne0;Ljava/lang/Thread;Lg21;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p1, v0}, Lc0;-><init>(Lne0;Z)V

    .line 3
    .line 4
    .line 5
    iput-object p2, p0, Lht;->s:Ljava/lang/Thread;

    .line 6
    .line 7
    iput-object p3, p0, Lht;->t:Lg21;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final l(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p0, p0, Lht;->s:Ljava/lang/Thread;

    .line 6
    .line 7
    invoke-static {p1, p0}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    invoke-static {p0}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method
