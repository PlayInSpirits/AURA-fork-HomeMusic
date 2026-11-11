.class public final Lay4;
.super Lyx4;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final q:Lrf3;


# direct methods
.method public constructor <init>(Lrf3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lyx4;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lay4;->q:Lrf3;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final next()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lyx4;->p:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x2

    .line 4
    .line 5
    iput v1, p0, Lyx4;->p:I

    .line 6
    .line 7
    new-instance v1, Lo03;

    .line 8
    .line 9
    iget-object v2, p0, Lyx4;->n:[Ljava/lang/Object;

    .line 10
    .line 11
    aget-object v3, v2, v0

    .line 12
    .line 13
    add-int/lit8 v0, v0, 0x1

    .line 14
    .line 15
    aget-object v0, v2, v0

    .line 16
    .line 17
    iget-object p0, p0, Lay4;->q:Lrf3;

    .line 18
    .line 19
    invoke-direct {v1, p0, v3, v0}, Lo03;-><init>(Lrf3;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-object v1
.end method
