.class public final Lqo4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lfa0;


# instance fields
.field public final n:Lpz1;


# direct methods
.method public constructor <init>(Lpz1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lqo4;->n:Lpz1;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 0

    .line 1
    iget-object p0, p0, Lqo4;->n:Lpz1;

    .line 2
    .line 3
    iget-object p0, p0, Lpz1;->o:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lso4;

    .line 6
    .line 7
    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final k(ZLwf1;Lwd0;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object p0, p0, Lqo4;->n:Lpz1;

    .line 2
    .line 3
    iget-object p0, p0, Lpz1;->o:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lso4;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance p1, Luo4;

    .line 11
    .line 12
    new-instance v0, Lpo4;

    .line 13
    .line 14
    invoke-interface {p0}, Lso4;->z()Lwe1;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-direct {v0, p0}, Lpo4;-><init>(Lwe1;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p1, v0}, Luo4;-><init>(Lpo4;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p2, p1, p3}, Lwf1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method
