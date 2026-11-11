.class public final Lku2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements La83;


# instance fields
.field public final a:Lad2;

.field public final b:Lht1;

.field public c:I


# direct methods
.method public constructor <init>(Lad2;Lht1;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lku2;->c:I

    .line 6
    .line 7
    iput-object p1, p0, Lku2;->a:Lad2;

    .line 8
    .line 9
    iput-object p2, p0, Lku2;->b:Lht1;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, Lku2;->c:I

    .line 2
    .line 3
    iget-object v1, p0, Lku2;->a:Lad2;

    .line 4
    .line 5
    iget v1, v1, Lad2;->g:I

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    iput v1, p0, Lku2;->c:I

    .line 10
    .line 11
    iget-object p0, p0, Lku2;->b:Lht1;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lht1;->b(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method
