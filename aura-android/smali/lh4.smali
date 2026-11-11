.class public final Llh4;
.super Ltl4;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public c:I


# direct methods
.method public constructor <init>(IJ)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p3}, Ltl4;-><init>(J)V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Llh4;->c:I

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Ltl4;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p1, Llh4;

    .line 5
    .line 6
    iget p1, p1, Llh4;->c:I

    .line 7
    .line 8
    iput p1, p0, Llh4;->c:I

    .line 9
    .line 10
    return-void
.end method

.method public final b(J)Ltl4;
    .locals 1

    .line 1
    new-instance v0, Llh4;

    .line 2
    .line 3
    iget p0, p0, Llh4;->c:I

    .line 4
    .line 5
    invoke-direct {v0, p0, p1, p2}, Llh4;-><init>(IJ)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
