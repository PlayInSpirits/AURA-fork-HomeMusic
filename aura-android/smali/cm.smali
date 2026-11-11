.class public final Lcm;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:Z

.field public final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lbm;

    .line 2
    .line 3
    invoke-direct {v0}, Lbm;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lbm;->a()Lcm;

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lbm;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p1, Lbm;->b:Z

    .line 5
    .line 6
    iput-boolean v0, p0, Lcm;->a:Z

    .line 7
    .line 8
    iget-boolean v0, p1, Lbm;->c:Z

    .line 9
    .line 10
    iput-boolean v0, p0, Lcm;->b:Z

    .line 11
    .line 12
    iget-boolean v0, p1, Lbm;->d:Z

    .line 13
    .line 14
    iput-boolean v0, p0, Lcm;->c:Z

    .line 15
    .line 16
    iget p1, p1, Lbm;->a:I

    .line 17
    .line 18
    iput p1, p0, Lcm;->d:I

    .line 19
    .line 20
    return-void
.end method
