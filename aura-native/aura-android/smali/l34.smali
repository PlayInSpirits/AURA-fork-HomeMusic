.class public abstract Ll34;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/high16 v1, 0x42480000    # 50.0f

    .line 3
    .line 4
    cmpg-float v0, v1, v0

    .line 5
    .line 6
    if-ltz v0, :cond_0

    .line 7
    .line 8
    const/high16 v0, 0x42c80000    # 100.0f

    .line 9
    .line 10
    cmpl-float v0, v1, v0

    .line 11
    .line 12
    if-lez v0, :cond_1

    .line 13
    .line 14
    :cond_0
    const-string v0, "The percent should be in the range of [0, 100]"

    .line 15
    .line 16
    invoke-static {v0}, Lfz1;->a(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :cond_1
    return-void
.end method
