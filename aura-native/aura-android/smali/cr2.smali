.class public final synthetic Lcr2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lmk;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:J


# direct methods
.method public synthetic constructor <init>(IJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcr2;->n:I

    .line 5
    .line 6
    iput-wide p2, p0, Lcr2;->o:J

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Lic2;
    .locals 4

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    new-instance v0, Lgr2;

    .line 4
    .line 5
    iget v1, p0, Lcr2;->n:I

    .line 6
    .line 7
    iget-wide v2, p0, Lcr2;->o:J

    .line 8
    .line 9
    invoke-direct {v0, p1, v1, v2, v3}, Lgr2;-><init>(Ljava/util/List;IJ)V

    .line 10
    .line 11
    .line 12
    new-instance p0, Lmw1;

    .line 13
    .line 14
    invoke-direct {p0, v0}, Lmw1;-><init>(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-object p0
.end method
