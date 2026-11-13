.class public final synthetic Ldefpackage/xm;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/qc2;
.implements Ldefpackage/wc0;
.implements Ldefpackage/ne4;


# instance fields
.field public final synthetic n:J


# direct methods
.method public synthetic constructor <init>(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Ldefpackage/xm;->n:J

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-wide v0, p0, Ldefpackage/xm;->n:J

    .line 2
    .line 3
    check-cast p1, Ldefpackage/al3;

    .line 4
    .line 5
    invoke-virtual {p1, v0, v1}, Ldefpackage/al3;->O(J)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public get()J
    .locals 2

    .line 1
    iget-wide v0, p0, Ldefpackage/xm;->n:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p1, Ldefpackage/pj0;

    .line 2
    .line 3
    iget-object v0, p1, Ldefpackage/pj0;->b:Ldefpackage/tj0;

    .line 4
    .line 5
    iget-object v1, v0, Ldefpackage/tj0;->j:Ldefpackage/pj0;

    .line 6
    .line 7
    if-eq p1, v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object p1, v0, Ldefpackage/tj0;->n:Ldefpackage/rm;

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    iget-wide v0, p0, Ldefpackage/xm;->n:J

    .line 15
    .line 16
    invoke-interface {p1, v0, v1}, Ldefpackage/rm;->a(J)V

    .line 17
    .line 18
    .line 19
    :cond_1
    :goto_0
    return-void
.end method
