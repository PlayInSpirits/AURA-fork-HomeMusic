.class public final Lam;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Ltb1;

.field public b:Lil;

.field public c:Landroid/media/AudioDeviceInfo;

.field public d:Z

.field public e:I

.field public f:I

.field public g:Z

.field public h:I


# direct methods
.method public constructor <init>(Lam;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lam;->a:Ltb1;

    .line 5
    .line 6
    iput-object v0, p0, Lam;->a:Ltb1;

    .line 7
    .line 8
    iget-object v0, p1, Lam;->b:Lil;

    .line 9
    .line 10
    iput-object v0, p0, Lam;->b:Lil;

    .line 11
    .line 12
    iget-object v0, p1, Lam;->c:Landroid/media/AudioDeviceInfo;

    .line 13
    .line 14
    iput-object v0, p0, Lam;->c:Landroid/media/AudioDeviceInfo;

    .line 15
    .line 16
    iget-boolean v0, p1, Lam;->d:Z

    .line 17
    .line 18
    iput-boolean v0, p0, Lam;->d:Z

    .line 19
    .line 20
    iget v0, p1, Lam;->e:I

    .line 21
    .line 22
    iput v0, p0, Lam;->e:I

    .line 23
    .line 24
    iget v0, p1, Lam;->f:I

    .line 25
    .line 26
    iput v0, p0, Lam;->f:I

    .line 27
    .line 28
    iget-boolean v0, p1, Lam;->g:Z

    .line 29
    .line 30
    iput-boolean v0, p0, Lam;->g:Z

    .line 31
    .line 32
    iget p1, p1, Lam;->h:I

    .line 33
    .line 34
    iput p1, p0, Lam;->h:I

    .line 35
    .line 36
    return-void
.end method

.method public constructor <init>(Ltb1;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Lam;->a:Ltb1;

    .line 39
    sget-object p1, Lil;->i:Lil;

    iput-object p1, p0, Lam;->b:Lil;

    const/4 p1, 0x0

    .line 40
    iput p1, p0, Lam;->e:I

    const/4 p1, -0x1

    .line 41
    iput p1, p0, Lam;->f:I

    .line 42
    iput p1, p0, Lam;->h:I

    return-void
.end method
