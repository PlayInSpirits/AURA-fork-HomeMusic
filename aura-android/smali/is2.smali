.class public final Lis2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Ljava/lang/String;

.field public d:I

.field public e:Landroid/media/VolumeProvider;

.field public final synthetic f:Landroid/os/Handler;

.field public final synthetic g:Lal3;


# direct methods
.method public constructor <init>(IIILjava/lang/String;Landroid/os/Handler;Lal3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p5, p0, Lis2;->f:Landroid/os/Handler;

    .line 5
    .line 6
    iput-object p6, p0, Lis2;->g:Lal3;

    .line 7
    .line 8
    iput p1, p0, Lis2;->a:I

    .line 9
    .line 10
    iput p2, p0, Lis2;->b:I

    .line 11
    .line 12
    iput p3, p0, Lis2;->d:I

    .line 13
    .line 14
    iput-object p4, p0, Lis2;->c:Ljava/lang/String;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a()Landroid/media/VolumeProvider;
    .locals 8

    .line 1
    iget-object v0, p0, Lis2;->e:Landroid/media/VolumeProvider;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    .line 7
    const/16 v1, 0x1e

    .line 8
    .line 9
    if-lt v0, v1, :cond_0

    .line 10
    .line 11
    new-instance v2, Lq85;

    .line 12
    .line 13
    iget v6, p0, Lis2;->d:I

    .line 14
    .line 15
    iget-object v7, p0, Lis2;->c:Ljava/lang/String;

    .line 16
    .line 17
    iget v4, p0, Lis2;->a:I

    .line 18
    .line 19
    iget v5, p0, Lis2;->b:I

    .line 20
    .line 21
    move-object v3, p0

    .line 22
    invoke-direct/range {v2 .. v7}, Lq85;-><init>(Lis2;IIILjava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iput-object v2, v3, Lis2;->e:Landroid/media/VolumeProvider;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move-object v3, p0

    .line 29
    new-instance p0, Lx52;

    .line 30
    .line 31
    iget v0, v3, Lis2;->b:I

    .line 32
    .line 33
    iget v1, v3, Lis2;->d:I

    .line 34
    .line 35
    iget v2, v3, Lis2;->a:I

    .line 36
    .line 37
    invoke-direct {p0, v3, v2, v0, v1}, Lx52;-><init>(Lis2;III)V

    .line 38
    .line 39
    .line 40
    iput-object p0, v3, Lis2;->e:Landroid/media/VolumeProvider;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    move-object v3, p0

    .line 44
    :goto_0
    iget-object p0, v3, Lis2;->e:Landroid/media/VolumeProvider;

    .line 45
    .line 46
    return-object p0
.end method
