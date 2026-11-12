.class public final Lx23;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public a:Z

.field public b:Z

.field public c:I

.field public d:Z

.field public e:Z

.field public f:I

.field public g:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lx23;->c:I

    .line 6
    .line 7
    iput v0, p0, Lx23;->f:I

    .line 8
    .line 9
    iput v0, p0, Lx23;->g:I

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a()Ly23;
    .locals 10

    .line 1
    iget-boolean v1, p0, Lx23;->a:Z

    .line 2
    .line 3
    new-instance v0, Ly23;

    .line 4
    .line 5
    iget-boolean v2, p0, Lx23;->b:Z

    .line 6
    .line 7
    iget v3, p0, Lx23;->c:I

    .line 8
    .line 9
    iget-boolean v4, p0, Lx23;->d:Z

    .line 10
    .line 11
    iget-boolean v5, p0, Lx23;->e:Z

    .line 12
    .line 13
    iget v6, p0, Lx23;->f:I

    .line 14
    .line 15
    iget v7, p0, Lx23;->g:I

    .line 16
    .line 17
    const/4 v8, -0x1

    .line 18
    const/4 v9, -0x1

    .line 19
    invoke-direct/range {v0 .. v9}, Ly23;-><init>(ZZIZZIIII)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method
